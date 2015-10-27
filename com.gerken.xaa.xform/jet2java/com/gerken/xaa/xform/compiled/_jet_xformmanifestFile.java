package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_xformmanifestFile implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_xformmanifestFile() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_get_3_14 = new TagInfo("c1:get", //$NON-NLS-1$
            3, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$xform/@xformProject", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_4_22 = new TagInfo("c1:get", //$NON-NLS-1$
            4, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$xform/@xformProject", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("Manifest-Version: 1.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-ManifestVersion: 2");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-Name: ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c1_get_3_14 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_3_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_3_14.setRuntimeParent(null);
        _jettag_c1_get_3_14.setTagInfo(_td_c1_get_3_14);
        _jettag_c1_get_3_14.doStart(context, out);
        _jettag_c1_get_3_14.doEnd();
        out.write(NL);         
        out.write("Bundle-SymbolicName: ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c1_get_4_22 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_4_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_4_22.setRuntimeParent(null);
        _jettag_c1_get_4_22.setTagInfo(_td_c1_get_4_22);
        _jettag_c1_get_4_22.doStart(context, out);
        _jettag_c1_get_4_22.doEnd();
        out.write(";singleton:=true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-Version: 1.0.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-Vendor: ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Require-Bundle: org.eclipse.jet");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-ClassPath: .,bin/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Bundle-RequiredExecutionEnvironment: JavaSE-1.6");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
