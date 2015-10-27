package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_editorbuildproperties implements JET2Template {

    public _jet_editorbuildproperties() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("source.. = src/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("output.. = bin/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("bin.includes = plugin.xml,\\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               META-INF/,\\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("               .");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
