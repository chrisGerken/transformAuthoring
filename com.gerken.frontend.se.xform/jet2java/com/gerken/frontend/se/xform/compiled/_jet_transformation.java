package com.gerken.frontend.se.xform.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(39);
    static {
        pathToTemplateOrdinalMap.put("templates/domain/domain.java.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/editor/editor.abstract.constraint.java.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/editor/editor.abstract.enumeration.java.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/editor/editor.abstract.index.java.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/editor/editor.abstract.shingle.java.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/editor/editor.actions.list.java.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/editor/editor.activator.java.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/editor/editor.build.properties.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/editor/editor.classpath.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/editor/editor.constraint.failure.java.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/editor/editor.data.reader.java.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/editor/editor.data.writer.java.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/editor/editor.error.list.java.jet", //$NON-NLS-1$
                Integer.valueOf(13));
        pathToTemplateOrdinalMap.put("templates/editor/editor.imodel.changed.listener.java.jet", //$NON-NLS-1$
                Integer.valueOf(14));
        pathToTemplateOrdinalMap.put("templates/editor/editor.manifest.mf.jet", //$NON-NLS-1$
                Integer.valueOf(15));
        pathToTemplateOrdinalMap.put("templates/editor/editor.model.access.java.jet", //$NON-NLS-1$
                Integer.valueOf(16));
        pathToTemplateOrdinalMap.put("templates/editor/editor.plugin.xml.jet", //$NON-NLS-1$
                Integer.valueOf(17));
        pathToTemplateOrdinalMap.put("templates/editor/editor.project.jet", //$NON-NLS-1$
                Integer.valueOf(18));
        pathToTemplateOrdinalMap.put("templates/editor/editor.shingle.editor.java.jet", //$NON-NLS-1$
                Integer.valueOf(19));
        pathToTemplateOrdinalMap.put("templates/editor/m2m.snippets.jet", //$NON-NLS-1$
                Integer.valueOf(20));
        pathToTemplateOrdinalMap.put("templates/editor/recurse.level.jet", //$NON-NLS-1$
                Integer.valueOf(21));
        pathToTemplateOrdinalMap.put("templates/editor/recurse.show.jet", //$NON-NLS-1$
                Integer.valueOf(22));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/checkbox/create.widget.jet", //$NON-NLS-1$
                Integer.valueOf(23));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/checkbox/declare.var.jet", //$NON-NLS-1$
                Integer.valueOf(24));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/checkbox/set.field.jet", //$NON-NLS-1$
                Integer.valueOf(25));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/checkbox/widget.listener.jet", //$NON-NLS-1$
                Integer.valueOf(26));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/combo/create.widget.jet", //$NON-NLS-1$
                Integer.valueOf(27));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/combo/declare.var.jet", //$NON-NLS-1$
                Integer.valueOf(28));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/combo/set.field.jet", //$NON-NLS-1$
                Integer.valueOf(29));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/combo/widget.listener.jet", //$NON-NLS-1$
                Integer.valueOf(30));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/text/create.widget.jet", //$NON-NLS-1$
                Integer.valueOf(31));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/text/declare.var.jet", //$NON-NLS-1$
                Integer.valueOf(32));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/text/set.field.jet", //$NON-NLS-1$
                Integer.valueOf(33));
        pathToTemplateOrdinalMap.put("templates/kinds/fields/text/widget.listener.jet", //$NON-NLS-1$
                Integer.valueOf(34));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(35));
        pathToTemplateOrdinalMap.put("templates/type/type.constraint.validator.java.jet", //$NON-NLS-1$
                Integer.valueOf(36));
        pathToTemplateOrdinalMap.put("templates/type/type.index.java.jet", //$NON-NLS-1$
                Integer.valueOf(37));
        pathToTemplateOrdinalMap.put("templates/type/type.shingle.java.jet", //$NON-NLS-1$
                Integer.valueOf(38));
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
            case 0: // templates/domain/domain.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_domainjava();
            case 1: // templates/dump.jet
                return new com.gerken.frontend.se.xform.compiled._jet_dump();
            case 2: // templates/editor/editor.abstract.constraint.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorabstractconstraintjava();
            case 3: // templates/editor/editor.abstract.enumeration.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorabstractenumerationjava();
            case 4: // templates/editor/editor.abstract.index.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorabstractindexjava();
            case 5: // templates/editor/editor.abstract.shingle.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorabstractshinglejava();
            case 6: // templates/editor/editor.actions.list.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editoractionslistjava();
            case 7: // templates/editor/editor.activator.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editoractivatorjava();
            case 8: // templates/editor/editor.build.properties.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorbuildproperties();
            case 9: // templates/editor/editor.classpath.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorclasspath();
            case 10: // templates/editor/editor.constraint.failure.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorconstraintfailurejava();
            case 11: // templates/editor/editor.data.reader.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editordatareaderjava();
            case 12: // templates/editor/editor.data.writer.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editordatawriterjava();
            case 13: // templates/editor/editor.error.list.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorerrorlistjava();
            case 14: // templates/editor/editor.imodel.changed.listener.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorimodelchangedlistenerjava();
            case 15: // templates/editor/editor.manifest.mf.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editormanifestmf();
            case 16: // templates/editor/editor.model.access.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editormodelaccessjava();
            case 17: // templates/editor/editor.plugin.xml.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorpluginxml();
            case 18: // templates/editor/editor.project.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorproject();
            case 19: // templates/editor/editor.shingle.editor.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_editorshingleeditorjava();
            case 20: // templates/editor/m2m.snippets.jet
                return new com.gerken.frontend.se.xform.compiled._jet_m2msnippets();
            case 21: // templates/editor/recurse.level.jet
                return new com.gerken.frontend.se.xform.compiled._jet_recurselevel();
            case 22: // templates/editor/recurse.show.jet
                return new com.gerken.frontend.se.xform.compiled._jet_recurseshow();
            case 23: // templates/kinds/fields/checkbox/create.widget.jet
                return new com.gerken.frontend.se.xform.compiled._jet_createwidget_1();
            case 24: // templates/kinds/fields/checkbox/declare.var.jet
                return new com.gerken.frontend.se.xform.compiled._jet_declarevar_1();
            case 25: // templates/kinds/fields/checkbox/set.field.jet
                return new com.gerken.frontend.se.xform.compiled._jet_setfield();
            case 26: // templates/kinds/fields/checkbox/widget.listener.jet
                return new com.gerken.frontend.se.xform.compiled._jet_widgetlistener_1();
            case 27: // templates/kinds/fields/combo/create.widget.jet
                return new com.gerken.frontend.se.xform.compiled._jet_createwidget_0();
            case 28: // templates/kinds/fields/combo/declare.var.jet
                return new com.gerken.frontend.se.xform.compiled._jet_declarevar();
            case 29: // templates/kinds/fields/combo/set.field.jet
                return new com.gerken.frontend.se.xform.compiled._jet_setfield_0();
            case 30: // templates/kinds/fields/combo/widget.listener.jet
                return new com.gerken.frontend.se.xform.compiled._jet_widgetlistener_0();
            case 31: // templates/kinds/fields/text/create.widget.jet
                return new com.gerken.frontend.se.xform.compiled._jet_createwidget();
            case 32: // templates/kinds/fields/text/declare.var.jet
                return new com.gerken.frontend.se.xform.compiled._jet_declarevar_0();
            case 33: // templates/kinds/fields/text/set.field.jet
                return new com.gerken.frontend.se.xform.compiled._jet_setfield_1();
            case 34: // templates/kinds/fields/text/widget.listener.jet
                return new com.gerken.frontend.se.xform.compiled._jet_widgetlistener();
            case 35: // templates/main.jet
                return new com.gerken.frontend.se.xform.compiled._jet_main();
            case 36: // templates/type/type.constraint.validator.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_typeconstraintvalidatorjava();
            case 37: // templates/type/type.index.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_typeindexjava();
            case 38: // templates/type/type.shingle.java.jet
                return new com.gerken.frontend.se.xform.compiled._jet_typeshinglejava();
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
