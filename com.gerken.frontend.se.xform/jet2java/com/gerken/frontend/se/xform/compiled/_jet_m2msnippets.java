package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_m2msnippets implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_m2msnippets() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                " ':' ", //$NON-NLS-1$
                "colon", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_3_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[not(@parent)]", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_13 = new TagInfo("c:get", //$NON-NLS-1$
            6, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_3 = new TagInfo("c:get", //$NON-NLS-1$
            10, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$colon", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_38 = new TagInfo("c:get", //$NON-NLS-1$
            10, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_69 = new TagInfo("c:get", //$NON-NLS-1$
            10, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_101 = new TagInfo("c:get", //$NON-NLS-1$
            10, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_135 = new TagInfo("c:get", //$NON-NLS-1$
            10, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$colon", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_173 = new TagInfo("c:get", //$NON-NLS-1$
            10, 173,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_204 = new TagInfo("c:get", //$NON-NLS-1$
            10, 204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_241 = new TagInfo("c:get", //$NON-NLS-1$
            10, 241,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$colon", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@parent]", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_13 = new TagInfo("c:get", //$NON-NLS-1$
            19, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_3 = new TagInfo("c:get", //$NON-NLS-1$
            22, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$colon", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_45 = new TagInfo("c:get", //$NON-NLS-1$
            22, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_77 = new TagInfo("c:get", //$NON-NLS-1$
            22, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_113 = new TagInfo("c:get", //$NON-NLS-1$
            22, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$type/field", //$NON-NLS-1$
                "field", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_3 = new TagInfo("c:get", //$NON-NLS-1$
            25, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$colon", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_38 = new TagInfo("c:get", //$NON-NLS-1$
            25, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_69 = new TagInfo("c:get", //$NON-NLS-1$
            25, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_101 = new TagInfo("c:get", //$NON-NLS-1$
            25, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_135 = new TagInfo("c:get", //$NON-NLS-1$
            25, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$colon", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_173 = new TagInfo("c:get", //$NON-NLS-1$
            25, 173,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_204 = new TagInfo("c:get", //$NON-NLS-1$
            25, 204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_241 = new TagInfo("c:get", //$NON-NLS-1$
            25, 241,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$colon", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_4 = new TagInfo("c:get", //$NON-NLS-1$
            28, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$colon", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_1.setRuntimeParent(null);
        _jettag_c_setVariable_1_1.setTagInfo(_td_c_setVariable_1_1);
        _jettag_c_setVariable_1_1.doStart(context, out);
        _jettag_c_setVariable_1_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_1.setRuntimeParent(null);
        _jettag_c_iterate_3_1.setTagInfo(_td_c_iterate_3_1);
        _jettag_c_iterate_3_1.doStart(context, out);
        while (_jettag_c_iterate_3_1.okToProcessBody()) {
            out.write(NL);         
            out.write("|");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("|  Element: ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_13.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_get_6_13.setTagInfo(_td_c_get_6_13);
            _jettag_c_get_6_13.doStart(context, out);
            _jettag_c_get_6_13.doEnd();
            out.write(NL);         
            out.write("|");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_9_1.setRuntimeParent(_jettag_c_iterate_3_1);
            _jettag_c_iterate_9_1.setTagInfo(_td_c_iterate_9_1);
            _jettag_c_iterate_9_1.doStart(context, out);
            while (_jettag_c_iterate_9_1.okToProcessBody()) {
                out.write("<c");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_3.setRuntimeParent(_jettag_c_iterate_9_1);
                _jettag_c_get_10_3.setTagInfo(_td_c_get_10_3);
                _jettag_c_get_10_3.doStart(context, out);
                _jettag_c_get_10_3.doEnd();
                out.write("if test=\"$");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_38); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_38.setRuntimeParent(_jettag_c_iterate_9_1);
                _jettag_c_get_10_38.setTagInfo(_td_c_get_10_38);
                _jettag_c_get_10_38.doStart(context, out);
                _jettag_c_get_10_38.doEnd();
                out.write("/@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_69.setRuntimeParent(_jettag_c_iterate_9_1);
                _jettag_c_get_10_69.setTagInfo(_td_c_get_10_69);
                _jettag_c_get_10_69.doStart(context, out);
                _jettag_c_get_10_69.doEnd();
                out.write("\">");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_101.setRuntimeParent(_jettag_c_iterate_9_1);
                _jettag_c_get_10_101.setTagInfo(_td_c_get_10_101);
                _jettag_c_get_10_101.doStart(context, out);
                _jettag_c_get_10_101.doEnd();
                out.write("=\"<c");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_135); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_135.setRuntimeParent(_jettag_c_iterate_9_1);
                _jettag_c_get_10_135.setTagInfo(_td_c_get_10_135);
                _jettag_c_get_10_135.doStart(context, out);
                _jettag_c_get_10_135.doEnd();
                out.write("get select=\"$");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_173 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_173); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_173.setRuntimeParent(_jettag_c_iterate_9_1);
                _jettag_c_get_10_173.setTagInfo(_td_c_get_10_173);
                _jettag_c_get_10_173.doStart(context, out);
                _jettag_c_get_10_173.doEnd();
                out.write("/@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_204.setRuntimeParent(_jettag_c_iterate_9_1);
                _jettag_c_get_10_204.setTagInfo(_td_c_get_10_204);
                _jettag_c_get_10_204.doStart(context, out);
                _jettag_c_get_10_204.doEnd();
                out.write("\"/>\"</c");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_241 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_241); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_241.setRuntimeParent(_jettag_c_iterate_9_1);
                _jettag_c_get_10_241.setTagInfo(_td_c_get_10_241);
                _jettag_c_get_10_241.doStart(context, out);
                _jettag_c_get_10_241.doEnd();
                out.write("if>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_9_1.handleBodyContent(out);
            }
            _jettag_c_iterate_9_1.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_3_1.handleBodyContent(out);
        }
        _jettag_c_iterate_3_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_16_1.setRuntimeParent(null);
        _jettag_c_iterate_16_1.setTagInfo(_td_c_iterate_16_1);
        _jettag_c_iterate_16_1.doStart(context, out);
        while (_jettag_c_iterate_16_1.okToProcessBody()) {
            out.write(NL);         
            out.write("|");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("|  Element: ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_19_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_19_13.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_19_13.setTagInfo(_td_c_get_19_13);
            _jettag_c_get_19_13.doStart(context, out);
            _jettag_c_get_19_13.doEnd();
            out.write(NL);         
            out.write("|");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("<c");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_22_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_3.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_22_3.setTagInfo(_td_c_get_22_3);
            _jettag_c_get_22_3.doStart(context, out);
            _jettag_c_get_22_3.doEnd();
            out.write("iterate select=\"$");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_22_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_45.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_22_45.setTagInfo(_td_c_get_22_45);
            _jettag_c_get_22_45.doStart(context, out);
            _jettag_c_get_22_45.doEnd();
            out.write("/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_22_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_77); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_77.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_22_77.setTagInfo(_td_c_get_22_77);
            _jettag_c_get_22_77.doStart(context, out);
            _jettag_c_get_22_77.doEnd();
            out.write("\" var=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_22_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_113); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_113.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_22_113.setTagInfo(_td_c_get_22_113);
            _jettag_c_get_22_113.doStart(context, out);
            _jettag_c_get_22_113.doEnd();
            out.write("\" >");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_24_1.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_iterate_24_1.setTagInfo(_td_c_iterate_24_1);
            _jettag_c_iterate_24_1.doStart(context, out);
            while (_jettag_c_iterate_24_1.okToProcessBody()) {
                out.write("<c");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_3.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_get_25_3.setTagInfo(_td_c_get_25_3);
                _jettag_c_get_25_3.doStart(context, out);
                _jettag_c_get_25_3.doEnd();
                out.write("if test=\"$");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_38); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_38.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_get_25_38.setTagInfo(_td_c_get_25_38);
                _jettag_c_get_25_38.doStart(context, out);
                _jettag_c_get_25_38.doEnd();
                out.write("/@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_69.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_get_25_69.setTagInfo(_td_c_get_25_69);
                _jettag_c_get_25_69.doStart(context, out);
                _jettag_c_get_25_69.doEnd();
                out.write("\">");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_101.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_get_25_101.setTagInfo(_td_c_get_25_101);
                _jettag_c_get_25_101.doStart(context, out);
                _jettag_c_get_25_101.doEnd();
                out.write("=\"<c");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_135); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_135.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_get_25_135.setTagInfo(_td_c_get_25_135);
                _jettag_c_get_25_135.doStart(context, out);
                _jettag_c_get_25_135.doEnd();
                out.write("get select=\"$");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_173 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_173); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_173.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_get_25_173.setTagInfo(_td_c_get_25_173);
                _jettag_c_get_25_173.doStart(context, out);
                _jettag_c_get_25_173.doEnd();
                out.write("/@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_204.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_get_25_204.setTagInfo(_td_c_get_25_204);
                _jettag_c_get_25_204.doStart(context, out);
                _jettag_c_get_25_204.doEnd();
                out.write("\"/>\"</c");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_241 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_241); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_241.setRuntimeParent(_jettag_c_iterate_24_1);
                _jettag_c_get_25_241.setTagInfo(_td_c_get_25_241);
                _jettag_c_get_25_241.doStart(context, out);
                _jettag_c_get_25_241.doEnd();
                out.write("if>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_24_1.handleBodyContent(out);
            }
            _jettag_c_iterate_24_1.doEnd();
            out.write("</c");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_28_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_28_4.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_28_4.setTagInfo(_td_c_get_28_4);
            _jettag_c_get_28_4.doStart(context, out);
            _jettag_c_get_28_4.doEnd();
            out.write("iterate>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_16_1.handleBodyContent(out);
        }
        _jettag_c_iterate_16_1.doEnd();
    }
}
