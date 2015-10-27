package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_xformorgEclipseJetPrefsFile implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_xformorgEclipseJetPrefsFile() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_get_3_41 = new TagInfo("c1:get", //$NON-NLS-1$
            3, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$xform/@xformProject", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("#Tue Jan 25 16:13:37 CST 2011");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("eclipse.preferences.version=1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jet.compiledTemplatePackage=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c1_get_3_41 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_3_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_3_41.setRuntimeParent(null);
        _jettag_c1_get_3_41.setTagInfo(_td_c1_get_3_41);
        _jettag_c1_get_3_41.doStart(context, out);
        _jettag_c1_get_3_41.doEnd();
        out.write(".compiled");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jet.compiledTemplateSrcDir=jet2java");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jet.projectPrefs=true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jet.useJava5=true");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
