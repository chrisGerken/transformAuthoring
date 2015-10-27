package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_if_3_1 = new TagInfo("c1:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "not(isVariableDefined(root))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_setVariable_4_5 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            4, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "xform", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_7_2 = new TagInfo("c1:iterate", //$NON-NLS-1$
            7, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/xform/group[@polymorphicSingleton='true']", //$NON-NLS-1$
                "ps", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_8_3 = new TagInfo("c1:set", //$NON-NLS-1$
            8, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "/xform/group[@id=$ps/@parentId]/token[@name=$ps/@polymorphicKey]", //$NON-NLS-1$
                "isPolymorphicKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_11_2 = new TagInfo("c1:set", //$NON-NLS-1$
            11, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$xform", //$NON-NLS-1$
                "xformProject", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_11_46 = new TagInfo("c1:get", //$NON-NLS-1$
            11, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$xform/@xformId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_13_2 = new TagInfo("c1:iterate", //$NON-NLS-1$
            13, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group", //$NON-NLS-1$
                "group", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_15_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            15, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/createProject", //$NON-NLS-1$
                "createProject", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_17_4 = new TagInfo("c1:set", //$NON-NLS-1$
            17, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$createProject", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_17_48 = new TagInfo("c1:get", //$NON-NLS-1$
            17, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createProject/@projectExpr", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_21_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            21, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/createFolder", //$NON-NLS-1$
                "createFolder", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_23_4 = new TagInfo("c1:set", //$NON-NLS-1$
            23, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$createFolder", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_23_47 = new TagInfo("c1:get", //$NON-NLS-1$
            23, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFolder/@projectExpr", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_23_92 = new TagInfo("c1:get", //$NON-NLS-1$
            23, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFolder/@folderExpr", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_27_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            27, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/createFile", //$NON-NLS-1$
                "createFile", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_29_4 = new TagInfo("c1:set", //$NON-NLS-1$
            29, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$createFile", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_29_45 = new TagInfo("c1:get", //$NON-NLS-1$
            29, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@projectExpr", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_29_88 = new TagInfo("c1:get", //$NON-NLS-1$
            29, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@folderExpr", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_29_131 = new TagInfo("c1:get", //$NON-NLS-1$
            29, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@nameExpr", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_30_4 = new TagInfo("c1:set", //$NON-NLS-1$
            30, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$createFile", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_30_59 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$group/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_30_91 = new TagInfo("c1:get", //$NON-NLS-1$
            30, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@purpose", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_31_4 = new TagInfo("c1:if", //$NON-NLS-1$
            31, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@binary='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_32_5 = new TagInfo("c1:set", //$NON-NLS-1$
            32, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$createFile", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_32_60 = new TagInfo("c1:get", //$NON-NLS-1$
            32, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$group/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_32_92 = new TagInfo("c1:get", //$NON-NLS-1$
            32, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$createFile/@purpose", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_36_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            36, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/createToken", //$NON-NLS-1$
                "createToken", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_40_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            40, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/inputToken", //$NON-NLS-1$
                "inputToken", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_46_2 = new TagInfo("c1:iterate", //$NON-NLS-1$
            46, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/replacement", //$NON-NLS-1$
                "replacement", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_53_2 = new TagInfo("ws:project", //$NON-NLS-1$
            53, 2,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_54_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            54, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/jet2java", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_55_5 = new TagInfo("ws:file", //$NON-NLS-1$
            55, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/.project", //$NON-NLS-1$
                "templates/xform/xform.project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_56_5 = new TagInfo("ws:file", //$NON-NLS-1$
            56, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/.classpath", //$NON-NLS-1$
                "templates/xform/xform.classpath.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_57_5 = new TagInfo("ws:file", //$NON-NLS-1$
            57, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/build.properties", //$NON-NLS-1$
                "templates/xform/xform.buildPropertiesFile.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_58_5 = new TagInfo("ws:file", //$NON-NLS-1$
            58, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/plugin.xml", //$NON-NLS-1$
                "templates/xform/xform.pluginXmlFile.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_59_5 = new TagInfo("ws:file", //$NON-NLS-1$
            59, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/sample.xml", //$NON-NLS-1$
                "templates/xform/xform.sampleXmlFile.jet", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_60_5 = new TagInfo("ws:file", //$NON-NLS-1$
            60, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/settings/org.eclipse.jet.prefs", //$NON-NLS-1$
                "templates/xform/xform.orgEclipseJetPrefsFile.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_61_5 = new TagInfo("ws:file", //$NON-NLS-1$
            61, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/META-INF/MANIFEST.MF", //$NON-NLS-1$
                "templates/xform/xform.manifestFile.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_62_5 = new TagInfo("ws:file", //$NON-NLS-1$
            62, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/templates/main.jet", //$NON-NLS-1$
                "templates/xform/xform.mainJetFile.jet", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_63_5 = new TagInfo("ws:file", //$NON-NLS-1$
            63, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/templates/dump.jet", //$NON-NLS-1$
                "templates/xform/xform.dumpJetFile.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_64_5 = new TagInfo("ws:file", //$NON-NLS-1$
            64, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
            },
            new String[] {
                "{$xform/@xformProject}/snippets/tags.txt", //$NON-NLS-1$
                "templates/xform/xform.snippets.jet", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_66_2 = new TagInfo("c1:iterate", //$NON-NLS-1$
            66, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group", //$NON-NLS-1$
                "group", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_68_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            68, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/createProject", //$NON-NLS-1$
                "createProject", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_72_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            72, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/createFolder", //$NON-NLS-1$
                "createFolder", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_76_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            76, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/createFile", //$NON-NLS-1$
                "createFile", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_80_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            80, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/createToken", //$NON-NLS-1$
                "createToken", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_84_3 = new TagInfo("c1:iterate", //$NON-NLS-1$
            84, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/inputToken", //$NON-NLS-1$
                "inputToken", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_if_92_1 = new TagInfo("c1:if", //$NON-NLS-1$
            92, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "isVariableDefined('org.eclipse.jet.resource.project.name')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_93_5 = new TagInfo("ws:file", //$NON-NLS-1$
            93, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/dump.jet", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/dump.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        RuntimeTagElement _jettag_c1_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_if_3_1.setRuntimeParent(null);
        _jettag_c1_if_3_1.setTagInfo(_td_c1_if_3_1);
        _jettag_c1_if_3_1.doStart(context, out);
        while (_jettag_c1_if_3_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c1_setVariable_4_5 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_4_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_setVariable_4_5.setRuntimeParent(_jettag_c1_if_3_1);
            _jettag_c1_setVariable_4_5.setTagInfo(_td_c1_setVariable_4_5);
            _jettag_c1_setVariable_4_5.doStart(context, out);
            _jettag_c1_setVariable_4_5.doEnd();
            _jettag_c1_if_3_1.handleBodyContent(out);
        }
        _jettag_c1_if_3_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_7_2 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_7_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_7_2.setRuntimeParent(null);
        _jettag_c1_iterate_7_2.setTagInfo(_td_c1_iterate_7_2);
        _jettag_c1_iterate_7_2.doStart(context, out);
        while (_jettag_c1_iterate_7_2.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_set_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_set_8_3.setRuntimeParent(_jettag_c1_iterate_7_2);
            _jettag_c1_set_8_3.setTagInfo(_td_c1_set_8_3);
            _jettag_c1_set_8_3.doStart(context, out);
            JET2Writer _jettag_c1_set_8_3_saved_out = out;
            while (_jettag_c1_set_8_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("true");  //$NON-NLS-1$        
                _jettag_c1_set_8_3.handleBodyContent(out);
            }
            out = _jettag_c1_set_8_3_saved_out;
            _jettag_c1_set_8_3.doEnd();
            out.write(NL);         
            _jettag_c1_iterate_7_2.handleBodyContent(out);
        }
        _jettag_c1_iterate_7_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c1_set_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_11_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_set_11_2.setRuntimeParent(null);
        _jettag_c1_set_11_2.setTagInfo(_td_c1_set_11_2);
        _jettag_c1_set_11_2.doStart(context, out);
        JET2Writer _jettag_c1_set_11_2_saved_out = out;
        while (_jettag_c1_set_11_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c1_get_11_46 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_11_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_11_46.setRuntimeParent(_jettag_c1_set_11_2);
            _jettag_c1_get_11_46.setTagInfo(_td_c1_get_11_46);
            _jettag_c1_get_11_46.doStart(context, out);
            _jettag_c1_get_11_46.doEnd();
            _jettag_c1_set_11_2.handleBodyContent(out);
        }
        out = _jettag_c1_set_11_2_saved_out;
        _jettag_c1_set_11_2.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_13_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_13_2.setRuntimeParent(null);
        _jettag_c1_iterate_13_2.setTagInfo(_td_c1_iterate_13_2);
        _jettag_c1_iterate_13_2.doStart(context, out);
        while (_jettag_c1_iterate_13_2.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_15_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_15_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_15_3.setRuntimeParent(_jettag_c1_iterate_13_2);
            _jettag_c1_iterate_15_3.setTagInfo(_td_c1_iterate_15_3);
            _jettag_c1_iterate_15_3.doStart(context, out);
            while (_jettag_c1_iterate_15_3.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_set_17_4 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_17_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_set_17_4.setRuntimeParent(_jettag_c1_iterate_15_3);
                _jettag_c1_set_17_4.setTagInfo(_td_c1_set_17_4);
                _jettag_c1_set_17_4.doStart(context, out);
                JET2Writer _jettag_c1_set_17_4_saved_out = out;
                while (_jettag_c1_set_17_4.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c1_get_17_48 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_17_48); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_get_17_48.setRuntimeParent(_jettag_c1_set_17_4);
                    _jettag_c1_get_17_48.setTagInfo(_td_c1_get_17_48);
                    _jettag_c1_get_17_48.doStart(context, out);
                    _jettag_c1_get_17_48.doEnd();
                    _jettag_c1_set_17_4.handleBodyContent(out);
                }
                out = _jettag_c1_set_17_4_saved_out;
                _jettag_c1_set_17_4.doEnd();
                out.write(NL);         
                out.write(NL);         
                _jettag_c1_iterate_15_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_15_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_21_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_21_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_21_3.setRuntimeParent(_jettag_c1_iterate_13_2);
            _jettag_c1_iterate_21_3.setTagInfo(_td_c1_iterate_21_3);
            _jettag_c1_iterate_21_3.doStart(context, out);
            while (_jettag_c1_iterate_21_3.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_set_23_4 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_23_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_set_23_4.setRuntimeParent(_jettag_c1_iterate_21_3);
                _jettag_c1_set_23_4.setTagInfo(_td_c1_set_23_4);
                _jettag_c1_set_23_4.doStart(context, out);
                JET2Writer _jettag_c1_set_23_4_saved_out = out;
                while (_jettag_c1_set_23_4.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c1_get_23_47 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_23_47); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_get_23_47.setRuntimeParent(_jettag_c1_set_23_4);
                    _jettag_c1_get_23_47.setTagInfo(_td_c1_get_23_47);
                    _jettag_c1_get_23_47.doStart(context, out);
                    _jettag_c1_get_23_47.doEnd();
                    RuntimeTagElement _jettag_c1_get_23_92 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_23_92); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_get_23_92.setRuntimeParent(_jettag_c1_set_23_4);
                    _jettag_c1_get_23_92.setTagInfo(_td_c1_get_23_92);
                    _jettag_c1_get_23_92.doStart(context, out);
                    _jettag_c1_get_23_92.doEnd();
                    _jettag_c1_set_23_4.handleBodyContent(out);
                }
                out = _jettag_c1_set_23_4_saved_out;
                _jettag_c1_set_23_4.doEnd();
                out.write(NL);         
                out.write(NL);         
                _jettag_c1_iterate_21_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_21_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_27_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_27_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_27_3.setRuntimeParent(_jettag_c1_iterate_13_2);
            _jettag_c1_iterate_27_3.setTagInfo(_td_c1_iterate_27_3);
            _jettag_c1_iterate_27_3.doStart(context, out);
            while (_jettag_c1_iterate_27_3.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_set_29_4 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_29_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_set_29_4.setRuntimeParent(_jettag_c1_iterate_27_3);
                _jettag_c1_set_29_4.setTagInfo(_td_c1_set_29_4);
                _jettag_c1_set_29_4.doStart(context, out);
                JET2Writer _jettag_c1_set_29_4_saved_out = out;
                while (_jettag_c1_set_29_4.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c1_get_29_45 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_29_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_get_29_45.setRuntimeParent(_jettag_c1_set_29_4);
                    _jettag_c1_get_29_45.setTagInfo(_td_c1_get_29_45);
                    _jettag_c1_get_29_45.doStart(context, out);
                    _jettag_c1_get_29_45.doEnd();
                    RuntimeTagElement _jettag_c1_get_29_88 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_29_88); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_get_29_88.setRuntimeParent(_jettag_c1_set_29_4);
                    _jettag_c1_get_29_88.setTagInfo(_td_c1_get_29_88);
                    _jettag_c1_get_29_88.doStart(context, out);
                    _jettag_c1_get_29_88.doEnd();
                    out.write("/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c1_get_29_131 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_29_131); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_get_29_131.setRuntimeParent(_jettag_c1_set_29_4);
                    _jettag_c1_get_29_131.setTagInfo(_td_c1_get_29_131);
                    _jettag_c1_get_29_131.doStart(context, out);
                    _jettag_c1_get_29_131.doEnd();
                    _jettag_c1_set_29_4.handleBodyContent(out);
                }
                out = _jettag_c1_set_29_4_saved_out;
                _jettag_c1_set_29_4.doEnd();
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_set_30_4 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_30_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_set_30_4.setRuntimeParent(_jettag_c1_iterate_27_3);
                _jettag_c1_set_30_4.setTagInfo(_td_c1_set_30_4);
                _jettag_c1_set_30_4.doStart(context, out);
                JET2Writer _jettag_c1_set_30_4_saved_out = out;
                while (_jettag_c1_set_30_4.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("templates/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c1_get_30_59 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_59); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_get_30_59.setRuntimeParent(_jettag_c1_set_30_4);
                    _jettag_c1_get_30_59.setTagInfo(_td_c1_get_30_59);
                    _jettag_c1_get_30_59.doStart(context, out);
                    _jettag_c1_get_30_59.doEnd();
                    out.write("/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c1_get_30_91 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_30_91); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_get_30_91.setRuntimeParent(_jettag_c1_set_30_4);
                    _jettag_c1_get_30_91.setTagInfo(_td_c1_get_30_91);
                    _jettag_c1_get_30_91.doStart(context, out);
                    _jettag_c1_get_30_91.doEnd();
                    out.write(".jet");  //$NON-NLS-1$        
                    _jettag_c1_set_30_4.handleBodyContent(out);
                }
                out = _jettag_c1_set_30_4_saved_out;
                _jettag_c1_set_30_4.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c1_if_31_4 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_31_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_if_31_4.setRuntimeParent(_jettag_c1_iterate_27_3);
                _jettag_c1_if_31_4.setTagInfo(_td_c1_if_31_4);
                _jettag_c1_if_31_4.doStart(context, out);
                while (_jettag_c1_if_31_4.okToProcessBody()) {
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c1_set_32_5 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_32_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c1_set_32_5.setRuntimeParent(_jettag_c1_if_31_4);
                    _jettag_c1_set_32_5.setTagInfo(_td_c1_set_32_5);
                    _jettag_c1_set_32_5.doStart(context, out);
                    JET2Writer _jettag_c1_set_32_5_saved_out = out;
                    while (_jettag_c1_set_32_5.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("templates/");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c1_get_32_60 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_32_60); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c1_get_32_60.setRuntimeParent(_jettag_c1_set_32_5);
                        _jettag_c1_get_32_60.setTagInfo(_td_c1_get_32_60);
                        _jettag_c1_get_32_60.doStart(context, out);
                        _jettag_c1_get_32_60.doEnd();
                        out.write("/");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c1_get_32_92 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_32_92); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c1_get_32_92.setRuntimeParent(_jettag_c1_set_32_5);
                        _jettag_c1_get_32_92.setTagInfo(_td_c1_get_32_92);
                        _jettag_c1_get_32_92.doStart(context, out);
                        _jettag_c1_get_32_92.doEnd();
                        _jettag_c1_set_32_5.handleBodyContent(out);
                    }
                    out = _jettag_c1_set_32_5_saved_out;
                    _jettag_c1_set_32_5.doEnd();
                    out.write(NL);         
                    _jettag_c1_if_31_4.handleBodyContent(out);
                }
                _jettag_c1_if_31_4.doEnd();
                _jettag_c1_iterate_27_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_27_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_36_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_36_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_36_3.setRuntimeParent(_jettag_c1_iterate_13_2);
            _jettag_c1_iterate_36_3.setTagInfo(_td_c1_iterate_36_3);
            _jettag_c1_iterate_36_3.doStart(context, out);
            while (_jettag_c1_iterate_36_3.okToProcessBody()) {
                out.write(NL);         
                _jettag_c1_iterate_36_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_36_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_40_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_40_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_40_3.setRuntimeParent(_jettag_c1_iterate_13_2);
            _jettag_c1_iterate_40_3.setTagInfo(_td_c1_iterate_40_3);
            _jettag_c1_iterate_40_3.doStart(context, out);
            while (_jettag_c1_iterate_40_3.okToProcessBody()) {
                out.write(NL);         
                _jettag_c1_iterate_40_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_40_3.doEnd();
            out.write(NL);         
            _jettag_c1_iterate_13_2.handleBodyContent(out);
        }
        _jettag_c1_iterate_13_2.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_46_2 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_46_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_46_2.setRuntimeParent(null);
        _jettag_c1_iterate_46_2.setTagInfo(_td_c1_iterate_46_2);
        _jettag_c1_iterate_46_2.doStart(context, out);
        while (_jettag_c1_iterate_46_2.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c1_iterate_46_2.handleBodyContent(out);
        }
        _jettag_c1_iterate_46_2.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_53_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_53_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_53_2.setRuntimeParent(null);
        _jettag_ws_project_53_2.setTagInfo(_td_ws_project_53_2);
        _jettag_ws_project_53_2.doStart(context, out);
        _jettag_ws_project_53_2.doEnd();
        RuntimeTagElement _jettag_ws_folder_54_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_54_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_folder_54_2.setRuntimeParent(null);
        _jettag_ws_folder_54_2.setTagInfo(_td_ws_folder_54_2);
        _jettag_ws_folder_54_2.doStart(context, out);
        _jettag_ws_folder_54_2.doEnd();
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_55_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_55_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_55_5.setRuntimeParent(null);
        _jettag_ws_file_55_5.setTagInfo(_td_ws_file_55_5);
        _jettag_ws_file_55_5.doStart(context, out);
        _jettag_ws_file_55_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_56_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_56_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_56_5.setRuntimeParent(null);
        _jettag_ws_file_56_5.setTagInfo(_td_ws_file_56_5);
        _jettag_ws_file_56_5.doStart(context, out);
        _jettag_ws_file_56_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_57_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_57_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_57_5.setRuntimeParent(null);
        _jettag_ws_file_57_5.setTagInfo(_td_ws_file_57_5);
        _jettag_ws_file_57_5.doStart(context, out);
        _jettag_ws_file_57_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_58_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_58_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_58_5.setRuntimeParent(null);
        _jettag_ws_file_58_5.setTagInfo(_td_ws_file_58_5);
        _jettag_ws_file_58_5.doStart(context, out);
        _jettag_ws_file_58_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_59_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_59_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_59_5.setRuntimeParent(null);
        _jettag_ws_file_59_5.setTagInfo(_td_ws_file_59_5);
        _jettag_ws_file_59_5.doStart(context, out);
        _jettag_ws_file_59_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_60_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_60_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_60_5.setRuntimeParent(null);
        _jettag_ws_file_60_5.setTagInfo(_td_ws_file_60_5);
        _jettag_ws_file_60_5.doStart(context, out);
        _jettag_ws_file_60_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_61_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_61_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_61_5.setRuntimeParent(null);
        _jettag_ws_file_61_5.setTagInfo(_td_ws_file_61_5);
        _jettag_ws_file_61_5.doStart(context, out);
        _jettag_ws_file_61_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_62_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_62_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_62_5.setRuntimeParent(null);
        _jettag_ws_file_62_5.setTagInfo(_td_ws_file_62_5);
        _jettag_ws_file_62_5.doStart(context, out);
        _jettag_ws_file_62_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_63_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_63_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_63_5.setRuntimeParent(null);
        _jettag_ws_file_63_5.setTagInfo(_td_ws_file_63_5);
        _jettag_ws_file_63_5.doStart(context, out);
        _jettag_ws_file_63_5.doEnd();
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_ws_file_64_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_64_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_64_5.setRuntimeParent(null);
        _jettag_ws_file_64_5.setTagInfo(_td_ws_file_64_5);
        _jettag_ws_file_64_5.doStart(context, out);
        _jettag_ws_file_64_5.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_66_2 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_66_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_66_2.setRuntimeParent(null);
        _jettag_c1_iterate_66_2.setTagInfo(_td_c1_iterate_66_2);
        _jettag_c1_iterate_66_2.doStart(context, out);
        while (_jettag_c1_iterate_66_2.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_68_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_68_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_68_3.setRuntimeParent(_jettag_c1_iterate_66_2);
            _jettag_c1_iterate_68_3.setTagInfo(_td_c1_iterate_68_3);
            _jettag_c1_iterate_68_3.doStart(context, out);
            while (_jettag_c1_iterate_68_3.okToProcessBody()) {
                out.write(NL);         
                _jettag_c1_iterate_68_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_68_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_72_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_72_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_72_3.setRuntimeParent(_jettag_c1_iterate_66_2);
            _jettag_c1_iterate_72_3.setTagInfo(_td_c1_iterate_72_3);
            _jettag_c1_iterate_72_3.doStart(context, out);
            while (_jettag_c1_iterate_72_3.okToProcessBody()) {
                out.write(NL);         
                _jettag_c1_iterate_72_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_72_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_76_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_76_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_76_3.setRuntimeParent(_jettag_c1_iterate_66_2);
            _jettag_c1_iterate_76_3.setTagInfo(_td_c1_iterate_76_3);
            _jettag_c1_iterate_76_3.doStart(context, out);
            while (_jettag_c1_iterate_76_3.okToProcessBody()) {
                out.write(NL);         
                _jettag_c1_iterate_76_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_76_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_80_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_80_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_80_3.setRuntimeParent(_jettag_c1_iterate_66_2);
            _jettag_c1_iterate_80_3.setTagInfo(_td_c1_iterate_80_3);
            _jettag_c1_iterate_80_3.doStart(context, out);
            while (_jettag_c1_iterate_80_3.okToProcessBody()) {
                out.write(NL);         
                _jettag_c1_iterate_80_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_80_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_84_3 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_84_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_84_3.setRuntimeParent(_jettag_c1_iterate_66_2);
            _jettag_c1_iterate_84_3.setTagInfo(_td_c1_iterate_84_3);
            _jettag_c1_iterate_84_3.doStart(context, out);
            while (_jettag_c1_iterate_84_3.okToProcessBody()) {
                out.write(NL);         
                _jettag_c1_iterate_84_3.handleBodyContent(out);
            }
            _jettag_c1_iterate_84_3.doEnd();
            out.write(NL);         
            _jettag_c1_iterate_66_2.handleBodyContent(out);
        }
        _jettag_c1_iterate_66_2.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_if_92_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "if", "c1:if", _td_c1_if_92_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_if_92_1.setRuntimeParent(null);
        _jettag_c1_if_92_1.setTagInfo(_td_c1_if_92_1);
        _jettag_c1_if_92_1.doStart(context, out);
        while (_jettag_c1_if_92_1.okToProcessBody()) {
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_93_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_93_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_93_5.setRuntimeParent(_jettag_c1_if_92_1);
            _jettag_ws_file_93_5.setTagInfo(_td_ws_file_93_5);
            _jettag_ws_file_93_5.doStart(context, out);
            _jettag_ws_file_93_5.doEnd();
            out.write(NL);         
            _jettag_c1_if_92_1.handleBodyContent(out);
        }
        _jettag_c1_if_92_1.doEnd();
    }
}
