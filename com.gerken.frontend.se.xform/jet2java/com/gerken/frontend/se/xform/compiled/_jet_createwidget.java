package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_createwidget implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_createwidget() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_3 = new TagInfo("c:get", //$NON-NLS-1$
            1, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@widgetVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_3 = new TagInfo("c:get", //$NON-NLS-1$
            5, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@widgetVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_3 = new TagInfo("c:get", //$NON-NLS-1$
            6, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@widgetVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_62 = new TagInfo("c:get", //$NON-NLS-1$
            6, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@listenerClass", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_3.setRuntimeParent(null);
        _jettag_c_get_1_3.setTagInfo(_td_c_get_1_3);
        _jettag_c_get_1_3.doStart(context, out);
        _jettag_c_get_1_3.doEnd();
        out.write(" = toolkit.createText(client,\"\",SWT.SINGLE);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttd = new TableWrapData(TableWrapData.FILL_GRAB);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttd.grabHorizontal = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttd.colspan = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_3.setRuntimeParent(null);
        _jettag_c_get_5_3.setTagInfo(_td_c_get_5_3);
        _jettag_c_get_5_3.doStart(context, out);
        _jettag_c_get_5_3.doEnd();
        out.write(".setLayoutData(td);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_3.setRuntimeParent(null);
        _jettag_c_get_6_3.setTagInfo(_td_c_get_6_3);
        _jettag_c_get_6_3.doStart(context, out);
        _jettag_c_get_6_3.doEnd();
        out.write(".addModifyListener(new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_62.setRuntimeParent(null);
        _jettag_c_get_6_62.setTagInfo(_td_c_get_6_62);
        _jettag_c_get_6_62.doStart(context, out);
        _jettag_c_get_6_62.doEnd();
        out.write("());");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
