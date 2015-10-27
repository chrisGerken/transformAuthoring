package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_mainJetFile1 implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_mainJetFile1() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_setVariable_1_1 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_2_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$target/token[@derived='true']", //$NON-NLS-1$
                "token", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_3_1 = new TagInfo("c1:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$token[@optional='true']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_4_1 = new TagInfo("c1:get", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_4_53 = new TagInfo("c1:get", //$NON-NLS-1$
            4, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_4_88 = new TagInfo("c1:get", //$NON-NLS-1$
            4, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$token/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_5_13 = new TagInfo("c1:get", //$NON-NLS-1$
            5, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_5_64 = new TagInfo("c1:get", //$NON-NLS-1$
            5, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_5_105 = new TagInfo("c1:get", //$NON-NLS-1$
            5, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$token/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_5_139 = new TagInfo("c1:if", //$NON-NLS-1$
            5, 139,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$token/@formula", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_5_169 = new TagInfo("c1:get", //$NON-NLS-1$
            5, 169,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "toJetTags($token/@formula)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_6_1 = new TagInfo("c1:if", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$token[@optional='true']", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_7_1 = new TagInfo("c1:get", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_11_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group[@parentId=$target/@id][@impliedSingleton='true']", //$NON-NLS-1$
                "implied", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_12_1 = new TagInfo("c1:get", //$NON-NLS-1$
            12, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_12_59 = new TagInfo("c1:get", //$NON-NLS-1$
            12, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_12_99 = new TagInfo("c1:get", //$NON-NLS-1$
            12, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$implied/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_15_1 = new TagInfo("c1:get", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_userRegion_15_36 = new TagInfo("c1:userRegion", //$NON-NLS-1$
            15, 36,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c1_get_15_86 = new TagInfo("c1:get", //$NON-NLS-1$
            15, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_15_121 = new TagInfo("c1:get", //$NON-NLS-1$
            15, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_initialCode_15_153 = new TagInfo("c1:initialCode", //$NON-NLS-1$
            15, 153,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c1_get_17_1 = new TagInfo("c1:get", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_17_86 = new TagInfo("c1:get", //$NON-NLS-1$
            17, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_17_121 = new TagInfo("c1:get", //$NON-NLS-1$
            17, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_19_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$target/token[@isPolymorphicKey='true']", //$NON-NLS-1$
                "token", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_20_1 = new TagInfo("c1:get", //$NON-NLS-1$
            20, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_20_59 = new TagInfo("c1:get", //$NON-NLS-1$
            20, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_20_101 = new TagInfo("c1:get", //$NON-NLS-1$
            20, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_20_135 = new TagInfo("c1:get", //$NON-NLS-1$
            20, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$token/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_23_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            23, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group[@parentId=$current/@id]", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_24_1 = new TagInfo("c1:set", //$NON-NLS-1$
            24, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_24_41 = new TagInfo("c1:get", //$NON-NLS-1$
            24, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_24_75 = new TagInfo("c1:get", //$NON-NLS-1$
            24, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$tab", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_25_1 = new TagInfo("c1:get", //$NON-NLS-1$
            25, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_25_56 = new TagInfo("c1:get", //$NON-NLS-1$
            25, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_25_90 = new TagInfo("c1:get", //$NON-NLS-1$
            25, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$current/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_25_131 = new TagInfo("c1:get", //$NON-NLS-1$
            25, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$current/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_include_26_1 = new TagInfo("c1:include", //$NON-NLS-1$
            26, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "restoreNames", //$NON-NLS-1$
            },
            new String[] {
                "templates/recurse/mainJetFile1.jet", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_27_1 = new TagInfo("c1:get", //$NON-NLS-1$
            27, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_30_1 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_userRegion_30_36 = new TagInfo("c1:userRegion", //$NON-NLS-1$
            30, 36,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c1_get_30_91 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_30_126 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_initialCode_30_158 = new TagInfo("c1:initialCode", //$NON-NLS-1$
            30, 158,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c1_get_32_1 = new TagInfo("c1:get", //$NON-NLS-1$
            32, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_32_91 = new TagInfo("c1:get", //$NON-NLS-1$
            32, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_32_126 = new TagInfo("c1:get", //$NON-NLS-1$
            32, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@id", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c1_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_setVariable_1_1.setRuntimeParent(null);
        _jettag_c1_setVariable_1_1.setTagInfo(_td_c1_setVariable_1_1);
        _jettag_c1_setVariable_1_1.doStart(context, out);
        _jettag_c1_setVariable_1_1.doEnd();
        RuntimeTagElement _jettag_c1_iterate_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_2_1.setRuntimeParent(null);
        _jettag_c1_iterate_2_1.setTagInfo(_td_c1_iterate_2_1);
        _jettag_c1_iterate_2_1.doStart(context, out);
        while (_jettag_c1_iterate_2_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_if_3_1.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_if_3_1.setTagInfo(_td_c1_if_3_1);
            _jettag_c1_if_3_1.doStart(context, out);
            while (_jettag_c1_if_3_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c1_get_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_4_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_4_1.setRuntimeParent(_jettag_c1_if_3_1);
                _jettag_c1_get_4_1.setTagInfo(_td_c1_get_4_1);
                _jettag_c1_get_4_1.doStart(context, out);
                _jettag_c1_get_4_1.doEnd();
                out.write("<c:if test=\"not($");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_4_53 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_4_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_4_53.setRuntimeParent(_jettag_c1_if_3_1);
                _jettag_c1_get_4_53.setTagInfo(_td_c1_get_4_53);
                _jettag_c1_get_4_53.doStart(context, out);
                _jettag_c1_get_4_53.doEnd();
                out.write("/@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_4_88 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_4_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_4_88.setRuntimeParent(_jettag_c1_if_3_1);
                _jettag_c1_get_4_88.setTagInfo(_td_c1_get_4_88);
                _jettag_c1_get_4_88.doStart(context, out);
                _jettag_c1_get_4_88.doEnd();
                out.write(")\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                _jettag_c1_if_3_1.handleBodyContent(out);
            }
            _jettag_c1_if_3_1.doEnd();
            RuntimeTagElement _jettag_c1_get_5_13 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_5_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_5_13.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_get_5_13.setTagInfo(_td_c1_get_5_13);
            _jettag_c1_get_5_13.doStart(context, out);
            _jettag_c1_get_5_13.doEnd();
            out.write("<c:set select=\"$");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_5_64 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_5_64); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_5_64.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_get_5_64.setTagInfo(_td_c1_get_5_64);
            _jettag_c1_get_5_64.doStart(context, out);
            _jettag_c1_get_5_64.doEnd();
            out.write("\" name=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_5_105 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_5_105); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_5_105.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_get_5_105.setTagInfo(_td_c1_get_5_105);
            _jettag_c1_get_5_105.doStart(context, out);
            _jettag_c1_get_5_105.doEnd();
            out.write("\">");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_if_5_139 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_5_139); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_if_5_139.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_if_5_139.setTagInfo(_td_c1_if_5_139);
            _jettag_c1_if_5_139.doStart(context, out);
            while (_jettag_c1_if_5_139.okToProcessBody()) {
                RuntimeTagElement _jettag_c1_get_5_169 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_5_169); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_5_169.setRuntimeParent(_jettag_c1_if_5_139);
                _jettag_c1_get_5_169.setTagInfo(_td_c1_get_5_169);
                _jettag_c1_get_5_169.doStart(context, out);
                _jettag_c1_get_5_169.doEnd();
                _jettag_c1_if_5_139.handleBodyContent(out);
            }
            _jettag_c1_if_5_139.doEnd();
            out.write("</c:set>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c1_if_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_6_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_if_6_1.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_if_6_1.setTagInfo(_td_c1_if_6_1);
            _jettag_c1_if_6_1.doStart(context, out);
            while (_jettag_c1_if_6_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c1_get_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_7_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_7_1.setRuntimeParent(_jettag_c1_if_6_1);
                _jettag_c1_get_7_1.setTagInfo(_td_c1_get_7_1);
                _jettag_c1_get_7_1.doStart(context, out);
                _jettag_c1_get_7_1.doEnd();
                out.write("</c:if>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c1_if_6_1.handleBodyContent(out);
            }
            _jettag_c1_if_6_1.doEnd();
            _jettag_c1_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_2_1.doEnd();
        out.write(NL);         
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
            out.write("<c:addElement select=\"$");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_12_59 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_12_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_12_59.setRuntimeParent(_jettag_c1_iterate_11_1);
            _jettag_c1_get_12_59.setTagInfo(_td_c1_get_12_59);
            _jettag_c1_get_12_59.doStart(context, out);
            _jettag_c1_get_12_59.doEnd();
            out.write("\" name=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_12_99 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_12_99); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_12_99.setRuntimeParent(_jettag_c1_iterate_11_1);
            _jettag_c1_get_12_99.setTagInfo(_td_c1_get_12_99);
            _jettag_c1_get_12_99.doStart(context, out);
            _jettag_c1_get_12_99.doEnd();
            out.write("\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            _jettag_c1_iterate_11_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_11_1.doEnd();
        RuntimeTagElement _jettag_c1_get_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_15_1.setRuntimeParent(null);
        _jettag_c1_get_15_1.setTagInfo(_td_c1_get_15_1);
        _jettag_c1_get_15_1.doStart(context, out);
        _jettag_c1_get_15_1.doEnd();
        RuntimeTagElement _jettag_c1_userRegion_15_36 = context.getTagFactory().createRuntimeTag(_jetns_c1, "userRegion", "c1:userRegion", _td_c1_userRegion_15_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_userRegion_15_36.setRuntimeParent(null);
        _jettag_c1_userRegion_15_36.setTagInfo(_td_c1_userRegion_15_36);
        _jettag_c1_userRegion_15_36.doStart(context, out);
        while (_jettag_c1_userRegion_15_36.okToProcessBody()) {
            out.write("*** Begin custom model updates for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_15_86 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_15_86); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_15_86.setRuntimeParent(_jettag_c1_userRegion_15_36);
            _jettag_c1_get_15_86.setTagInfo(_td_c1_get_15_86);
            _jettag_c1_get_15_86.doStart(context, out);
            _jettag_c1_get_15_86.doEnd();
            out.write(" (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_15_121 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_15_121); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_15_121.setRuntimeParent(_jettag_c1_userRegion_15_36);
            _jettag_c1_get_15_121.setTagInfo(_td_c1_get_15_121);
            _jettag_c1_get_15_121.doStart(context, out);
            _jettag_c1_get_15_121.doEnd();
            out.write(")");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_initialCode_15_153 = context.getTagFactory().createRuntimeTag(_jetns_c1, "initialCode", "c1:initialCode", _td_c1_initialCode_15_153); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_initialCode_15_153.setRuntimeParent(_jettag_c1_userRegion_15_36);
            _jettag_c1_initialCode_15_153.setTagInfo(_td_c1_initialCode_15_153);
            _jettag_c1_initialCode_15_153.doStart(context, out);
            while (_jettag_c1_initialCode_15_153.okToProcessBody()) {
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c1_get_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_17_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_17_1.setRuntimeParent(_jettag_c1_initialCode_15_153);
                _jettag_c1_get_17_1.setTagInfo(_td_c1_get_17_1);
                _jettag_c1_get_17_1.doStart(context, out);
                _jettag_c1_get_17_1.doEnd();
                _jettag_c1_initialCode_15_153.handleBodyContent(out);
            }
            _jettag_c1_initialCode_15_153.doEnd();
            out.write("*** End custom model updates for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_17_86 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_17_86); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_17_86.setRuntimeParent(_jettag_c1_userRegion_15_36);
            _jettag_c1_get_17_86.setTagInfo(_td_c1_get_17_86);
            _jettag_c1_get_17_86.doStart(context, out);
            _jettag_c1_get_17_86.doEnd();
            out.write(" (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_17_121 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_17_121); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_17_121.setRuntimeParent(_jettag_c1_userRegion_15_36);
            _jettag_c1_get_17_121.setTagInfo(_td_c1_get_17_121);
            _jettag_c1_get_17_121.doStart(context, out);
            _jettag_c1_get_17_121.doEnd();
            out.write(")");  //$NON-NLS-1$        
            _jettag_c1_userRegion_15_36.handleBodyContent(out);
        }
        _jettag_c1_userRegion_15_36.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_19_1.setRuntimeParent(null);
        _jettag_c1_iterate_19_1.setTagInfo(_td_c1_iterate_19_1);
        _jettag_c1_iterate_19_1.doStart(context, out);
        while (_jettag_c1_iterate_19_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_get_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_20_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_20_1.setRuntimeParent(_jettag_c1_iterate_19_1);
            _jettag_c1_get_20_1.setTagInfo(_td_c1_get_20_1);
            _jettag_c1_get_20_1.doStart(context, out);
            _jettag_c1_get_20_1.doEnd();
            out.write("<c:addElement select=\"$");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_20_59 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_20_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_20_59.setRuntimeParent(_jettag_c1_iterate_19_1);
            _jettag_c1_get_20_59.setTagInfo(_td_c1_get_20_59);
            _jettag_c1_get_20_59.doStart(context, out);
            _jettag_c1_get_20_59.doEnd();
            out.write("\" name=\"{$");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_20_101 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_20_101); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_20_101.setRuntimeParent(_jettag_c1_iterate_19_1);
            _jettag_c1_get_20_101.setTagInfo(_td_c1_get_20_101);
            _jettag_c1_get_20_101.doStart(context, out);
            _jettag_c1_get_20_101.doEnd();
            out.write("/@");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_20_135 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_20_135); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_20_135.setRuntimeParent(_jettag_c1_iterate_19_1);
            _jettag_c1_get_20_135.setTagInfo(_td_c1_get_20_135);
            _jettag_c1_get_20_135.doStart(context, out);
            _jettag_c1_get_20_135.doEnd();
            out.write("}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            _jettag_c1_iterate_19_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_19_1.doEnd();
        RuntimeTagElement _jettag_c1_iterate_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_23_1.setRuntimeParent(null);
        _jettag_c1_iterate_23_1.setTagInfo(_td_c1_iterate_23_1);
        _jettag_c1_iterate_23_1.doStart(context, out);
        while (_jettag_c1_iterate_23_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_set_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_24_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_set_24_1.setRuntimeParent(_jettag_c1_iterate_23_1);
            _jettag_c1_set_24_1.setTagInfo(_td_c1_set_24_1);
            _jettag_c1_set_24_1.doStart(context, out);
            JET2Writer _jettag_c1_set_24_1_saved_out = out;
            while (_jettag_c1_set_24_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c1_get_24_41 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_24_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_24_41.setRuntimeParent(_jettag_c1_set_24_1);
                _jettag_c1_get_24_41.setTagInfo(_td_c1_get_24_41);
                _jettag_c1_get_24_41.doStart(context, out);
                _jettag_c1_get_24_41.doEnd();
                RuntimeTagElement _jettag_c1_get_24_75 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_24_75); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_24_75.setRuntimeParent(_jettag_c1_set_24_1);
                _jettag_c1_get_24_75.setTagInfo(_td_c1_get_24_75);
                _jettag_c1_get_24_75.doStart(context, out);
                _jettag_c1_get_24_75.doEnd();
                _jettag_c1_set_24_1.handleBodyContent(out);
            }
            out = _jettag_c1_set_24_1_saved_out;
            _jettag_c1_set_24_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_get_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_25_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_25_1.setRuntimeParent(_jettag_c1_iterate_23_1);
            _jettag_c1_get_25_1.setTagInfo(_td_c1_get_25_1);
            _jettag_c1_get_25_1.doStart(context, out);
            _jettag_c1_get_25_1.doEnd();
            out.write("<c:iterate select=\"$");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_25_56 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_25_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_25_56.setRuntimeParent(_jettag_c1_iterate_23_1);
            _jettag_c1_get_25_56.setTagInfo(_td_c1_get_25_56);
            _jettag_c1_get_25_56.doStart(context, out);
            _jettag_c1_get_25_56.doEnd();
            out.write("/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_25_90 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_25_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_25_90.setRuntimeParent(_jettag_c1_iterate_23_1);
            _jettag_c1_get_25_90.setTagInfo(_td_c1_get_25_90);
            _jettag_c1_get_25_90.doStart(context, out);
            _jettag_c1_get_25_90.doEnd();
            out.write("\" var=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_25_131 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_25_131); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_25_131.setRuntimeParent(_jettag_c1_iterate_23_1);
            _jettag_c1_get_25_131.setTagInfo(_td_c1_get_25_131);
            _jettag_c1_get_25_131.doStart(context, out);
            _jettag_c1_get_25_131.doEnd();
            out.write("\">");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c1_include_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "include", "c1:include", _td_c1_include_26_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_include_26_1.setRuntimeParent(_jettag_c1_iterate_23_1);
            _jettag_c1_include_26_1.setTagInfo(_td_c1_include_26_1);
            _jettag_c1_include_26_1.doStart(context, out);
            _jettag_c1_include_26_1.doEnd();
            RuntimeTagElement _jettag_c1_get_27_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_27_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_27_1.setRuntimeParent(_jettag_c1_iterate_23_1);
            _jettag_c1_get_27_1.setTagInfo(_td_c1_get_27_1);
            _jettag_c1_get_27_1.doStart(context, out);
            _jettag_c1_get_27_1.doEnd();
            out.write("</c:iterate> ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c1_iterate_23_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_23_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_get_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_30_1.setRuntimeParent(null);
        _jettag_c1_get_30_1.setTagInfo(_td_c1_get_30_1);
        _jettag_c1_get_30_1.doStart(context, out);
        _jettag_c1_get_30_1.doEnd();
        RuntimeTagElement _jettag_c1_userRegion_30_36 = context.getTagFactory().createRuntimeTag(_jetns_c1, "userRegion", "c1:userRegion", _td_c1_userRegion_30_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_userRegion_30_36.setRuntimeParent(null);
        _jettag_c1_userRegion_30_36.setTagInfo(_td_c1_userRegion_30_36);
        _jettag_c1_userRegion_30_36.doStart(context, out);
        while (_jettag_c1_userRegion_30_36.okToProcessBody()) {
            out.write("*** Begin custom model post updates for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_30_91 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_30_91.setRuntimeParent(_jettag_c1_userRegion_30_36);
            _jettag_c1_get_30_91.setTagInfo(_td_c1_get_30_91);
            _jettag_c1_get_30_91.doStart(context, out);
            _jettag_c1_get_30_91.doEnd();
            out.write(" (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_30_126 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_126); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_30_126.setRuntimeParent(_jettag_c1_userRegion_30_36);
            _jettag_c1_get_30_126.setTagInfo(_td_c1_get_30_126);
            _jettag_c1_get_30_126.doStart(context, out);
            _jettag_c1_get_30_126.doEnd();
            out.write(")");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_initialCode_30_158 = context.getTagFactory().createRuntimeTag(_jetns_c1, "initialCode", "c1:initialCode", _td_c1_initialCode_30_158); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_initialCode_30_158.setRuntimeParent(_jettag_c1_userRegion_30_36);
            _jettag_c1_initialCode_30_158.setTagInfo(_td_c1_initialCode_30_158);
            _jettag_c1_initialCode_30_158.doStart(context, out);
            while (_jettag_c1_initialCode_30_158.okToProcessBody()) {
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c1_get_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_32_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_32_1.setRuntimeParent(_jettag_c1_initialCode_30_158);
                _jettag_c1_get_32_1.setTagInfo(_td_c1_get_32_1);
                _jettag_c1_get_32_1.doStart(context, out);
                _jettag_c1_get_32_1.doEnd();
                _jettag_c1_initialCode_30_158.handleBodyContent(out);
            }
            _jettag_c1_initialCode_30_158.doEnd();
            out.write("*** End custom model post updates for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_32_91 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_32_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_32_91.setRuntimeParent(_jettag_c1_userRegion_30_36);
            _jettag_c1_get_32_91.setTagInfo(_td_c1_get_32_91);
            _jettag_c1_get_32_91.doStart(context, out);
            _jettag_c1_get_32_91.doEnd();
            out.write(" (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_32_126 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_32_126); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_32_126.setRuntimeParent(_jettag_c1_userRegion_30_36);
            _jettag_c1_get_32_126.setTagInfo(_td_c1_get_32_126);
            _jettag_c1_get_32_126.doStart(context, out);
            _jettag_c1_get_32_126.doEnd();
            out.write(")");  //$NON-NLS-1$        
            _jettag_c1_userRegion_30_36.handleBodyContent(out);
        }
        _jettag_c1_userRegion_30_36.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
    }
}
