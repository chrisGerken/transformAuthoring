package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editordatawriterjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editordatawriterjava() {
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
        out.write("import org.w3c.dom.Document;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.NamedNodeMap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.NodeList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class DataWriter {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate static DataWriter instance = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate String indentString = \"\\t\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate DataWriter() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic static DataWriter getInstance() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (instance == null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tinstance = new DataWriter();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn instance;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String format(Document doc) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdoc.normalizeDocument();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tStringBuffer sb = new StringBuffer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString indent = \"\\r\\n\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNodeList nlist = doc.getChildNodes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < nlist.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode kid = nlist.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (kid.getNodeType() == Node.ELEMENT_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\twrite((Element)kid,sb,indent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn sb.toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void write(Element element, StringBuffer sb, String indent) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (!hasKids(element) & !hasContent(element)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(indent).append(\"<\"+element.getNodeName());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNamedNodeMap map = element.getAttributes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (int i = 0; i < map.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tNode n = map.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tsb.append(\" \"+n.getNodeName()+\"=\\\"\"+deEntify(n.getNodeValue())+\"\\\"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"/>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tString nodeName = element.getNodeName();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(indent).append(\"<\"+nodeName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNamedNodeMap map = element.getAttributes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (int i = 0; i < map.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tNode n = map.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tString attrName = n.getNodeName();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tString attrValue = n.getNodeValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tsb.append(\" \"+attrName+\"=\\\"\"+deEntify(attrValue)+\"\\\"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\">\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNodeList nlist = element.getChildNodes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (int i = 0; i < nlist.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tNode kid = nlist.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tint nodeType = kid.getNodeType();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (nodeType == Node.ELEMENT_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\twrite((Element)kid,sb,indent+indentString);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tnote(kid);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (hasContent(element)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tsb.append(deEntify(getContent(element)));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tsb.append(\"</\"+element.getNodeName()+\">\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tsb.append(indent).append(\"</\"+element.getNodeName()+\">\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate void note(Node kid) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate String deEntify(String buffer) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tStringBuffer sb = new StringBuffer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < buffer.length(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tchar c = buffer.charAt(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (c == '&') { sb.append(\"&amp;\"); } ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (c == '<') { sb.append(\"&lt;\"); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (c == '>') { sb.append(\"&gt;\"); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (c == '\\'') { sb.append(\"&apos;\"); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (c == '\"') { sb.append(\"&quot;\"); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\t\telse if (c == '%') { sb.append(\"&pct;\"); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {sb.append(c); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn sb.toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate String getContent(Element element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNodeList nlist = element.getChildNodes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < nlist.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode kid = nlist.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (kid.getNodeType() == Node.TEXT_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn ((Text)kid).getNodeValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate boolean hasContent(Element element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNodeList nlist = element.getChildNodes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < nlist.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode kid = nlist.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (kid.getNodeType() == Node.TEXT_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate boolean hasKids(Element element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNodeList nlist = element.getChildNodes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < nlist.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode kid = nlist.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (kid.getNodeType() == Node.ELEMENT_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
