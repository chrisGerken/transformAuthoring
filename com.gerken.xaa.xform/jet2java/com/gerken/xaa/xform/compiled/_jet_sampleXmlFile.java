package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_sampleXmlFile implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_sampleXmlFile() {
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
                "$target/token[(@derived='false') or (@optional='true')]", //$NON-NLS-1$
                "token", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_3_1 = new TagInfo("c1:get", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_3_42 = new TagInfo("c1:get", //$NON-NLS-1$
            3, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$token/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_3_77 = new TagInfo("c1:if", //$NON-NLS-1$
            3, 77,
            new String[] {
                "test", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$token/desc", //$NON-NLS-1$
                "desc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_3_114 = new TagInfo("c1:get", //$NON-NLS-1$
            3, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$desc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_5_1 = new TagInfo("c1:get", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_5_37 = new TagInfo("c1:get", //$NON-NLS-1$
            5, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_5_70 = new TagInfo("c1:iterate", //$NON-NLS-1$
            5, 70,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$target/token[@derived='false']", //$NON-NLS-1$
                "token", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_5_137 = new TagInfo("c1:get", //$NON-NLS-1$
            5, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$token/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_6_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group[@parentId=$current/@id]", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_7_1 = new TagInfo("c1:set", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_7_41 = new TagInfo("c1:get", //$NON-NLS-1$
            7, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_7_75 = new TagInfo("c1:get", //$NON-NLS-1$
            7, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$tab", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_include_8_1 = new TagInfo("c1:include", //$NON-NLS-1$
            8, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "restoreNames", //$NON-NLS-1$
            },
            new String[] {
                "templates/recurse/sampleXmlFile.jet", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_11_1 = new TagInfo("c1:get", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$target/@indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_11_38 = new TagInfo("c1:get", //$NON-NLS-1$
            11, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$current/@name", //$NON-NLS-1$
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
            RuntimeTagElement _jettag_c1_get_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_3_1.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_get_3_1.setTagInfo(_td_c1_get_3_1);
            _jettag_c1_get_3_1.doStart(context, out);
            _jettag_c1_get_3_1.doEnd();
            out.write("<!--  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_3_42 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_3_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_3_42.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_get_3_42.setTagInfo(_td_c1_get_3_42);
            _jettag_c1_get_3_42.doStart(context, out);
            _jettag_c1_get_3_42.doEnd();
            out.write(" : ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_if_3_77 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_3_77); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_if_3_77.setRuntimeParent(_jettag_c1_iterate_2_1);
            _jettag_c1_if_3_77.setTagInfo(_td_c1_if_3_77);
            _jettag_c1_if_3_77.doStart(context, out);
            while (_jettag_c1_if_3_77.okToProcessBody()) {
                RuntimeTagElement _jettag_c1_get_3_114 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_3_114); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_3_114.setRuntimeParent(_jettag_c1_if_3_77);
                _jettag_c1_get_3_114.setTagInfo(_td_c1_get_3_114);
                _jettag_c1_get_3_114.doStart(context, out);
                _jettag_c1_get_3_114.doEnd();
                _jettag_c1_if_3_77.handleBodyContent(out);
            }
            _jettag_c1_if_3_77.doEnd();
            out.write(" -->");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c1_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_2_1.doEnd();
        RuntimeTagElement _jettag_c1_get_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_5_1.setRuntimeParent(null);
        _jettag_c1_get_5_1.setTagInfo(_td_c1_get_5_1);
        _jettag_c1_get_5_1.doStart(context, out);
        _jettag_c1_get_5_1.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c1_get_5_37 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_5_37); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_5_37.setRuntimeParent(null);
        _jettag_c1_get_5_37.setTagInfo(_td_c1_get_5_37);
        _jettag_c1_get_5_37.doStart(context, out);
        _jettag_c1_get_5_37.doEnd();
        RuntimeTagElement _jettag_c1_iterate_5_70 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_5_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_5_70.setRuntimeParent(null);
        _jettag_c1_iterate_5_70.setTagInfo(_td_c1_iterate_5_70);
        _jettag_c1_iterate_5_70.doStart(context, out);
        while (_jettag_c1_iterate_5_70.okToProcessBody()) {
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_5_137 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_5_137); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_5_137.setRuntimeParent(_jettag_c1_iterate_5_70);
            _jettag_c1_get_5_137.setTagInfo(_td_c1_get_5_137);
            _jettag_c1_get_5_137.doStart(context, out);
            _jettag_c1_get_5_137.doEnd();
            out.write("=\"\"");  //$NON-NLS-1$        
            _jettag_c1_iterate_5_70.handleBodyContent(out);
        }
        _jettag_c1_iterate_5_70.doEnd();
        out.write(">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_6_1.setRuntimeParent(null);
        _jettag_c1_iterate_6_1.setTagInfo(_td_c1_iterate_6_1);
        _jettag_c1_iterate_6_1.doStart(context, out);
        while (_jettag_c1_iterate_6_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_set_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_7_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_set_7_1.setRuntimeParent(_jettag_c1_iterate_6_1);
            _jettag_c1_set_7_1.setTagInfo(_td_c1_set_7_1);
            _jettag_c1_set_7_1.doStart(context, out);
            JET2Writer _jettag_c1_set_7_1_saved_out = out;
            while (_jettag_c1_set_7_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c1_get_7_41 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_7_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_7_41.setRuntimeParent(_jettag_c1_set_7_1);
                _jettag_c1_get_7_41.setTagInfo(_td_c1_get_7_41);
                _jettag_c1_get_7_41.doStart(context, out);
                _jettag_c1_get_7_41.doEnd();
                RuntimeTagElement _jettag_c1_get_7_75 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_7_75); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_7_75.setRuntimeParent(_jettag_c1_set_7_1);
                _jettag_c1_get_7_75.setTagInfo(_td_c1_get_7_75);
                _jettag_c1_get_7_75.doStart(context, out);
                _jettag_c1_get_7_75.doEnd();
                _jettag_c1_set_7_1.handleBodyContent(out);
            }
            out = _jettag_c1_set_7_1_saved_out;
            _jettag_c1_set_7_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_include_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "include", "c1:include", _td_c1_include_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_include_8_1.setRuntimeParent(_jettag_c1_iterate_6_1);
            _jettag_c1_include_8_1.setTagInfo(_td_c1_include_8_1);
            _jettag_c1_include_8_1.doStart(context, out);
            _jettag_c1_include_8_1.doEnd();
            _jettag_c1_iterate_6_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_6_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_get_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_11_1.setRuntimeParent(null);
        _jettag_c1_get_11_1.setTagInfo(_td_c1_get_11_1);
        _jettag_c1_get_11_1.doStart(context, out);
        _jettag_c1_get_11_1.doEnd();
        out.write("</");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c1_get_11_38 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_11_38); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_11_38.setRuntimeParent(null);
        _jettag_c1_get_11_38.setTagInfo(_td_c1_get_11_38);
        _jettag_c1_get_11_38.doStart(context, out);
        _jettag_c1_get_11_38.doEnd();
        out.write(">");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
