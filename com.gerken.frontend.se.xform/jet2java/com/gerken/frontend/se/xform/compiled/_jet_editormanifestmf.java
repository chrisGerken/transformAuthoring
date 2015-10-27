package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editormanifestmf implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editormanifestmf() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_3_14 = new TagInfo("c:get", //$NON-NLS-1$
            3, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_22 = new TagInfo("c:get", //$NON-NLS-1$
            4, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_19 = new TagInfo("c:get", //$NON-NLS-1$
            6, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_16 = new TagInfo("c:get", //$NON-NLS-1$
            7, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@provider", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("Manifest-Version: 1.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-ManifestVersion: 2");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-Name: ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_14.setRuntimeParent(null);
        _jettag_c_get_3_14.setTagInfo(_td_c_get_3_14);
        _jettag_c_get_3_14.doStart(context, out);
        _jettag_c_get_3_14.doEnd();
        out.write(NL);         
        out.write("Bundle-SymbolicName: ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_22.setRuntimeParent(null);
        _jettag_c_get_4_22.setTagInfo(_td_c_get_4_22);
        _jettag_c_get_4_22.doStart(context, out);
        _jettag_c_get_4_22.doEnd();
        out.write(";singleton:=true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-Version: 1.0.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-Activator: ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_19.setRuntimeParent(null);
        _jettag_c_get_6_19.setTagInfo(_td_c_get_6_19);
        _jettag_c_get_6_19.doStart(context, out);
        _jettag_c_get_6_19.doEnd();
        out.write(".Activator");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-Vendor: ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_16.setRuntimeParent(null);
        _jettag_c_get_7_16.setTagInfo(_td_c_get_7_16);
        _jettag_c_get_7_16.doStart(context, out);
        _jettag_c_get_7_16.doEnd();
        out.write(NL);         
        out.write("Require-Bundle: org.eclipse.ui,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" org.eclipse.core.runtime,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" org.eclipse.ui.forms;bundle-version=\"3.3.104\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" org.eclipse.core.resources;bundle-version=\"3.4.3\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" org.eclipse.ui.ide;bundle-version=\"3.4.2\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" org.eclipse.jet;bundle-version=\"0.9.5\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" org.eclipse.ui.editors;bundle-version=\"3.4.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Eclipse-AutoStart: true");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
