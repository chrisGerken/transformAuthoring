package com.gerken.se.fromxml.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_recurse implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_recurse() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_1_1 = new TagInfo("c:if", //$NON-NLS-1$
            1, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($model/type[@name=name($current)])", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_addElement_2_1 = new TagInfo("c:addElement", //$NON-NLS-1$
            2, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "type", //$NON-NLS-1$
                "$model", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_3_1 = new TagInfo("c:set", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_35 = new TagInfo("c:get", //$NON-NLS-1$
            3, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "name($current)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_1 = new TagInfo("c:if", //$NON-NLS-1$
            4, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($type/@name = 'root')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_5_1 = new TagInfo("c:set", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_37 = new TagInfo("c:get", //$NON-NLS-1$
            5, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "name($current/..)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$model/type[@name=name($current)]", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$current/attribute::*", //$NON-NLS-1$
                "attr", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_1 = new TagInfo("c:if", //$NON-NLS-1$
            12, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($type/field[@name=name($attr)])", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_addElement_13_1 = new TagInfo("c:addElement", //$NON-NLS-1$
            13, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "field", //$NON-NLS-1$
                "$type", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_14_1 = new TagInfo("c:set", //$NON-NLS-1$
            14, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$field", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_36 = new TagInfo("c:get", //$NON-NLS-1$
            14, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "name($attr)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_15_1 = new TagInfo("c:set", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$field", //$NON-NLS-1$
                "kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_1 = new TagInfo("c:if", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "contains($attr,'|')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_stringTokens_17_2 = new TagInfo("c:stringTokens", //$NON-NLS-1$
            17, 2,
            new String[] {
                "name", //$NON-NLS-1$
                "string", //$NON-NLS-1$
                "delimitedBy", //$NON-NLS-1$
            },
            new String[] {
                "token", //$NON-NLS-1$
                "{$attr}", //$NON-NLS-1$
                "|", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_addElement_18_3 = new TagInfo("c:addElement", //$NON-NLS-1$
            18, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$field", //$NON-NLS-1$
                "value", //$NON-NLS-1$
                "value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_19_3 = new TagInfo("c:set", //$NON-NLS-1$
            19, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$value", //$NON-NLS-1$
                "key", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_37 = new TagInfo("c:get", //$NON-NLS-1$
            19, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$token/@value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_21_2 = new TagInfo("c:set", //$NON-NLS-1$
            21, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$field", //$NON-NLS-1$
                "kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_23_1 = new TagInfo("c:if", //$NON-NLS-1$
            23, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attr = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_24_2 = new TagInfo("c:set", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$field", //$NON-NLS-1$
                "kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$current/*", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_30_1 = new TagInfo("c:include", //$NON-NLS-1$
            30, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/recurse.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_1.setRuntimeParent(null);
        _jettag_c_if_1_1.setTagInfo(_td_c_if_1_1);
        _jettag_c_if_1_1.doStart(context, out);
        while (_jettag_c_if_1_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_addElement_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "addElement", "c:addElement", _td_c_addElement_2_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_addElement_2_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_addElement_2_1.setTagInfo(_td_c_addElement_2_1);
            _jettag_c_addElement_2_1.doStart(context, out);
            _jettag_c_addElement_2_1.doEnd();
            RuntimeTagElement _jettag_c_set_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_3_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_set_3_1.setTagInfo(_td_c_set_3_1);
            _jettag_c_set_3_1.doStart(context, out);
            JET2Writer _jettag_c_set_3_1_saved_out = out;
            while (_jettag_c_set_3_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_3_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_35.setRuntimeParent(_jettag_c_set_3_1);
                _jettag_c_get_3_35.setTagInfo(_td_c_get_3_35);
                _jettag_c_get_3_35.doStart(context, out);
                _jettag_c_get_3_35.doEnd();
                _jettag_c_set_3_1.handleBodyContent(out);
            }
            out = _jettag_c_set_3_1_saved_out;
            _jettag_c_set_3_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_4_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_if_4_1.setTagInfo(_td_c_if_4_1);
            _jettag_c_if_4_1.doStart(context, out);
            while (_jettag_c_if_4_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_set_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_5_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_5_1.setRuntimeParent(_jettag_c_if_4_1);
                _jettag_c_set_5_1.setTagInfo(_td_c_set_5_1);
                _jettag_c_set_5_1.doStart(context, out);
                JET2Writer _jettag_c_set_5_1_saved_out = out;
                while (_jettag_c_set_5_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_5_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_37); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_5_37.setRuntimeParent(_jettag_c_set_5_1);
                    _jettag_c_get_5_37.setTagInfo(_td_c_get_5_37);
                    _jettag_c_get_5_37.doStart(context, out);
                    _jettag_c_get_5_37.doEnd();
                    _jettag_c_set_5_1.handleBodyContent(out);
                }
                out = _jettag_c_set_5_1_saved_out;
                _jettag_c_set_5_1.doEnd();
                out.write(NL);         
                _jettag_c_if_4_1.handleBodyContent(out);
            }
            _jettag_c_if_4_1.doEnd();
            _jettag_c_if_1_1.handleBodyContent(out);
        }
        _jettag_c_if_1_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_9_1.setRuntimeParent(null);
        _jettag_c_setVariable_9_1.setTagInfo(_td_c_setVariable_9_1);
        _jettag_c_setVariable_9_1.doStart(context, out);
        _jettag_c_setVariable_9_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_1.setRuntimeParent(null);
        _jettag_c_iterate_11_1.setTagInfo(_td_c_iterate_11_1);
        _jettag_c_iterate_11_1.doStart(context, out);
        while (_jettag_c_iterate_11_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_12_1.setRuntimeParent(_jettag_c_iterate_11_1);
            _jettag_c_if_12_1.setTagInfo(_td_c_if_12_1);
            _jettag_c_if_12_1.doStart(context, out);
            while (_jettag_c_if_12_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_addElement_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "addElement", "c:addElement", _td_c_addElement_13_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_addElement_13_1.setRuntimeParent(_jettag_c_if_12_1);
                _jettag_c_addElement_13_1.setTagInfo(_td_c_addElement_13_1);
                _jettag_c_addElement_13_1.doStart(context, out);
                _jettag_c_addElement_13_1.doEnd();
                RuntimeTagElement _jettag_c_set_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_14_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_14_1.setRuntimeParent(_jettag_c_if_12_1);
                _jettag_c_set_14_1.setTagInfo(_td_c_set_14_1);
                _jettag_c_set_14_1.doStart(context, out);
                JET2Writer _jettag_c_set_14_1_saved_out = out;
                while (_jettag_c_set_14_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_14_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_36); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_36.setRuntimeParent(_jettag_c_set_14_1);
                    _jettag_c_get_14_36.setTagInfo(_td_c_get_14_36);
                    _jettag_c_get_14_36.doStart(context, out);
                    _jettag_c_get_14_36.doEnd();
                    _jettag_c_set_14_1.handleBodyContent(out);
                }
                out = _jettag_c_set_14_1_saved_out;
                _jettag_c_set_14_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_set_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_15_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_15_1.setRuntimeParent(_jettag_c_if_12_1);
                _jettag_c_set_15_1.setTagInfo(_td_c_set_15_1);
                _jettag_c_set_15_1.doStart(context, out);
                JET2Writer _jettag_c_set_15_1_saved_out = out;
                while (_jettag_c_set_15_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("text");  //$NON-NLS-1$        
                    _jettag_c_set_15_1.handleBodyContent(out);
                }
                out = _jettag_c_set_15_1_saved_out;
                _jettag_c_set_15_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_16_1.setRuntimeParent(_jettag_c_if_12_1);
                _jettag_c_if_16_1.setTagInfo(_td_c_if_16_1);
                _jettag_c_if_16_1.doStart(context, out);
                while (_jettag_c_if_16_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_stringTokens_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "stringTokens", "c:stringTokens", _td_c_stringTokens_17_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_stringTokens_17_2.setRuntimeParent(_jettag_c_if_16_1);
                    _jettag_c_stringTokens_17_2.setTagInfo(_td_c_stringTokens_17_2);
                    _jettag_c_stringTokens_17_2.doStart(context, out);
                    while (_jettag_c_stringTokens_17_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_addElement_18_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "addElement", "c:addElement", _td_c_addElement_18_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_addElement_18_3.setRuntimeParent(_jettag_c_stringTokens_17_2);
                        _jettag_c_addElement_18_3.setTagInfo(_td_c_addElement_18_3);
                        _jettag_c_addElement_18_3.doStart(context, out);
                        _jettag_c_addElement_18_3.doEnd();
                        out.write("\t\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_set_19_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_19_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_set_19_3.setRuntimeParent(_jettag_c_stringTokens_17_2);
                        _jettag_c_set_19_3.setTagInfo(_td_c_set_19_3);
                        _jettag_c_set_19_3.doStart(context, out);
                        JET2Writer _jettag_c_set_19_3_saved_out = out;
                        while (_jettag_c_set_19_3.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_get_19_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_37); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_19_37.setRuntimeParent(_jettag_c_set_19_3);
                            _jettag_c_get_19_37.setTagInfo(_td_c_get_19_37);
                            _jettag_c_get_19_37.doStart(context, out);
                            _jettag_c_get_19_37.doEnd();
                            _jettag_c_set_19_3.handleBodyContent(out);
                        }
                        out = _jettag_c_set_19_3_saved_out;
                        _jettag_c_set_19_3.doEnd();
                        out.write("    ");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_stringTokens_17_2.handleBodyContent(out);
                    }
                    _jettag_c_stringTokens_17_2.doEnd();
                    out.write("\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_21_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_21_2.setRuntimeParent(_jettag_c_if_16_1);
                    _jettag_c_set_21_2.setTagInfo(_td_c_set_21_2);
                    _jettag_c_set_21_2.doStart(context, out);
                    JET2Writer _jettag_c_set_21_2_saved_out = out;
                    while (_jettag_c_set_21_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("combo");  //$NON-NLS-1$        
                        _jettag_c_set_21_2.handleBodyContent(out);
                    }
                    out = _jettag_c_set_21_2_saved_out;
                    _jettag_c_set_21_2.doEnd();
                    out.write(NL);         
                    _jettag_c_if_16_1.handleBodyContent(out);
                }
                _jettag_c_if_16_1.doEnd();
                RuntimeTagElement _jettag_c_if_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_23_1.setRuntimeParent(_jettag_c_if_12_1);
                _jettag_c_if_23_1.setTagInfo(_td_c_if_23_1);
                _jettag_c_if_23_1.doStart(context, out);
                while (_jettag_c_if_23_1.okToProcessBody()) {
                    out.write("\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_24_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_24_2.setRuntimeParent(_jettag_c_if_23_1);
                    _jettag_c_set_24_2.setTagInfo(_td_c_set_24_2);
                    _jettag_c_set_24_2.doStart(context, out);
                    JET2Writer _jettag_c_set_24_2_saved_out = out;
                    while (_jettag_c_set_24_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("checkbox");  //$NON-NLS-1$        
                        _jettag_c_set_24_2.handleBodyContent(out);
                    }
                    out = _jettag_c_set_24_2_saved_out;
                    _jettag_c_set_24_2.doEnd();
                    out.write(NL);         
                    _jettag_c_if_23_1.handleBodyContent(out);
                }
                _jettag_c_if_23_1.doEnd();
                _jettag_c_if_12_1.handleBodyContent(out);
            }
            _jettag_c_if_12_1.doEnd();
            _jettag_c_iterate_11_1.handleBodyContent(out);
        }
        _jettag_c_iterate_11_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_29_1.setRuntimeParent(null);
        _jettag_c_iterate_29_1.setTagInfo(_td_c_iterate_29_1);
        _jettag_c_iterate_29_1.doStart(context, out);
        while (_jettag_c_iterate_29_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_30_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_30_1.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_include_30_1.setTagInfo(_td_c_include_30_1);
            _jettag_c_include_30_1.doStart(context, out);
            _jettag_c_include_30_1.doEnd();
            _jettag_c_iterate_29_1.handleBodyContent(out);
        }
        _jettag_c_iterate_29_1.doEnd();
    }
}
