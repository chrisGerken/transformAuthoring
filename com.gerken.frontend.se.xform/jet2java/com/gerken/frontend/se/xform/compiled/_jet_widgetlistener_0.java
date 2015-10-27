package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_widgetlistener_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_widgetlistener_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_18 = new TagInfo("c:get", //$NON-NLS-1$
            1, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@listenerClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_20 = new TagInfo("c:get", //$NON-NLS-1$
            5, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@widgetVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_26 = new TagInfo("c:get", //$NON-NLS-1$
            6, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_60 = new TagInfo("c:get", //$NON-NLS-1$
            8, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_1 = new TagInfo("c:if", //$NON-NLS-1$
            9, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$type/@parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_16 = new TagInfo("c:get", //$NON-NLS-1$
            10, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type[@name=$type/@parent]/@shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_92 = new TagInfo("c:get", //$NON-NLS-1$
            10, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@indexGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_45 = new TagInfo("c:get", //$NON-NLS-1$
            12, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$field/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\tprotected class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_18.setRuntimeParent(null);
        _jettag_c_get_1_18.setTagInfo(_td_c_get_1_18);
        _jettag_c_get_1_18.doStart(context, out);
        _jettag_c_get_1_18.doEnd();
        out.write(" implements ModifyListener {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tpublic void modifyText(ModifyEvent e) { exec(); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tprivate void exec() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (isFillingFields()) { return; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tint itemIndex = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_20.setRuntimeParent(null);
        _jettag_c_get_5_20.setTagInfo(_td_c_get_5_20);
        _jettag_c_get_5_20.doStart(context, out);
        _jettag_c_get_5_20.doEnd();
        out.write(".getSelectionIndex();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tString value = domain_");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_26.setRuntimeParent(null);
        _jettag_c_get_6_26.setTagInfo(_td_c_get_6_26);
        _jettag_c_get_6_26.doStart(context, out);
        _jettag_c_get_6_26.doEnd();
        out.write(".getKey(itemIndex);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (value==null) {value = \"\"; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tModelAccess.getInstance().setAttribute(getSourceNode(),\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_60); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_60.setRuntimeParent(null);
        _jettag_c_get_8_60.setTagInfo(_td_c_get_8_60);
        _jettag_c_get_8_60.doStart(context, out);
        _jettag_c_get_8_60.doEnd();
        out.write("\",value);");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_9_1.setRuntimeParent(null);
        _jettag_c_if_9_1.setTagInfo(_td_c_if_9_1);
        _jettag_c_if_9_1.doStart(context, out);
        while (_jettag_c_if_9_1.okToProcessBody()) {
            out.write("\t\t\tgetEditor().");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_10_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_16); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_16.setRuntimeParent(_jettag_c_if_9_1);
            _jettag_c_get_10_16.setTagInfo(_td_c_get_10_16);
            _jettag_c_get_10_16.doStart(context, out);
            _jettag_c_get_10_16.doEnd();
            out.write("().");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_10_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_92); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_92.setRuntimeParent(_jettag_c_if_9_1);
            _jettag_c_get_10_92.setTagInfo(_td_c_get_10_92);
            _jettag_c_get_10_92.doStart(context, out);
            _jettag_c_get_10_92.doEnd();
            out.write("().update();");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_9_1.handleBodyContent(out);
        }
        _jettag_c_if_9_1.doEnd();
        out.write("\t\t\tgetValidator().validate(getSourceNode(),\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_45.setRuntimeParent(null);
        _jettag_c_get_12_45.setTagInfo(_td_c_get_12_45);
        _jettag_c_get_12_45.doStart(context, out);
        _jettag_c_get_12_45.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetEditor().modelChanged();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tupdateConstraintMessage();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
