package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editoractivatorjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editoractivatorjava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorProjectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_42 = new TagInfo("c:get", //$NON-NLS-1$
            13, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@id", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.eclipse.jface.resource.ImageDescriptor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.plugin.AbstractUIPlugin;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.osgi.framework.BundleContext;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * The activator class controls the plug-in life cycle");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public class Activator extends AbstractUIPlugin {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t// The plug-in ID");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static final String PLUGIN_ID = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_42.setRuntimeParent(null);
        _jettag_c_get_13_42.setTagInfo(_td_c_get_13_42);
        _jettag_c_get_13_42.doStart(context, out);
        _jettag_c_get_13_42.doEnd();
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t// The shared instance");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static Activator plugin;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * The constructor");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Activator() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * (non-Javadoc)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void start(BundleContext context) throws Exception {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper.start(context);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tplugin = this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * (non-Javadoc)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void stop(BundleContext context) throws Exception {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tplugin = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper.stop(context);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * Returns the shared instance");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * @return the shared instance");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static Activator getDefault() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn plugin;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * Returns an image descriptor for the image file at the given");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * plug-in relative path");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * @param path the path");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * @return the image descriptor");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static ImageDescriptor getImageDescriptor(String path) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn imageDescriptorFromPlugin(PLUGIN_ID, path);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
