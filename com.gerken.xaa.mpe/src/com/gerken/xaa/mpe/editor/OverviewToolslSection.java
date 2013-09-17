package com.gerken.xaa.mpe.editor;


import com.gerken.xaa.mpe.core.AbstractToolSection;
import com.gerken.xaa.mpe.core.AbstractFormPage;
import com.gerken.xaa.mpe.core.ModelAccess;
import com.gerken.xaa.mpe.core.ModelFormatter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jet.JET2Platform;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class OverviewToolslSection extends AbstractToolSection implements IHyperlinkListener {

	public OverviewToolslSection(AbstractFormPage page, Composite parent) {
		super(page, parent);
	}

	public String getTextContent() {

		String patternId = ModelAccess.getAttribute(getModel(), "/xform/@xformId");
		String content = "<form>" +
							"<li style=\"text\" bindent=\"5\"><a href=\"purposes.to.tokens\">Build tokens</a> for selected purposes</li>" +
							"<li style=\"text\" bindent=\"5\"><a href=\"invoke.xaa.xform\">Generate</a> "+patternId+" xform</li>" +
							"</form>";

		return content;
	}

	public void linkActivated(HyperlinkEvent e) {
		String href = e.getHref().toString();


		if (href.equals("invoke.xaa.xform")) {
			if (getPage().getMpeEditor().getConstraintManager().getCurrentProblems().size() > 0) {
				boolean goon = MessageDialog.openConfirm(new Shell(),"Errors Exist in Model","Errors in the model may cause the generation to fail.  Do you wish to continue?");
				if (!goon) { return; }
			}
			try {
				String patternId = ModelAccess.getAttribute(getModel(), "/xform/@xformId");
				boolean goon = MessageDialog.openConfirm(new Shell(),"Begin Generation","Generate "+patternId+" xform?");
				if (!goon) { return; }
					// Begin pattern invoke sample.xform
				String contents = ModelFormatter.getInstance().format(getModel());
				IStatus status = JET2Platform.runTransformOnString("com.gerken.xaa.xform", contents, new NullProgressMonitor());
				if ((status.getSeverity() == IStatus.OK) | (status.getSeverity() == IStatus.INFO)) {
					MessageDialog.openInformation(new Shell(),"Pattern successfully applied",status.getMessage());
				} else {
					ErrorDialog.openError(new Shell(),"Pattern applied with errors",status.getMessage(),status);
				}
					// End pattern invoke sample.xform
			} catch (Throwable t) {
					MessageDialog.openInformation(new Shell(),"Exception thrown",t.toString());
			}
			return;
		}

		if (href.equals("purposes.to.tokens")) {
			boolean confirm = MessageDialog.openConfirm(new Shell(),"Build Tokens","Do you wish to build tokens from selected purposes?");
			if (!confirm) { return; }
			purposesToTokens();			
			return;
		}

	}

	private void purposesToTokens() {
		Document doc = getPage().getModel();
		Node[] cf = ModelAccess.getNodes(doc,"/xform/group/createFile[@purposeAsTokenName=\"true\"]");
		Node xpath = ModelAccess.getNodes(doc, "/xform")[0];
		for (int n = 0; n < cf.length; n++) {
			String groupName = ModelAccess.getAttribute(cf[n], "../@name");
			String purpose = ModelAccess.getAttribute(cf[n], "@purpose");
			String oPath = ModelAccess.getAttribute( cf[n], "@oPath");
			int offset = oPath.lastIndexOf("/");
			if (offset > -1) {
				oPath = oPath.substring(offset+1);
			}
			offset = oPath.indexOf(".");
			if (offset > -1) {
				oPath = oPath.substring(0,offset);
			}
			String filename = oPath;
			
			Element replacement = xpath.getOwnerDocument().createElement("replacement");
			xpath.appendChild(replacement);
			replacement.setAttribute("newString","{$"+groupName+"/@"+purpose+"}");
			replacement.setAttribute("oldString",filename);

			Node group = ModelAccess.getNodes(cf[n], "..")[0];
			
			Element token = group.getOwnerDocument().createElement("token");
			group.appendChild(token);
			token.setAttribute("formula",filename);
			token.setAttribute("derived","true");
			token.setAttribute("name",purpose);
			token.setAttribute("desc","variable for "+filename);
			
		}
		
	}

	public void linkEntered(HyperlinkEvent e) {}

	public void linkExited(HyperlinkEvent e) {}

	public boolean isPrimary() {
		return true;
	}

	public String getText() {
		return "Custom Actions";
	}
	
	public String getDescription() {
		return "Click to perform an action";
	}

	public boolean isSectionExpanded() {
		return true;
	}

}
