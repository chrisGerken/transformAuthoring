package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_recurselevel implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_recurselevel() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_1_1 = new TagInfo("c:if", //$NON-NLS-1$
            1, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$current/@parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_2_5 = new TagInfo("c:set", //$NON-NLS-1$
            2, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "level", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_43 = new TagInfo("c:get", //$NON-NLS-1$
            2, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "number($editor/type[@name=$current/@parent]/@level)+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_1 = new TagInfo("c:if", //$NON-NLS-1$
            4, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($current/@parent)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_5_5 = new TagInfo("c:set", //$NON-NLS-1$
            5, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "level", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$current/@name]", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_1 = new TagInfo("c:include", //$NON-NLS-1$
            8, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/editor/recurse.level.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_1.setRuntimeParent(null);
        _jettag_c_if_1_1.setTagInfo(_td_c_if_1_1);
        _jettag_c_if_1_1.doStart(context, out);
        while (_jettag_c_if_1_1.okToProcessBody()) {
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_2_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_2_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_2_5.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_set_2_5.setTagInfo(_td_c_set_2_5);
            _jettag_c_set_2_5.doStart(context, out);
            JET2Writer _jettag_c_set_2_5_saved_out = out;
            while (_jettag_c_set_2_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_2_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_2_43.setRuntimeParent(_jettag_c_set_2_5);
                _jettag_c_get_2_43.setTagInfo(_td_c_get_2_43);
                _jettag_c_get_2_43.doStart(context, out);
                _jettag_c_get_2_43.doEnd();
                _jettag_c_set_2_5.handleBodyContent(out);
            }
            out = _jettag_c_set_2_5_saved_out;
            _jettag_c_set_2_5.doEnd();
            out.write(NL);         
            _jettag_c_if_1_1.handleBodyContent(out);
        }
        _jettag_c_if_1_1.doEnd();
        RuntimeTagElement _jettag_c_if_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_4_1.setRuntimeParent(null);
        _jettag_c_if_4_1.setTagInfo(_td_c_if_4_1);
        _jettag_c_if_4_1.doStart(context, out);
        while (_jettag_c_if_4_1.okToProcessBody()) {
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_5_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_5_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_5_5.setRuntimeParent(_jettag_c_if_4_1);
            _jettag_c_set_5_5.setTagInfo(_td_c_set_5_5);
            _jettag_c_set_5_5.doStart(context, out);
            JET2Writer _jettag_c_set_5_5_saved_out = out;
            while (_jettag_c_set_5_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("0");  //$NON-NLS-1$        
                _jettag_c_set_5_5.handleBodyContent(out);
            }
            out = _jettag_c_set_5_5_saved_out;
            _jettag_c_set_5_5.doEnd();
            out.write(NL);         
            _jettag_c_if_4_1.handleBodyContent(out);
        }
        _jettag_c_if_4_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_1.setRuntimeParent(null);
        _jettag_c_iterate_7_1.setTagInfo(_td_c_iterate_7_1);
        _jettag_c_iterate_7_1.doStart(context, out);
        while (_jettag_c_iterate_7_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_8_1.setRuntimeParent(_jettag_c_iterate_7_1);
            _jettag_c_include_8_1.setTagInfo(_td_c_include_8_1);
            _jettag_c_include_8_1.doStart(context, out);
            _jettag_c_include_8_1.doEnd();
            _jettag_c_iterate_7_1.handleBodyContent(out);
        }
        _jettag_c_iterate_7_1.doEnd();
        out.write("    ");  //$NON-NLS-1$        
    }
}
