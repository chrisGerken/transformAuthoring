package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editorpluginxml implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editorpluginxml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_19 = new TagInfo("c:get", //$NON-NLS-1$
            8, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_25 = new TagInfo("c:get", //$NON-NLS-1$
            9, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@extension", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_20 = new TagInfo("c:get", //$NON-NLS-1$
            11, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_17 = new TagInfo("c:get", //$NON-NLS-1$
            12, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<?eclipse version=\"3.4\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<plugin>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("   <extension");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         point=\"org.eclipse.ui.editors\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <editor");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            name=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_19.setRuntimeParent(null);
        _jettag_c_get_8_19.setTagInfo(_td_c_get_8_19);
        _jettag_c_get_8_19.doStart(context, out);
        _jettag_c_get_8_19.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            extensions=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_25.setRuntimeParent(null);
        _jettag_c_get_9_25.setTagInfo(_td_c_get_9_25);
        _jettag_c_get_9_25.doStart(context, out);
        _jettag_c_get_9_25.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            icon=\"icons/shingle.ico\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            class=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_20.setRuntimeParent(null);
        _jettag_c_get_11_20.setTagInfo(_td_c_get_11_20);
        _jettag_c_get_11_20.doStart(context, out);
        _jettag_c_get_11_20.doEnd();
        out.write(".ShingleEditor\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            id=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_17.setRuntimeParent(null);
        _jettag_c_get_12_17.setTagInfo(_td_c_get_12_17);
        _jettag_c_get_12_17.doStart(context, out);
        _jettag_c_get_12_17.doEnd();
        out.write(".ShingleEditor\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </editor>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   </extension>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("</plugin>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
