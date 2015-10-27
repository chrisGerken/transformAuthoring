package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editorerrorlistjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editorerrorlistjava() {
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
        out.write("import java.util.StringTokenizer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Composite;");  //$NON-NLS-1$        
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
        out.write("public class ErrorList extends AbstractIndex implements IModelChangedListener {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate Node sourceNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ArrayList<ConstraintFailure> cf;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ErrorList() {");  //$NON-NLS-1$        
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
        out.write("\t\tcf = ModelAccess.getInstance().failuresAtOrUnder(getSourceNode());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif (cf.isEmpty()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<li style=\\\"text\\\" >There are no errors in the data.</li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<li style=\\\"text\\\" >Use the links below to navigate to data in error.</li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < cf.size(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tString message = cf.get(i).getMessage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tString label   = cf.get(i).getShingleLabel();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (cf.get(i).getSeverity() == ConstraintFailure.CONSTRAINT_ERROR) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmessage = \"<span color=\\\"\" + getRedID() + \"\\\">\" + message + \"</span>\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmessage = \"<span color=\\\"\" + getYellowID() + \"\\\">\" + message + \"</span>\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<li style=\\\"text\\\" ><a href=\\\"\"+i+\"\\\">\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(label);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"</a>: \");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(message);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"</li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
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
        out.write("\t\tint index = Integer.parseInt(href);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tArrayList<Node> nodes = new ArrayList<Node>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNode targetNode = cf.get(index).getTargetNode();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tnodes.add(targetNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twhile (!targetNode.getNodeName().equals(\"root\")) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\ttargetNode = targetNode.getParentNode();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tnodes.add(0,targetNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < nodes.size(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\ttargetNode = nodes.get(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tAbstractShingle shingle = getShinglePart().getShingle(targetNode.getNodeName());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tshingle.setSourceNode(targetNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (i < (nodes.size()-1)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tString name = nodes.get(i+1).getNodeName();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tshingle.onlyExpandIndexFor(name);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tshingle.updateIndexes(nodes.get(i+1));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tshingle.onlyExpandIndexFor(\"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tshingle.updateIndexes(null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetShinglePart().showShingle(cf.get(index).getTargetNode().getNodeName());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void linkEntered(HyperlinkEvent e) {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void linkExited(HyperlinkEvent e) {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getDescription() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"Click to edit\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getTitle() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"Model Errors\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
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
        out.write(NL);         
        out.write("\tpublic void modelChanged() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tupdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
