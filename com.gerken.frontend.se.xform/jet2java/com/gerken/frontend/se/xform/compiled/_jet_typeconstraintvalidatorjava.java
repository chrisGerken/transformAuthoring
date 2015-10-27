package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_typeconstraintvalidatorjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_typeconstraintvalidatorjava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@constraintPackage", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_8_14 = new TagInfo("c:get", //$NON-NLS-1$
            8, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@validatorClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_9 = new TagInfo("c:get", //$NON-NLS-1$
            10, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@validatorClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_19_1 = new TagInfo("c:if", //$NON-NLS-1$
            19, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$field/constraint", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_45 = new TagInfo("c:get", //$NON-NLS-1$
            20, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$field/constraint", //$NON-NLS-1$
                "constraint", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_23_1 = new TagInfo("c:choose", //$NON-NLS-1$
            23, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$constraint/@kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_24_1 = new TagInfo("c:when", //$NON-NLS-1$
            24, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                " 'java.package' ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_23 = new TagInfo("c:get", //$NON-NLS-1$
            26, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@label", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_31_1 = new TagInfo("c:when", //$NON-NLS-1$
            31, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                " 'name' ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_23 = new TagInfo("c:get", //$NON-NLS-1$
            33, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@label", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_38_1 = new TagInfo("c:when", //$NON-NLS-1$
            38, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                " 'required' ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_39_1 = new TagInfo("c:if", //$NON-NLS-1$
            39, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$constraint/@ifPresent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_51 = new TagInfo("c:get", //$NON-NLS-1$
            40, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$constraint/@ifPresent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_43_1 = new TagInfo("c:if", //$NON-NLS-1$
            43, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($constraint/@ifPresent)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_23 = new TagInfo("c:get", //$NON-NLS-1$
            46, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@label", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_51_1 = new TagInfo("c:when", //$NON-NLS-1$
            51, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                " 'number' ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_23 = new TagInfo("c:get", //$NON-NLS-1$
            53, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@label", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_58_1 = new TagInfo("c:when", //$NON-NLS-1$
            58, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                " 'unique' ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_59_45 = new TagInfo("c:iterate", //$NON-NLS-1$
            59, 45,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "number($constraint/@levels)", //$NON-NLS-1$
                "index", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_59_120 = new TagInfo("c:iterate", //$NON-NLS-1$
            59, 120,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "number($constraint/@levels)-1", //$NON-NLS-1$
                "index", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_196 = new TagInfo("c:get", //$NON-NLS-1$
            59, 196,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_227 = new TagInfo("c:get", //$NON-NLS-1$
            59, 227,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_23 = new TagInfo("c:get", //$NON-NLS-1$
            61, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@label", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_11 = new TagInfo("c:get", //$NON-NLS-1$
            76, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleLabel", //$NON-NLS-1$
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
        out.write(".AbstractConstraint;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_8.setRuntimeParent(null);
        _jettag_c_get_6_8.setTagInfo(_td_c_get_6_8);
        _jettag_c_get_6_8.doStart(context, out);
        _jettag_c_get_6_8.doEnd();
        out.write(".ModelAccess;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_14.setRuntimeParent(null);
        _jettag_c_get_8_14.setTagInfo(_td_c_get_8_14);
        _jettag_c_get_8_14.doStart(context, out);
        _jettag_c_get_8_14.doEnd();
        out.write(" extends AbstractConstraint {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_9.setRuntimeParent(null);
        _jettag_c_get_10_9.setTagInfo(_td_c_get_10_9);
        _jettag_c_get_10_9.doStart(context, out);
        _jettag_c_get_10_9.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic int validate(Node targetNode, String changedAttributeName) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString buffer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tModelAccess access = ModelAccess.getInstance();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\taccess.clearFailures(targetNode);");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_17_1.setRuntimeParent(null);
        _jettag_c_iterate_17_1.setTagInfo(_td_c_iterate_17_1);
        _jettag_c_iterate_17_1.doStart(context, out);
        while (_jettag_c_iterate_17_1.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_19_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_19_1.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_if_19_1.setTagInfo(_td_c_if_19_1);
            _jettag_c_if_19_1.doStart(context, out);
            while (_jettag_c_if_19_1.okToProcessBody()) {
                out.write("\t\tbuffer = access.getAttribute(targetNode,\"@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_20_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_45); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_45.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_c_get_20_45.setTagInfo(_td_c_get_20_45);
                _jettag_c_get_20_45.doStart(context, out);
                _jettag_c_get_20_45.doEnd();
                out.write("\");");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_19_1.handleBodyContent(out);
            }
            _jettag_c_if_19_1.doEnd();
            RuntimeTagElement _jettag_c_iterate_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_22_1.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_c_iterate_22_1.setTagInfo(_td_c_iterate_22_1);
            _jettag_c_iterate_22_1.doStart(context, out);
            while (_jettag_c_iterate_22_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_choose_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_23_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_23_1.setRuntimeParent(_jettag_c_iterate_22_1);
                _jettag_c_choose_23_1.setTagInfo(_td_c_choose_23_1);
                _jettag_c_choose_23_1.doStart(context, out);
                JET2Writer _jettag_c_choose_23_1_saved_out = out;
                while (_jettag_c_choose_23_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_24_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_24_1.setRuntimeParent(_jettag_c_choose_23_1);
                    _jettag_c_when_24_1.setTagInfo(_td_c_when_24_1);
                    _jettag_c_when_24_1.doStart(context, out);
                    JET2Writer _jettag_c_when_24_1_saved_out = out;
                    while (_jettag_c_when_24_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t\tif (!validPackageName(buffer)) {");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tObject args[] = { \"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_26_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_23); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_26_23.setRuntimeParent(_jettag_c_when_24_1);
                        _jettag_c_get_26_23.setTagInfo(_td_c_get_26_23);
                        _jettag_c_get_26_23.doStart(context, out);
                        _jettag_c_get_26_23.doEnd();
                        out.write("\" };");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tString message = bind(\"{0} must be a valid java package name\",args);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\taddError(targetNode,message);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t}");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_24_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_24_1_saved_out;
                    _jettag_c_when_24_1.doEnd();
                    RuntimeTagElement _jettag_c_when_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_31_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_31_1.setRuntimeParent(_jettag_c_choose_23_1);
                    _jettag_c_when_31_1.setTagInfo(_td_c_when_31_1);
                    _jettag_c_when_31_1.doStart(context, out);
                    JET2Writer _jettag_c_when_31_1_saved_out = out;
                    while (_jettag_c_when_31_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t\tif (!validName(buffer)) {");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tObject args[] = { \"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_33_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_23); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_33_23.setRuntimeParent(_jettag_c_when_31_1);
                        _jettag_c_get_33_23.setTagInfo(_td_c_get_33_23);
                        _jettag_c_get_33_23.doStart(context, out);
                        _jettag_c_get_33_23.doEnd();
                        out.write("\" };");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tString message = bind(\"{0} must be a valid name\",args);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\taddError(targetNode,message);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t}");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_31_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_31_1_saved_out;
                    _jettag_c_when_31_1.doEnd();
                    RuntimeTagElement _jettag_c_when_38_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_38_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_38_1.setRuntimeParent(_jettag_c_choose_23_1);
                    _jettag_c_when_38_1.setTagInfo(_td_c_when_38_1);
                    _jettag_c_when_38_1.doStart(context, out);
                    JET2Writer _jettag_c_when_38_1_saved_out = out;
                    while (_jettag_c_when_38_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_if_39_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_39_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_39_1.setRuntimeParent(_jettag_c_when_38_1);
                        _jettag_c_if_39_1.setTagInfo(_td_c_if_39_1);
                        _jettag_c_if_39_1.doStart(context, out);
                        while (_jettag_c_if_39_1.okToProcessBody()) {
                            out.write("\t\tString other = access.getAttribute(targetNode,\"@");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_40_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_51); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_40_51.setRuntimeParent(_jettag_c_if_39_1);
                            _jettag_c_get_40_51.setTagInfo(_td_c_get_40_51);
                            _jettag_c_get_40_51.doStart(context, out);
                            _jettag_c_get_40_51.doEnd();
                            out.write("\");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\tif ((other.length() > 0) && !present(buffer)) {");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_39_1.handleBodyContent(out);
                        }
                        _jettag_c_if_39_1.doEnd();
                        RuntimeTagElement _jettag_c_if_43_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_43_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_43_1.setRuntimeParent(_jettag_c_when_38_1);
                        _jettag_c_if_43_1.setTagInfo(_td_c_if_43_1);
                        _jettag_c_if_43_1.doStart(context, out);
                        while (_jettag_c_if_43_1.okToProcessBody()) {
                            out.write("\t\tif (!present(buffer)) {");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_43_1.handleBodyContent(out);
                        }
                        _jettag_c_if_43_1.doEnd();
                        out.write("\t\t\tObject args[] = { \"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_46_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_23); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_46_23.setRuntimeParent(_jettag_c_when_38_1);
                        _jettag_c_get_46_23.setTagInfo(_td_c_get_46_23);
                        _jettag_c_get_46_23.doStart(context, out);
                        _jettag_c_get_46_23.doEnd();
                        out.write("\" };");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tString message = bind(\"{0} can not be blank\",args);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\taddError(targetNode,message);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t}");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_38_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_38_1_saved_out;
                    _jettag_c_when_38_1.doEnd();
                    RuntimeTagElement _jettag_c_when_51_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_51_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_51_1.setRuntimeParent(_jettag_c_choose_23_1);
                    _jettag_c_when_51_1.setTagInfo(_td_c_when_51_1);
                    _jettag_c_when_51_1.doStart(context, out);
                    JET2Writer _jettag_c_when_51_1_saved_out = out;
                    while (_jettag_c_when_51_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t\tif (!validNumber(buffer)) {");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tObject args[] = { \"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_53_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_23); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_53_23.setRuntimeParent(_jettag_c_when_51_1);
                        _jettag_c_get_53_23.setTagInfo(_td_c_get_53_23);
                        _jettag_c_get_53_23.doStart(context, out);
                        _jettag_c_get_53_23.doEnd();
                        out.write("\" };");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tString message = bind(\"{0} must be a valid number\",args);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\taddError(targetNode,message);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t}");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_51_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_51_1_saved_out;
                    _jettag_c_when_51_1.doEnd();
                    RuntimeTagElement _jettag_c_when_58_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_58_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_58_1.setRuntimeParent(_jettag_c_choose_23_1);
                    _jettag_c_when_58_1.setTagInfo(_td_c_when_58_1);
                    _jettag_c_when_58_1.doStart(context, out);
                    JET2Writer _jettag_c_when_58_1_saved_out = out;
                    while (_jettag_c_when_58_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t\tNode node[] = access.getNodes(targetNode,\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_59_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_59_45); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_59_45.setRuntimeParent(_jettag_c_when_58_1);
                        _jettag_c_iterate_59_45.setTagInfo(_td_c_iterate_59_45);
                        _jettag_c_iterate_59_45.doStart(context, out);
                        while (_jettag_c_iterate_59_45.okToProcessBody()) {
                            out.write("../");  //$NON-NLS-1$        
                            _jettag_c_iterate_59_45.handleBodyContent(out);
                        }
                        _jettag_c_iterate_59_45.doEnd();
                        RuntimeTagElement _jettag_c_iterate_59_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_59_120); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_59_120.setRuntimeParent(_jettag_c_when_58_1);
                        _jettag_c_iterate_59_120.setTagInfo(_td_c_iterate_59_120);
                        _jettag_c_iterate_59_120.doStart(context, out);
                        while (_jettag_c_iterate_59_120.okToProcessBody()) {
                            out.write("*/");  //$NON-NLS-1$        
                            _jettag_c_iterate_59_120.handleBodyContent(out);
                        }
                        _jettag_c_iterate_59_120.doEnd();
                        RuntimeTagElement _jettag_c_get_59_196 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_196); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_59_196.setRuntimeParent(_jettag_c_when_58_1);
                        _jettag_c_get_59_196.setTagInfo(_td_c_get_59_196);
                        _jettag_c_get_59_196.doStart(context, out);
                        _jettag_c_get_59_196.doEnd();
                        out.write("[@");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_59_227 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_227); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_59_227.setRuntimeParent(_jettag_c_when_58_1);
                        _jettag_c_get_59_227.setTagInfo(_td_c_get_59_227);
                        _jettag_c_get_59_227.doStart(context, out);
                        _jettag_c_get_59_227.doEnd();
                        out.write("='\"+buffer+\"']\");");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\tif (node.length > 1) {");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tObject args[] = { \"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_61_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_23); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_61_23.setRuntimeParent(_jettag_c_when_58_1);
                        _jettag_c_get_61_23.setTagInfo(_td_c_get_61_23);
                        _jettag_c_get_61_23.doStart(context, out);
                        _jettag_c_get_61_23.doEnd();
                        out.write("\" };");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\tString message = bind(\"{0} must be a unique value\",args);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t\taddError(targetNode,message);");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("\t\t}");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_58_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_58_1_saved_out;
                    _jettag_c_when_58_1.doEnd();
                    _jettag_c_choose_23_1.handleBodyContent(out);
                }
                out = _jettag_c_choose_23_1_saved_out;
                _jettag_c_choose_23_1.doEnd();
                _jettag_c_iterate_22_1.handleBodyContent(out);
            }
            _jettag_c_iterate_22_1.doEnd();
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_17_1.handleBodyContent(out);
        }
        _jettag_c_iterate_17_1.doEnd();
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn access.getFailures(targetNode).size();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getShingleLabel() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_76_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_76_11.setRuntimeParent(null);
        _jettag_c_get_76_11.setTagInfo(_td_c_get_76_11);
        _jettag_c_get_76_11.doStart(context, out);
        _jettag_c_get_76_11.doEnd();
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
