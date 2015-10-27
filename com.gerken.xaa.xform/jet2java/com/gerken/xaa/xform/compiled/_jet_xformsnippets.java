package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_xformsnippets implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_xformsnippets() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_iterate_3_1 = new TagInfo("c1:iterate", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group", //$NON-NLS-1$
                "group", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_5_12 = new TagInfo("c1:get", //$NON-NLS-1$
            5, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$group/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_iterate_7_2 = new TagInfo("c1:iterate", //$NON-NLS-1$
            7, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$group/token", //$NON-NLS-1$
                "token", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_8_18 = new TagInfo("c1:get", //$NON-NLS-1$
            8, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$group/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_get_8_51 = new TagInfo("c1:get", //$NON-NLS-1$
            8, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$token/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\"getter\" snippets for defined tokens (input and calculated)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_iterate_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_iterate_3_1.setRuntimeParent(null);
        _jettag_c1_iterate_3_1.setTagInfo(_td_c1_iterate_3_1);
        _jettag_c1_iterate_3_1.doStart(context, out);
        while (_jettag_c1_iterate_3_1.okToProcessBody()) {
            out.write(NL);         
            out.write("Tokens for ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c1_get_5_12 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_5_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_get_5_12.setRuntimeParent(_jettag_c1_iterate_3_1);
            _jettag_c1_get_5_12.setTagInfo(_td_c1_get_5_12);
            _jettag_c1_get_5_12.doStart(context, out);
            _jettag_c1_get_5_12.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c1_iterate_7_2 = context.getTagFactory().createRuntimeTag(_jetns_c1, "iterate", "c1:iterate", _td_c1_iterate_7_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c1_iterate_7_2.setRuntimeParent(_jettag_c1_iterate_3_1);
            _jettag_c1_iterate_7_2.setTagInfo(_td_c1_iterate_7_2);
            _jettag_c1_iterate_7_2.doStart(context, out);
            while (_jettag_c1_iterate_7_2.okToProcessBody()) {
                out.write("\t<c:get select=\"$");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_8_18 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_8_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_8_18.setRuntimeParent(_jettag_c1_iterate_7_2);
                _jettag_c1_get_8_18.setTagInfo(_td_c1_get_8_18);
                _jettag_c1_get_8_18.doStart(context, out);
                _jettag_c1_get_8_18.doEnd();
                out.write("/@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c1_get_8_51 = context.getTagFactory().createRuntimeTag(_jetns_c1, "get", "c1:get", _td_c1_get_8_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c1_get_8_51.setRuntimeParent(_jettag_c1_iterate_7_2);
                _jettag_c1_get_8_51.setTagInfo(_td_c1_get_8_51);
                _jettag_c1_get_8_51.doStart(context, out);
                _jettag_c1_get_8_51.doEnd();
                out.write("\" />");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c1_iterate_7_2.handleBodyContent(out);
            }
            _jettag_c1_iterate_7_2.doEnd();
            out.write(NL);         
            _jettag_c1_iterate_3_1.handleBodyContent(out);
        }
        _jettag_c1_iterate_3_1.doEnd();
    }
}
