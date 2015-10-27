package com.gerken.xaa.xform.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(15);
    static {
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/recurse/mainJetFile1.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/recurse/mainJetFile2.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/recurse/sampleXmlFile.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/xform/xform.buildPropertiesFile.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/xform/xform.classpath.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/xform/xform.dumpJetFile.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/xform/xform.mainJetFile.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/xform/xform.manifestFile.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/xform/xform.orgEclipseJetPrefsFile.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/xform/xform.pluginXmlFile.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/xform/xform.project.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/xform/xform.sampleXmlFile.jet", //$NON-NLS-1$
                Integer.valueOf(13));
        pathToTemplateOrdinalMap.put("templates/xform/xform.snippets.jet", //$NON-NLS-1$
                Integer.valueOf(14));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // templates/dump.jet
                return new com.gerken.xaa.xform.compiled._jet_dump();
            case 1: // templates/main.jet
                return new com.gerken.xaa.xform.compiled._jet_main();
            case 2: // templates/recurse/mainJetFile1.jet
                return new com.gerken.xaa.xform.compiled._jet_mainJetFile1();
            case 3: // templates/recurse/mainJetFile2.jet
                return new com.gerken.xaa.xform.compiled._jet_mainJetFile2();
            case 4: // templates/recurse/sampleXmlFile.jet
                return new com.gerken.xaa.xform.compiled._jet_sampleXmlFile();
            case 5: // templates/xform/xform.buildPropertiesFile.jet
                return new com.gerken.xaa.xform.compiled._jet_xformbuildPropertiesFile();
            case 6: // templates/xform/xform.classpath.jet
                return new com.gerken.xaa.xform.compiled._jet_xformclasspath();
            case 7: // templates/xform/xform.dumpJetFile.jet
                return new com.gerken.xaa.xform.compiled._jet_xformdumpJetFile();
            case 8: // templates/xform/xform.mainJetFile.jet
                return new com.gerken.xaa.xform.compiled._jet_xformmainJetFile();
            case 9: // templates/xform/xform.manifestFile.jet
                return new com.gerken.xaa.xform.compiled._jet_xformmanifestFile();
            case 10: // templates/xform/xform.orgEclipseJetPrefsFile.jet
                return new com.gerken.xaa.xform.compiled._jet_xformorgEclipseJetPrefsFile();
            case 11: // templates/xform/xform.pluginXmlFile.jet
                return new com.gerken.xaa.xform.compiled._jet_xformpluginXmlFile();
            case 12: // templates/xform/xform.project.jet
                return new com.gerken.xaa.xform.compiled._jet_xformproject();
            case 13: // templates/xform/xform.sampleXmlFile.jet
                return new com.gerken.xaa.xform.compiled._jet_xformsampleXmlFile();
            case 14: // templates/xform/xform.snippets.jet
                return new com.gerken.xaa.xform.compiled._jet_xformsnippets();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
