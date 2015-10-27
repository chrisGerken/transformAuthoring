package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_recurseshow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_recurseshow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_1_1 = new TagInfo("c:if", //$NON-NLS-1$
            1, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$type/@parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_2_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@name=$type/@parent]", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_1 = new TagInfo("c:include", //$NON-NLS-1$
            4, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "restoreNames", //$NON-NLS-1$
            },
            new String[] {
                "templates/editor/recurse.show.jet", //$NON-NLS-1$
                "current,type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_16 = new TagInfo("c:get", //$NON-NLS-1$
            7, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@level", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_62 = new TagInfo("c:get", //$NON-NLS-1$
            7, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleVar", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_1.setRuntimeParent(null);
        _jettag_c_if_1_1.setTagInfo(_td_c_if_1_1);
        _jettag_c_if_1_1.doStart(context, out);
        while (_jettag_c_if_1_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_2_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_setVariable_2_1.setTagInfo(_td_c_setVariable_2_1);
            _jettag_c_setVariable_2_1.doStart(context, out);
            _jettag_c_setVariable_2_1.doEnd();
            RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
            _jettag_c_setVariable_3_1.doStart(context, out);
            _jettag_c_setVariable_3_1.doEnd();
            RuntimeTagElement _jettag_c_include_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_4_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_include_4_1.setTagInfo(_td_c_include_4_1);
            _jettag_c_include_4_1.doStart(context, out);
            _jettag_c_include_4_1.doEnd();
            RuntimeTagElement _jettag_c_setVariable_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_5_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_setVariable_5_1.setTagInfo(_td_c_setVariable_5_1);
            _jettag_c_setVariable_5_1.doStart(context, out);
            _jettag_c_setVariable_5_1.doEnd();
            _jettag_c_if_1_1.handleBodyContent(out);
        }
        _jettag_c_if_1_1.doEnd();
        out.write("\t\t\tstackLayout[");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_16.setRuntimeParent(null);
        _jettag_c_get_7_16.setTagInfo(_td_c_get_7_16);
        _jettag_c_get_7_16.doStart(context, out);
        _jettag_c_get_7_16.doEnd();
        out.write("].topControl = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_62.setRuntimeParent(null);
        _jettag_c_get_7_62.setTagInfo(_td_c_get_7_62);
        _jettag_c_get_7_62.doStart(context, out);
        _jettag_c_get_7_62.doEnd();
        out.write(".getShingle();");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
