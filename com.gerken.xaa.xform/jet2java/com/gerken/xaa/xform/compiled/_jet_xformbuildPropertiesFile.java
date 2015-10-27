package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_xformbuildPropertiesFile implements JET2Template {

    public _jet_xformbuildPropertiesFile() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("source.. = jet2java/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("output.. = bin/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("bin.includes = .,\\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               plugin.xml,\\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               META-INF/,\\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               templates/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("src.includes = .project,\\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               build.properties,\\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               .classpath");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
