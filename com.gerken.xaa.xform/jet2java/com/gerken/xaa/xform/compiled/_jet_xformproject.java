package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_xformproject implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_xformproject() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_get_3_8 = new TagInfo("c1:get", //$NON-NLS-1$
            3, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$xform/@xformProject", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<projectDescription>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<name>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c1_get_3_8 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_3_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_3_8.setRuntimeParent(null);
        _jettag_c1_get_3_8.setTagInfo(_td_c1_get_3_8);
        _jettag_c1_get_3_8.doStart(context, out);
        _jettag_c1_get_3_8.doEnd();
        out.write("</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<comment></comment>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<projects>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</projects>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<buildSpec>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>org.eclipse.jet.builder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>org.eclipse.jdt.core.javabuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>org.eclipse.pde.ManifestBuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</buildSpec>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<natures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>org.eclipse.pde.PluginNature</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>org.eclipse.jdt.core.javanature</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>org.eclipse.jet.jet2Nature</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>com.gerken.xaa.xform</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</natures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</projectDescription>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
