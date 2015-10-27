package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editorabstractshinglejava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editorabstractshinglejava() {
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
        out.write("import org.eclipse.swt.SWT;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.layout.GridData;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.layout.GridLayout;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Composite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Label;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.FormToolkit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("public abstract class AbstractShingle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate Composite\t\tshingle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Label\t\t\tconstraintMessage;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Node\t\t\tsourceNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate boolean\t\t\tfillingFields;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate AbstractConstraint validator;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ShingleEditor\teditor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic AbstractShingle() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setSourceNode(Node sourceNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.sourceNode = sourceNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfillFields();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Node getSourceNode() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn sourceNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Composite createShingle(Composite parent, FormToolkit toolkit, ShingleEditor editor) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.setEditor(editor);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tshingle = toolkit.createComposite(parent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tGridLayout gl = new GridLayout();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl.numColumns = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tshingle.setLayout(gl);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tGridData gd = new GridData(SWT.DEFAULT,SWT.DEFAULT);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd.verticalAlignment = SWT.BEGINNING;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tshingle.setLayoutData(gd);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\taddContent(toolkit);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn shingle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void addContent(FormToolkit toolkit) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\taddFormSections(shingle,toolkit);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\taddIndexSections(shingle,toolkit,editor);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic abstract void addIndexSections(Composite shingle2, FormToolkit toolkit, ShingleEditor editor);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Composite getShingle() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn shingle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setEditor(ShingleEditor editor) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.editor = editor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ShingleEditor getEditor() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn editor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected abstract void addFormSections(Composite shingle, FormToolkit toolkit);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected abstract void fillFields();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setFillingFields(boolean fillingFields) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.fillingFields = fillingFields;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic boolean isFillingFields() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn fillingFields;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setValidator(AbstractConstraint validator) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.validator = validator;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic AbstractConstraint getValidator() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (validator == null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvalidator = createValidator();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn validator;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic abstract AbstractConstraint createValidator();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void clearFailureDisplay() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetConstraintMessage().setVisible(false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void displayFirstFailure(String message) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetConstraintMessage().setVisible(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetConstraintMessage().setText(message);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetShingle().layout(true,true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getFirstContraintErrorText() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tArrayList<ConstraintFailure> cf = ModelAccess.getInstance().getFailures(getSourceNode());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (cf.isEmpty()) { return \"\"; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn cf.get(0).getMessage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setConstraintMessage(Label constraintMessage) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.constraintMessage = constraintMessage;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Label getConstraintMessage() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn constraintMessage;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void updateConstraintMessage() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString message = getFirstContraintErrorText();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (message.length() > 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdisplayFirstFailure(message);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tclearFailureDisplay();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic abstract void setFocus();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic abstract void onlyExpandIndexFor(String nodeName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic abstract AbstractIndex getIndexFor(String nodeName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic abstract void updateIndexes(Node node);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic abstract AbstractShingle getShingleToLeft();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void addFillSpace(FormToolkit toolkit, Composite section, int columns) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tLabel label = toolkit.createLabel(section,\"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tGridData gd = new GridData(ShingleEditor.MAX_WIDTH,SWT.FILL,true,false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd.horizontalSpan = columns;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd.widthHint = ShingleEditor.MAX_WIDTH;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlabel.setLayoutData(gd);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlabel.setVisible(false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
