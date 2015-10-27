package com.gerken.se.fromxml.xform.compiled;

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
    
    private static final TagInfo _td_c_loadContent_3_1 = new TagInfo("c:loadContent", //$NON-NLS-1$
            3, 1,
            new String[] {
                "var", //$NON-NLS-1$
            },
            new String[] {
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/model", //$NON-NLS-1$
                "model", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_1 = new TagInfo("c:include", //$NON-NLS-1$
            9, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/recurse.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_11_1 = new TagInfo("ws:file", //$NON-NLS-1$
            11, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
            },
            new String[] {
                "templates/dump.jet", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/se.model.{$org.eclipse.jet.resource.name}", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        RuntimeTagElement _jettag_c_loadContent_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "loadContent", "c:loadContent", _td_c_loadContent_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_loadContent_3_1.setRuntimeParent(null);
        _jettag_c_loadContent_3_1.setTagInfo(_td_c_loadContent_3_1);
        _jettag_c_loadContent_3_1.doStart(context, out);
        JET2Writer _jettag_c_loadContent_3_1_saved_out = out;
        while (_jettag_c_loadContent_3_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("    <model/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_loadContent_3_1.handleBodyContent(out);
        }
        out = _jettag_c_loadContent_3_1_saved_out;
        _jettag_c_loadContent_3_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_6_1.setRuntimeParent(null);
        _jettag_c_setVariable_6_1.setTagInfo(_td_c_setVariable_6_1);
        _jettag_c_setVariable_6_1.doStart(context, out);
        _jettag_c_setVariable_6_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        RuntimeTagElement _jettag_c_include_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_9_1.setRuntimeParent(null);
        _jettag_c_include_9_1.setTagInfo(_td_c_include_9_1);
        _jettag_c_include_9_1.doStart(context, out);
        _jettag_c_include_9_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_file_11_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_11_1.setRuntimeParent(null);
        _jettag_ws_file_11_1.setTagInfo(_td_ws_file_11_1);
        _jettag_ws_file_11_1.doStart(context, out);
        _jettag_ws_file_11_1.doEnd();
        out.write(NL);         
        out.write(NL);         
    }
}
