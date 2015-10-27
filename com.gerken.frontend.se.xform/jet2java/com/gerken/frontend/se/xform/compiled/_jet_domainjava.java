package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_domainjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_domainjava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@domainPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_8 = new TagInfo("c:get", //$NON-NLS-1$
            5, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_8 = new TagInfo("c:get", //$NON-NLS-1$
            6, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_8 = new TagInfo("c:get", //$NON-NLS-1$
            7, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_14 = new TagInfo("c:get", //$NON-NLS-1$
            11, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$domain/@domainClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_9 = new TagInfo("c:get", //$NON-NLS-1$
            13, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$domain/@domainClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$domain/value", //$NON-NLS-1$
                "value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_13 = new TagInfo("c:get", //$NON-NLS-1$
            23, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$value/@key", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_15 = new TagInfo("c:get", //$NON-NLS-1$
            24, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$value/@displayText", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$domain/query", //$NON-NLS-1$
                "query", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_1 = new TagInfo("c:if", //$NON-NLS-1$
            28, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$query/@fromRoot = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_31_1 = new TagInfo("c:if", //$NON-NLS-1$
            31, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$query/@fromRoot = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_39 = new TagInfo("c:get", //$NON-NLS-1$
            35, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$query/@queryExpression", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_39 = new TagInfo("c:get", //$NON-NLS-1$
            37, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$query/@keyExpression", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_41 = new TagInfo("c:get", //$NON-NLS-1$
            38, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$query/@valueExpression", //$NON-NLS-1$
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
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_8.setRuntimeParent(null);
        _jettag_c_get_5_8.setTagInfo(_td_c_get_5_8);
        _jettag_c_get_5_8.doStart(context, out);
        _jettag_c_get_5_8.doEnd();
        out.write(".AbstractEnumeration;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_8.setRuntimeParent(null);
        _jettag_c_get_6_8.setTagInfo(_td_c_get_6_8);
        _jettag_c_get_6_8.doStart(context, out);
        _jettag_c_get_6_8.doEnd();
        out.write(".ModelAccess;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_8.setRuntimeParent(null);
        _jettag_c_get_7_8.setTagInfo(_td_c_get_7_8);
        _jettag_c_get_7_8.doStart(context, out);
        _jettag_c_get_7_8.doEnd();
        out.write(".ShingleEditor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.util.ArrayList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_14.setRuntimeParent(null);
        _jettag_c_get_11_14.setTagInfo(_td_c_get_11_14);
        _jettag_c_get_11_14.doStart(context, out);
        _jettag_c_get_11_14.doEnd();
        out.write(" extends AbstractEnumeration {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_9.setRuntimeParent(null);
        _jettag_c_get_13_9.setTagInfo(_td_c_get_13_9);
        _jettag_c_get_13_9.doStart(context, out);
        _jettag_c_get_13_9.doEnd();
        out.write("(ShingleEditor editor) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper(editor);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void addConstants(ArrayList<String> keys, ArrayList<String> values) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tNode current;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tModelAccess ma = ModelAccess.getInstance();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_22_1.setRuntimeParent(null);
        _jettag_c_iterate_22_1.setTagInfo(_td_c_iterate_22_1);
        _jettag_c_iterate_22_1.doStart(context, out);
        while (_jettag_c_iterate_22_1.okToProcessBody()) {
            out.write("\t\tkeys.add(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_23_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_13.setRuntimeParent(_jettag_c_iterate_22_1);
            _jettag_c_get_23_13.setTagInfo(_td_c_get_23_13);
            _jettag_c_get_23_13.doStart(context, out);
            _jettag_c_get_23_13.doEnd();
            out.write("\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tvalues.add(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_24_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_15.setRuntimeParent(_jettag_c_iterate_22_1);
            _jettag_c_get_24_15.setTagInfo(_td_c_get_24_15);
            _jettag_c_get_24_15.doStart(context, out);
            _jettag_c_get_24_15.doEnd();
            out.write("\");   ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_22_1.handleBodyContent(out);
        }
        _jettag_c_iterate_22_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_27_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_27_1.setRuntimeParent(null);
        _jettag_c_iterate_27_1.setTagInfo(_td_c_iterate_27_1);
        _jettag_c_iterate_27_1.doStart(context, out);
        while (_jettag_c_iterate_27_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_28_1.setRuntimeParent(_jettag_c_iterate_27_1);
            _jettag_c_if_28_1.setTagInfo(_td_c_if_28_1);
            _jettag_c_if_28_1.doStart(context, out);
            while (_jettag_c_if_28_1.okToProcessBody()) {
                out.write("\t\tcurrent = getTarget();");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_28_1.handleBodyContent(out);
            }
            _jettag_c_if_28_1.doEnd();
            RuntimeTagElement _jettag_c_if_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_31_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_31_1.setRuntimeParent(_jettag_c_iterate_27_1);
            _jettag_c_if_31_1.setTagInfo(_td_c_if_31_1);
            _jettag_c_if_31_1.doStart(context, out);
            while (_jettag_c_if_31_1.okToProcessBody()) {
                out.write("\t\tcurrent = getEditor.getRoot();");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_31_1.handleBodyContent(out);
            }
            _jettag_c_if_31_1.doEnd();
            out.write("\t\tif (current != null) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tNode node[] = ma.getNodes(current,\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_39); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_39.setRuntimeParent(_jettag_c_iterate_27_1);
            _jettag_c_get_35_39.setTagInfo(_td_c_get_35_39);
            _jettag_c_get_35_39.doStart(context, out);
            _jettag_c_get_35_39.doEnd();
            out.write("\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tfor (int i = 0; i < node.length; i++) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tkeys.add(ma.getAttribute(node[i],\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_37_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_39); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_39.setRuntimeParent(_jettag_c_iterate_27_1);
            _jettag_c_get_37_39.setTagInfo(_td_c_get_37_39);
            _jettag_c_get_37_39.doStart(context, out);
            _jettag_c_get_37_39.doEnd();
            out.write("\"));");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tvalues.add(ma.getAttribute(node[i],\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_38_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_38_41.setRuntimeParent(_jettag_c_iterate_27_1);
            _jettag_c_get_38_41.setTagInfo(_td_c_get_38_41);
            _jettag_c_get_38_41.doStart(context, out);
            _jettag_c_get_38_41.doEnd();
            out.write("\"));");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_27_1.handleBodyContent(out);
        }
        _jettag_c_iterate_27_1.doEnd();
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
