package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editorabstractenumerationjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editorabstractenumerationjava() {
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
        out.write("import java.util.Vector;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.apache.xpath.XPathAPI;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.apache.xpath.objects.XObject;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.NodeList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("public abstract class AbstractEnumeration {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate boolean dynamic = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ShingleEditor\t editor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprotected String  key[] \t = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprotected String  text[] \t = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate\tNode \ttarget   = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic AbstractEnumeration(ShingleEditor editor) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.editor = editor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected ShingleEditor getEditor() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn editor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void gatherValues() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tArrayList<String> keys = new ArrayList<String>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tArrayList<String> values = new ArrayList<String>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\taddConstants(keys,values);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tkey = keys.toArray(new String[0]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttext = values.toArray(new String[0]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic abstract void addConstants(ArrayList<String> keys, ArrayList<String> values);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setTarget(Node target) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.target = target;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tkey = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttext = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Node getTarget() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn target;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String[] getKeys() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (dynamic || (key == null)) { gatherValues(); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn key;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String[] getTexts() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (dynamic || (text == null)) { gatherValues(); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getKey(int index) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn getKeys()[index];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getText(int index) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn getTexts()[index];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic int getKeyIndex(String _key) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetKeys();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < key.length; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (key[i].equals(_key)) { return i; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String textFor(String _key) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tint sel = getKeyIndex(_key);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (sel < 0) { return \"\"; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn getText(sel);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic int size() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn getKeys().length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Node[] retrieveNodes(Node snode, String expr) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (snode == null) { return new Node[0]; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ModelAccess.getInstance().getNodes(snode,expr);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String retrieveAttribute(Node aNode, String expr) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ModelAccess.getInstance().getAttribute(aNode,expr);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected void setAttribute(Node node, String name, String value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (node == null) { return; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tModelAccess.getInstance().setAttribute(node, name, value);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
