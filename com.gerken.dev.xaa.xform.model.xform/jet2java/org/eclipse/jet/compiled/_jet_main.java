package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_3_1 = new TagInfo("c:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not(isVariableDefined(root))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/model", //$NON-NLS-1$
                "model", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_17_5 = new TagInfo("c:set", //$NON-NLS-1$
            17, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$model", //$NON-NLS-1$
                "srcProject", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$model/element", //$NON-NLS-1$
                "element", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_25_9 = new TagInfo("c:set", //$NON-NLS-1$
            25, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$element", //$NON-NLS-1$
                "elementJava", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_53 = new TagInfo("c:get", //$NON-NLS-1$
            25, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_32_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            32, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/property", //$NON-NLS-1$
                "property", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_33_13 = new TagInfo("c:set", //$NON-NLS-1$
            33, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$property", //$NON-NLS-1$
                "getterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_62 = new TagInfo("c:get", //$NON-NLS-1$
            33, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($property/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_34_13 = new TagInfo("c:set", //$NON-NLS-1$
            34, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$property", //$NON-NLS-1$
                "setterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_62 = new TagInfo("c:get", //$NON-NLS-1$
            34, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($property/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_48_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            48, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/nested", //$NON-NLS-1$
                "nested", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_49_13 = new TagInfo("c:set", //$NON-NLS-1$
            49, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$nested", //$NON-NLS-1$
                "varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_52 = new TagInfo("c:get", //$NON-NLS-1$
            49, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($nested/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_50_13 = new TagInfo("c:set", //$NON-NLS-1$
            50, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$nested", //$NON-NLS-1$
                "listVarName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_56 = new TagInfo("c:get", //$NON-NLS-1$
            50, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_93_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            93, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/model", //$NON-NLS-1$
                "model", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_100_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            100, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$model/element", //$NON-NLS-1$
                "element", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_101_9 = new TagInfo("ws:file", //$NON-NLS-1$
            101, 9,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
            },
            new String[] {
                "{$model/@srcProject}/src/com/gerken/xaa/model/xform/{$element/@elementJava}.java", //$NON-NLS-1$
                "templates/element/elementJava.jet", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_109_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            109, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/property", //$NON-NLS-1$
                "property", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_117_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            117, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/nested", //$NON-NLS-1$
                "nested", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_129_1 = new TagInfo("c:if", //$NON-NLS-1$
            129, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "isVariableDefined('org.eclipse.jet.resource.project.name')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_130_5 = new TagInfo("ws:file", //$NON-NLS-1$
            130, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/dump.jet", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/dump.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_3_1.setRuntimeParent(null);
        _jettag_c_if_3_1.setTagInfo(_td_c_if_3_1);
        _jettag_c_if_3_1.doStart(context, out);
        while (_jettag_c_if_3_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_4_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_4_5.setRuntimeParent(_jettag_c_if_3_1);
            _jettag_c_setVariable_4_5.setTagInfo(_td_c_setVariable_4_5);
            _jettag_c_setVariable_4_5.doStart(context, out);
            _jettag_c_setVariable_4_5.doEnd();
            _jettag_c_if_3_1.handleBodyContent(out);
        }
        _jettag_c_if_3_1.doEnd();
        out.write(NL);         
        out.write("*******************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("*** Begin custom model updates for root (3)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("*** End custom model updates for root (3)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_16_1.setRuntimeParent(null);
        _jettag_c_iterate_16_1.setTagInfo(_td_c_iterate_16_1);
        _jettag_c_iterate_16_1.doStart(context, out);
        while (_jettag_c_iterate_16_1.okToProcessBody()) {
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_17_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_17_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_17_5.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_set_17_5.setTagInfo(_td_c_set_17_5);
            _jettag_c_set_17_5.doStart(context, out);
            JET2Writer _jettag_c_set_17_5_saved_out = out;
            while (_jettag_c_set_17_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("com.gerken.xaa.model");  //$NON-NLS-1$        
                _jettag_c_set_17_5.handleBodyContent(out);
            }
            out = _jettag_c_set_17_5_saved_out;
            _jettag_c_set_17_5.doEnd();
            out.write(NL);         
            out.write(NL);         
            out.write("    *** Begin custom model updates for model (4)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    *** End custom model updates for model (4)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_24_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_24_5.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_iterate_24_5.setTagInfo(_td_c_iterate_24_5);
            _jettag_c_iterate_24_5.doStart(context, out);
            while (_jettag_c_iterate_24_5.okToProcessBody()) {
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_25_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_25_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_25_9.setRuntimeParent(_jettag_c_iterate_24_5);
                _jettag_c_set_25_9.setTagInfo(_td_c_set_25_9);
                _jettag_c_set_25_9.doStart(context, out);
                JET2Writer _jettag_c_set_25_9_saved_out = out;
                while (_jettag_c_set_25_9.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_25_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_53); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_53.setRuntimeParent(_jettag_c_set_25_9);
                    _jettag_c_get_25_53.setTagInfo(_td_c_get_25_53);
                    _jettag_c_get_25_53.doStart(context, out);
                    _jettag_c_get_25_53.doEnd();
                    _jettag_c_set_25_9.handleBodyContent(out);
                }
                out = _jettag_c_set_25_9_saved_out;
                _jettag_c_set_25_9.doEnd();
                out.write(NL);         
                out.write(NL);         
                out.write("        *** Begin custom model updates for element (94)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        *** End custom model updates for element (94)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_32_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_32_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_32_9.setRuntimeParent(_jettag_c_iterate_24_5);
                _jettag_c_iterate_32_9.setTagInfo(_td_c_iterate_32_9);
                _jettag_c_iterate_32_9.doStart(context, out);
                while (_jettag_c_iterate_32_9.okToProcessBody()) {
                    out.write("            ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_33_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_33_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_33_13.setRuntimeParent(_jettag_c_iterate_32_9);
                    _jettag_c_set_33_13.setTagInfo(_td_c_set_33_13);
                    _jettag_c_set_33_13.doStart(context, out);
                    JET2Writer _jettag_c_set_33_13_saved_out = out;
                    while (_jettag_c_set_33_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("get");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_33_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_62); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_33_62.setRuntimeParent(_jettag_c_set_33_13);
                        _jettag_c_get_33_62.setTagInfo(_td_c_get_33_62);
                        _jettag_c_get_33_62.doStart(context, out);
                        _jettag_c_get_33_62.doEnd();
                        _jettag_c_set_33_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_33_13_saved_out;
                    _jettag_c_set_33_13.doEnd();
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_34_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_34_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_34_13.setRuntimeParent(_jettag_c_iterate_32_9);
                    _jettag_c_set_34_13.setTagInfo(_td_c_set_34_13);
                    _jettag_c_set_34_13.doStart(context, out);
                    JET2Writer _jettag_c_set_34_13_saved_out = out;
                    while (_jettag_c_set_34_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("set");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_34_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_62); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_34_62.setRuntimeParent(_jettag_c_set_34_13);
                        _jettag_c_get_34_62.setTagInfo(_td_c_get_34_62);
                        _jettag_c_get_34_62.doStart(context, out);
                        _jettag_c_get_34_62.doEnd();
                        _jettag_c_set_34_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_34_13_saved_out;
                    _jettag_c_set_34_13.doEnd();
                    out.write(NL);         
                    out.write(NL);         
                    out.write("            *** Begin custom model updates for property (95)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("            *** End custom model updates for property (95)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write(NL);         
                    out.write("            *** Begin custom model post updates for property (95)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("            *** End custom model post updates for property (95)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write(NL);         
                    _jettag_c_iterate_32_9.handleBodyContent(out);
                }
                _jettag_c_iterate_32_9.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_48_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_48_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_48_9.setRuntimeParent(_jettag_c_iterate_24_5);
                _jettag_c_iterate_48_9.setTagInfo(_td_c_iterate_48_9);
                _jettag_c_iterate_48_9.doStart(context, out);
                while (_jettag_c_iterate_48_9.okToProcessBody()) {
                    out.write("            ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_49_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_49_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_49_13.setRuntimeParent(_jettag_c_iterate_48_9);
                    _jettag_c_set_49_13.setTagInfo(_td_c_set_49_13);
                    _jettag_c_set_49_13.doStart(context, out);
                    JET2Writer _jettag_c_set_49_13_saved_out = out;
                    while (_jettag_c_set_49_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_get_49_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_52); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_49_52.setRuntimeParent(_jettag_c_set_49_13);
                        _jettag_c_get_49_52.setTagInfo(_td_c_get_49_52);
                        _jettag_c_get_49_52.doStart(context, out);
                        _jettag_c_get_49_52.doEnd();
                        _jettag_c_set_49_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_49_13_saved_out;
                    _jettag_c_set_49_13.doEnd();
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_50_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_50_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_50_13.setRuntimeParent(_jettag_c_iterate_48_9);
                    _jettag_c_set_50_13.setTagInfo(_td_c_set_50_13);
                    _jettag_c_set_50_13.doStart(context, out);
                    JET2Writer _jettag_c_set_50_13_saved_out = out;
                    while (_jettag_c_set_50_13.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_get_50_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_56); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_50_56.setRuntimeParent(_jettag_c_set_50_13);
                        _jettag_c_get_50_56.setTagInfo(_td_c_get_50_56);
                        _jettag_c_get_50_56.doStart(context, out);
                        _jettag_c_get_50_56.doEnd();
                        out.write("List");  //$NON-NLS-1$        
                        _jettag_c_set_50_13.handleBodyContent(out);
                    }
                    out = _jettag_c_set_50_13_saved_out;
                    _jettag_c_set_50_13.doEnd();
                    out.write(NL);         
                    out.write(NL);         
                    out.write("            *** Begin custom model updates for nested (96)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("        *** End custom model updates for nested (96)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write(NL);         
                    out.write("            *** Begin custom model post updates for nested (96)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("        *** End custom model post updates for nested (96)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write(NL);         
                    _jettag_c_iterate_48_9.handleBodyContent(out);
                }
                _jettag_c_iterate_48_9.doEnd();
                out.write(NL);         
                out.write("        *** Begin custom model post updates for element (94)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        *** End custom model post updates for element (94)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write(NL);         
                _jettag_c_iterate_24_5.handleBodyContent(out);
            }
            _jettag_c_iterate_24_5.doEnd();
            out.write(NL);         
            out.write("    *** Begin custom model post updates for model (4)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    *** End custom model post updates for model (4)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            _jettag_c_iterate_16_1.handleBodyContent(out);
        }
        _jettag_c_iterate_16_1.doEnd();
        out.write(NL);         
        out.write("*** Begin custom model post updates for root (3)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("*** End custom model post updates for root (3)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("*******************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("*** Begin custom generation updates for root (3)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("*** End custom generation updates for root (3)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_93_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_93_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_93_1.setRuntimeParent(null);
        _jettag_c_iterate_93_1.setTagInfo(_td_c_iterate_93_1);
        _jettag_c_iterate_93_1.doStart(context, out);
        while (_jettag_c_iterate_93_1.okToProcessBody()) {
            out.write(NL);         
            out.write("    *** Begin custom generation updates for model (4)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    *** End custom generation updates for model (4)");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_100_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_100_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_100_5.setRuntimeParent(_jettag_c_iterate_93_1);
            _jettag_c_iterate_100_5.setTagInfo(_td_c_iterate_100_5);
            _jettag_c_iterate_100_5.doStart(context, out);
            while (_jettag_c_iterate_100_5.okToProcessBody()) {
                out.write("        ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_101_9 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_101_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_101_9.setRuntimeParent(_jettag_c_iterate_100_5);
                _jettag_ws_file_101_9.setTagInfo(_td_ws_file_101_9);
                _jettag_ws_file_101_9.doStart(context, out);
                _jettag_ws_file_101_9.doEnd();
                out.write(NL);         
                out.write(NL);         
                out.write(NL);         
                out.write("        *** Begin custom generation updates for element (94)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("        *** End custom generation updates for element (94)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_109_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_109_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_109_9.setRuntimeParent(_jettag_c_iterate_100_5);
                _jettag_c_iterate_109_9.setTagInfo(_td_c_iterate_109_9);
                _jettag_c_iterate_109_9.doStart(context, out);
                while (_jettag_c_iterate_109_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            *** Begin custom generation updates for property (95)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("            *** End custom generation updates for property (95)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    _jettag_c_iterate_109_9.handleBodyContent(out);
                }
                _jettag_c_iterate_109_9.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_117_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_117_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_117_9.setRuntimeParent(_jettag_c_iterate_100_5);
                _jettag_c_iterate_117_9.setTagInfo(_td_c_iterate_117_9);
                _jettag_c_iterate_117_9.doStart(context, out);
                while (_jettag_c_iterate_117_9.okToProcessBody()) {
                    out.write(NL);         
                    out.write("            *** Begin custom generation updates for nested (96)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("        *** End custom generation updates for nested (96)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    _jettag_c_iterate_117_9.handleBodyContent(out);
                }
                _jettag_c_iterate_117_9.doEnd();
                _jettag_c_iterate_100_5.handleBodyContent(out);
            }
            _jettag_c_iterate_100_5.doEnd();
            _jettag_c_iterate_93_1.handleBodyContent(out);
        }
        _jettag_c_iterate_93_1.doEnd();
        out.write(NL);         
        out.write("*******************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_129_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_129_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_129_1.setRuntimeParent(null);
        _jettag_c_if_129_1.setTagInfo(_td_c_if_129_1);
        _jettag_c_if_129_1.doStart(context, out);
        while (_jettag_c_if_129_1.okToProcessBody()) {
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_130_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_130_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_130_5.setRuntimeParent(_jettag_c_if_129_1);
            _jettag_ws_file_130_5.setTagInfo(_td_ws_file_130_5);
            _jettag_ws_file_130_5.doStart(context, out);
            _jettag_ws_file_130_5.doEnd();
            out.write(NL);         
            _jettag_c_if_129_1.handleBodyContent(out);
        }
        _jettag_c_if_129_1.doEnd();
    }
}
