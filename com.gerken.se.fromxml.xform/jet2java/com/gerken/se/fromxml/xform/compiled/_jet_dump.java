package com.gerken.se.fromxml.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_dump implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_dump() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_3_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$model/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_17 = new TagInfo("c:get", //$NON-NLS-1$
            4, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_49 = new TagInfo("c:if", //$NON-NLS-1$
            4, 49,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$type/@parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_84 = new TagInfo("c:get", //$NON-NLS-1$
            4, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_154 = new TagInfo("c:get", //$NON-NLS-1$
            4, 154,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_23 = new TagInfo("c:get", //$NON-NLS-1$
            6, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_63 = new TagInfo("c:get", //$NON-NLS-1$
            6, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_102 = new TagInfo("c:get", //$NON-NLS-1$
            6, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@kind", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_134 = new TagInfo("c:if", //$NON-NLS-1$
            6, 134,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$field/@kind='checkbox'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_200 = new TagInfo("c:if", //$NON-NLS-1$
            6, 200,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$field/@kind='combo'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_244 = new TagInfo("c:get", //$NON-NLS-1$
            6, 244,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$model/type/field[@kind='combo']", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_19 = new TagInfo("c:get", //$NON-NLS-1$
            16, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$field/value", //$NON-NLS-1$
                "value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_20 = new TagInfo("c:get", //$NON-NLS-1$
            18, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$value/@key", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_65 = new TagInfo("c:get", //$NON-NLS-1$
            18, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$value/@key", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<root>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   <editor  id=\"\"  name=\"\" extension=\"\"  provider=\"\" >");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_1.setRuntimeParent(null);
        _jettag_c_iterate_3_1.setTagInfo(_td_c_iterate_3_1);
        _jettag_c_iterate_3_1.doStart(context, out);
        while (_jettag_c_iterate_3_1.okToProcessBody()) {
            out.write("\t   <type name=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_17); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_17.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_get_4_17.setTagInfo(_td_c_get_4_17);
            _jettag_c_get_4_17.doStart(context, out);
            _jettag_c_get_4_17.doEnd();
            out.write("\"  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_4_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_4_49.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_if_4_49.setTagInfo(_td_c_if_4_49);
            _jettag_c_if_4_49.doStart(context, out);
            while (_jettag_c_if_4_49.okToProcessBody()) {
                out.write("parent=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_84.setRuntimeParent(_jettag_c_if_4_49);
                _jettag_c_get_4_84.setTagInfo(_td_c_get_4_84);
                _jettag_c_get_4_84.doStart(context, out);
                _jettag_c_get_4_84.doEnd();
                out.write("\"  ");  //$NON-NLS-1$        
                _jettag_c_if_4_49.handleBodyContent(out);
            }
            _jettag_c_if_4_49.doEnd();
            out.write("nounPhrase=\"\"  indexLabel=\"{@");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_154 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_154); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_154.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_get_4_154.setTagInfo(_td_c_get_4_154);
            _jettag_c_get_4_154.doStart(context, out);
            _jettag_c_get_4_154.doEnd();
            out.write("}\"  shingleLabel=\"\"  >");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_5_1.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_iterate_5_1.setTagInfo(_td_c_iterate_5_1);
            _jettag_c_iterate_5_1.doStart(context, out);
            while (_jettag_c_iterate_5_1.okToProcessBody()) {
                out.write("\t       <field  name=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_23); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_23.setRuntimeParent(_jettag_c_iterate_5_1);
                _jettag_c_get_6_23.setTagInfo(_td_c_get_6_23);
                _jettag_c_get_6_23.doStart(context, out);
                _jettag_c_get_6_23.doEnd();
                out.write("\"  label=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_63.setRuntimeParent(_jettag_c_iterate_5_1);
                _jettag_c_get_6_63.setTagInfo(_td_c_get_6_63);
                _jettag_c_get_6_63.doStart(context, out);
                _jettag_c_get_6_63.doEnd();
                out.write("\"  kind=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_102); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_102.setRuntimeParent(_jettag_c_iterate_5_1);
                _jettag_c_get_6_102.setTagInfo(_td_c_get_6_102);
                _jettag_c_get_6_102.doStart(context, out);
                _jettag_c_get_6_102.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_6_134 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_134); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_6_134.setRuntimeParent(_jettag_c_iterate_5_1);
                _jettag_c_if_6_134.setTagInfo(_td_c_if_6_134);
                _jettag_c_if_6_134.doStart(context, out);
                while (_jettag_c_if_6_134.okToProcessBody()) {
                    out.write("  text=\"Checkbox Text\"");  //$NON-NLS-1$        
                    _jettag_c_if_6_134.handleBodyContent(out);
                }
                _jettag_c_if_6_134.doEnd();
                RuntimeTagElement _jettag_c_if_6_200 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_200); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_6_200.setRuntimeParent(_jettag_c_iterate_5_1);
                _jettag_c_if_6_200.setTagInfo(_td_c_if_6_200);
                _jettag_c_if_6_200.doStart(context, out);
                while (_jettag_c_if_6_200.okToProcessBody()) {
                    out.write("  domain=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_6_244 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_244); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_6_244.setRuntimeParent(_jettag_c_if_6_200);
                    _jettag_c_get_6_244.setTagInfo(_td_c_get_6_244);
                    _jettag_c_get_6_244.doStart(context, out);
                    _jettag_c_get_6_244.doEnd();
                    out.write("Values\"");  //$NON-NLS-1$        
                    _jettag_c_if_6_200.handleBodyContent(out);
                }
                _jettag_c_if_6_200.doEnd();
                out.write("  >");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t           <constraint  kind=\"required\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t           <constraint  kind=\"name\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t           <constraint  kind=\"java.package\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t           <constraint  kind=\"unique\" levels=\"1\"  />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t       </field>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_5_1.handleBodyContent(out);
            }
            _jettag_c_iterate_5_1.doEnd();
            out.write("\t   </type>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_3_1.handleBodyContent(out);
        }
        _jettag_c_iterate_3_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_15_1.setRuntimeParent(null);
        _jettag_c_iterate_15_1.setTagInfo(_td_c_iterate_15_1);
        _jettag_c_iterate_15_1.doStart(context, out);
        while (_jettag_c_iterate_15_1.okToProcessBody()) {
            out.write("\t   <domain name=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_16_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_19.setRuntimeParent(_jettag_c_iterate_15_1);
            _jettag_c_get_16_19.setTagInfo(_td_c_get_16_19);
            _jettag_c_get_16_19.doStart(context, out);
            _jettag_c_get_16_19.doEnd();
            out.write("Values\" >");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_17_1.setRuntimeParent(_jettag_c_iterate_15_1);
            _jettag_c_iterate_17_1.setTagInfo(_td_c_iterate_17_1);
            _jettag_c_iterate_17_1.doStart(context, out);
            while (_jettag_c_iterate_17_1.okToProcessBody()) {
                out.write("\t\t    <value  key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_20.setRuntimeParent(_jettag_c_iterate_17_1);
                _jettag_c_get_18_20.setTagInfo(_td_c_get_18_20);
                _jettag_c_get_18_20.doStart(context, out);
                _jettag_c_get_18_20.doEnd();
                out.write("\"  displayText=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_65.setRuntimeParent(_jettag_c_iterate_17_1);
                _jettag_c_get_18_65.setTagInfo(_td_c_get_18_65);
                _jettag_c_get_18_65.doStart(context, out);
                _jettag_c_get_18_65.doEnd();
                out.write("\" />");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_17_1.handleBodyContent(out);
            }
            _jettag_c_iterate_17_1.doEnd();
            out.write("\t        <query  desc=\"\" fromRoot=\"\" queryExpression=\"\"  keyExpression=\"\"  valueExpression=\"\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t   </domain>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_15_1.handleBodyContent(out);
        }
        _jettag_c_iterate_15_1.doEnd();
        out.write("\t   <pattern  id=\"\"  desc=\"\"  />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   </editor>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</root>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
    }
}
