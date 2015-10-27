package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editorconstraintfailurejava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editorconstraintfailurejava() {
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
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ConstraintFailure {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate Node \ttargetNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate int\t\tseverity;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate String \tmessage;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate String  shingleLabel;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static int CONSTRAINT_INFO\t = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static int CONSTRAINT_WARNING = 3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static int CONSTRAINT_ERROR \t = 4;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ConstraintFailure(Node targetNode, int severity, String message, String shingleLabel) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.targetNode = targetNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.severity   = severity;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.message    = message;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.shingleLabel = shingleLabel;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Node getTargetNode() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn targetNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setTargetNode(Node targetNode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.targetNode = targetNode;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic int getSeverity() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn severity;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setSeverity(int severity) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.severity = severity;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getMessage() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn message;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setMessage(String message) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.message = message;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getShingleLabel() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn shingleLabel;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
