package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_typeshinglejava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_typeshinglejava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@shinglesPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_8 = new TagInfo("c:get", //$NON-NLS-1$
            22, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@constraintPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_54 = new TagInfo("c:get", //$NON-NLS-1$
            22, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@validatorClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_8 = new TagInfo("c:get", //$NON-NLS-1$
            24, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_8 = new TagInfo("c:get", //$NON-NLS-1$
            25, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_8 = new TagInfo("c:get", //$NON-NLS-1$
            28, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($type/@parent)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_8 = new TagInfo("c:get", //$NON-NLS-1$
            30, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_8 = new TagInfo("c:get", //$NON-NLS-1$
            31, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_8 = new TagInfo("c:get", //$NON-NLS-1$
            33, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_8 = new TagInfo("c:get", //$NON-NLS-1$
            34, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_35_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            35, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$type/@name]", //$NON-NLS-1$
                "child", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_8 = new TagInfo("c:get", //$NON-NLS-1$
            36, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@indexPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_49 = new TagInfo("c:get", //$NON-NLS-1$
            36, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/domain", //$NON-NLS-1$
                "domain", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_8 = new TagInfo("c:get", //$NON-NLS-1$
            39, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@domainPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_50 = new TagInfo("c:get", //$NON-NLS-1$
            39, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$domain/@domainClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_14 = new TagInfo("c:get", //$NON-NLS-1$
            42, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_44_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            44, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_45_1 = new TagInfo("c:include", //$NON-NLS-1$
            45, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/kinds/fields/{$field/@kind}/declare.var.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_48_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            48, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$type/@name]", //$NON-NLS-1$
                "child", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_11 = new TagInfo("c:get", //$NON-NLS-1$
            49, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_49 = new TagInfo("c:get", //$NON-NLS-1$
            49, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_52_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            52, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field[@domain]", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_14 = new TagInfo("c:get", //$NON-NLS-1$
            53, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/domain[@name=$field/@domain]/@domainClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_83 = new TagInfo("c:get", //$NON-NLS-1$
            53, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@domainVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_1 = new TagInfo("c:if", //$NON-NLS-1$
            56, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($type/@parent)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_9 = new TagInfo("c:get", //$NON-NLS-1$
            61, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_20 = new TagInfo("c:get", //$NON-NLS-1$
            81, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleLabel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_100_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            100, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_39 = new TagInfo("c:get", //$NON-NLS-1$
            103, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@label", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_107_1 = new TagInfo("c:include", //$NON-NLS-1$
            107, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/kinds/fields/{$field/@kind}/create.widget.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_113_1 = new TagInfo("c:if", //$NON-NLS-1$
            113, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($type/@parent)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_122_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            122, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$type/@name]", //$NON-NLS-1$
                "child", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_3 = new TagInfo("c:get", //$NON-NLS-1$
            124, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_45 = new TagInfo("c:get", //$NON-NLS-1$
            124, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_3 = new TagInfo("c:get", //$NON-NLS-1$
            125, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_127_1 = new TagInfo("c:if", //$NON-NLS-1$
            127, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($type/@parent)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_142_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            142, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_143_1 = new TagInfo("c:include", //$NON-NLS-1$
            143, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/kinds/fields/{$field/@kind}/set.field.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_146_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            146, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$type/@name]", //$NON-NLS-1$
                "child", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_147_3 = new TagInfo("c:get", //$NON-NLS-1$
            147, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_150_1 = new TagInfo("c:if", //$NON-NLS-1$
            150, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($type/@parent)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_158_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            158, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$type/@name]", //$NON-NLS-1$
                "child", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_9 = new TagInfo("c:get", //$NON-NLS-1$
            160, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_47 = new TagInfo("c:get", //$NON-NLS-1$
            160, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_10 = new TagInfo("c:get", //$NON-NLS-1$
            161, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_164_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            164, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_166_1 = new TagInfo("c:include", //$NON-NLS-1$
            166, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/kinds/fields/{$field/@kind}/widget.listener.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_171_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            171, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$type/@name]", //$NON-NLS-1$
                "child", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_172_3 = new TagInfo("c:get", //$NON-NLS-1$
            172, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_172_76 = new TagInfo("c:get", //$NON-NLS-1$
            172, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_178_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            178, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$type/@name]", //$NON-NLS-1$
                "child", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_179_8 = new TagInfo("c:get", //$NON-NLS-1$
            179, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_179_68 = new TagInfo("c:get", //$NON-NLS-1$
            179, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_185_14 = new TagInfo("c:get", //$NON-NLS-1$
            185, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@validatorClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_189_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            189, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent=$type/@name]", //$NON-NLS-1$
                "child", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_191_3 = new TagInfo("c:get", //$NON-NLS-1$
            191, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_3 = new TagInfo("c:get", //$NON-NLS-1$
            192, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$child/@indexGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_198_1 = new TagInfo("c:if", //$NON-NLS-1$
            198, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not($type[@parent])", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_201_1 = new TagInfo("c:if", //$NON-NLS-1$
            201, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$type[@parent]", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_202_22 = new TagInfo("c:get", //$NON-NLS-1$
            202, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@name=$type/@parent]/@shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_207_1 = new TagInfo("c:if", //$NON-NLS-1$
            207, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_208_3 = new TagInfo("c:get", //$NON-NLS-1$
            208, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/field[1]/@widgetVar", //$NON-NLS-1$
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
        out.write("import org.eclipse.swt.SWT;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.events.ModifyEvent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.events.ModifyListener;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.events.SelectionEvent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.events.SelectionListener;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.graphics.Color;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.layout.GridData;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.layout.GridLayout;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Button;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Combo;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Composite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Label;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.swt.widgets.Text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.ExpandableComposite;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.FormToolkit;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.Section;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.TableWrapData;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.TableWrapLayout;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_8.setRuntimeParent(null);
        _jettag_c_get_22_8.setTagInfo(_td_c_get_22_8);
        _jettag_c_get_22_8.doStart(context, out);
        _jettag_c_get_22_8.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_54.setRuntimeParent(null);
        _jettag_c_get_22_54.setTagInfo(_td_c_get_22_54);
        _jettag_c_get_22_54.doStart(context, out);
        _jettag_c_get_22_54.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_8.setRuntimeParent(null);
        _jettag_c_get_24_8.setTagInfo(_td_c_get_24_8);
        _jettag_c_get_24_8.doStart(context, out);
        _jettag_c_get_24_8.doEnd();
        out.write(".AbstractConstraint;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_8.setRuntimeParent(null);
        _jettag_c_get_25_8.setTagInfo(_td_c_get_25_8);
        _jettag_c_get_25_8.doStart(context, out);
        _jettag_c_get_25_8.doEnd();
        out.write(".AbstractIndex;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.widgets.FormText;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_8.setRuntimeParent(null);
        _jettag_c_get_28_8.setTagInfo(_td_c_get_28_8);
        _jettag_c_get_28_8.doStart(context, out);
        _jettag_c_get_28_8.doEnd();
        out.write(".AbstractShingle;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_29_1.setRuntimeParent(null);
        _jettag_c_if_29_1.setTagInfo(_td_c_if_29_1);
        _jettag_c_if_29_1.doStart(context, out);
        while (_jettag_c_if_29_1.okToProcessBody()) {
            out.write("import ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_30_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_8.setRuntimeParent(_jettag_c_if_29_1);
            _jettag_c_get_30_8.setTagInfo(_td_c_get_30_8);
            _jettag_c_get_30_8.doStart(context, out);
            _jettag_c_get_30_8.doEnd();
            out.write(".ActionsList;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("import ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_31_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_8.setRuntimeParent(_jettag_c_if_29_1);
            _jettag_c_get_31_8.setTagInfo(_td_c_get_31_8);
            _jettag_c_get_31_8.doStart(context, out);
            _jettag_c_get_31_8.doEnd();
            out.write(".ErrorList;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_29_1.handleBodyContent(out);
        }
        _jettag_c_if_29_1.doEnd();
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_8.setRuntimeParent(null);
        _jettag_c_get_33_8.setTagInfo(_td_c_get_33_8);
        _jettag_c_get_33_8.doStart(context, out);
        _jettag_c_get_33_8.doEnd();
        out.write(".ShingleEditor;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_8.setRuntimeParent(null);
        _jettag_c_get_34_8.setTagInfo(_td_c_get_34_8);
        _jettag_c_get_34_8.doStart(context, out);
        _jettag_c_get_34_8.doEnd();
        out.write(".ModelAccess;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_35_1.setRuntimeParent(null);
        _jettag_c_iterate_35_1.setTagInfo(_td_c_iterate_35_1);
        _jettag_c_iterate_35_1.doStart(context, out);
        while (_jettag_c_iterate_35_1.okToProcessBody()) {
            out.write("import ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_36_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_8.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_36_8.setTagInfo(_td_c_get_36_8);
            _jettag_c_get_36_8.doStart(context, out);
            _jettag_c_get_36_8.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_36_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_36_49.setRuntimeParent(_jettag_c_iterate_35_1);
            _jettag_c_get_36_49.setTagInfo(_td_c_get_36_49);
            _jettag_c_get_36_49.doStart(context, out);
            _jettag_c_get_36_49.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_35_1.handleBodyContent(out);
        }
        _jettag_c_iterate_35_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_38_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_38_1.setRuntimeParent(null);
        _jettag_c_iterate_38_1.setTagInfo(_td_c_iterate_38_1);
        _jettag_c_iterate_38_1.doStart(context, out);
        while (_jettag_c_iterate_38_1.okToProcessBody()) {
            out.write("import ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_39_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_8.setRuntimeParent(_jettag_c_iterate_38_1);
            _jettag_c_get_39_8.setTagInfo(_td_c_get_39_8);
            _jettag_c_get_39_8.doStart(context, out);
            _jettag_c_get_39_8.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_39_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_39_50.setRuntimeParent(_jettag_c_iterate_38_1);
            _jettag_c_get_39_50.setTagInfo(_td_c_get_39_50);
            _jettag_c_get_39_50.doStart(context, out);
            _jettag_c_get_39_50.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_38_1.handleBodyContent(out);
        }
        _jettag_c_iterate_38_1.doEnd();
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_14.setRuntimeParent(null);
        _jettag_c_get_42_14.setTagInfo(_td_c_get_42_14);
        _jettag_c_get_42_14.doStart(context, out);
        _jettag_c_get_42_14.doEnd();
        out.write(" extends AbstractShingle {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_44_1.setRuntimeParent(null);
        _jettag_c_iterate_44_1.setTagInfo(_td_c_iterate_44_1);
        _jettag_c_iterate_44_1.doStart(context, out);
        while (_jettag_c_iterate_44_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_45_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_45_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_45_1.setRuntimeParent(_jettag_c_iterate_44_1);
            _jettag_c_include_45_1.setTagInfo(_td_c_include_45_1);
            _jettag_c_include_45_1.doStart(context, out);
            _jettag_c_include_45_1.doEnd();
            _jettag_c_iterate_44_1.handleBodyContent(out);
        }
        _jettag_c_iterate_44_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_48_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_48_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_48_1.setRuntimeParent(null);
        _jettag_c_iterate_48_1.setTagInfo(_td_c_iterate_48_1);
        _jettag_c_iterate_48_1.doStart(context, out);
        while (_jettag_c_iterate_48_1.okToProcessBody()) {
            out.write("\t\tprivate ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_49_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_49_11.setRuntimeParent(_jettag_c_iterate_48_1);
            _jettag_c_get_49_11.setTagInfo(_td_c_get_49_11);
            _jettag_c_get_49_11.doStart(context, out);
            _jettag_c_get_49_11.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_49_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_49_49.setRuntimeParent(_jettag_c_iterate_48_1);
            _jettag_c_get_49_49.setTagInfo(_td_c_get_49_49);
            _jettag_c_get_49_49.doStart(context, out);
            _jettag_c_get_49_49.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_48_1.handleBodyContent(out);
        }
        _jettag_c_iterate_48_1.doEnd();
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_52_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_52_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_52_1.setRuntimeParent(null);
        _jettag_c_iterate_52_1.setTagInfo(_td_c_iterate_52_1);
        _jettag_c_iterate_52_1.doStart(context, out);
        while (_jettag_c_iterate_52_1.okToProcessBody()) {
            out.write("    \tprivate ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_14.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_53_14.setTagInfo(_td_c_get_53_14);
            _jettag_c_get_53_14.doStart(context, out);
            _jettag_c_get_53_14.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_83); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_83.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_53_83.setTagInfo(_td_c_get_53_83);
            _jettag_c_get_53_83.doStart(context, out);
            _jettag_c_get_53_83.doEnd();
            out.write("; ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_52_1.handleBodyContent(out);
        }
        _jettag_c_iterate_52_1.doEnd();
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_56_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_56_1.setRuntimeParent(null);
        _jettag_c_if_56_1.setTagInfo(_td_c_if_56_1);
        _jettag_c_if_56_1.doStart(context, out);
        while (_jettag_c_if_56_1.okToProcessBody()) {
            out.write("\t\tprivate ErrorList\tindexErrors;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tprivate ActionsList indexActions;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_56_1.handleBodyContent(out);
        }
        _jettag_c_if_56_1.doEnd();
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_61_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_61_9.setRuntimeParent(null);
        _jettag_c_get_61_9.setTagInfo(_td_c_get_61_9);
        _jettag_c_get_61_9.doStart(context, out);
        _jettag_c_get_61_9.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprotected void addFormSections(Composite shingle, FormToolkit toolkit) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSection \tsection;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tGridLayout \tgl;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tGridData \tgd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tLabel label;\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tTableWrapData td;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection = toolkit.createSection(shingle,ExpandableComposite.TITLE_BAR|ExpandableComposite.TWISTIE|ExpandableComposite.EXPANDED);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl = new GridLayout();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgl.numColumns = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setLayout(gl);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd = new GridData(SWT.FILL,SWT.FILL,true,false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgd.verticalAlignment = SWT.BEGINNING;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setLayoutData(gd);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setText(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_81_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_81_20.setRuntimeParent(null);
        _jettag_c_get_81_20.setTagInfo(_td_c_get_81_20);
        _jettag_c_get_81_20.doStart(context, out);
        _jettag_c_get_81_20.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\taddFillSpace(toolkit,section,2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tComposite client = toolkit.createComposite(section);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tTableWrapLayout layout = new TableWrapLayout();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlayout.leftMargin = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlayout.rightMargin = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlayout.numColumns = 3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tclient.setLayout(layout);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsection.setClient(client);\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tlabel = toolkit.createLabel(client,\"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttd = new TableWrapData(TableWrapData.LEFT);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttd.colspan = 3;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlabel.setLayoutData(td);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlabel.setForeground(new Color(section.getDisplay(),200,0,0));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetConstraintMessage(label);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlabel.setVisible(false);");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_100_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_100_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_100_1.setRuntimeParent(null);
        _jettag_c_iterate_100_1.setTagInfo(_td_c_iterate_100_1);
        _jettag_c_iterate_100_1.doStart(context, out);
        while (_jettag_c_iterate_100_1.okToProcessBody()) {
            out.write(NL);         
            out.write(NL);         
            out.write("\t\tlabel = toolkit.createLabel(client,\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_103_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_39); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_103_39.setRuntimeParent(_jettag_c_iterate_100_1);
            _jettag_c_get_103_39.setTagInfo(_td_c_get_103_39);
            _jettag_c_get_103_39.doStart(context, out);
            _jettag_c_get_103_39.doEnd();
            out.write("\");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\ttd = new TableWrapData(TableWrapData.LEFT);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tlabel.setLayoutData(td);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_107_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_107_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_107_1.setRuntimeParent(_jettag_c_iterate_100_1);
            _jettag_c_include_107_1.setTagInfo(_td_c_include_107_1);
            _jettag_c_include_107_1.doStart(context, out);
            _jettag_c_include_107_1.doEnd();
            _jettag_c_iterate_100_1.handleBodyContent(out);
        }
        _jettag_c_iterate_100_1.doEnd();
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void addIndexSections(Composite shingle, FormToolkit toolkit, ShingleEditor editor) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_113_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_113_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_113_1.setRuntimeParent(null);
        _jettag_c_if_113_1.setTagInfo(_td_c_if_113_1);
        _jettag_c_if_113_1.doStart(context, out);
        while (_jettag_c_if_113_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\taddFillSpace(toolkit,shingle,1);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tindexActions = new ActionsList();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tindexActions.createIndexSection(shingle, toolkit, editor);");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_113_1.handleBodyContent(out);
        }
        _jettag_c_if_113_1.doEnd();
        out.write(NL);         
        out.write("\t\taddFillSpace(toolkit,shingle,1);");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_122_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_122_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_122_1.setRuntimeParent(null);
        _jettag_c_iterate_122_1.setTagInfo(_td_c_iterate_122_1);
        _jettag_c_iterate_122_1.doStart(context, out);
        while (_jettag_c_iterate_122_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_124_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_124_3.setRuntimeParent(_jettag_c_iterate_122_1);
            _jettag_c_get_124_3.setTagInfo(_td_c_get_124_3);
            _jettag_c_get_124_3.doStart(context, out);
            _jettag_c_get_124_3.doEnd();
            out.write(" = new ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_124_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_124_45.setRuntimeParent(_jettag_c_iterate_122_1);
            _jettag_c_get_124_45.setTagInfo(_td_c_get_124_45);
            _jettag_c_get_124_45.doStart(context, out);
            _jettag_c_get_124_45.doEnd();
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_125_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_125_3.setRuntimeParent(_jettag_c_iterate_122_1);
            _jettag_c_get_125_3.setTagInfo(_td_c_get_125_3);
            _jettag_c_get_125_3.doStart(context, out);
            _jettag_c_get_125_3.doEnd();
            out.write(".createIndexSection(shingle, toolkit, editor);");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_122_1.handleBodyContent(out);
        }
        _jettag_c_iterate_122_1.doEnd();
        RuntimeTagElement _jettag_c_if_127_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_127_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_127_1.setRuntimeParent(null);
        _jettag_c_if_127_1.setTagInfo(_td_c_if_127_1);
        _jettag_c_if_127_1.doStart(context, out);
        while (_jettag_c_if_127_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\taddFillSpace(toolkit,shingle,1);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tindexErrors = new ErrorList();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tindexErrors.createIndexSection(shingle, toolkit, editor);");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_127_1.handleBodyContent(out);
        }
        _jettag_c_if_127_1.doEnd();
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprotected void fillFields() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetFillingFields(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tModelAccess helper= ModelAccess.getInstance();");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_142_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_142_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_142_1.setRuntimeParent(null);
        _jettag_c_iterate_142_1.setTagInfo(_td_c_iterate_142_1);
        _jettag_c_iterate_142_1.doStart(context, out);
        while (_jettag_c_iterate_142_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_143_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_143_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_143_1.setRuntimeParent(_jettag_c_iterate_142_1);
            _jettag_c_include_143_1.setTagInfo(_td_c_include_143_1);
            _jettag_c_include_143_1.doStart(context, out);
            _jettag_c_include_143_1.doEnd();
            _jettag_c_iterate_142_1.handleBodyContent(out);
        }
        _jettag_c_iterate_142_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_146_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_146_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_146_1.setRuntimeParent(null);
        _jettag_c_iterate_146_1.setTagInfo(_td_c_iterate_146_1);
        _jettag_c_iterate_146_1.doStart(context, out);
        while (_jettag_c_iterate_146_1.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_147_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_147_3.setRuntimeParent(_jettag_c_iterate_146_1);
            _jettag_c_get_147_3.setTagInfo(_td_c_get_147_3);
            _jettag_c_get_147_3.doStart(context, out);
            _jettag_c_get_147_3.doEnd();
            out.write(".setSourceNode(getSourceNode());");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_146_1.handleBodyContent(out);
        }
        _jettag_c_iterate_146_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_150_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_150_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_150_1.setRuntimeParent(null);
        _jettag_c_if_150_1.setTagInfo(_td_c_if_150_1);
        _jettag_c_if_150_1.doStart(context, out);
        while (_jettag_c_if_150_1.okToProcessBody()) {
            out.write("\t\tindexErrors.setSourceNode(getSourceNode());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tindexActions.setSourceNode(getSourceNode());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            _jettag_c_if_150_1.handleBodyContent(out);
        }
        _jettag_c_if_150_1.doEnd();
        out.write("\t\tupdateConstraintMessage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetFillingFields(false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_158_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_158_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_158_1.setRuntimeParent(null);
        _jettag_c_iterate_158_1.setTagInfo(_td_c_iterate_158_1);
        _jettag_c_iterate_158_1.doStart(context, out);
        while (_jettag_c_iterate_158_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_160_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_160_9.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_c_get_160_9.setTagInfo(_td_c_get_160_9);
            _jettag_c_get_160_9.doStart(context, out);
            _jettag_c_get_160_9.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_160_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_160_47.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_c_get_160_47.setTagInfo(_td_c_get_160_47);
            _jettag_c_get_160_47.doStart(context, out);
            _jettag_c_get_160_47.doEnd();
            out.write("() {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\treturn ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_161_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_161_10.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_c_get_161_10.setTagInfo(_td_c_get_161_10);
            _jettag_c_get_161_10.doStart(context, out);
            _jettag_c_get_161_10.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_158_1.handleBodyContent(out);
        }
        _jettag_c_iterate_158_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_164_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_164_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_164_1.setRuntimeParent(null);
        _jettag_c_iterate_164_1.setTagInfo(_td_c_iterate_164_1);
        _jettag_c_iterate_164_1.doStart(context, out);
        while (_jettag_c_iterate_164_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_166_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_166_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_166_1.setRuntimeParent(_jettag_c_iterate_164_1);
            _jettag_c_include_166_1.setTagInfo(_td_c_include_166_1);
            _jettag_c_include_166_1.doStart(context, out);
            _jettag_c_include_166_1.doEnd();
            _jettag_c_iterate_164_1.handleBodyContent(out);
        }
        _jettag_c_iterate_164_1.doEnd();
        out.write(NL);         
        out.write("\tpublic void onlyExpandIndexFor(String nodeName) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_171_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_171_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_171_1.setRuntimeParent(null);
        _jettag_c_iterate_171_1.setTagInfo(_td_c_iterate_171_1);
        _jettag_c_iterate_171_1.doStart(context, out);
        while (_jettag_c_iterate_171_1.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_172_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_172_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_172_3.setRuntimeParent(_jettag_c_iterate_171_1);
            _jettag_c_get_172_3.setTagInfo(_td_c_get_172_3);
            _jettag_c_get_172_3.doStart(context, out);
            _jettag_c_get_172_3.doEnd();
            out.write("().getSection().setExpanded(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_172_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_172_76); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_172_76.setRuntimeParent(_jettag_c_iterate_171_1);
            _jettag_c_get_172_76.setTagInfo(_td_c_get_172_76);
            _jettag_c_get_172_76.doStart(context, out);
            _jettag_c_get_172_76.doEnd();
            out.write("\".equals(nodeName));");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_171_1.handleBodyContent(out);
        }
        _jettag_c_iterate_171_1.doEnd();
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic AbstractIndex getIndexFor(String nodeName) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_178_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_178_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_178_1.setRuntimeParent(null);
        _jettag_c_iterate_178_1.setTagInfo(_td_c_iterate_178_1);
        _jettag_c_iterate_178_1.doStart(context, out);
        while (_jettag_c_iterate_178_1.okToProcessBody()) {
            out.write("\t\tif (\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_179_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_179_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_179_8.setRuntimeParent(_jettag_c_iterate_178_1);
            _jettag_c_get_179_8.setTagInfo(_td_c_get_179_8);
            _jettag_c_get_179_8.doStart(context, out);
            _jettag_c_get_179_8.doEnd();
            out.write("\".equals(nodeName)) { return ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_179_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_179_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_179_68.setRuntimeParent(_jettag_c_iterate_178_1);
            _jettag_c_get_179_68.setTagInfo(_td_c_get_179_68);
            _jettag_c_get_179_68.doStart(context, out);
            _jettag_c_get_179_68.doEnd();
            out.write("(); }");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_178_1.handleBodyContent(out);
        }
        _jettag_c_iterate_178_1.doEnd();
        out.write("\t\treturn null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic AbstractConstraint createValidator() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_185_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_185_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_185_14.setRuntimeParent(null);
        _jettag_c_get_185_14.setTagInfo(_td_c_get_185_14);
        _jettag_c_get_185_14.doStart(context, out);
        _jettag_c_get_185_14.doEnd();
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void updateIndexes(Node node) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_189_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_189_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_189_1.setRuntimeParent(null);
        _jettag_c_iterate_189_1.setTagInfo(_td_c_iterate_189_1);
        _jettag_c_iterate_189_1.doStart(context, out);
        while (_jettag_c_iterate_189_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_191_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_191_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_191_3.setRuntimeParent(_jettag_c_iterate_189_1);
            _jettag_c_get_191_3.setTagInfo(_td_c_get_191_3);
            _jettag_c_get_191_3.doStart(context, out);
            _jettag_c_get_191_3.doEnd();
            out.write("().setSelectedElement(node);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_192_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_192_3.setRuntimeParent(_jettag_c_iterate_189_1);
            _jettag_c_get_192_3.setTagInfo(_td_c_get_192_3);
            _jettag_c_get_192_3.doStart(context, out);
            _jettag_c_get_192_3.doEnd();
            out.write("().update();");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_189_1.handleBodyContent(out);
        }
        _jettag_c_iterate_189_1.doEnd();
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic AbstractShingle getShingleToLeft() {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_198_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_198_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_198_1.setRuntimeParent(null);
        _jettag_c_if_198_1.setTagInfo(_td_c_if_198_1);
        _jettag_c_if_198_1.doStart(context, out);
        while (_jettag_c_if_198_1.okToProcessBody()) {
            out.write("\t\treturn null;\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_198_1.handleBodyContent(out);
        }
        _jettag_c_if_198_1.doEnd();
        RuntimeTagElement _jettag_c_if_201_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_201_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_201_1.setRuntimeParent(null);
        _jettag_c_if_201_1.setTagInfo(_td_c_if_201_1);
        _jettag_c_if_201_1.doStart(context, out);
        while (_jettag_c_if_201_1.okToProcessBody()) {
            out.write("\t\treturn getEditor().");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_202_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_202_22); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_202_22.setRuntimeParent(_jettag_c_if_201_1);
            _jettag_c_get_202_22.setTagInfo(_td_c_get_202_22);
            _jettag_c_get_202_22.doStart(context, out);
            _jettag_c_get_202_22.doEnd();
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_201_1.handleBodyContent(out);
        }
        _jettag_c_if_201_1.doEnd();
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void setFocus() {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_207_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_207_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_207_1.setRuntimeParent(null);
        _jettag_c_if_207_1.setTagInfo(_td_c_if_207_1);
        _jettag_c_if_207_1.doStart(context, out);
        while (_jettag_c_if_207_1.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_208_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_208_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_208_3.setRuntimeParent(_jettag_c_if_207_1);
            _jettag_c_get_208_3.setTagInfo(_td_c_get_208_3);
            _jettag_c_get_208_3.doStart(context, out);
            _jettag_c_get_208_3.doEnd();
            out.write(".setFocus();");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_207_1.handleBodyContent(out);
        }
        _jettag_c_if_207_1.doEnd();
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
