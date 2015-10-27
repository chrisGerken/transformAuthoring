package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_xformmainJetFile implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_xformmainJetFile() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_setVariable_9_1 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group[@root='true']", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_10_1 = new TagInfo("c1:set", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_setVariable_11_1 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                " '    ' ", //$NON-NLS-1$
                "tab", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_include_12_1 = new TagInfo("c1:include", //$NON-NLS-1$
            12, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/recurse/mainJetFile1.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_setVariable_16_1 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group[@root='true']", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_17_1 = new TagInfo("c1:set", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_setVariable_18_1 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            18, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                " '    ' ", //$NON-NLS-1$
                "tab", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_include_19_1 = new TagInfo("c1:include", //$NON-NLS-1$
            19, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/recurse/mainJetFile2.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<");  //$NON-NLS-1$        
        // 
        out.write("%@taglib prefix=\"ws\" id=\"org.eclipse.jet.workspaceTags\" %>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<c:if test=\"not(isVariableDefined(root))\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <c:setVariable select=\"/*\" var=\"root\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</c:if>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("*******************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_setVariable_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_setVariable_9_1.setRuntimeParent(null);
        _jettag_c1_setVariable_9_1.setTagInfo(_td_c1_setVariable_9_1);
        _jettag_c1_setVariable_9_1.doStart(context, out);
        _jettag_c1_setVariable_9_1.doEnd();
        RuntimeTagElement _jettag_c1_set_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_set_10_1.setRuntimeParent(null);
        _jettag_c1_set_10_1.setTagInfo(_td_c1_set_10_1);
        _jettag_c1_set_10_1.doStart(context, out);
        JET2Writer _jettag_c1_set_10_1_saved_out = out;
        while (_jettag_c1_set_10_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            _jettag_c1_set_10_1.handleBodyContent(out);
        }
        out = _jettag_c1_set_10_1_saved_out;
        _jettag_c1_set_10_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_setVariable_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_setVariable_11_1.setRuntimeParent(null);
        _jettag_c1_setVariable_11_1.setTagInfo(_td_c1_setVariable_11_1);
        _jettag_c1_setVariable_11_1.doStart(context, out);
        _jettag_c1_setVariable_11_1.doEnd();
        RuntimeTagElement _jettag_c1_include_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "include", "c1:include", _td_c1_include_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_include_12_1.setRuntimeParent(null);
        _jettag_c1_include_12_1.setTagInfo(_td_c1_include_12_1);
        _jettag_c1_include_12_1.doStart(context, out);
        _jettag_c1_include_12_1.doEnd();
        out.write(NL);         
        out.write("*******************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c1_setVariable_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_setVariable_16_1.setRuntimeParent(null);
        _jettag_c1_setVariable_16_1.setTagInfo(_td_c1_setVariable_16_1);
        _jettag_c1_setVariable_16_1.doStart(context, out);
        _jettag_c1_setVariable_16_1.doEnd();
        RuntimeTagElement _jettag_c1_set_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_set_17_1.setRuntimeParent(null);
        _jettag_c1_set_17_1.setTagInfo(_td_c1_set_17_1);
        _jettag_c1_set_17_1.doStart(context, out);
        JET2Writer _jettag_c1_set_17_1_saved_out = out;
        while (_jettag_c1_set_17_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            _jettag_c1_set_17_1.handleBodyContent(out);
        }
        out = _jettag_c1_set_17_1_saved_out;
        _jettag_c1_set_17_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_setVariable_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_setVariable_18_1.setRuntimeParent(null);
        _jettag_c1_setVariable_18_1.setTagInfo(_td_c1_setVariable_18_1);
        _jettag_c1_setVariable_18_1.doStart(context, out);
        _jettag_c1_setVariable_18_1.doEnd();
        RuntimeTagElement _jettag_c1_include_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "include", "c1:include", _td_c1_include_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_include_19_1.setRuntimeParent(null);
        _jettag_c1_include_19_1.setTagInfo(_td_c1_include_19_1);
        _jettag_c1_include_19_1.doStart(context, out);
        _jettag_c1_include_19_1.doEnd();
        out.write(NL);         
        out.write("*******************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<c:if test=\"isVariableDefined('org.eclipse.jet.resource.project.name')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <ws:file template=\"templates/dump.jet\" path=\"{$org.eclipse.jet.resource.project.name}/dump.xml\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</c:if>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
