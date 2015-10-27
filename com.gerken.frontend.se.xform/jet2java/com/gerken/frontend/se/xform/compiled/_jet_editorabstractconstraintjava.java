package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editorabstractconstraintjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editorabstractconstraintjava() {
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
        out.write("import java.text.MessageFormat;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.StringTokenizer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public abstract class AbstractConstraint {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic AbstractConstraint() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic abstract int validate(Node targetNode, String changedAttributeName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String bind(String pattern, Object[] args) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn MessageFormat.format(pattern, args);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void addError(Node targetNode, String message) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tConstraintFailure cf = new ConstraintFailure(targetNode,ConstraintFailure.CONSTRAINT_ERROR,message,getShingleLabel());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tModelAccess.getInstance().addFailure(targetNode, cf);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic boolean present(String buffer) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn buffer.trim().length() > 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic boolean validName(String buffer) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (buffer.length() == 0) {return true; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (!Character.isJavaIdentifierStart(buffer.charAt(0))) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 1; i < buffer.length(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!Character.isJavaIdentifierPart(buffer.charAt(i))) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic boolean validNumber(String buffer) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (buffer.length() == 0) {return true; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tint start = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (buffer.charAt(0)=='-') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tstart = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (buffer.length() == 1) {return false; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = start; i < buffer.length(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!Character.isDigit(buffer.charAt(i))) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic boolean validPackageName(String buffer) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tStringTokenizer st = new StringTokenizer(buffer,\".\",true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tboolean dotNext = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twhile (st.hasMoreTokens()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tString level = st.nextToken();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (dotNext) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (!level.equals(\".\")) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdotNext = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (!Character.isJavaIdentifierStart(level.charAt(0))) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfor (int i = 1; i < level.length(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (!Character.isJavaIdentifierPart(level.charAt(i))) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdotNext = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic abstract String getShingleLabel();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
