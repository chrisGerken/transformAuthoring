package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_xformpluginXmlFile implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_xformpluginXmlFile() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_get_10_34 = new TagInfo("c1:get", //$NON-NLS-1$
            10, 34,
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
        out.write("<?eclipse version=\"3.0\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<plugin>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   <extension");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         id=\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         name=\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         point=\"org.eclipse.jet.transform\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <transform ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            startTemplate=\"templates/main.jet\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            templateLoaderClass=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c1_get_10_34 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_10_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_get_10_34.setRuntimeParent(null);
        _jettag_c1_get_10_34.setTagInfo(_td_c1_get_10_34);
        _jettag_c1_get_10_34.doStart(context, out);
        _jettag_c1_get_10_34.doEnd();
        out.write(".compiled._jet_transformation\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         <description></description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         <tagLibraries>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <importLibrary id=\"org.eclipse.jet.controlTags\" usePrefix=\"c\" autoImport=\"true\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <importLibrary id=\"org.eclipse.jet.javaTags\" usePrefix=\"java\" autoImport=\"true\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <importLibrary id=\"org.eclipse.jet.formatTags\" usePrefix=\"f\" autoImport=\"true\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <importLibrary id=\"org.eclipse.jet.workspaceTags\" usePrefix=\"ws\" autoImport=\"false\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("         </tagLibraries>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </transform>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   </extension>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</plugin>");  //$NON-NLS-1$        
    }
}
