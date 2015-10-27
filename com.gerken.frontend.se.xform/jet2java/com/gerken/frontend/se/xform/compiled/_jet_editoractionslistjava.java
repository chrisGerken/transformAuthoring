package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editoractionslistjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editoractionslistjava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/pattern", //$NON-NLS-1$
                "pattern", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_48 = new TagInfo("c:get", //$NON-NLS-1$
            51, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pattern/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_95 = new TagInfo("c:get", //$NON-NLS-1$
            51, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pattern/@desc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_65_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            65, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/pattern", //$NON-NLS-1$
                "pattern", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_12 = new TagInfo("c:get", //$NON-NLS-1$
            67, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pattern/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_81 = new TagInfo("c:get", //$NON-NLS-1$
            74, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pattern/@desc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_56 = new TagInfo("c:get", //$NON-NLS-1$
            77, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pattern/@id", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.util.ArrayList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.eclipse.core.runtime.IStatus;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.core.runtime.NullProgressMonitor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jet.JET2Platform;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jface.dialogs.ErrorDialog;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jface.dialogs.MessageDialog;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Composite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Shell;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.events.HyperlinkEvent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.FormToolkit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.Section;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ActionsList extends AbstractIndex implements IModelChangedListener {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate Node sourceNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Node target[];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ActionsList() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Section createIndexSection(Composite shingle, FormToolkit toolkit,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tShingleEditor part) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSection aSection = super.createIndexSection(shingle, toolkit, part);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tpart.addModelChagedListener(this);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn aSection;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getTextContent() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tStringBuffer sb = new StringBuffer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsb.append(\"<form>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tArrayList<ConstraintFailure> cf = ModelAccess.getInstance().failuresAtOrUnder(getSourceNode());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif (cf.isEmpty()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<li style=\\\"text\\\" >There are no errors in the data.</li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<li style=\\\"text\\\" >There are <a href=\\\"errors\\\">\"+cf.size()+\" error(s)</a> in this model.</li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("//\t\tsb.append(\"<li style=\\\"text\\\" >There are no actions available.</li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\tsb.append(\"<li style=\\\"text\\\" >  </li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_50_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_50_1.setRuntimeParent(null);
        _jettag_c_iterate_50_1.setTagInfo(_td_c_iterate_50_1);
        _jettag_c_iterate_50_1.doStart(context, out);
        while (_jettag_c_iterate_50_1.okToProcessBody()) {
            out.write("\t\tsb.append(\"<li style=\\\"text\\\" ><a href=\\\"gen.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_51_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_51_48.setRuntimeParent(_jettag_c_iterate_50_1);
            _jettag_c_get_51_48.setTagInfo(_td_c_get_51_48);
            _jettag_c_get_51_48.doStart(context, out);
            _jettag_c_get_51_48.doEnd();
            out.write("\\\">Generate</a> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_51_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_51_95.setRuntimeParent(_jettag_c_iterate_50_1);
            _jettag_c_get_51_95.setTagInfo(_td_c_get_51_95);
            _jettag_c_get_51_95.doStart(context, out);
            _jettag_c_get_51_95.doEnd();
            out.write(".</li>\");");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_50_1.handleBodyContent(out);
        }
        _jettag_c_iterate_50_1.doEnd();
        out.write("\t\tsb.append(\"</form>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn sb.toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void linkActivated(HyperlinkEvent e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString href = e.getHref().toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (\"errors\".equals(href)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().getRootShingle().onlyExpandIndexFor(\"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn;\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_65_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_65_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_65_1.setRuntimeParent(null);
        _jettag_c_iterate_65_1.setTagInfo(_td_c_iterate_65_1);
        _jettag_c_iterate_65_1.doStart(context, out);
        while (_jettag_c_iterate_65_1.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif (\"gen.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_12.setRuntimeParent(_jettag_c_iterate_65_1);
            _jettag_c_get_67_12.setTagInfo(_td_c_get_67_12);
            _jettag_c_get_67_12.doStart(context, out);
            _jettag_c_get_67_12.doEnd();
            out.write("\".equals(href)) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tArrayList<ConstraintFailure> cf = ModelAccess.getInstance().failuresAtOrUnder(getSourceNode());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tboolean proceed = true;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tif (cf.size() > 0) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tproceed = MessageDialog.openConfirm(new Shell(),\"Errors Exist in Model\",\"Errors in the model may cause the generation to fail.  Do you wish to continue?\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tif (!proceed) { return; }");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tproceed = MessageDialog.openConfirm(new Shell(),\"Begin Generation\",\"Generate ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_74_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_81); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_74_81.setRuntimeParent(_jettag_c_iterate_65_1);
            _jettag_c_get_74_81.setTagInfo(_td_c_get_74_81);
            _jettag_c_get_74_81.doStart(context, out);
            _jettag_c_get_74_81.doEnd();
            out.write("?\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tif (!proceed) { return; }");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tString xmlRepresentation = DataWriter.getInstance().format(getShinglePart().getModel());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tIStatus status = JET2Platform.runTransformOnString(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_77_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_77_56.setRuntimeParent(_jettag_c_iterate_65_1);
            _jettag_c_get_77_56.setTagInfo(_td_c_get_77_56);
            _jettag_c_get_77_56.doStart(context, out);
            _jettag_c_get_77_56.doEnd();
            out.write("\", xmlRepresentation, new NullProgressMonitor());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tif ((status.getSeverity() == IStatus.OK) | (status.getSeverity() == IStatus.INFO)) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tMessageDialog.openInformation(new Shell(),\"Generation was sucessful\",status.getMessage());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t} else {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tErrorDialog.openError(new Shell(),\"Generation completed with errors\",status.getMessage(),status);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_65_1.handleBodyContent(out);
        }
        _jettag_c_iterate_65_1.doEnd();
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void linkEntered(HyperlinkEvent e) {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void linkExited(HyperlinkEvent e) {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getDescription() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"Dashboard actions\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getTitle() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"Summary\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void modelChanged() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tupdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
