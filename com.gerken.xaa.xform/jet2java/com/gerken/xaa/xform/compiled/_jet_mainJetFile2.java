package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_mainJetFile2 implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws1 = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_mainJetFile2() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_setVariable_2_1 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_4_1 = new TagInfo("c1:get", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_userRegion_4_36 = new TagInfo("c1:userRegion", //$NON-NLS-1$
            4, 36,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c1_get_4_95 = new TagInfo("c1:get", //$NON-NLS-1$
            4, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_4_130 = new TagInfo("c1:get", //$NON-NLS-1$
            4, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_initialCode_4_162 = new TagInfo("c1:initialCode", //$NON-NLS-1$
            4, 162,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c1_get_6_1 = new TagInfo("c1:get", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_6_95 = new TagInfo("c1:get", //$NON-NLS-1$
            6, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_6_130 = new TagInfo("c1:get", //$NON-NLS-1$
            6, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_8_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$target/createProject", //$NON-NLS-1$
                "createProject", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_9_1 = new TagInfo("c1:get", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_9_54 = new TagInfo("c1:get", //$NON-NLS-1$
            9, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createProject/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_9_95 = new TagInfo("c1:if", //$NON-NLS-1$
            9, 95,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$createProject/@hasLocation='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_9_155 = new TagInfo("c1:get", //$NON-NLS-1$
            9, 155,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createProject/@locationExpr", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_11_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$target/createFolder", //$NON-NLS-1$
                "createFolder", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_12_1 = new TagInfo("c1:get", //$NON-NLS-1$
            12, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_12_53 = new TagInfo("c1:get", //$NON-NLS-1$
            12, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFolder/@path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_14_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            14, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$target/createFile", //$NON-NLS-1$
                "createFile", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_15_1 = new TagInfo("c1:if", //$NON-NLS-1$
            15, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@binary='false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_16_1 = new TagInfo("c1:get", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_16_51 = new TagInfo("c1:get", //$NON-NLS-1$
            16, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_16_100 = new TagInfo("c1:get", //$NON-NLS-1$
            16, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@template", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_16_152 = new TagInfo("c1:get", //$NON-NLS-1$
            16, 152,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@replace", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_18_1 = new TagInfo("c1:if", //$NON-NLS-1$
            18, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@binary='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_19_1 = new TagInfo("c1:get", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_19_57 = new TagInfo("c1:get", //$NON-NLS-1$
            19, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_19_101 = new TagInfo("c1:get", //$NON-NLS-1$
            19, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@template", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_19_153 = new TagInfo("c1:get", //$NON-NLS-1$
            19, 153,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@replace", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws1_copyFile_21_1 = new TagInfo("ws1:copyFile", //$NON-NLS-1$
            21, 1,
            new String[] {
                "target", //$NON-NLS-1$
                "src", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformId}/{$createFile/@template}", //$NON-NLS-1$
                "{$createFile/@src}", //$NON-NLS-1$
                "workspace", //$NON-NLS-1$
                "false", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_24_1 = new TagInfo("c1:get", //$NON-NLS-1$
            24, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_userRegion_24_36 = new TagInfo("c1:userRegion", //$NON-NLS-1$
            24, 36,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c1_get_24_91 = new TagInfo("c1:get", //$NON-NLS-1$
            24, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_24_126 = new TagInfo("c1:get", //$NON-NLS-1$
            24, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_initialCode_24_158 = new TagInfo("c1:initialCode", //$NON-NLS-1$
            24, 158,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c1_get_26_1 = new TagInfo("c1:get", //$NON-NLS-1$
            26, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_26_91 = new TagInfo("c1:get", //$NON-NLS-1$
            26, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_26_126 = new TagInfo("c1:get", //$NON-NLS-1$
            26, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_28_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            28, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group[@parentId=$current/@id]", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_29_1 = new TagInfo("c1:set", //$NON-NLS-1$
            29, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_29_41 = new TagInfo("c1:get", //$NON-NLS-1$
            29, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_29_75 = new TagInfo("c1:get", //$NON-NLS-1$
            29, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$tab", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_30_1 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_30_56 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_30_90 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$current/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_30_131 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$current/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_include_31_1 = new TagInfo("c1:include", //$NON-NLS-1$
            31, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "restoreNames", //$NON-NLS-1$
            },
            new String[] {
                "templates/recurse/mainJetFile2.jet", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_32_1 = new TagInfo("c1:get", //$NON-NLS-1$
            32, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c1_setVariable_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_setVariable_2_1.setRuntimeParent(null);
        _jettag_c1_setVariable_2_1.setTagInfo(_td_c1_setVariable_2_1);
        _jettag_c1_setVariable_2_1.doStart(context, out);
        _jettag_c1_setVariable_2_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_get_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_4_1.setRuntimeParent(null);
        _jettag_c1_get_4_1.setTagInfo(_td_c1_get_4_1);
        _jettag_c1_get_4_1.doStart(context, out);
        _jettag_c1_get_4_1.doEnd();
        RuntimeTagElement _jettag_c1_userRegion_4_36 = context.getTagFactory().createRuntimeTag(_jetns_c1, "userRegion", "c1:userRegion", _td_c1_userRegion_4_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_userRegion_4_36.setRuntimeParent(null);
        _jettag_c1_userRegion_4_36.setTagInfo(_td_c1_userRegion_4_36);
        _jettag_c1_userRegion_4_36.doStart(context, out);
        while (_jettag_c1_userRegion_4_36.okToProcessBody()) {
            out.write("*** Begin custom pre-generation actions for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_4_95 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_4_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_4_95.setRuntimeParent(_jettag_c1_userRegion_4_36);
            _jettag_c1_get_4_95.setTagInfo(_td_c1_get_4_95);
            _jettag_c1_get_4_95.doStart(context, out);
            _jettag_c1_get_4_95.doEnd();
            out.write(" (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_4_130 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_4_130); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_4_130.setRuntimeParent(_jettag_c1_userRegion_4_36);
            _jettag_c1_get_4_130.setTagInfo(_td_c1_get_4_130);
            _jettag_c1_get_4_130.doStart(context, out);
            _jettag_c1_get_4_130.doEnd();
            out.write(")");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_initialCode_4_162 = context.getTagFactory().createRuntimeTag(_jetns_c1, "initialCode", "c1:initialCode", _td_c1_initialCode_4_162); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_initialCode_4_162.setRuntimeParent(_jettag_c1_userRegion_4_36);
            _jettag_c1_initialCode_4_162.setTagInfo(_td_c1_initialCode_4_162);
            _jettag_c1_initialCode_4_162.doStart(context, out);
            while (_jettag_c1_initialCode_4_162.okToProcessBody()) {
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c1_get_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_6_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_6_1.setRuntimeParent(_jettag_c1_initialCode_4_162);
                _jettag_c1_get_6_1.setTagInfo(_td_c1_get_6_1);
                _jettag_c1_get_6_1.doStart(context, out);
                _jettag_c1_get_6_1.doEnd();
                _jettag_c1_initialCode_4_162.handleBodyContent(out);
            }
            _jettag_c1_initialCode_4_162.doEnd();
            out.write("*** End custom pre-generation actions for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_6_95 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_6_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_6_95.setRuntimeParent(_jettag_c1_userRegion_4_36);
            _jettag_c1_get_6_95.setTagInfo(_td_c1_get_6_95);
            _jettag_c1_get_6_95.doStart(context, out);
            _jettag_c1_get_6_95.doEnd();
            out.write(" (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_6_130 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_6_130); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_6_130.setRuntimeParent(_jettag_c1_userRegion_4_36);
            _jettag_c1_get_6_130.setTagInfo(_td_c1_get_6_130);
            _jettag_c1_get_6_130.doStart(context, out);
            _jettag_c1_get_6_130.doEnd();
            out.write(")");  //$NON-NLS-1$        
            _jettag_c1_userRegion_4_36.handleBodyContent(out);
        }
        _jettag_c1_userRegion_4_36.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_8_1.setRuntimeParent(null);
        _jettag_c1_iterate_8_1.setTagInfo(_td_c1_iterate_8_1);
        _jettag_c1_iterate_8_1.doStart(context, out);
        while (_jettag_c1_iterate_8_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_get_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_9_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_9_1.setRuntimeParent(_jettag_c1_iterate_8_1);
            _jettag_c1_get_9_1.setTagInfo(_td_c1_get_9_1);
            _jettag_c1_get_9_1.doStart(context, out);
            _jettag_c1_get_9_1.doEnd();
            out.write("<ws:project name=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_9_54 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_9_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_9_54.setRuntimeParent(_jettag_c1_iterate_8_1);
            _jettag_c1_get_9_54.setTagInfo(_td_c1_get_9_54);
            _jettag_c1_get_9_54.doStart(context, out);
            _jettag_c1_get_9_54.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_if_9_95 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_9_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_if_9_95.setRuntimeParent(_jettag_c1_iterate_8_1);
            _jettag_c1_if_9_95.setTagInfo(_td_c1_if_9_95);
            _jettag_c1_if_9_95.doStart(context, out);
            while (_jettag_c1_if_9_95.okToProcessBody()) {
                out.write(" location=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_9_155 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_9_155); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_9_155.setRuntimeParent(_jettag_c1_if_9_95);
                _jettag_c1_get_9_155.setTagInfo(_td_c1_get_9_155);
                _jettag_c1_get_9_155.doStart(context, out);
                _jettag_c1_get_9_155.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                _jettag_c1_if_9_95.handleBodyContent(out);
            }
            _jettag_c1_if_9_95.doEnd();
            out.write(" />");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c1_iterate_8_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_8_1.doEnd();
        RuntimeTagElement _jettag_c1_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_11_1.setRuntimeParent(null);
        _jettag_c1_iterate_11_1.setTagInfo(_td_c1_iterate_11_1);
        _jettag_c1_iterate_11_1.doStart(context, out);
        while (_jettag_c1_iterate_11_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_get_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_12_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_12_1.setRuntimeParent(_jettag_c1_iterate_11_1);
            _jettag_c1_get_12_1.setTagInfo(_td_c1_get_12_1);
            _jettag_c1_get_12_1.doStart(context, out);
            _jettag_c1_get_12_1.doEnd();
            out.write("<ws:folder path=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_12_53 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_12_53); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_12_53.setRuntimeParent(_jettag_c1_iterate_11_1);
            _jettag_c1_get_12_53.setTagInfo(_td_c1_get_12_53);
            _jettag_c1_get_12_53.doStart(context, out);
            _jettag_c1_get_12_53.doEnd();
            out.write("\" />");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c1_iterate_11_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_11_1.doEnd();
        RuntimeTagElement _jettag_c1_iterate_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_14_1.setRuntimeParent(null);
        _jettag_c1_iterate_14_1.setTagInfo(_td_c1_iterate_14_1);
        _jettag_c1_iterate_14_1.doStart(context, out);
        while (_jettag_c1_iterate_14_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_if_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_15_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_if_15_1.setRuntimeParent(_jettag_c1_iterate_14_1);
            _jettag_c1_if_15_1.setTagInfo(_td_c1_if_15_1);
            _jettag_c1_if_15_1.doStart(context, out);
            while (_jettag_c1_if_15_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c1_get_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_16_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_16_1.setRuntimeParent(_jettag_c1_if_15_1);
                _jettag_c1_get_16_1.setTagInfo(_td_c1_get_16_1);
                _jettag_c1_get_16_1.doStart(context, out);
                _jettag_c1_get_16_1.doEnd();
                out.write("<ws:file path=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_16_51 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_16_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_16_51.setRuntimeParent(_jettag_c1_if_15_1);
                _jettag_c1_get_16_51.setTagInfo(_td_c1_get_16_51);
                _jettag_c1_get_16_51.doStart(context, out);
                _jettag_c1_get_16_51.doEnd();
                out.write("\" template=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_16_100 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_16_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_16_100.setRuntimeParent(_jettag_c1_if_15_1);
                _jettag_c1_get_16_100.setTagInfo(_td_c1_get_16_100);
                _jettag_c1_get_16_100.doStart(context, out);
                _jettag_c1_get_16_100.doEnd();
                out.write("\" replace=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_16_152 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_16_152); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_16_152.setRuntimeParent(_jettag_c1_if_15_1);
                _jettag_c1_get_16_152.setTagInfo(_td_c1_get_16_152);
                _jettag_c1_get_16_152.doStart(context, out);
                _jettag_c1_get_16_152.doEnd();
                out.write("\" />");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c1_if_15_1.handleBodyContent(out);
            }
            _jettag_c1_if_15_1.doEnd();
            RuntimeTagElement _jettag_c1_if_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_18_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_if_18_1.setRuntimeParent(_jettag_c1_iterate_14_1);
            _jettag_c1_if_18_1.setTagInfo(_td_c1_if_18_1);
            _jettag_c1_if_18_1.doStart(context, out);
            while (_jettag_c1_if_18_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c1_get_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_19_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_19_1.setRuntimeParent(_jettag_c1_if_18_1);
                _jettag_c1_get_19_1.setTagInfo(_td_c1_get_19_1);
                _jettag_c1_get_19_1.doStart(context, out);
                _jettag_c1_get_19_1.doEnd();
                out.write("<ws:copyFile target=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_19_57 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_19_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_19_57.setRuntimeParent(_jettag_c1_if_18_1);
                _jettag_c1_get_19_57.setTagInfo(_td_c1_get_19_57);
                _jettag_c1_get_19_57.doStart(context, out);
                _jettag_c1_get_19_57.doEnd();
                out.write("\" src=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_19_101 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_19_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_19_101.setRuntimeParent(_jettag_c1_if_18_1);
                _jettag_c1_get_19_101.setTagInfo(_td_c1_get_19_101);
                _jettag_c1_get_19_101.doStart(context, out);
                _jettag_c1_get_19_101.doEnd();
                out.write("\" replace=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_19_153 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_19_153); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_19_153.setRuntimeParent(_jettag_c1_if_18_1);
                _jettag_c1_get_19_153.setTagInfo(_td_c1_get_19_153);
                _jettag_c1_get_19_153.doStart(context, out);
                _jettag_c1_get_19_153.doEnd();
                out.write("\" />");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c1_if_18_1.handleBodyContent(out);
            }
            _jettag_c1_if_18_1.doEnd();
            RuntimeTagElement _jettag_ws1_copyFile_21_1 = context.getTagFactory().createRuntimeTag(_jetns_ws1, "copyFile", "ws1:copyFile", _td_ws1_copyFile_21_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws1_copyFile_21_1.setRuntimeParent(_jettag_c1_iterate_14_1);
            _jettag_ws1_copyFile_21_1.setTagInfo(_td_ws1_copyFile_21_1);
            _jettag_ws1_copyFile_21_1.doStart(context, out);
            _jettag_ws1_copyFile_21_1.doEnd();
            out.write(NL);         
            _jettag_c1_iterate_14_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_14_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_get_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_24_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_24_1.setRuntimeParent(null);
        _jettag_c1_get_24_1.setTagInfo(_td_c1_get_24_1);
        _jettag_c1_get_24_1.doStart(context, out);
        _jettag_c1_get_24_1.doEnd();
        RuntimeTagElement _jettag_c1_userRegion_24_36 = context.getTagFactory().createRuntimeTag(_jetns_c1, "userRegion", "c1:userRegion", _td_c1_userRegion_24_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_userRegion_24_36.setRuntimeParent(null);
        _jettag_c1_userRegion_24_36.setTagInfo(_td_c1_userRegion_24_36);
        _jettag_c1_userRegion_24_36.doStart(context, out);
        while (_jettag_c1_userRegion_24_36.okToProcessBody()) {
            out.write("*** Begin custom generation updates for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_24_91 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_24_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_24_91.setRuntimeParent(_jettag_c1_userRegion_24_36);
            _jettag_c1_get_24_91.setTagInfo(_td_c1_get_24_91);
            _jettag_c1_get_24_91.doStart(context, out);
            _jettag_c1_get_24_91.doEnd();
            out.write(" (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_24_126 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_24_126); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_24_126.setRuntimeParent(_jettag_c1_userRegion_24_36);
            _jettag_c1_get_24_126.setTagInfo(_td_c1_get_24_126);
            _jettag_c1_get_24_126.doStart(context, out);
            _jettag_c1_get_24_126.doEnd();
            out.write(")");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_initialCode_24_158 = context.getTagFactory().createRuntimeTag(_jetns_c1, "initialCode", "c1:initialCode", _td_c1_initialCode_24_158); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_initialCode_24_158.setRuntimeParent(_jettag_c1_userRegion_24_36);
            _jettag_c1_initialCode_24_158.setTagInfo(_td_c1_initialCode_24_158);
            _jettag_c1_initialCode_24_158.doStart(context, out);
            while (_jettag_c1_initialCode_24_158.okToProcessBody()) {
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c1_get_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_26_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_26_1.setRuntimeParent(_jettag_c1_initialCode_24_158);
                _jettag_c1_get_26_1.setTagInfo(_td_c1_get_26_1);
                _jettag_c1_get_26_1.doStart(context, out);
                _jettag_c1_get_26_1.doEnd();
                _jettag_c1_initialCode_24_158.handleBodyContent(out);
            }
            _jettag_c1_initialCode_24_158.doEnd();
            out.write("*** End custom generation updates for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_26_91 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_26_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_26_91.setRuntimeParent(_jettag_c1_userRegion_24_36);
            _jettag_c1_get_26_91.setTagInfo(_td_c1_get_26_91);
            _jettag_c1_get_26_91.doStart(context, out);
            _jettag_c1_get_26_91.doEnd();
            out.write(" (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_26_126 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_26_126); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_26_126.setRuntimeParent(_jettag_c1_userRegion_24_36);
            _jettag_c1_get_26_126.setTagInfo(_td_c1_get_26_126);
            _jettag_c1_get_26_126.doStart(context, out);
            _jettag_c1_get_26_126.doEnd();
            out.write(")");  //$NON-NLS-1$        
            _jettag_c1_userRegion_24_36.handleBodyContent(out);
        }
        _jettag_c1_userRegion_24_36.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_28_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_28_1.setRuntimeParent(null);
        _jettag_c1_iterate_28_1.setTagInfo(_td_c1_iterate_28_1);
        _jettag_c1_iterate_28_1.doStart(context, out);
        while (_jettag_c1_iterate_28_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_set_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_29_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_set_29_1.setRuntimeParent(_jettag_c1_iterate_28_1);
            _jettag_c1_set_29_1.setTagInfo(_td_c1_set_29_1);
            _jettag_c1_set_29_1.doStart(context, out);
            JET2Writer _jettag_c1_set_29_1_saved_out = out;
            while (_jettag_c1_set_29_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c1_get_29_41 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_29_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_29_41.setRuntimeParent(_jettag_c1_set_29_1);
                _jettag_c1_get_29_41.setTagInfo(_td_c1_get_29_41);
                _jettag_c1_get_29_41.doStart(context, out);
                _jettag_c1_get_29_41.doEnd();
                RuntimeTagElement _jettag_c1_get_29_75 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_29_75); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_29_75.setRuntimeParent(_jettag_c1_set_29_1);
                _jettag_c1_get_29_75.setTagInfo(_td_c1_get_29_75);
                _jettag_c1_get_29_75.doStart(context, out);
                _jettag_c1_get_29_75.doEnd();
                _jettag_c1_set_29_1.handleBodyContent(out);
            }
            out = _jettag_c1_set_29_1_saved_out;
            _jettag_c1_set_29_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_get_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_30_1.setRuntimeParent(_jettag_c1_iterate_28_1);
            _jettag_c1_get_30_1.setTagInfo(_td_c1_get_30_1);
            _jettag_c1_get_30_1.doStart(context, out);
            _jettag_c1_get_30_1.doEnd();
            out.write("<c:iterate select=\"$");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_30_56 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_30_56.setRuntimeParent(_jettag_c1_iterate_28_1);
            _jettag_c1_get_30_56.setTagInfo(_td_c1_get_30_56);
            _jettag_c1_get_30_56.doStart(context, out);
            _jettag_c1_get_30_56.doEnd();
            out.write("/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_30_90 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_30_90.setRuntimeParent(_jettag_c1_iterate_28_1);
            _jettag_c1_get_30_90.setTagInfo(_td_c1_get_30_90);
            _jettag_c1_get_30_90.doStart(context, out);
            _jettag_c1_get_30_90.doEnd();
            out.write("\" var=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_30_131 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_131); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_30_131.setRuntimeParent(_jettag_c1_iterate_28_1);
            _jettag_c1_get_30_131.setTagInfo(_td_c1_get_30_131);
            _jettag_c1_get_30_131.doStart(context, out);
            _jettag_c1_get_30_131.doEnd();
            out.write("\">");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c1_include_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "include", "c1:include", _td_c1_include_31_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_include_31_1.setRuntimeParent(_jettag_c1_iterate_28_1);
            _jettag_c1_include_31_1.setTagInfo(_td_c1_include_31_1);
            _jettag_c1_include_31_1.doStart(context, out);
            _jettag_c1_include_31_1.doEnd();
            RuntimeTagElement _jettag_c1_get_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_32_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_32_1.setRuntimeParent(_jettag_c1_iterate_28_1);
            _jettag_c1_get_32_1.setTagInfo(_td_c1_get_32_1);
            _jettag_c1_get_32_1.doStart(context, out);
            _jettag_c1_get_32_1.doEnd();
            out.write("</c:iterate> ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c1_iterate_28_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_28_1.doEnd();
    }
}
