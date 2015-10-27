package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editorshingleeditorjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editorshingleeditorjava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_8 = new TagInfo("c:get", //$NON-NLS-1$
            35, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorProjectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_8 = new TagInfo("c:get", //$NON-NLS-1$
            37, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@shinglesPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_52 = new TagInfo("c:get", //$NON-NLS-1$
            37, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_53 = new TagInfo("c:get", //$NON-NLS-1$
            49, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@maxLevel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_56 = new TagInfo("c:get", //$NON-NLS-1$
            50, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@maxLevel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_59_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            59, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_10 = new TagInfo("c:get", //$NON-NLS-1$
            60, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_51 = new TagInfo("c:get", //$NON-NLS-1$
            60, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_23 = new TagInfo("c:get", //$NON-NLS-1$
            129, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@maxLevel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_140_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            140, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_3 = new TagInfo("c:get", //$NON-NLS-1$
            141, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_46 = new TagInfo("c:get", //$NON-NLS-1$
            141, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_142_3 = new TagInfo("c:get", //$NON-NLS-1$
            142, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_142_67 = new TagInfo("c:get", //$NON-NLS-1$
            142, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@level", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_143_16 = new TagInfo("c:get", //$NON-NLS-1$
            143, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_147_3 = new TagInfo("c:get", //$NON-NLS-1$
            147, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[not(@parent)]/@shingleVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_16 = new TagInfo("c:get", //$NON-NLS-1$
            148, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[not(@parent)]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_155_23 = new TagInfo("c:get", //$NON-NLS-1$
            155, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@maxLevel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_161_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            161, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_9 = new TagInfo("c:get", //$NON-NLS-1$
            163, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_48 = new TagInfo("c:get", //$NON-NLS-1$
            163, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_164_10 = new TagInfo("c:get", //$NON-NLS-1$
            164, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_171_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            171, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_20 = new TagInfo("c:get", //$NON-NLS-1$
            173, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_174_1 = new TagInfo("c:include", //$NON-NLS-1$
            174, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "restoreNames", //$NON-NLS-1$
            },
            new String[] {
                "templates/editor/recurse.show.jet", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_175_4 = new TagInfo("c:get", //$NON-NLS-1$
            175, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_176_20 = new TagInfo("c:get", //$NON-NLS-1$
            176, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "number($type/@level) + 1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_180_23 = new TagInfo("c:get", //$NON-NLS-1$
            180, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@maxLevel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_313_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            313, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_314_8 = new TagInfo("c:get", //$NON-NLS-1$
            314, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_314_67 = new TagInfo("c:get", //$NON-NLS-1$
            314, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleVar", //$NON-NLS-1$
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
        out.write("import java.io.ByteArrayInputStream;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.io.InputStream;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.net.URL;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.ArrayList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Iterator;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.eclipse.core.resources.IFile;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.core.runtime.CoreException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.core.runtime.IProgressMonitor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.core.runtime.IStatus;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.jface.resource.ImageDescriptor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.SWT;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.custom.SashForm;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.custom.ScrolledComposite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.custom.StackLayout;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.graphics.Image;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.graphics.Point;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.graphics.Rectangle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.layout.GridData;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.layout.GridLayout;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Composite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.IEditorInput;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.IEditorSite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.IFileEditorInput;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.PartInitException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.FormToolkit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.part.EditorPart;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.texteditor.DocumentProviderRegistry;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.texteditor.IDocumentProvider;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Document;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_35_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_35_8.setRuntimeParent(null);
        _jettag_c_get_35_8.setTagInfo(_td_c_get_35_8);
        _jettag_c_get_35_8.doStart(context, out);
        _jettag_c_get_35_8.doEnd();
        out.write(".Activator;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_36_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_36_1.setRuntimeParent(null);
        _jettag_c_iterate_36_1.setTagInfo(_td_c_iterate_36_1);
        _jettag_c_iterate_36_1.doStart(context, out);
        while (_jettag_c_iterate_36_1.okToProcessBody()) {
            out.write("import ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_37_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_8.setRuntimeParent(_jettag_c_iterate_36_1);
            _jettag_c_get_37_8.setTagInfo(_td_c_get_37_8);
            _jettag_c_get_37_8.doStart(context, out);
            _jettag_c_get_37_8.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_37_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_37_52.setRuntimeParent(_jettag_c_iterate_36_1);
            _jettag_c_get_37_52.setTagInfo(_td_c_get_37_52);
            _jettag_c_get_37_52.doStart(context, out);
            _jettag_c_get_37_52.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_36_1.handleBodyContent(out);
        }
        _jettag_c_iterate_36_1.doEnd();
        out.write(NL);         
        out.write("public class ShingleEditor extends EditorPart {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic static int \t\t\tMAX_WIDTH = 300;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate FormToolkit\t\t\ttoolkit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Composite\t\t\tshingleContainer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ScrolledComposite\tframe;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Composite\t\t\tshingleStack[] = new Composite[");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_53.setRuntimeParent(null);
        _jettag_c_get_49_53.setTagInfo(_td_c_get_49_53);
        _jettag_c_get_49_53.doStart(context, out);
        _jettag_c_get_49_53.doEnd();
        out.write("];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate StackLayout\t\t\tstackLayout[] = new StackLayout[");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_50_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_50_56.setRuntimeParent(null);
        _jettag_c_get_50_56.setTagInfo(_td_c_get_50_56);
        _jettag_c_get_50_56.doStart(context, out);
        _jettag_c_get_50_56.doEnd();
        out.write("];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ArrayList<Composite> shingles = new ArrayList<Composite>(8);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate boolean\t\t\t\tdirty = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ArrayList<IModelChangedListener> modelChangedListeners = new ArrayList<IModelChangedListener>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Document\t\t\tdataModel;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_59_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_59_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_59_1.setRuntimeParent(null);
        _jettag_c_iterate_59_1.setTagInfo(_td_c_iterate_59_1);
        _jettag_c_iterate_59_1.doStart(context, out);
        while (_jettag_c_iterate_59_1.okToProcessBody()) {
            out.write("\tprivate ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_60_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_10.setRuntimeParent(_jettag_c_iterate_59_1);
            _jettag_c_get_60_10.setTagInfo(_td_c_get_60_10);
            _jettag_c_get_60_10.doStart(context, out);
            _jettag_c_get_60_10.doEnd();
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_60_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_60_51.setRuntimeParent(_jettag_c_iterate_59_1);
            _jettag_c_get_60_51.setTagInfo(_td_c_get_60_51);
            _jettag_c_get_60_51.doStart(context, out);
            _jettag_c_get_60_51.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_59_1.handleBodyContent(out);
        }
        _jettag_c_iterate_59_1.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static String \t\tRED_ID \t\t= \"shingle_red\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static String \t\tBLUE_ID \t= \"shingle_blue\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static String \t\tGREEN_ID \t= \"shingle_green\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static String \t\tYELLOW_ID \t= \"shingle_yellow\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate Image\t\t\t \timage_delete;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Image\t\t\t \timage_up;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Image\t\t\t \timage_down;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Image\t\t\t \timage_copy;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Image\t\t\t \timage_edit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ShingleEditor() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void doSave(IProgressMonitor monitor) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tperformSave(true, monitor);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void doSaveAs() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void init(IEditorSite site, IEditorInput input)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthrows PartInitException {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetSite(site);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetInput(input);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetPartName(input.getName());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tloadImages();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic boolean isDirty() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn dirty;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic boolean isSaveAsAllowed() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void createPartControl(Composite parent) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoolkit = new FormToolkit(parent.getDisplay());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoolkit.getColors().createColor(RED_ID, 200, 20, 20);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoolkit.getColors().createColor(BLUE_ID, 20, 20, 200);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoolkit.getColors().createColor(GREEN_ID, 20, 200, 20);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoolkit.getColors().createColor(YELLOW_ID, 200, 200, 20);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tGridLayout gl;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tGridData   gd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tframe = new ScrolledComposite(parent,SWT.H_SCROLL|SWT.V_SCROLL);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl = new GridLayout();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl.numColumns = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tframe.setLayout(gl);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd = new GridData(SWT.FILL,SWT.FILL,true,true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tframe.setLayoutData(gd);\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tframe.getHorizontalBar().setPageIncrement(305);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoolkit.adapt(frame);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tshingleContainer = new SashForm(frame,SWT.HORIZONTAL);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl = new GridLayout();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl.numColumns = 8;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tshingleContainer.setLayout(gl);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd = new GridData(SWT.FILL,SWT.FILL,true,true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tshingleContainer.setLayoutData(gd);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoolkit.adapt(shingleContainer);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_129_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_129_23.setRuntimeParent(null);
        _jettag_c_get_129_23.setTagInfo(_td_c_get_129_23);
        _jettag_c_get_129_23.doStart(context, out);
        _jettag_c_get_129_23.doEnd();
        out.write("; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tshingleStack[i] = toolkit.createComposite(shingleContainer);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tstackLayout[i] = new StackLayout();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tshingleStack[i].setLayout(stackLayout[i]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgd = new GridData(ShingleEditor.MAX_WIDTH,SWT.DEFAULT);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgd.verticalAlignment = SWT.BEGINNING;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tshingleStack[i].setLayoutData(gd);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tframe.setContent(shingleContainer); ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_140_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_140_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_140_1.setRuntimeParent(null);
        _jettag_c_iterate_140_1.setTagInfo(_td_c_iterate_140_1);
        _jettag_c_iterate_140_1.doStart(context, out);
        while (_jettag_c_iterate_140_1.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_141_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_141_3.setRuntimeParent(_jettag_c_iterate_140_1);
            _jettag_c_get_141_3.setTagInfo(_td_c_get_141_3);
            _jettag_c_get_141_3.doStart(context, out);
            _jettag_c_get_141_3.doEnd();
            out.write(" = new ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_141_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_141_46.setRuntimeParent(_jettag_c_iterate_140_1);
            _jettag_c_get_141_46.setTagInfo(_td_c_get_141_46);
            _jettag_c_get_141_46.doStart(context, out);
            _jettag_c_get_141_46.doEnd();
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_142_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_142_3.setRuntimeParent(_jettag_c_iterate_140_1);
            _jettag_c_get_142_3.setTagInfo(_td_c_get_142_3);
            _jettag_c_get_142_3.doStart(context, out);
            _jettag_c_get_142_3.doEnd();
            out.write(".createShingle(shingleStack[");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_142_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_142_67); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_142_67.setRuntimeParent(_jettag_c_iterate_140_1);
            _jettag_c_get_142_67.setTagInfo(_td_c_get_142_67);
            _jettag_c_get_142_67.doStart(context, out);
            _jettag_c_get_142_67.doEnd();
            out.write("], toolkit, this);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tshingles.add(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_143_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_143_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_143_16.setRuntimeParent(_jettag_c_iterate_140_1);
            _jettag_c_get_143_16.setTagInfo(_td_c_get_143_16);
            _jettag_c_get_143_16.doStart(context, out);
            _jettag_c_get_143_16.doEnd();
            out.write(".getShingle());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_140_1.handleBodyContent(out);
        }
        _jettag_c_iterate_140_1.doEnd();
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_147_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_147_3.setRuntimeParent(null);
        _jettag_c_get_147_3.setTagInfo(_td_c_get_147_3);
        _jettag_c_get_147_3.doStart(context, out);
        _jettag_c_get_147_3.doEnd();
        out.write(".setSourceNode(getRoot());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tshowShingle(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_148_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_148_16.setRuntimeParent(null);
        _jettag_c_get_148_16.setTagInfo(_td_c_get_148_16);
        _jettag_c_get_148_16.doStart(context, out);
        _jettag_c_get_148_16.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tresize();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void resize() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\tshingleContainer.layout(true,true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_155_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_155_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_155_23.setRuntimeParent(null);
        _jettag_c_get_155_23.setTagInfo(_td_c_get_155_23);
        _jettag_c_get_155_23.doStart(context, out);
        _jettag_c_get_155_23.doEnd();
        out.write("; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tshingleStack[i].layout(true,true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tshingleContainer.setSize(shingleContainer.computeSize(SWT.DEFAULT,SWT.DEFAULT));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\tframe.layout(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_161_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_161_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_161_1.setRuntimeParent(null);
        _jettag_c_iterate_161_1.setTagInfo(_td_c_iterate_161_1);
        _jettag_c_iterate_161_1.doStart(context, out);
        while (_jettag_c_iterate_161_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_163_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_163_9.setRuntimeParent(_jettag_c_iterate_161_1);
            _jettag_c_get_163_9.setTagInfo(_td_c_get_163_9);
            _jettag_c_get_163_9.doStart(context, out);
            _jettag_c_get_163_9.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_163_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_163_48.setRuntimeParent(_jettag_c_iterate_161_1);
            _jettag_c_get_163_48.setTagInfo(_td_c_get_163_48);
            _jettag_c_get_163_48.doStart(context, out);
            _jettag_c_get_163_48.doEnd();
            out.write("() {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\treturn ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_164_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_164_10.setRuntimeParent(_jettag_c_iterate_161_1);
            _jettag_c_get_164_10.setTagInfo(_td_c_get_164_10);
            _jettag_c_get_164_10.doStart(context, out);
            _jettag_c_get_164_10.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_161_1.handleBodyContent(out);
        }
        _jettag_c_iterate_161_1.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void showShingle(String name) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tint visibleStacks = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_171_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_171_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_171_1.setRuntimeParent(null);
        _jettag_c_iterate_171_1.setTagInfo(_td_c_iterate_171_1);
        _jettag_c_iterate_171_1.doStart(context, out);
        while (_jettag_c_iterate_171_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\tif (name.equals(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_173_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_20); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_173_20.setRuntimeParent(_jettag_c_iterate_171_1);
            _jettag_c_get_173_20.setTagInfo(_td_c_get_173_20);
            _jettag_c_get_173_20.doStart(context, out);
            _jettag_c_get_173_20.doEnd();
            out.write("\")) {");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_174_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_174_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_174_1.setRuntimeParent(_jettag_c_iterate_171_1);
            _jettag_c_include_174_1.setTagInfo(_td_c_include_174_1);
            _jettag_c_include_174_1.doStart(context, out);
            _jettag_c_include_174_1.doEnd();
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_175_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_175_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_175_4.setRuntimeParent(_jettag_c_iterate_171_1);
            _jettag_c_get_175_4.setTagInfo(_td_c_get_175_4);
            _jettag_c_get_175_4.doStart(context, out);
            _jettag_c_get_175_4.doEnd();
            out.write(".setFocus();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tvisibleStacks = ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_176_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_176_20); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_176_20.setRuntimeParent(_jettag_c_iterate_171_1);
            _jettag_c_get_176_20.setTagInfo(_td_c_get_176_20);
            _jettag_c_get_176_20.doStart(context, out);
            _jettag_c_get_176_20.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_171_1.handleBodyContent(out);
        }
        _jettag_c_iterate_171_1.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_180_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_180_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_180_23.setRuntimeParent(null);
        _jettag_c_get_180_23.setTagInfo(_td_c_get_180_23);
        _jettag_c_get_180_23.doStart(context, out);
        _jettag_c_get_180_23.doEnd();
        out.write("; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tshingleStack[i].setVisible(i<visibleStacks);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tresize();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tRectangle bounds = shingleStack[visibleStacks-1].getBounds();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tPoint origin = frame.getOrigin();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tRectangle clientArea = frame.getClientArea();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tint scrollAmount = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tboolean mustScroll = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (clientArea.width > bounds.width) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// shingle can fit");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (bounds.x+bounds.width>clientArea.width) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// shingle is over the right side.  Shift left");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmustScroll = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tscrollAmount = bounds.x + bounds.width - clientArea.width - 5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (bounds.x < 5) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// shingle is over the left side.  Shift right");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmustScroll = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tscrollAmount = 5 - bounds.x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tmustScroll = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tscrollAmount = 5 - bounds.x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (mustScroll) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tframe.setOrigin(new Point(origin.x+scrollAmount,0));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Document getModel() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (dataModel == null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdataModel = buildModel();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (dataModel.getDocumentElement().getNodeName() != \"root\") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdataModel = DataReader.getInstance().buildEmptyModel();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn dataModel;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Element getRoot() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn getModel().getDocumentElement();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate Document buildModel() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDocument newDoc = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (getEditorInput() instanceof IFileEditorInput) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\ttry {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tIFileEditorInput modelFile = (IFileEditorInput)getEditorInput();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tIFile ifile = modelFile.getFile();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tInputStream is = ifile.getContents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnewDoc = DataReader.getInstance().readData(is);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} catch (Exception e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnewDoc = DataReader.getInstance().buildEmptyModel();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn newDoc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setFocus() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t// TODO Auto-generated method stub");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void dispose() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper.dispose();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (toolkit != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\ttoolkit.dispose();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void modelChanged() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdirty = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tIterator<IModelChangedListener> iter = modelChangedListeners.iterator();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twhile (iter.hasNext()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\titer.next().modelChanged();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void addModelChagedListener(IModelChangedListener listener) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmodelChangedListeners.add(listener);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprotected void performSave(boolean overwrite, IProgressMonitor progressMonitor) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\ttry {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIFileEditorInput input= (IFileEditorInput) getEditorInput();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tByteArrayInputStream is = new ByteArrayInputStream(DataWriter.getInstance().format(getModel()).getBytes());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tinput.getFile().setContents(is,true,true,progressMonitor);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdirty = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} catch (CoreException e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// TODO Auto-generated catch block");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\te.printStackTrace();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate void loadImages() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\timage_delete = Activator.getImageDescriptor(\"icons/delete.ico\").createImage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\timage_up \t= Activator.getImageDescriptor(\"icons/up.ico\").createImage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\timage_down \t= Activator.getImageDescriptor(\"icons/down.ico\").createImage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\timage_copy \t= Activator.getImageDescriptor(\"icons/copy.ico\").createImage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\timage_edit \t= Activator.getImageDescriptor(\"icons/edit.ico\").createImage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Image getDeleteImage() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn image_delete;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Image getUpImage() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn image_up;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Image getDownImage() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn image_down;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Image getCopyImage() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn image_copy;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Image getEditImage() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn image_edit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic AbstractShingle getShingle(String nodeName) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_313_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_313_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_313_1.setRuntimeParent(null);
        _jettag_c_iterate_313_1.setTagInfo(_td_c_iterate_313_1);
        _jettag_c_iterate_313_1.doStart(context, out);
        while (_jettag_c_iterate_313_1.okToProcessBody()) {
            out.write("\t\tif (\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_314_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_314_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_314_8.setRuntimeParent(_jettag_c_iterate_313_1);
            _jettag_c_get_314_8.setTagInfo(_td_c_get_314_8);
            _jettag_c_get_314_8.doStart(context, out);
            _jettag_c_get_314_8.doEnd();
            out.write("\".equals(nodeName)) { return ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_314_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_314_67); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_314_67.setRuntimeParent(_jettag_c_iterate_313_1);
            _jettag_c_get_314_67.setTagInfo(_td_c_get_314_67);
            _jettag_c_get_314_67.doStart(context, out);
            _jettag_c_get_314_67.doEnd();
            out.write("; }");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_313_1.handleBodyContent(out);
        }
        _jettag_c_iterate_313_1.doEnd();
        out.write("\t\treturn null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
