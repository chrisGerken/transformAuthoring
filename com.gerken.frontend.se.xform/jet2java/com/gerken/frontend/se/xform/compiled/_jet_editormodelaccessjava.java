package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editormodelaccessjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editormodelaccessjava() {
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
        out.write("import javax.xml.xpath.XPath;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.xml.xpath.XPathConstants;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.xml.xpath.XPathFactory;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.w3c.dom.Element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.NamedNodeMap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.NodeList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ModelAccess {  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate static ModelAccess instance = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static String CF_KEY = \"ConstraintFailure\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ModelAccess() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic static ModelAccess getInstance() { ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (instance == null) { instance = new ModelAccess(); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn instance;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Node[] getNodes(Node sourceNode, String xpathExpresion) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (sourceNode == null) { return new Node[0]; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tXPathFactory factory = XPathFactory.newInstance();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tXPath xpath = factory.newXPath();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNodeList nodes = (NodeList) xpath.evaluate(xpathExpresion,sourceNode,XPathConstants.NODESET);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tVector<Node> v = new Vector<Node>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor(int itr = 0; itr < nodes.getLength(); itr++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tNode node = nodes.item(itr);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (node.getNodeType() == Node.ELEMENT_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tv.addElement(node);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode result[] = new Node[v.size()];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tv.copyInto(result);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} catch (Exception e) {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn new Node[0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getAttribute(Node sourceNode, String xpathAttributeExpression) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tXPathFactory factory = XPathFactory.newInstance();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tXPath xpath = factory.newXPath();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNodeList nodes = (NodeList) xpath.evaluate(xpathAttributeExpression,sourceNode,XPathConstants.NODESET);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor(int itr = 0; itr < nodes.getLength(); itr++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tNode node = nodes.item(itr);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (node.getNodeType() == Node.ATTRIBUTE_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn String.valueOf(node.getNodeValue());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} catch (Exception e) {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String bind(Node sourceNode,String pattern) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString buffer = pattern;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tint i = buffer.indexOf(\"{\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twhile (i > -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tint j = buffer.indexOf(\"}\",i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (j > -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tString prev = buffer.substring(0,i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tString attrExpr   = buffer.substring(i+1,j);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tString after  = buffer.substring(j+1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tbuffer = prev + getAttribute(sourceNode,attrExpr) + after;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ti = buffer.indexOf(\"{\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ti = -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn buffer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setAttribute(Node sourceNode, String attributeName, String value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (sourceNode == null) { return; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry { ((Element) sourceNode).setAttribute(attributeName, value); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcatch (Throwable t) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSystem.out.println(t);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void moveUp(Node sourceNode, Node previousNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNode parentNode = sourceNode.getParentNode();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparentNode.removeChild(sourceNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparentNode.insertBefore(sourceNode,previousNode);\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void moveDown(Node sourceNode, Node nextNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNode parentNode = sourceNode.getParentNode();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparentNode.removeChild(nextNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparentNode.insertBefore(nextNode,sourceNode);\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Node copyNode(Node sourceNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tElement newNode = sourceNode.getOwnerDocument().createElement(sourceNode.getNodeName());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNode parentNode = sourceNode.getParentNode();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparentNode.insertBefore(newNode,sourceNode);\t\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparentNode.removeChild(sourceNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparentNode.insertBefore(sourceNode,newNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn newNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void removeNode(Node sourceNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNode parentNode = sourceNode.getParentNode();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparentNode.removeChild(sourceNode);\t\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Node newNode(Node sourceNode, String childName) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tElement newNode = sourceNode.getOwnerDocument().createElement(childName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsourceNode.appendChild(newNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn newNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setFailures(Node targetNode, ArrayList<ConstraintFailure> cf) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttargetNode.setUserData(CF_KEY,cf,null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ArrayList<ConstraintFailure> getFailures(Node targetNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tArrayList<ConstraintFailure> cf = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcf = (ArrayList<ConstraintFailure>) targetNode.getUserData(CF_KEY);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (cf == null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcf = new ArrayList<ConstraintFailure>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn cf;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void clearFailures(Node targetNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetFailures(targetNode,new ArrayList<ConstraintFailure>());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void addFailure(Node targetNode, ConstraintFailure cf) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tArrayList<ConstraintFailure> cfs = getFailures(targetNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcfs.add(cf);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetFailures(targetNode,cfs);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ArrayList<ConstraintFailure> failuresAtOrUnder(Node targetNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif (targetNode == null) { return new ArrayList<ConstraintFailure>(); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tArrayList<ConstraintFailure> cf = new ArrayList<ConstraintFailure>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfailuresAtOrUnder(targetNode,cf);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn cf;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ArrayList<ConstraintFailure> failuresAtOrUnder(Node node, ArrayList<ConstraintFailure> cf) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tcf.addAll(getFailures(node));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNodeList nlist = node.getChildNodes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < nlist.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode kid = nlist.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfailuresAtOrUnder(kid,cf);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn cf;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
