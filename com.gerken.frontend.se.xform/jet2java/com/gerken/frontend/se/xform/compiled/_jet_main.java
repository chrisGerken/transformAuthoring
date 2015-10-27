package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_30_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            30, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_47_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            47, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/editor", //$NON-NLS-1$
                "editor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_52_3 = new TagInfo("c:set", //$NON-NLS-1$
            52, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "editorProjectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_70 = new TagInfo("c:get", //$NON-NLS-1$
            52, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_53_3 = new TagInfo("c:set", //$NON-NLS-1$
            53, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_66 = new TagInfo("c:get", //$NON-NLS-1$
            53, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_54_3 = new TagInfo("c:set", //$NON-NLS-1$
            54, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "editorDir", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_62 = new TagInfo("c:get", //$NON-NLS-1$
            54, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "translate($editor/@editorPackage,'.','/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_55_3 = new TagInfo("c:set", //$NON-NLS-1$
            55, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "basePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_64 = new TagInfo("c:get", //$NON-NLS-1$
            55, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_56_3 = new TagInfo("c:set", //$NON-NLS-1$
            56, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "baseDir", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_60 = new TagInfo("c:get", //$NON-NLS-1$
            56, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "translate($editor/@basePackage,'.','/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_57_3 = new TagInfo("c:set", //$NON-NLS-1$
            57, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "domainPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_66 = new TagInfo("c:get", //$NON-NLS-1$
            57, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_58_3 = new TagInfo("c:set", //$NON-NLS-1$
            58, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "domainDir", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_62 = new TagInfo("c:get", //$NON-NLS-1$
            58, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "translate($editor/@domainPackage,'.','/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_59_3 = new TagInfo("c:set", //$NON-NLS-1$
            59, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "constraintPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_70 = new TagInfo("c:get", //$NON-NLS-1$
            59, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@basePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_60_3 = new TagInfo("c:set", //$NON-NLS-1$
            60, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "constraintDir", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_66 = new TagInfo("c:get", //$NON-NLS-1$
            60, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "translate($editor/@constraintPackage,'.','/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_61_3 = new TagInfo("c:set", //$NON-NLS-1$
            61, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "indexPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_65 = new TagInfo("c:get", //$NON-NLS-1$
            61, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@basePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_62_3 = new TagInfo("c:set", //$NON-NLS-1$
            62, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "indexDir", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_61 = new TagInfo("c:get", //$NON-NLS-1$
            62, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "translate($editor/@indexPackage,'.','/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_63_3 = new TagInfo("c:set", //$NON-NLS-1$
            63, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "shinglesPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_68 = new TagInfo("c:get", //$NON-NLS-1$
            63, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@basePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_64_3 = new TagInfo("c:set", //$NON-NLS-1$
            64, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "shinglesDir", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_64 = new TagInfo("c:get", //$NON-NLS-1$
            64, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "translate($editor/@shinglesPackage,'.','/')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_65_3 = new TagInfo("c:set", //$NON-NLS-1$
            65, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$editor", //$NON-NLS-1$
                "maxLevel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_68_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            68, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_73_5 = new TagInfo("c:set", //$NON-NLS-1$
            73, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "validatorClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_67 = new TagInfo("c:get", //$NON-NLS-1$
            73, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($type/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_74_5 = new TagInfo("c:set", //$NON-NLS-1$
            74, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "indexClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_63 = new TagInfo("c:get", //$NON-NLS-1$
            74, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($type/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_75_5 = new TagInfo("c:set", //$NON-NLS-1$
            75, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "shingleClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_65 = new TagInfo("c:get", //$NON-NLS-1$
            75, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($type/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_76_5 = new TagInfo("c:set", //$NON-NLS-1$
            76, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_75 = new TagInfo("c:get", //$NON-NLS-1$
            76, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($type/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_77_5 = new TagInfo("c:set", //$NON-NLS-1$
            77, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "indexVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_67 = new TagInfo("c:get", //$NON-NLS-1$
            77, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_78_5 = new TagInfo("c:set", //$NON-NLS-1$
            78, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "indexGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_73 = new TagInfo("c:get", //$NON-NLS-1$
            78, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($type/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_79_5 = new TagInfo("c:set", //$NON-NLS-1$
            79, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "shingleVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_70 = new TagInfo("c:get", //$NON-NLS-1$
            79, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($type/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_80_5 = new TagInfo("c:set", //$NON-NLS-1$
            80, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
                "level", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_83_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            83, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_88_7 = new TagInfo("c:set", //$NON-NLS-1$
            88, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$field", //$NON-NLS-1$
                "widgetVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_70 = new TagInfo("c:get", //$NON-NLS-1$
            88, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_89_7 = new TagInfo("c:set", //$NON-NLS-1$
            89, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$field", //$NON-NLS-1$
                "listenerClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_69 = new TagInfo("c:get", //$NON-NLS-1$
            89, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($field/@kind)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_115 = new TagInfo("c:get", //$NON-NLS-1$
            89, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($field/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_90_7 = new TagInfo("c:set", //$NON-NLS-1$
            90, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$field", //$NON-NLS-1$
                "domainVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_72 = new TagInfo("c:get", //$NON-NLS-1$
            90, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_93_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            93, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$field/constraint", //$NON-NLS-1$
                "constraint", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_105_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            105, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/domain", //$NON-NLS-1$
                "domain", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_110_5 = new TagInfo("c:set", //$NON-NLS-1$
            110, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$domain", //$NON-NLS-1$
                "domainClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_66 = new TagInfo("c:get", //$NON-NLS-1$
            110, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($domain/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_113_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            113, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$domain/value", //$NON-NLS-1$
                "value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_119_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            119, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$domain/query", //$NON-NLS-1$
                "query", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_128_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            128, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/pattern", //$NON-NLS-1$
                "pattern", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_135_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            135, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[not(@parent)]", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_136_3 = new TagInfo("c:include", //$NON-NLS-1$
            136, 3,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/editor/recurse.level.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_158_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            158, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/editor", //$NON-NLS-1$
                "editor", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_163_3 = new TagInfo("ws:project", //$NON-NLS-1$
            163, 3,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_164_3 = new TagInfo("ws:file", //$NON-NLS-1$
            164, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/.classpath", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.classpath.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_165_3 = new TagInfo("ws:file", //$NON-NLS-1$
            165, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/.project", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_166_3 = new TagInfo("ws:file", //$NON-NLS-1$
            166, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/META-INF/MANIFEST.MF", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.manifest.mf.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_167_3 = new TagInfo("ws:file", //$NON-NLS-1$
            167, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/build.properties", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.build.properties.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_168_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            168, 3,
            new String[] {
                "binary", //$NON-NLS-1$
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "true", //$NON-NLS-1$
                "templates/editor/editor.copy.ico", //$NON-NLS-1$
                "{$editor/@editorProjectName}/icons/copy.ico", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_169_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            169, 3,
            new String[] {
                "binary", //$NON-NLS-1$
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "true", //$NON-NLS-1$
                "templates/editor/editor.delete.ico", //$NON-NLS-1$
                "{$editor/@editorProjectName}/icons/delete.ico", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_170_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            170, 3,
            new String[] {
                "binary", //$NON-NLS-1$
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "true", //$NON-NLS-1$
                "templates/editor/editor.down.ico", //$NON-NLS-1$
                "{$editor/@editorProjectName}/icons/down.ico", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_171_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            171, 3,
            new String[] {
                "binary", //$NON-NLS-1$
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "true", //$NON-NLS-1$
                "templates/editor/editor.edit.ico", //$NON-NLS-1$
                "{$editor/@editorProjectName}/icons/edit.ico", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_172_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            172, 3,
            new String[] {
                "binary", //$NON-NLS-1$
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "true", //$NON-NLS-1$
                "templates/editor/editor.shingle.ico", //$NON-NLS-1$
                "{$editor/@editorProjectName}/icons/shingle.ico", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_173_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            173, 3,
            new String[] {
                "binary", //$NON-NLS-1$
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "true", //$NON-NLS-1$
                "templates/editor/editor.up.ico", //$NON-NLS-1$
                "{$editor/@editorProjectName}/icons/up.ico", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_174_3 = new TagInfo("ws:file", //$NON-NLS-1$
            174, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/plugin.xml", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.plugin.xml.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_175_3 = new TagInfo("ws:file", //$NON-NLS-1$
            175, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@baseDir}/Activator.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.activator.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_176_3 = new TagInfo("ws:file", //$NON-NLS-1$
            176, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/AbstractConstraint.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.abstract.constraint.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_177_3 = new TagInfo("ws:file", //$NON-NLS-1$
            177, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/AbstractEnumeration.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.abstract.enumeration.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_178_3 = new TagInfo("ws:file", //$NON-NLS-1$
            178, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/AbstractIndex.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.abstract.index.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_179_3 = new TagInfo("ws:file", //$NON-NLS-1$
            179, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/AbstractShingle.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.abstract.shingle.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_180_3 = new TagInfo("ws:file", //$NON-NLS-1$
            180, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/ActionsList.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.actions.list.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_181_3 = new TagInfo("ws:file", //$NON-NLS-1$
            181, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/ConstraintFailure.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.constraint.failure.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_182_3 = new TagInfo("ws:file", //$NON-NLS-1$
            182, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/DataReader.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.data.reader.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_183_3 = new TagInfo("ws:file", //$NON-NLS-1$
            183, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/DataWriter.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.data.writer.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_184_3 = new TagInfo("ws:file", //$NON-NLS-1$
            184, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/ErrorList.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.error.list.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_185_3 = new TagInfo("ws:file", //$NON-NLS-1$
            185, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/IModelChangedListener.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.imodel.changed.listener.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_186_3 = new TagInfo("ws:file", //$NON-NLS-1$
            186, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/ModelAccess.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.model.access.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_187_3 = new TagInfo("ws:file", //$NON-NLS-1$
            187, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@editorDir}/ShingleEditor.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/editor.shingle.editor.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_188_3 = new TagInfo("ws:file", //$NON-NLS-1$
            188, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/snippets/m2m.txt", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/editor/m2m.snippets.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_192_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            192, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_197_5 = new TagInfo("ws:file", //$NON-NLS-1$
            197, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@constraintDir}/{$type/@validatorClass}.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/type/type.constraint.validator.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_198_5 = new TagInfo("ws:file", //$NON-NLS-1$
            198, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@indexDir}/{$type/@indexClass}.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/type/type.index.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_199_5 = new TagInfo("ws:file", //$NON-NLS-1$
            199, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@shinglesDir}/{$type/@shingleClass}.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/type/type.shingle.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_203_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            203, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_208_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            208, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$field/constraint", //$NON-NLS-1$
                "constraint", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_222_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            222, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/domain", //$NON-NLS-1$
                "domain", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_227_5 = new TagInfo("ws:file", //$NON-NLS-1$
            227, 5,
            new String[] {
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$editor/@editorProjectName}/src/{$editor/@domainDir}/{$domain/@domainClass}.java", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "templates/domain/domain.java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_231_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            231, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$domain/value", //$NON-NLS-1$
                "value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_237_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            237, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$domain/query", //$NON-NLS-1$
                "query", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_247_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            247, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/pattern", //$NON-NLS-1$
                "pattern", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_262_1 = new TagInfo("c:if", //$NON-NLS-1$
            262, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "isVariableDefined('org.eclipse.jet.resource.project.name')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_263_3 = new TagInfo("ws:file", //$NON-NLS-1$
            263, 3,
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
        // Entry point for transformation com.gerken.frontend.se.xform 
        // 
        //  IMPORTANT: MACHINE GENERATED! DO NOT MODIFY, EXCEPT IN DESIGNATED LOCATIONS
        //  
        //  This template is generated by the JET Authoring editor. Do not modify it, except in areas
        //  where comments indicate. Modifications in other areas will be lost when the JET Authoring edit
        //  'Update Project' action is invoked.
        out.write(NL);         
        //
        //  This template has two phases:
        //  1) it traverses the input model, and computes 'derived attributes' creating an 'annotated input model'.
        //  2) it traverses the annotated input model, and performs transformation actions such as creating projects, folders and files
        //  
        //  The template includes user regions where customizations may be added:
        //  1) custom derived attribute calculations may be added in three locations for each block of attributes:
        //    a) before the block of generated calculations
        //    b) after the block of generated calculations
        //    c) after all child calculations have been performed
        //  2) custom processing may be added
        //    a) before the input annotation phase
        //    b) after the input annotation phase
        //    c) after the action phase. 
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        // Define variables the root element in the model 
        RuntimeTagElement _jettag_c_setVariable_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_30_1.setRuntimeParent(null);
        _jettag_c_setVariable_30_1.setTagInfo(_td_c_setVariable_30_1);
        _jettag_c_setVariable_30_1.doStart(context, out);
        _jettag_c_setVariable_30_1.doEnd();
        out.write(NL);         
        out.write("// Begin: custom actions prior to input annotation");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("// End: custom actions prior to input annotation");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        //---------------------------------------------------------------------------------------
        // Phase I - Input annotation: Navigate over model and compute derived attribute values. 
        //---------------------------------------------------------------------------------------
        // NOTE: The order of calculations can be changed in the JET Authoring Editor:
        //       1) Click the 'Sort on calculation order' tool icon.
        //       2) Drag derived attributes within the schema and actions tree.
        out.write(NL);         
        // derived attributes for $root 
        // begin custom variables for $root (1) 
        // end custom variables for $root (1) 
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_47_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_47_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_47_1.setRuntimeParent(null);
        _jettag_c_iterate_47_1.setTagInfo(_td_c_iterate_47_1);
        _jettag_c_iterate_47_1.doStart(context, out);
        while (_jettag_c_iterate_47_1.okToProcessBody()) {
            // derived attributes for $editor 
            // begin custom variables for $editor (1) 
            // end custom variables for $editor (1) 
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_52_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_52_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_52_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_52_3.setTagInfo(_td_c_set_52_3);
            _jettag_c_set_52_3.doStart(context, out);
            JET2Writer _jettag_c_set_52_3_saved_out = out;
            while (_jettag_c_set_52_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_52_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_70.setRuntimeParent(_jettag_c_set_52_3);
                _jettag_c_get_52_70.setTagInfo(_td_c_get_52_70);
                _jettag_c_get_52_70.doStart(context, out);
                _jettag_c_get_52_70.doEnd();
                _jettag_c_set_52_3.handleBodyContent(out);
            }
            out = _jettag_c_set_52_3_saved_out;
            _jettag_c_set_52_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_53_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_53_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_53_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_53_3.setTagInfo(_td_c_set_53_3);
            _jettag_c_set_53_3.doStart(context, out);
            JET2Writer _jettag_c_set_53_3_saved_out = out;
            while (_jettag_c_set_53_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_53_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_66.setRuntimeParent(_jettag_c_set_53_3);
                _jettag_c_get_53_66.setTagInfo(_td_c_get_53_66);
                _jettag_c_get_53_66.doStart(context, out);
                _jettag_c_get_53_66.doEnd();
                out.write(".editor");  //$NON-NLS-1$        
                _jettag_c_set_53_3.handleBodyContent(out);
            }
            out = _jettag_c_set_53_3_saved_out;
            _jettag_c_set_53_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_54_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_54_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_54_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_54_3.setTagInfo(_td_c_set_54_3);
            _jettag_c_set_54_3.doStart(context, out);
            JET2Writer _jettag_c_set_54_3_saved_out = out;
            while (_jettag_c_set_54_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_54_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_62); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_62.setRuntimeParent(_jettag_c_set_54_3);
                _jettag_c_get_54_62.setTagInfo(_td_c_get_54_62);
                _jettag_c_get_54_62.doStart(context, out);
                _jettag_c_get_54_62.doEnd();
                _jettag_c_set_54_3.handleBodyContent(out);
            }
            out = _jettag_c_set_54_3_saved_out;
            _jettag_c_set_54_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_55_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_55_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_55_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_55_3.setTagInfo(_td_c_set_55_3);
            _jettag_c_set_55_3.doStart(context, out);
            JET2Writer _jettag_c_set_55_3_saved_out = out;
            while (_jettag_c_set_55_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_55_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_64.setRuntimeParent(_jettag_c_set_55_3);
                _jettag_c_get_55_64.setTagInfo(_td_c_get_55_64);
                _jettag_c_get_55_64.doStart(context, out);
                _jettag_c_get_55_64.doEnd();
                _jettag_c_set_55_3.handleBodyContent(out);
            }
            out = _jettag_c_set_55_3_saved_out;
            _jettag_c_set_55_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_56_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_56_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_56_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_56_3.setTagInfo(_td_c_set_56_3);
            _jettag_c_set_56_3.doStart(context, out);
            JET2Writer _jettag_c_set_56_3_saved_out = out;
            while (_jettag_c_set_56_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_56_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_60); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_60.setRuntimeParent(_jettag_c_set_56_3);
                _jettag_c_get_56_60.setTagInfo(_td_c_get_56_60);
                _jettag_c_get_56_60.doStart(context, out);
                _jettag_c_get_56_60.doEnd();
                _jettag_c_set_56_3.handleBodyContent(out);
            }
            out = _jettag_c_set_56_3_saved_out;
            _jettag_c_set_56_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_57_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_57_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_57_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_57_3.setTagInfo(_td_c_set_57_3);
            _jettag_c_set_57_3.doStart(context, out);
            JET2Writer _jettag_c_set_57_3_saved_out = out;
            while (_jettag_c_set_57_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_57_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_57_66.setRuntimeParent(_jettag_c_set_57_3);
                _jettag_c_get_57_66.setTagInfo(_td_c_get_57_66);
                _jettag_c_get_57_66.doStart(context, out);
                _jettag_c_get_57_66.doEnd();
                out.write(".domain");  //$NON-NLS-1$        
                _jettag_c_set_57_3.handleBodyContent(out);
            }
            out = _jettag_c_set_57_3_saved_out;
            _jettag_c_set_57_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_58_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_58_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_58_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_58_3.setTagInfo(_td_c_set_58_3);
            _jettag_c_set_58_3.doStart(context, out);
            JET2Writer _jettag_c_set_58_3_saved_out = out;
            while (_jettag_c_set_58_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_58_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_62); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_62.setRuntimeParent(_jettag_c_set_58_3);
                _jettag_c_get_58_62.setTagInfo(_td_c_get_58_62);
                _jettag_c_get_58_62.doStart(context, out);
                _jettag_c_get_58_62.doEnd();
                _jettag_c_set_58_3.handleBodyContent(out);
            }
            out = _jettag_c_set_58_3_saved_out;
            _jettag_c_set_58_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_59_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_59_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_59_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_59_3.setTagInfo(_td_c_set_59_3);
            _jettag_c_set_59_3.doStart(context, out);
            JET2Writer _jettag_c_set_59_3_saved_out = out;
            while (_jettag_c_set_59_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_59_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_59_70.setRuntimeParent(_jettag_c_set_59_3);
                _jettag_c_get_59_70.setTagInfo(_td_c_get_59_70);
                _jettag_c_get_59_70.doStart(context, out);
                _jettag_c_get_59_70.doEnd();
                out.write(".constraint");  //$NON-NLS-1$        
                _jettag_c_set_59_3.handleBodyContent(out);
            }
            out = _jettag_c_set_59_3_saved_out;
            _jettag_c_set_59_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_60_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_60_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_60_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_60_3.setTagInfo(_td_c_set_60_3);
            _jettag_c_set_60_3.doStart(context, out);
            JET2Writer _jettag_c_set_60_3_saved_out = out;
            while (_jettag_c_set_60_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_60_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_60_66.setRuntimeParent(_jettag_c_set_60_3);
                _jettag_c_get_60_66.setTagInfo(_td_c_get_60_66);
                _jettag_c_get_60_66.doStart(context, out);
                _jettag_c_get_60_66.doEnd();
                _jettag_c_set_60_3.handleBodyContent(out);
            }
            out = _jettag_c_set_60_3_saved_out;
            _jettag_c_set_60_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_61_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_61_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_61_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_61_3.setTagInfo(_td_c_set_61_3);
            _jettag_c_set_61_3.doStart(context, out);
            JET2Writer _jettag_c_set_61_3_saved_out = out;
            while (_jettag_c_set_61_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_61_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_65.setRuntimeParent(_jettag_c_set_61_3);
                _jettag_c_get_61_65.setTagInfo(_td_c_get_61_65);
                _jettag_c_get_61_65.doStart(context, out);
                _jettag_c_get_61_65.doEnd();
                out.write(".index");  //$NON-NLS-1$        
                _jettag_c_set_61_3.handleBodyContent(out);
            }
            out = _jettag_c_set_61_3_saved_out;
            _jettag_c_set_61_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_62_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_62_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_62_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_62_3.setTagInfo(_td_c_set_62_3);
            _jettag_c_set_62_3.doStart(context, out);
            JET2Writer _jettag_c_set_62_3_saved_out = out;
            while (_jettag_c_set_62_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_62_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_61); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_61.setRuntimeParent(_jettag_c_set_62_3);
                _jettag_c_get_62_61.setTagInfo(_td_c_get_62_61);
                _jettag_c_get_62_61.doStart(context, out);
                _jettag_c_get_62_61.doEnd();
                _jettag_c_set_62_3.handleBodyContent(out);
            }
            out = _jettag_c_set_62_3_saved_out;
            _jettag_c_set_62_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_63_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_63_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_63_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_63_3.setTagInfo(_td_c_set_63_3);
            _jettag_c_set_63_3.doStart(context, out);
            JET2Writer _jettag_c_set_63_3_saved_out = out;
            while (_jettag_c_set_63_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_63_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_68.setRuntimeParent(_jettag_c_set_63_3);
                _jettag_c_get_63_68.setTagInfo(_td_c_get_63_68);
                _jettag_c_get_63_68.doStart(context, out);
                _jettag_c_get_63_68.doEnd();
                out.write(".shingles");  //$NON-NLS-1$        
                _jettag_c_set_63_3.handleBodyContent(out);
            }
            out = _jettag_c_set_63_3_saved_out;
            _jettag_c_set_63_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_64_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_64_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_64_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_64_3.setTagInfo(_td_c_set_64_3);
            _jettag_c_set_64_3.doStart(context, out);
            JET2Writer _jettag_c_set_64_3_saved_out = out;
            while (_jettag_c_set_64_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                RuntimeTagElement _jettag_c_get_64_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_64_64.setRuntimeParent(_jettag_c_set_64_3);
                _jettag_c_get_64_64.setTagInfo(_td_c_get_64_64);
                _jettag_c_get_64_64.doStart(context, out);
                _jettag_c_get_64_64.doEnd();
                _jettag_c_set_64_3.handleBodyContent(out);
            }
            out = _jettag_c_set_64_3_saved_out;
            _jettag_c_set_64_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_65_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_65_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_65_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_set_65_3.setTagInfo(_td_c_set_65_3);
            _jettag_c_set_65_3.doStart(context, out);
            JET2Writer _jettag_c_set_65_3_saved_out = out;
            while (_jettag_c_set_65_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                //@generated
                out.write("4");  //$NON-NLS-1$        
                _jettag_c_set_65_3.handleBodyContent(out);
            }
            out = _jettag_c_set_65_3_saved_out;
            _jettag_c_set_65_3.doEnd();
            out.write(NL);         
            // begin custom variables for $editor (2) 
            // end custom variables for $editor (2) 
            RuntimeTagElement _jettag_c_iterate_68_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_68_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_68_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_iterate_68_3.setTagInfo(_td_c_iterate_68_3);
            _jettag_c_iterate_68_3.doStart(context, out);
            while (_jettag_c_iterate_68_3.okToProcessBody()) {
                // derived attributes for $type 
                // begin custom variables for $type (1) 
                // end custom variables for $type (1) 
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_73_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_73_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_73_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_set_73_5.setTagInfo(_td_c_set_73_5);
                _jettag_c_set_73_5.doStart(context, out);
                JET2Writer _jettag_c_set_73_5_saved_out = out;
                while (_jettag_c_set_73_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    RuntimeTagElement _jettag_c_get_73_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_73_67.setRuntimeParent(_jettag_c_set_73_5);
                    _jettag_c_get_73_67.setTagInfo(_td_c_get_73_67);
                    _jettag_c_get_73_67.doStart(context, out);
                    _jettag_c_get_73_67.doEnd();
                    out.write("ConstraintValidator");  //$NON-NLS-1$        
                    _jettag_c_set_73_5.handleBodyContent(out);
                }
                out = _jettag_c_set_73_5_saved_out;
                _jettag_c_set_73_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_74_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_74_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_74_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_set_74_5.setTagInfo(_td_c_set_74_5);
                _jettag_c_set_74_5.doStart(context, out);
                JET2Writer _jettag_c_set_74_5_saved_out = out;
                while (_jettag_c_set_74_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    RuntimeTagElement _jettag_c_get_74_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_74_63.setRuntimeParent(_jettag_c_set_74_5);
                    _jettag_c_get_74_63.setTagInfo(_td_c_get_74_63);
                    _jettag_c_get_74_63.doStart(context, out);
                    _jettag_c_get_74_63.doEnd();
                    out.write("Index");  //$NON-NLS-1$        
                    _jettag_c_set_74_5.handleBodyContent(out);
                }
                out = _jettag_c_set_74_5_saved_out;
                _jettag_c_set_74_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_75_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_75_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_75_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_set_75_5.setTagInfo(_td_c_set_75_5);
                _jettag_c_set_75_5.doStart(context, out);
                JET2Writer _jettag_c_set_75_5_saved_out = out;
                while (_jettag_c_set_75_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    RuntimeTagElement _jettag_c_get_75_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_65); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_75_65.setRuntimeParent(_jettag_c_set_75_5);
                    _jettag_c_get_75_65.setTagInfo(_td_c_get_75_65);
                    _jettag_c_get_75_65.doStart(context, out);
                    _jettag_c_get_75_65.doEnd();
                    out.write("Shingle");  //$NON-NLS-1$        
                    _jettag_c_set_75_5.handleBodyContent(out);
                }
                out = _jettag_c_set_75_5_saved_out;
                _jettag_c_set_75_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_76_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_76_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_76_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_set_76_5.setTagInfo(_td_c_set_76_5);
                _jettag_c_set_76_5.doStart(context, out);
                JET2Writer _jettag_c_set_76_5_saved_out = out;
                while (_jettag_c_set_76_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    out.write("get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_76_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_75); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_76_75.setRuntimeParent(_jettag_c_set_76_5);
                    _jettag_c_get_76_75.setTagInfo(_td_c_get_76_75);
                    _jettag_c_get_76_75.doStart(context, out);
                    _jettag_c_get_76_75.doEnd();
                    out.write("Shingle");  //$NON-NLS-1$        
                    _jettag_c_set_76_5.handleBodyContent(out);
                }
                out = _jettag_c_set_76_5_saved_out;
                _jettag_c_set_76_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_77_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_77_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_77_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_set_77_5.setTagInfo(_td_c_set_77_5);
                _jettag_c_set_77_5.doStart(context, out);
                JET2Writer _jettag_c_set_77_5_saved_out = out;
                while (_jettag_c_set_77_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    out.write("index_");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_77_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_77_67.setRuntimeParent(_jettag_c_set_77_5);
                    _jettag_c_get_77_67.setTagInfo(_td_c_get_77_67);
                    _jettag_c_get_77_67.doStart(context, out);
                    _jettag_c_get_77_67.doEnd();
                    _jettag_c_set_77_5.handleBodyContent(out);
                }
                out = _jettag_c_set_77_5_saved_out;
                _jettag_c_set_77_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_78_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_78_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_78_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_set_78_5.setTagInfo(_td_c_set_78_5);
                _jettag_c_set_78_5.doStart(context, out);
                JET2Writer _jettag_c_set_78_5_saved_out = out;
                while (_jettag_c_set_78_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    out.write("get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_78_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_78_73.setRuntimeParent(_jettag_c_set_78_5);
                    _jettag_c_get_78_73.setTagInfo(_td_c_get_78_73);
                    _jettag_c_get_78_73.doStart(context, out);
                    _jettag_c_get_78_73.doEnd();
                    out.write("Index");  //$NON-NLS-1$        
                    _jettag_c_set_78_5.handleBodyContent(out);
                }
                out = _jettag_c_set_78_5_saved_out;
                _jettag_c_set_78_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_79_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_79_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_79_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_set_79_5.setTagInfo(_td_c_set_79_5);
                _jettag_c_set_79_5.doStart(context, out);
                JET2Writer _jettag_c_set_79_5_saved_out = out;
                while (_jettag_c_set_79_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    out.write("shingle");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_79_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_79_70.setRuntimeParent(_jettag_c_set_79_5);
                    _jettag_c_get_79_70.setTagInfo(_td_c_get_79_70);
                    _jettag_c_get_79_70.doStart(context, out);
                    _jettag_c_get_79_70.doEnd();
                    _jettag_c_set_79_5.handleBodyContent(out);
                }
                out = _jettag_c_set_79_5_saved_out;
                _jettag_c_set_79_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_80_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_80_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_80_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_set_80_5.setTagInfo(_td_c_set_80_5);
                _jettag_c_set_80_5.doStart(context, out);
                JET2Writer _jettag_c_set_80_5_saved_out = out;
                while (_jettag_c_set_80_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    out.write("0");  //$NON-NLS-1$        
                    _jettag_c_set_80_5.handleBodyContent(out);
                }
                out = _jettag_c_set_80_5_saved_out;
                _jettag_c_set_80_5.doEnd();
                out.write(NL);         
                // begin custom variables for $type (2) 
                // end custom variables for $type (2) 
                RuntimeTagElement _jettag_c_iterate_83_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_83_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_83_5.setRuntimeParent(_jettag_c_iterate_68_3);
                _jettag_c_iterate_83_5.setTagInfo(_td_c_iterate_83_5);
                _jettag_c_iterate_83_5.doStart(context, out);
                while (_jettag_c_iterate_83_5.okToProcessBody()) {
                    // derived attributes for $field 
                    // begin custom variables for $field (1) 
                    // end custom variables for $field (1) 
                    out.write(NL);         
                    out.write("      ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_88_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_88_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_88_7.setRuntimeParent(_jettag_c_iterate_83_5);
                    _jettag_c_set_88_7.setTagInfo(_td_c_set_88_7);
                    _jettag_c_set_88_7.doStart(context, out);
                    JET2Writer _jettag_c_set_88_7_saved_out = out;
                    while (_jettag_c_set_88_7.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        //@generated
                        out.write("text_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_88_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_70); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_88_70.setRuntimeParent(_jettag_c_set_88_7);
                        _jettag_c_get_88_70.setTagInfo(_td_c_get_88_70);
                        _jettag_c_get_88_70.doStart(context, out);
                        _jettag_c_get_88_70.doEnd();
                        _jettag_c_set_88_7.handleBodyContent(out);
                    }
                    out = _jettag_c_set_88_7_saved_out;
                    _jettag_c_set_88_7.doEnd();
                    out.write(NL);         
                    out.write("      ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_89_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_89_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_89_7.setRuntimeParent(_jettag_c_iterate_83_5);
                    _jettag_c_set_89_7.setTagInfo(_td_c_set_89_7);
                    _jettag_c_set_89_7.doStart(context, out);
                    JET2Writer _jettag_c_set_89_7_saved_out = out;
                    while (_jettag_c_set_89_7.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        //@generated
                        RuntimeTagElement _jettag_c_get_89_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_69); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_89_69.setRuntimeParent(_jettag_c_set_89_7);
                        _jettag_c_get_89_69.setTagInfo(_td_c_get_89_69);
                        _jettag_c_get_89_69.doStart(context, out);
                        _jettag_c_get_89_69.doEnd();
                        RuntimeTagElement _jettag_c_get_89_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_115); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_89_115.setRuntimeParent(_jettag_c_set_89_7);
                        _jettag_c_get_89_115.setTagInfo(_td_c_get_89_115);
                        _jettag_c_get_89_115.doStart(context, out);
                        _jettag_c_get_89_115.doEnd();
                        out.write("Listener");  //$NON-NLS-1$        
                        _jettag_c_set_89_7.handleBodyContent(out);
                    }
                    out = _jettag_c_set_89_7_saved_out;
                    _jettag_c_set_89_7.doEnd();
                    out.write(NL);         
                    out.write("      ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_set_90_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_90_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_set_90_7.setRuntimeParent(_jettag_c_iterate_83_5);
                    _jettag_c_set_90_7.setTagInfo(_td_c_set_90_7);
                    _jettag_c_set_90_7.doStart(context, out);
                    JET2Writer _jettag_c_set_90_7_saved_out = out;
                    while (_jettag_c_set_90_7.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        //@generated
                        out.write("domain_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_90_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_72); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_90_72.setRuntimeParent(_jettag_c_set_90_7);
                        _jettag_c_get_90_72.setTagInfo(_td_c_get_90_72);
                        _jettag_c_get_90_72.doStart(context, out);
                        _jettag_c_get_90_72.doEnd();
                        _jettag_c_set_90_7.handleBodyContent(out);
                    }
                    out = _jettag_c_set_90_7_saved_out;
                    _jettag_c_set_90_7.doEnd();
                    out.write(NL);         
                    // begin custom variables for $field (2) 
                    // end custom variables for $field (2) 
                    RuntimeTagElement _jettag_c_iterate_93_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_93_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_93_7.setRuntimeParent(_jettag_c_iterate_83_5);
                    _jettag_c_iterate_93_7.setTagInfo(_td_c_iterate_93_7);
                    _jettag_c_iterate_93_7.doStart(context, out);
                    while (_jettag_c_iterate_93_7.okToProcessBody()) {
                        // derived attributes for $constraint 
                        // begin custom variables for $constraint (1) 
                        // end custom variables for $constraint (1) 
                        out.write(NL);         
                        _jettag_c_iterate_93_7.handleBodyContent(out);
                    }
                    _jettag_c_iterate_93_7.doEnd();
                    // begin custom variables for $field (3) 
                    // end custom variables for $field (3) 
                    _jettag_c_iterate_83_5.handleBodyContent(out);
                }
                _jettag_c_iterate_83_5.doEnd();
                // begin custom variables for $type (3) 
                // end custom variables for $type (3) 
                _jettag_c_iterate_68_3.handleBodyContent(out);
            }
            _jettag_c_iterate_68_3.doEnd();
            RuntimeTagElement _jettag_c_iterate_105_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_105_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_105_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_iterate_105_3.setTagInfo(_td_c_iterate_105_3);
            _jettag_c_iterate_105_3.doStart(context, out);
            while (_jettag_c_iterate_105_3.okToProcessBody()) {
                // derived attributes for $domain 
                // begin custom variables for $domain (1) 
                // end custom variables for $domain (1) 
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_110_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_110_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_110_5.setRuntimeParent(_jettag_c_iterate_105_3);
                _jettag_c_set_110_5.setTagInfo(_td_c_set_110_5);
                _jettag_c_set_110_5.doStart(context, out);
                JET2Writer _jettag_c_set_110_5_saved_out = out;
                while (_jettag_c_set_110_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    //@generated
                    RuntimeTagElement _jettag_c_get_110_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_110_66.setRuntimeParent(_jettag_c_set_110_5);
                    _jettag_c_get_110_66.setTagInfo(_td_c_get_110_66);
                    _jettag_c_get_110_66.doStart(context, out);
                    _jettag_c_get_110_66.doEnd();
                    out.write("Domain");  //$NON-NLS-1$        
                    _jettag_c_set_110_5.handleBodyContent(out);
                }
                out = _jettag_c_set_110_5_saved_out;
                _jettag_c_set_110_5.doEnd();
                out.write(NL);         
                // begin custom variables for $domain (2) 
                // end custom variables for $domain (2) 
                RuntimeTagElement _jettag_c_iterate_113_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_113_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_113_5.setRuntimeParent(_jettag_c_iterate_105_3);
                _jettag_c_iterate_113_5.setTagInfo(_td_c_iterate_113_5);
                _jettag_c_iterate_113_5.doStart(context, out);
                while (_jettag_c_iterate_113_5.okToProcessBody()) {
                    // derived attributes for $value 
                    // begin custom variables for $value (1) 
                    // end custom variables for $value (1) 
                    out.write(NL);         
                    _jettag_c_iterate_113_5.handleBodyContent(out);
                }
                _jettag_c_iterate_113_5.doEnd();
                RuntimeTagElement _jettag_c_iterate_119_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_119_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_119_5.setRuntimeParent(_jettag_c_iterate_105_3);
                _jettag_c_iterate_119_5.setTagInfo(_td_c_iterate_119_5);
                _jettag_c_iterate_119_5.doStart(context, out);
                while (_jettag_c_iterate_119_5.okToProcessBody()) {
                    // derived attributes for $query 
                    // begin custom variables for $query (1) 
                    // end custom variables for $query (1) 
                    out.write(NL);         
                    _jettag_c_iterate_119_5.handleBodyContent(out);
                }
                _jettag_c_iterate_119_5.doEnd();
                // begin custom variables for $domain (3) 
                // end custom variables for $domain (3) 
                _jettag_c_iterate_105_3.handleBodyContent(out);
            }
            _jettag_c_iterate_105_3.doEnd();
            RuntimeTagElement _jettag_c_iterate_128_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_128_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_128_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_iterate_128_3.setTagInfo(_td_c_iterate_128_3);
            _jettag_c_iterate_128_3.doStart(context, out);
            while (_jettag_c_iterate_128_3.okToProcessBody()) {
                // derived attributes for $pattern 
                // begin custom variables for $pattern (1) 
                // end custom variables for $pattern (1) 
                out.write(NL);         
                _jettag_c_iterate_128_3.handleBodyContent(out);
            }
            _jettag_c_iterate_128_3.doEnd();
            // begin custom variables for $editor (3) 
            RuntimeTagElement _jettag_c_setVariable_135_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_135_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_135_5.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_setVariable_135_5.setTagInfo(_td_c_setVariable_135_5);
            _jettag_c_setVariable_135_5.doStart(context, out);
            _jettag_c_setVariable_135_5.doEnd();
            RuntimeTagElement _jettag_c_include_136_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_136_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_136_3.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_include_136_3.setTagInfo(_td_c_include_136_3);
            _jettag_c_include_136_3.doStart(context, out);
            _jettag_c_include_136_3.doEnd();
            // end custom variables for $editor (3) 
            _jettag_c_iterate_47_1.handleBodyContent(out);
        }
        _jettag_c_iterate_47_1.doEnd();
        // begin custom variables for $root (3) 
        // end custom variables for $root (3) 
        out.write(NL);         
        out.write("// Begin: custom actions after input annotation");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("// End: custom actions after input annotation");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        //------------------------------------------------------------------------%>
        //<%-- Phase II - Action execution: Navigate over model and perform actions 
        //------------------------------------------------------------------------%>
        //<%-- NOTE: The order of actions can be changed in the JET Authoring Editor:
        //       1) Click the 'Sort on calculation order' tool icon.
        //       2) Drag actions within the schema and actions tree.
        out.write(NL);         
        // actions for $root 
        // Begin: custom actions for $root (1) 
        // End: custom actions for $root (1) 
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_158_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_158_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_158_1.setRuntimeParent(null);
        _jettag_c_iterate_158_1.setTagInfo(_td_c_iterate_158_1);
        _jettag_c_iterate_158_1.doStart(context, out);
        while (_jettag_c_iterate_158_1.okToProcessBody()) {
            // actions for $editor 
            // Begin: custom actions for $editor (1) 
            // End: custom actions for $editor (1) 
            out.write(NL);         
            RuntimeTagElement _jettag_ws_project_163_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_163_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_project_163_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_project_163_3.setTagInfo(_td_ws_project_163_3);
            _jettag_ws_project_163_3.doStart(context, out);
            _jettag_ws_project_163_3.doEnd();
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_164_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_164_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_164_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_164_3.setTagInfo(_td_ws_file_164_3);
            _jettag_ws_file_164_3.doStart(context, out);
            _jettag_ws_file_164_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_165_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_165_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_165_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_165_3.setTagInfo(_td_ws_file_165_3);
            _jettag_ws_file_165_3.doStart(context, out);
            _jettag_ws_file_165_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_166_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_166_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_166_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_166_3.setTagInfo(_td_ws_file_166_3);
            _jettag_ws_file_166_3.doStart(context, out);
            _jettag_ws_file_166_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_167_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_167_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_167_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_167_3.setTagInfo(_td_ws_file_167_3);
            _jettag_ws_file_167_3.doStart(context, out);
            _jettag_ws_file_167_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_168_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_168_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_168_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_copyFile_168_3.setTagInfo(_td_ws_copyFile_168_3);
            _jettag_ws_copyFile_168_3.doStart(context, out);
            _jettag_ws_copyFile_168_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_169_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_169_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_169_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_copyFile_169_3.setTagInfo(_td_ws_copyFile_169_3);
            _jettag_ws_copyFile_169_3.doStart(context, out);
            _jettag_ws_copyFile_169_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_170_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_170_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_170_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_copyFile_170_3.setTagInfo(_td_ws_copyFile_170_3);
            _jettag_ws_copyFile_170_3.doStart(context, out);
            _jettag_ws_copyFile_170_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_171_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_171_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_171_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_copyFile_171_3.setTagInfo(_td_ws_copyFile_171_3);
            _jettag_ws_copyFile_171_3.doStart(context, out);
            _jettag_ws_copyFile_171_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_172_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_172_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_172_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_copyFile_172_3.setTagInfo(_td_ws_copyFile_172_3);
            _jettag_ws_copyFile_172_3.doStart(context, out);
            _jettag_ws_copyFile_172_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_173_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_173_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_173_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_copyFile_173_3.setTagInfo(_td_ws_copyFile_173_3);
            _jettag_ws_copyFile_173_3.doStart(context, out);
            _jettag_ws_copyFile_173_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_174_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_174_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_174_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_174_3.setTagInfo(_td_ws_file_174_3);
            _jettag_ws_file_174_3.doStart(context, out);
            _jettag_ws_file_174_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_175_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_175_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_175_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_175_3.setTagInfo(_td_ws_file_175_3);
            _jettag_ws_file_175_3.doStart(context, out);
            _jettag_ws_file_175_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_176_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_176_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_176_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_176_3.setTagInfo(_td_ws_file_176_3);
            _jettag_ws_file_176_3.doStart(context, out);
            _jettag_ws_file_176_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_177_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_177_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_177_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_177_3.setTagInfo(_td_ws_file_177_3);
            _jettag_ws_file_177_3.doStart(context, out);
            _jettag_ws_file_177_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_178_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_178_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_178_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_178_3.setTagInfo(_td_ws_file_178_3);
            _jettag_ws_file_178_3.doStart(context, out);
            _jettag_ws_file_178_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_179_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_179_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_179_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_179_3.setTagInfo(_td_ws_file_179_3);
            _jettag_ws_file_179_3.doStart(context, out);
            _jettag_ws_file_179_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_180_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_180_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_180_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_180_3.setTagInfo(_td_ws_file_180_3);
            _jettag_ws_file_180_3.doStart(context, out);
            _jettag_ws_file_180_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_181_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_181_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_181_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_181_3.setTagInfo(_td_ws_file_181_3);
            _jettag_ws_file_181_3.doStart(context, out);
            _jettag_ws_file_181_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_182_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_182_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_182_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_182_3.setTagInfo(_td_ws_file_182_3);
            _jettag_ws_file_182_3.doStart(context, out);
            _jettag_ws_file_182_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_183_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_183_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_183_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_183_3.setTagInfo(_td_ws_file_183_3);
            _jettag_ws_file_183_3.doStart(context, out);
            _jettag_ws_file_183_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_184_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_184_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_184_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_184_3.setTagInfo(_td_ws_file_184_3);
            _jettag_ws_file_184_3.doStart(context, out);
            _jettag_ws_file_184_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_185_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_185_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_185_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_185_3.setTagInfo(_td_ws_file_185_3);
            _jettag_ws_file_185_3.doStart(context, out);
            _jettag_ws_file_185_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_186_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_186_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_186_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_186_3.setTagInfo(_td_ws_file_186_3);
            _jettag_ws_file_186_3.doStart(context, out);
            _jettag_ws_file_186_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_187_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_187_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_187_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_187_3.setTagInfo(_td_ws_file_187_3);
            _jettag_ws_file_187_3.doStart(context, out);
            _jettag_ws_file_187_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_188_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_188_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_188_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_ws_file_188_3.setTagInfo(_td_ws_file_188_3);
            _jettag_ws_file_188_3.doStart(context, out);
            _jettag_ws_file_188_3.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Begin: custom actions for $editor (2) 
            // End: custom actions for $editor (2) 
            RuntimeTagElement _jettag_c_iterate_192_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_192_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_192_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_c_iterate_192_3.setTagInfo(_td_c_iterate_192_3);
            _jettag_c_iterate_192_3.doStart(context, out);
            while (_jettag_c_iterate_192_3.okToProcessBody()) {
                // actions for $type 
                // Begin: custom actions for $type (1) 
                // End: custom actions for $type (1) 
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_197_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_197_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_197_5.setRuntimeParent(_jettag_c_iterate_192_3);
                _jettag_ws_file_197_5.setTagInfo(_td_ws_file_197_5);
                _jettag_ws_file_197_5.doStart(context, out);
                _jettag_ws_file_197_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_198_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_198_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_198_5.setRuntimeParent(_jettag_c_iterate_192_3);
                _jettag_ws_file_198_5.setTagInfo(_td_ws_file_198_5);
                _jettag_ws_file_198_5.doStart(context, out);
                _jettag_ws_file_198_5.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_199_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_199_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_199_5.setRuntimeParent(_jettag_c_iterate_192_3);
                _jettag_ws_file_199_5.setTagInfo(_td_ws_file_199_5);
                _jettag_ws_file_199_5.doStart(context, out);
                _jettag_ws_file_199_5.doEnd();
                out.write(NL);         
                out.write(NL);         
                // Begin: custom actions for $type (2) 
                // End: custom actions for $type (2) 
                RuntimeTagElement _jettag_c_iterate_203_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_203_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_203_5.setRuntimeParent(_jettag_c_iterate_192_3);
                _jettag_c_iterate_203_5.setTagInfo(_td_c_iterate_203_5);
                _jettag_c_iterate_203_5.doStart(context, out);
                while (_jettag_c_iterate_203_5.okToProcessBody()) {
                    // actions for $field 
                    // Begin: custom actions for $field (1) 
                    // End: custom actions for $field (1) 
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_iterate_208_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_208_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_208_7.setRuntimeParent(_jettag_c_iterate_203_5);
                    _jettag_c_iterate_208_7.setTagInfo(_td_c_iterate_208_7);
                    _jettag_c_iterate_208_7.doStart(context, out);
                    while (_jettag_c_iterate_208_7.okToProcessBody()) {
                        // actions for $constraint 
                        // Begin: custom actions for $constraint (1) 
                        // End: custom actions for $constraint (1) 
                        out.write(NL);         
                        _jettag_c_iterate_208_7.handleBodyContent(out);
                    }
                    _jettag_c_iterate_208_7.doEnd();
                    out.write(NL);         
                    // Begin: custom actions for $field (3) 
                    // End: custom actions for $field (3) 
                    _jettag_c_iterate_203_5.handleBodyContent(out);
                }
                _jettag_c_iterate_203_5.doEnd();
                out.write(NL);         
                // Begin: custom actions for $type (3) 
                // End: custom actions for $type (3) 
                _jettag_c_iterate_192_3.handleBodyContent(out);
            }
            _jettag_c_iterate_192_3.doEnd();
            RuntimeTagElement _jettag_c_iterate_222_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_222_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_222_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_c_iterate_222_3.setTagInfo(_td_c_iterate_222_3);
            _jettag_c_iterate_222_3.doStart(context, out);
            while (_jettag_c_iterate_222_3.okToProcessBody()) {
                // actions for $domain 
                // Begin: custom actions for $domain (1) 
                // End: custom actions for $domain (1) 
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_227_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_227_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_227_5.setRuntimeParent(_jettag_c_iterate_222_3);
                _jettag_ws_file_227_5.setTagInfo(_td_ws_file_227_5);
                _jettag_ws_file_227_5.doStart(context, out);
                _jettag_ws_file_227_5.doEnd();
                out.write(NL);         
                out.write(NL);         
                // Begin: custom actions for $domain (2) 
                // End: custom actions for $domain (2) 
                RuntimeTagElement _jettag_c_iterate_231_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_231_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_231_5.setRuntimeParent(_jettag_c_iterate_222_3);
                _jettag_c_iterate_231_5.setTagInfo(_td_c_iterate_231_5);
                _jettag_c_iterate_231_5.doStart(context, out);
                while (_jettag_c_iterate_231_5.okToProcessBody()) {
                    // actions for $value 
                    // Begin: custom actions for $value (1) 
                    // End: custom actions for $value (1) 
                    out.write(NL);         
                    _jettag_c_iterate_231_5.handleBodyContent(out);
                }
                _jettag_c_iterate_231_5.doEnd();
                RuntimeTagElement _jettag_c_iterate_237_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_237_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_237_5.setRuntimeParent(_jettag_c_iterate_222_3);
                _jettag_c_iterate_237_5.setTagInfo(_td_c_iterate_237_5);
                _jettag_c_iterate_237_5.doStart(context, out);
                while (_jettag_c_iterate_237_5.okToProcessBody()) {
                    // actions for $query 
                    // Begin: custom actions for $query (1) 
                    // End: custom actions for $query (1) 
                    out.write(NL);         
                    _jettag_c_iterate_237_5.handleBodyContent(out);
                }
                _jettag_c_iterate_237_5.doEnd();
                out.write(NL);         
                // Begin: custom actions for $domain (3) 
                // End: custom actions for $domain (3) 
                _jettag_c_iterate_222_3.handleBodyContent(out);
            }
            _jettag_c_iterate_222_3.doEnd();
            RuntimeTagElement _jettag_c_iterate_247_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_247_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_247_3.setRuntimeParent(_jettag_c_iterate_158_1);
            _jettag_c_iterate_247_3.setTagInfo(_td_c_iterate_247_3);
            _jettag_c_iterate_247_3.doStart(context, out);
            while (_jettag_c_iterate_247_3.okToProcessBody()) {
                // actions for $pattern 
                // Begin: custom actions for $pattern (1) 
                // End: custom actions for $pattern (1) 
                out.write(NL);         
                _jettag_c_iterate_247_3.handleBodyContent(out);
            }
            _jettag_c_iterate_247_3.doEnd();
            out.write(NL);         
            // Begin: custom actions for $editor (3) 
            // End: custom actions for $editor (3) 
            _jettag_c_iterate_158_1.handleBodyContent(out);
        }
        _jettag_c_iterate_158_1.doEnd();
        out.write(NL);         
        // Begin: custom actions for $root (3) 
        // End: custom actions for $root (3) 
        out.write(NL);         
        // Begin: final custom actions  
        RuntimeTagElement _jettag_c_if_262_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_262_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_262_1.setRuntimeParent(null);
        _jettag_c_if_262_1.setTagInfo(_td_c_if_262_1);
        _jettag_c_if_262_1.doStart(context, out);
        while (_jettag_c_if_262_1.okToProcessBody()) {
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_263_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_263_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_263_3.setRuntimeParent(_jettag_c_if_262_1);
            _jettag_ws_file_263_3.setTagInfo(_td_ws_file_263_3);
            _jettag_ws_file_263_3.doStart(context, out);
            _jettag_ws_file_263_3.doEnd();
            out.write(NL);         
            _jettag_c_if_262_1.handleBodyContent(out);
        }
        _jettag_c_if_262_1.doEnd();
        // End: final custom actions 
    }
}
