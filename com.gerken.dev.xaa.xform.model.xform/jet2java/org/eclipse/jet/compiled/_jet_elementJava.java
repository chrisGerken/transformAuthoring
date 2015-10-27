package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_elementJava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_elementJava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_userRegion_3_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            3, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_3_33 = new TagInfo("c:initialCode", //$NON-NLS-1$
            3, 33,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_10_14 = new TagInfo("c:get", //$NON-NLS-1$
            10, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/@elementJava", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_12_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/property", //$NON-NLS-1$
                "property", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_10 = new TagInfo("c:get", //$NON-NLS-1$
            13, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_46 = new TagInfo("c:get", //$NON-NLS-1$
            13, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/nested", //$NON-NLS-1$
                "nested", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_20 = new TagInfo("c:get", //$NON-NLS-1$
            16, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_54 = new TagInfo("c:get", //$NON-NLS-1$
            16, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@listVarName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_110 = new TagInfo("c:get", //$NON-NLS-1$
            16, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_10 = new TagInfo("c:get", //$NON-NLS-1$
            17, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_46 = new TagInfo("c:get", //$NON-NLS-1$
            17, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_20_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            20, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_20_42 = new TagInfo("c:initialCode", //$NON-NLS-1$
            20, 42,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_24_9 = new TagInfo("c:get", //$NON-NLS-1$
            24, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/@elementJava", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_9 = new TagInfo("c:get", //$NON-NLS-1$
            28, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/@elementJava", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/property", //$NON-NLS-1$
                "property", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_30_1 = new TagInfo("c:choose", //$NON-NLS-1$
            30, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_31_1 = new TagInfo("c:when", //$NON-NLS-1$
            31, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                " 'String' ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_8 = new TagInfo("c:get", //$NON-NLS-1$
            32, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_59 = new TagInfo("c:get", //$NON-NLS-1$
            32, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_34_1 = new TagInfo("c:when", //$NON-NLS-1$
            34, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                " 'boolean' ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_3 = new TagInfo("c:get", //$NON-NLS-1$
            35, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_61 = new TagInfo("c:get", //$NON-NLS-1$
            35, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_40_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            40, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_40_48 = new TagInfo("c:initialCode", //$NON-NLS-1$
            40, 48,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_47_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            47, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/nested", //$NON-NLS-1$
                "nested", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_9 = new TagInfo("c:get", //$NON-NLS-1$
            48, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_65 = new TagInfo("c:get", //$NON-NLS-1$
            48, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_102 = new TagInfo("c:get", //$NON-NLS-1$
            48, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_52_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            52, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/property", //$NON-NLS-1$
                "property", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_9 = new TagInfo("c:get", //$NON-NLS-1$
            54, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_44 = new TagInfo("c:get", //$NON-NLS-1$
            54, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@getterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_10 = new TagInfo("c:get", //$NON-NLS-1$
            55, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_14 = new TagInfo("c:get", //$NON-NLS-1$
            58, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@setterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_57 = new TagInfo("c:get", //$NON-NLS-1$
            58, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_92 = new TagInfo("c:get", //$NON-NLS-1$
            58, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_8 = new TagInfo("c:get", //$NON-NLS-1$
            59, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_45 = new TagInfo("c:get", //$NON-NLS-1$
            59, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_62_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            62, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/nested", //$NON-NLS-1$
                "nested", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_9 = new TagInfo("c:get", //$NON-NLS-1$
            64, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_47 = new TagInfo("c:get", //$NON-NLS-1$
            64, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_7 = new TagInfo("c:get", //$NON-NLS-1$
            65, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_4 = new TagInfo("c:get", //$NON-NLS-1$
            66, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_46 = new TagInfo("c:get", //$NON-NLS-1$
            66, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_79 = new TagInfo("c:get", //$NON-NLS-1$
            66, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@listVarName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_4 = new TagInfo("c:get", //$NON-NLS-1$
            67, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@listVarName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_52 = new TagInfo("c:get", //$NON-NLS-1$
            67, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_10 = new TagInfo("c:get", //$NON-NLS-1$
            69, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_17 = new TagInfo("c:get", //$NON-NLS-1$
            72, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_50 = new TagInfo("c:get", //$NON-NLS-1$
            72, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_3 = new TagInfo("c:get", //$NON-NLS-1$
            73, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@listVarName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_3 = new TagInfo("c:get", //$NON-NLS-1$
            74, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_20 = new TagInfo("c:get", //$NON-NLS-1$
            78, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_53 = new TagInfo("c:get", //$NON-NLS-1$
            78, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_3 = new TagInfo("c:get", //$NON-NLS-1$
            79, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@listVarName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_3 = new TagInfo("c:get", //$NON-NLS-1$
            80, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@varName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_17 = new TagInfo("c:get", //$NON-NLS-1$
            85, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($element/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_86_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            86, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/property", //$NON-NLS-1$
                "property", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_17 = new TagInfo("c:get", //$NON-NLS-1$
            87, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_53 = new TagInfo("c:get", //$NON-NLS-1$
            87, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$property/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_90_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            90, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_90_49 = new TagInfo("c:initialCode", //$NON-NLS-1$
            90, 49,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_95_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            95, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/nested", //$NON-NLS-1$
                "nested", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_26 = new TagInfo("c:get", //$NON-NLS-1$
            96, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_7 = new TagInfo("c:get", //$NON-NLS-1$
            97, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_20 = new TagInfo("c:get", //$NON-NLS-1$
            101, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($element/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_105_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            105, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$element/nested", //$NON-NLS-1$
                "nested", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_24 = new TagInfo("c:get", //$NON-NLS-1$
            106, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_10 = new TagInfo("c:get", //$NON-NLS-1$
            107, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_107_44 = new TagInfo("c:get", //$NON-NLS-1$
            107, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$nested/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_112_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            112, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_112_40 = new TagInfo("c:initialCode", //$NON-NLS-1$
            112, 40,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package com.gerken.xaa.model.xform;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_3_1.setRuntimeParent(null);
        _jettag_c_userRegion_3_1.setTagInfo(_td_c_userRegion_3_1);
        _jettag_c_userRegion_3_1.doStart(context, out);
        while (_jettag_c_userRegion_3_1.okToProcessBody()) {
            out.write("\t\t// Begin imports");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_initialCode_3_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_3_33); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_3_33.setRuntimeParent(_jettag_c_userRegion_3_1);
            _jettag_c_initialCode_3_33.setTagInfo(_td_c_initialCode_3_33);
            _jettag_c_initialCode_3_33.doStart(context, out);
            while (_jettag_c_initialCode_3_33.okToProcessBody()) {
                out.write(NL);         
                out.write("import java.util.ArrayList;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("import java.util.Collection;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_initialCode_3_33.handleBodyContent(out);
            }
            _jettag_c_initialCode_3_33.doEnd();
            out.write("\t\t// End imports");  //$NON-NLS-1$        
            _jettag_c_userRegion_3_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_3_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_14.setRuntimeParent(null);
        _jettag_c_get_10_14.setTagInfo(_td_c_get_10_14);
        _jettag_c_get_10_14.doStart(context, out);
        _jettag_c_get_10_14.doEnd();
        out.write(" extends ModelElement {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_12_1.setRuntimeParent(null);
        _jettag_c_iterate_12_1.setTagInfo(_td_c_iterate_12_1);
        _jettag_c_iterate_12_1.doStart(context, out);
        while (_jettag_c_iterate_12_1.okToProcessBody()) {
            out.write("\tprivate ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_10.setRuntimeParent(_jettag_c_iterate_12_1);
            _jettag_c_get_13_10.setTagInfo(_td_c_get_13_10);
            _jettag_c_get_13_10.doStart(context, out);
            _jettag_c_get_13_10.doEnd();
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_46.setRuntimeParent(_jettag_c_iterate_12_1);
            _jettag_c_get_13_46.setTagInfo(_td_c_get_13_46);
            _jettag_c_get_13_46.doStart(context, out);
            _jettag_c_get_13_46.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_12_1.handleBodyContent(out);
        }
        _jettag_c_iterate_12_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_15_1.setRuntimeParent(null);
        _jettag_c_iterate_15_1.setTagInfo(_td_c_iterate_15_1);
        _jettag_c_iterate_15_1.doStart(context, out);
        while (_jettag_c_iterate_15_1.okToProcessBody()) {
            out.write("\tprivate ArrayList<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_16_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_20); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_20.setRuntimeParent(_jettag_c_iterate_15_1);
            _jettag_c_get_16_20.setTagInfo(_td_c_get_16_20);
            _jettag_c_get_16_20.doStart(context, out);
            _jettag_c_get_16_20.doEnd();
            out.write("> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_16_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_54.setRuntimeParent(_jettag_c_iterate_15_1);
            _jettag_c_get_16_54.setTagInfo(_td_c_get_16_54);
            _jettag_c_get_16_54.doStart(context, out);
            _jettag_c_get_16_54.doEnd();
            out.write(" = new ArrayList<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_16_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_110); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_110.setRuntimeParent(_jettag_c_iterate_15_1);
            _jettag_c_get_16_110.setTagInfo(_td_c_get_16_110);
            _jettag_c_get_16_110.doStart(context, out);
            _jettag_c_get_16_110.doEnd();
            out.write(">();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tprivate ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_17_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_10.setRuntimeParent(_jettag_c_iterate_15_1);
            _jettag_c_get_17_10.setTagInfo(_td_c_get_17_10);
            _jettag_c_get_17_10.doStart(context, out);
            _jettag_c_get_17_10.doEnd();
            out.write("[]\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_17_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_46.setRuntimeParent(_jettag_c_iterate_15_1);
            _jettag_c_get_17_46.setTagInfo(_td_c_get_17_46);
            _jettag_c_get_17_46.doStart(context, out);
            _jettag_c_get_17_46.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_15_1.handleBodyContent(out);
        }
        _jettag_c_iterate_15_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_20_1.setRuntimeParent(null);
        _jettag_c_userRegion_20_1.setTagInfo(_td_c_userRegion_20_1);
        _jettag_c_userRegion_20_1.doStart(context, out);
        while (_jettag_c_userRegion_20_1.okToProcessBody()) {
            out.write("\t\t// Begin custom variables");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_initialCode_20_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_20_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_20_42.setRuntimeParent(_jettag_c_userRegion_20_1);
            _jettag_c_initialCode_20_42.setTagInfo(_td_c_initialCode_20_42);
            _jettag_c_initialCode_20_42.doStart(context, out);
            while (_jettag_c_initialCode_20_42.okToProcessBody()) {
                out.write(NL);         
                out.write(NL);         
                _jettag_c_initialCode_20_42.handleBodyContent(out);
            }
            _jettag_c_initialCode_20_42.doEnd();
            out.write("\t\t// End custom variables");  //$NON-NLS-1$        
            _jettag_c_userRegion_20_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_20_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_9.setRuntimeParent(null);
        _jettag_c_get_24_9.setTagInfo(_td_c_get_24_9);
        _jettag_c_get_24_9.doStart(context, out);
        _jettag_c_get_24_9.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_9.setRuntimeParent(null);
        _jettag_c_get_28_9.setTagInfo(_td_c_get_28_9);
        _jettag_c_get_28_9.doStart(context, out);
        _jettag_c_get_28_9.doEnd();
        out.write("(Node node) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_29_1.setRuntimeParent(null);
        _jettag_c_iterate_29_1.setTagInfo(_td_c_iterate_29_1);
        _jettag_c_iterate_29_1.doStart(context, out);
        while (_jettag_c_iterate_29_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_choose_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_30_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_30_1.setRuntimeParent(_jettag_c_iterate_29_1);
            _jettag_c_choose_30_1.setTagInfo(_td_c_choose_30_1);
            _jettag_c_choose_30_1.doStart(context, out);
            JET2Writer _jettag_c_choose_30_1_saved_out = out;
            while (_jettag_c_choose_30_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_31_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_31_1.setRuntimeParent(_jettag_c_choose_30_1);
                _jettag_c_when_31_1.setTagInfo(_td_c_when_31_1);
                _jettag_c_when_31_1.doStart(context, out);
                JET2Writer _jettag_c_when_31_1_saved_out = out;
                while (_jettag_c_when_31_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\tthis.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_8.setRuntimeParent(_jettag_c_when_31_1);
                    _jettag_c_get_32_8.setTagInfo(_td_c_get_32_8);
                    _jettag_c_get_32_8.doStart(context, out);
                    _jettag_c_get_32_8.doEnd();
                    out.write(" = getAttr(node,\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_59); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_59.setRuntimeParent(_jettag_c_when_31_1);
                    _jettag_c_get_32_59.setTagInfo(_td_c_get_32_59);
                    _jettag_c_get_32_59.doStart(context, out);
                    _jettag_c_get_32_59.doEnd();
                    out.write("\");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_31_1.handleBodyContent(out);
                }
                out = _jettag_c_when_31_1_saved_out;
                _jettag_c_when_31_1.doEnd();
                RuntimeTagElement _jettag_c_when_34_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_34_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_34_1.setRuntimeParent(_jettag_c_choose_30_1);
                _jettag_c_when_34_1.setTagInfo(_td_c_when_34_1);
                _jettag_c_when_34_1.doStart(context, out);
                JET2Writer _jettag_c_when_34_1_saved_out = out;
                while (_jettag_c_when_34_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_3.setRuntimeParent(_jettag_c_when_34_1);
                    _jettag_c_get_35_3.setTagInfo(_td_c_get_35_3);
                    _jettag_c_get_35_3.doStart(context, out);
                    _jettag_c_get_35_3.doEnd();
                    out.write(" = getBooleanAttr(node,\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_61.setRuntimeParent(_jettag_c_when_34_1);
                    _jettag_c_get_35_61.setTagInfo(_td_c_get_35_61);
                    _jettag_c_get_35_61.doStart(context, out);
                    _jettag_c_get_35_61.doEnd();
                    out.write("\");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_34_1.handleBodyContent(out);
                }
                out = _jettag_c_when_34_1_saved_out;
                _jettag_c_when_34_1.doEnd();
                _jettag_c_choose_30_1.handleBodyContent(out);
            }
            out = _jettag_c_choose_30_1_saved_out;
            _jettag_c_choose_30_1.doEnd();
            _jettag_c_iterate_29_1.handleBodyContent(out);
        }
        _jettag_c_iterate_29_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_40_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_40_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_40_1.setRuntimeParent(null);
        _jettag_c_userRegion_40_1.setTagInfo(_td_c_userRegion_40_1);
        _jettag_c_userRegion_40_1.doStart(context, out);
        while (_jettag_c_userRegion_40_1.okToProcessBody()) {
            out.write("\t\t// Begin read custom attributes");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_initialCode_40_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_40_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_40_48.setRuntimeParent(_jettag_c_userRegion_40_1);
            _jettag_c_initialCode_40_48.setTagInfo(_td_c_initialCode_40_48);
            _jettag_c_initialCode_40_48.doStart(context, out);
            while (_jettag_c_initialCode_40_48.okToProcessBody()) {
                out.write(NL);         
                out.write(NL);         
                _jettag_c_initialCode_40_48.handleBodyContent(out);
            }
            _jettag_c_initialCode_40_48.doEnd();
            out.write("\t\t// End read custom attributes");  //$NON-NLS-1$        
            _jettag_c_userRegion_40_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_40_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tNode kid[] = getChildren(node);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int k = 0; k < kid.length; k++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tString name = kid[k].getNodeName();");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_47_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_47_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_47_1.setRuntimeParent(null);
        _jettag_c_iterate_47_1.setTagInfo(_td_c_iterate_47_1);
        _jettag_c_iterate_47_1.doStart(context, out);
        while (_jettag_c_iterate_47_1.okToProcessBody()) {
            out.write("\t\t\tif (\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_48_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_9.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_get_48_9.setTagInfo(_td_c_get_48_9);
            _jettag_c_get_48_9.doStart(context, out);
            _jettag_c_get_48_9.doEnd();
            out.write("\".equals(name)) { add");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_48_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_65.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_get_48_65.setTagInfo(_td_c_get_48_65);
            _jettag_c_get_48_65.doStart(context, out);
            _jettag_c_get_48_65.doEnd();
            out.write("(new ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_48_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_102); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_48_102.setRuntimeParent(_jettag_c_iterate_47_1);
            _jettag_c_get_48_102.setTagInfo(_td_c_get_48_102);
            _jettag_c_get_48_102.doStart(context, out);
            _jettag_c_get_48_102.doEnd();
            out.write("(kid[k])); }");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_47_1.handleBodyContent(out);
        }
        _jettag_c_iterate_47_1.doEnd();
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_52_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_52_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_52_1.setRuntimeParent(null);
        _jettag_c_iterate_52_1.setTagInfo(_td_c_iterate_52_1);
        _jettag_c_iterate_52_1.doStart(context, out);
        while (_jettag_c_iterate_52_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_54_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_54_9.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_54_9.setTagInfo(_td_c_get_54_9);
            _jettag_c_get_54_9.doStart(context, out);
            _jettag_c_get_54_9.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_54_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_54_44.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_54_44.setTagInfo(_td_c_get_54_44);
            _jettag_c_get_54_44.doStart(context, out);
            _jettag_c_get_54_44.doEnd();
            out.write("() {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\treturn ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_55_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_55_10.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_55_10.setTagInfo(_td_c_get_55_10);
            _jettag_c_get_55_10.doStart(context, out);
            _jettag_c_get_55_10.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\tpublic void ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_58_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_58_14.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_58_14.setTagInfo(_td_c_get_58_14);
            _jettag_c_get_58_14.doStart(context, out);
            _jettag_c_get_58_14.doEnd();
            out.write("(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_58_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_58_57.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_58_57.setTagInfo(_td_c_get_58_57);
            _jettag_c_get_58_57.doStart(context, out);
            _jettag_c_get_58_57.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_58_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_92); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_58_92.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_58_92.setTagInfo(_td_c_get_58_92);
            _jettag_c_get_58_92.doStart(context, out);
            _jettag_c_get_58_92.doEnd();
            out.write(") {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tthis.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_59_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_59_8.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_59_8.setTagInfo(_td_c_get_59_8);
            _jettag_c_get_59_8.doStart(context, out);
            _jettag_c_get_59_8.doEnd();
            out.write(" = ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_59_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_59_45.setRuntimeParent(_jettag_c_iterate_52_1);
            _jettag_c_get_59_45.setTagInfo(_td_c_get_59_45);
            _jettag_c_get_59_45.doStart(context, out);
            _jettag_c_get_59_45.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_52_1.handleBodyContent(out);
        }
        _jettag_c_iterate_52_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_62_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_62_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_62_1.setRuntimeParent(null);
        _jettag_c_iterate_62_1.setTagInfo(_td_c_iterate_62_1);
        _jettag_c_iterate_62_1.doStart(context, out);
        while (_jettag_c_iterate_62_1.okToProcessBody()) {
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_64_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_9.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_64_9.setTagInfo(_td_c_get_64_9);
            _jettag_c_get_64_9.doStart(context, out);
            _jettag_c_get_64_9.doEnd();
            out.write("[] get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_64_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_47.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_64_47.setTagInfo(_td_c_get_64_47);
            _jettag_c_get_64_47.doStart(context, out);
            _jettag_c_get_64_47.doEnd();
            out.write("Array() {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_65_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_65_7.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_65_7.setTagInfo(_td_c_get_65_7);
            _jettag_c_get_65_7.doStart(context, out);
            _jettag_c_get_65_7.doEnd();
            out.write(" == null) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_66_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_66_4.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_66_4.setTagInfo(_td_c_get_66_4);
            _jettag_c_get_66_4.doStart(context, out);
            _jettag_c_get_66_4.doEnd();
            out.write(" = new ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_66_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_46); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_66_46.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_66_46.setTagInfo(_td_c_get_66_46);
            _jettag_c_get_66_46.doStart(context, out);
            _jettag_c_get_66_46.doEnd();
            out.write("[");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_66_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_79); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_66_79.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_66_79.setTagInfo(_td_c_get_66_79);
            _jettag_c_get_66_79.doStart(context, out);
            _jettag_c_get_66_79.doEnd();
            out.write(".size()];");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_4.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_67_4.setTagInfo(_td_c_get_67_4);
            _jettag_c_get_67_4.doStart(context, out);
            _jettag_c_get_67_4.doEnd();
            out.write(".toArray(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_52.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_67_52.setTagInfo(_td_c_get_67_52);
            _jettag_c_get_67_52.doStart(context, out);
            _jettag_c_get_67_52.doEnd();
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\treturn ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_69_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_69_10.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_69_10.setTagInfo(_td_c_get_69_10);
            _jettag_c_get_69_10.doStart(context, out);
            _jettag_c_get_69_10.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\tpublic void add");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_72_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_17.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_72_17.setTagInfo(_td_c_get_72_17);
            _jettag_c_get_72_17.doStart(context, out);
            _jettag_c_get_72_17.doEnd();
            out.write("(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_72_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_50.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_72_50.setTagInfo(_td_c_get_72_50);
            _jettag_c_get_72_50.doStart(context, out);
            _jettag_c_get_72_50.doEnd();
            out.write(" _another) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_73_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_73_3.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_73_3.setTagInfo(_td_c_get_73_3);
            _jettag_c_get_73_3.doStart(context, out);
            _jettag_c_get_73_3.doEnd();
            out.write(".add(_another);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_74_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_74_3.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_74_3.setTagInfo(_td_c_get_74_3);
            _jettag_c_get_74_3.doStart(context, out);
            _jettag_c_get_74_3.doEnd();
            out.write(" = null;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t_another.setParent(this);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\tpublic void remove");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_78_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_20); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_78_20.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_78_20.setTagInfo(_td_c_get_78_20);
            _jettag_c_get_78_20.doStart(context, out);
            _jettag_c_get_78_20.doEnd();
            out.write("(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_78_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_53); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_78_53.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_78_53.setTagInfo(_td_c_get_78_53);
            _jettag_c_get_78_53.doStart(context, out);
            _jettag_c_get_78_53.doEnd();
            out.write(" child) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_79_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_79_3.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_79_3.setTagInfo(_td_c_get_79_3);
            _jettag_c_get_79_3.doStart(context, out);
            _jettag_c_get_79_3.doEnd();
            out.write(".remove(child);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_80_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_80_3.setRuntimeParent(_jettag_c_iterate_62_1);
            _jettag_c_get_80_3.setTagInfo(_td_c_get_80_3);
            _jettag_c_get_80_3.doStart(context, out);
            _jettag_c_get_80_3.doEnd();
            out.write(" = null;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_62_1.handleBodyContent(out);
        }
        _jettag_c_iterate_62_1.doEnd();
        out.write(NL);         
        out.write("\tpublic void writeTo(StringBuffer sb) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsb.append(\"\\t<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_85_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_85_17.setRuntimeParent(null);
        _jettag_c_get_85_17.setTagInfo(_td_c_get_85_17);
        _jettag_c_get_85_17.doStart(context, out);
        _jettag_c_get_85_17.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_86_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_86_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_86_1.setRuntimeParent(null);
        _jettag_c_iterate_86_1.setTagInfo(_td_c_iterate_86_1);
        _jettag_c_iterate_86_1.doStart(context, out);
        while (_jettag_c_iterate_86_1.okToProcessBody()) {
            out.write("\t\twriteAttr(sb,\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_87_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_87_17.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_87_17.setTagInfo(_td_c_get_87_17);
            _jettag_c_get_87_17.doStart(context, out);
            _jettag_c_get_87_17.doEnd();
            out.write("\",");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_87_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_53); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_87_53.setRuntimeParent(_jettag_c_iterate_86_1);
            _jettag_c_get_87_53.setTagInfo(_td_c_get_87_53);
            _jettag_c_get_87_53.doStart(context, out);
            _jettag_c_get_87_53.doEnd();
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_86_1.handleBodyContent(out);
        }
        _jettag_c_iterate_86_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_90_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_90_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_90_1.setRuntimeParent(null);
        _jettag_c_userRegion_90_1.setTagInfo(_td_c_userRegion_90_1);
        _jettag_c_userRegion_90_1.doStart(context, out);
        while (_jettag_c_userRegion_90_1.okToProcessBody()) {
            out.write("\t\t// Begin write custom attributes");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_initialCode_90_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_90_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_90_49.setRuntimeParent(_jettag_c_userRegion_90_1);
            _jettag_c_initialCode_90_49.setTagInfo(_td_c_initialCode_90_49);
            _jettag_c_initialCode_90_49.doStart(context, out);
            while (_jettag_c_initialCode_90_49.okToProcessBody()) {
                out.write(NL);         
                out.write(NL);         
                _jettag_c_initialCode_90_49.handleBodyContent(out);
            }
            _jettag_c_initialCode_90_49.doEnd();
            out.write("\t\t// End write custom attributes");  //$NON-NLS-1$        
            _jettag_c_userRegion_90_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_90_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsb.append(\" >\\r\\n\");");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_95_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_95_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_95_1.setRuntimeParent(null);
        _jettag_c_iterate_95_1.setTagInfo(_td_c_iterate_95_1);
        _jettag_c_iterate_95_1.doStart(context, out);
        while (_jettag_c_iterate_95_1.okToProcessBody()) {
            out.write("\t\tfor (int i = 0; i < get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_96_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_26); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_96_26.setRuntimeParent(_jettag_c_iterate_95_1);
            _jettag_c_get_96_26.setTagInfo(_td_c_get_96_26);
            _jettag_c_get_96_26.doStart(context, out);
            _jettag_c_get_96_26.doEnd();
            out.write("Array().length; i++) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tget");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_97_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_97_7.setRuntimeParent(_jettag_c_iterate_95_1);
            _jettag_c_get_97_7.setTagInfo(_td_c_get_97_7);
            _jettag_c_get_97_7.doStart(context, out);
            _jettag_c_get_97_7.doEnd();
            out.write("Array()[i].writeTo(sb);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_95_1.handleBodyContent(out);
        }
        _jettag_c_iterate_95_1.doEnd();
        out.write(NL);         
        out.write("\t\tsb.append(\"\\t\\t</");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_101_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_101_20.setRuntimeParent(null);
        _jettag_c_get_101_20.setTagInfo(_td_c_get_101_20);
        _jettag_c_get_101_20.doStart(context, out);
        _jettag_c_get_101_20.doEnd();
        out.write(">\\r\\n\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void removeChild(ModelElement child) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_105_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_105_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_105_1.setRuntimeParent(null);
        _jettag_c_iterate_105_1.setTagInfo(_td_c_iterate_105_1);
        _jettag_c_iterate_105_1.doStart(context, out);
        while (_jettag_c_iterate_105_1.okToProcessBody()) {
            out.write("\t\tif (child instanceof ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_106_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_106_24.setRuntimeParent(_jettag_c_iterate_105_1);
            _jettag_c_get_106_24.setTagInfo(_td_c_get_106_24);
            _jettag_c_get_106_24.doStart(context, out);
            _jettag_c_get_106_24.doEnd();
            out.write(") {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tremove");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_107_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_107_10.setRuntimeParent(_jettag_c_iterate_105_1);
            _jettag_c_get_107_10.setTagInfo(_td_c_get_107_10);
            _jettag_c_get_107_10.doStart(context, out);
            _jettag_c_get_107_10.doEnd();
            out.write("((");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_107_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_107_44.setRuntimeParent(_jettag_c_iterate_105_1);
            _jettag_c_get_107_44.setTagInfo(_td_c_get_107_44);
            _jettag_c_get_107_44.doStart(context, out);
            _jettag_c_get_107_44.doEnd();
            out.write(")child);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_105_1.handleBodyContent(out);
        }
        _jettag_c_iterate_105_1.doEnd();
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_112_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_112_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_112_1.setRuntimeParent(null);
        _jettag_c_userRegion_112_1.setTagInfo(_td_c_userRegion_112_1);
        _jettag_c_userRegion_112_1.doStart(context, out);
        while (_jettag_c_userRegion_112_1.okToProcessBody()) {
            out.write("\t\t// Begin custom methods");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_initialCode_112_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_112_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_112_40.setRuntimeParent(_jettag_c_userRegion_112_1);
            _jettag_c_initialCode_112_40.setTagInfo(_td_c_initialCode_112_40);
            _jettag_c_initialCode_112_40.doStart(context, out);
            while (_jettag_c_initialCode_112_40.okToProcessBody()) {
                out.write(NL);         
                out.write(NL);         
                _jettag_c_initialCode_112_40.handleBodyContent(out);
            }
            _jettag_c_initialCode_112_40.doEnd();
            out.write("\t\t// End custom methods");  //$NON-NLS-1$        
            _jettag_c_userRegion_112_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_112_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
