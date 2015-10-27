package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editorabstractindexjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editorabstractindexjava() {
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
        out.write("import org.eclipse.swt.SWT;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.SWTException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.layout.GridData;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.layout.GridLayout;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Composite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.events.IHyperlinkListener;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.ExpandableComposite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.FormText;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.FormToolkit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.Section;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.TableWrapData;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("public abstract class AbstractIndex implements IHyperlinkListener {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate\tSection\t\tsection;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate FormText \tformText;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Node\t\tselectedElement = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Node \t\tsourceNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static String delete_key \t= \"img_delete\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static String up_key \t\t= \"img_up\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static String down_key \t\t= \"img_down\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static String copy_key \t\t= \"img_copy\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static String edit_key \t\t= \"img_edits\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate ShingleEditor\tpart;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic AbstractIndex() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Section createIndexSection(Composite shingle, FormToolkit toolkit, ShingleEditor part) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tGridLayout \tgl;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tGridData \tgd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.part = part;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection = toolkit.createSection(shingle,ExpandableComposite.TITLE_BAR|ExpandableComposite.TWISTIE|ExpandableComposite.EXPANDED); // Section.DESCRIPTION|");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl = new GridLayout();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl.numColumns = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setLayout(gl);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd = new GridData(SWT.FILL,SWT.FILL,true,false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd.widthHint = ShingleEditor.MAX_WIDTH;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd.verticalAlignment = SWT.BEGINNING;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setLayoutData(gd);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setDescription(getDescription());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setText(getTitle());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tformText = toolkit.createFormText(section, false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry { ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tformText.setText(getTextContent(), true, false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tformText.setImage(delete_key, getShinglePart().getDeleteImage());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tformText.setImage(up_key, getShinglePart().getUpImage());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tformText.setImage(down_key, getShinglePart().getDownImage());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tformText.setImage(copy_key, getShinglePart().getCopyImage());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tformText.setImage(edit_key, getShinglePart().getEditImage());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} catch (SWTException e) { formText.setText(\"\", false, false); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\ttext.setImage(\"page\", image);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setClient(formText);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tformText.addHyperlinkListener(this);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tformText.setColor(getRedID(),toolkit.getColors().getColor(getRedID()));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tformText.setColor(getBlueID(),toolkit.getColors().getColor(getBlueID()));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tformText.setColor(getGreenID(),toolkit.getColors().getColor(getGreenID()));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tformText.setColor(getYellowID(),toolkit.getColors().getColor(getYellowID()));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn section;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getDeleteKey() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn delete_key;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getUpKey() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn up_key;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getDownKey() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn down_key;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getCopyKey() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn copy_key;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getEditKey() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn edit_key;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void update() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry { formText.setText(getTextContent(), true, false); } ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcatch (SWTException e) { formText.setText(\"\", false, false); } ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetShinglePart().resize();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic abstract String getTitle(); ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic abstract String getDescription();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected abstract String getTextContent();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Section getSection() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn section;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected String getYellowID() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ShingleEditor.YELLOW_ID;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected String getGreenID() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ShingleEditor.GREEN_ID;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected String getBlueID() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ShingleEditor.BLUE_ID;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected String getRedID() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ShingleEditor.RED_ID;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ShingleEditor getShinglePart() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn part;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setSelectedElement(Node element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.selectedElement = element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Node getSelectedElement() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn selectedElement;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void clearSelectedElement() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.selectedElement = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setSourceNode(Node sourceNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.sourceNode = sourceNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tupdate();");  //$NON-NLS-1$        
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
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
