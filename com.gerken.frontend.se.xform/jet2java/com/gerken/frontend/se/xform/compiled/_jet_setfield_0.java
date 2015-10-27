package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_setfield_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_setfield_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_7 = new TagInfo("c:get", //$NON-NLS-1$
            1, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@domainVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_4 = new TagInfo("c:get", //$NON-NLS-1$
            2, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@domainVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_47 = new TagInfo("c:get", //$NON-NLS-1$
            2, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/domain[@name=$field/@domain]/@domainClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_3 = new TagInfo("c:get", //$NON-NLS-1$
            4, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@domainVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_3 = new TagInfo("c:get", //$NON-NLS-1$
            5, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@widgetVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_49 = new TagInfo("c:get", //$NON-NLS-1$
            5, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@domainVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_3 = new TagInfo("c:get", //$NON-NLS-1$
            6, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@widgetVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_48 = new TagInfo("c:get", //$NON-NLS-1$
            6, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@domainVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_131 = new TagInfo("c:get", //$NON-NLS-1$
            6, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t\tif (");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_7.setRuntimeParent(null);
        _jettag_c_get_1_7.setTagInfo(_td_c_get_1_7);
        _jettag_c_get_1_7.doStart(context, out);
        _jettag_c_get_1_7.doEnd();
        out.write(" == null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_4.setRuntimeParent(null);
        _jettag_c_get_2_4.setTagInfo(_td_c_get_2_4);
        _jettag_c_get_2_4.doStart(context, out);
        _jettag_c_get_2_4.doEnd();
        out.write(" = new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_47.setRuntimeParent(null);
        _jettag_c_get_2_47.setTagInfo(_td_c_get_2_47);
        _jettag_c_get_2_47.doStart(context, out);
        _jettag_c_get_2_47.doEnd();
        out.write("(getEditor());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_3.setRuntimeParent(null);
        _jettag_c_get_4_3.setTagInfo(_td_c_get_4_3);
        _jettag_c_get_4_3.doStart(context, out);
        _jettag_c_get_4_3.doEnd();
        out.write(".setTarget(getSourceNode());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_3.setRuntimeParent(null);
        _jettag_c_get_5_3.setTagInfo(_td_c_get_5_3);
        _jettag_c_get_5_3.doStart(context, out);
        _jettag_c_get_5_3.doEnd();
        out.write(".setItems(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_49.setRuntimeParent(null);
        _jettag_c_get_5_49.setTagInfo(_td_c_get_5_49);
        _jettag_c_get_5_49.doStart(context, out);
        _jettag_c_get_5_49.doEnd();
        out.write(".getTexts());\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_3.setRuntimeParent(null);
        _jettag_c_get_6_3.setTagInfo(_td_c_get_6_3);
        _jettag_c_get_6_3.doStart(context, out);
        _jettag_c_get_6_3.doEnd();
        out.write(".setText(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_48); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_48.setRuntimeParent(null);
        _jettag_c_get_6_48.setTagInfo(_td_c_get_6_48);
        _jettag_c_get_6_48.doStart(context, out);
        _jettag_c_get_6_48.doEnd();
        out.write(".textFor(helper.getAttribute(getSourceNode(),\"@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_131); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_131.setRuntimeParent(null);
        _jettag_c_get_6_131.setTagInfo(_td_c_get_6_131);
        _jettag_c_get_6_131.doStart(context, out);
        _jettag_c_get_6_131.doEnd();
        out.write("\")));");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
