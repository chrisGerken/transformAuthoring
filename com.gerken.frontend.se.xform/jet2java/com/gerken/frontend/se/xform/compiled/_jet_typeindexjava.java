package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_typeindexjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_typeindexjava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@indexPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_8 = new TagInfo("c:get", //$NON-NLS-1$
            8, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_8 = new TagInfo("c:get", //$NON-NLS-1$
            9, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_14 = new TagInfo("c:get", //$NON-NLS-1$
            11, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@indexClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_9 = new TagInfo("c:get", //$NON-NLS-1$
            15, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@indexClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_64 = new TagInfo("c:get", //$NON-NLS-1$
            24, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_69 = new TagInfo("c:get", //$NON-NLS-1$
            26, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@nounPhrase", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_61 = new TagInfo("c:get", //$NON-NLS-1$
            29, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@indexLabel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_1 = new TagInfo("c:if", //$NON-NLS-1$
            63, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$type/@parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_35 = new TagInfo("c:get", //$NON-NLS-1$
            64, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@parent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_21 = new TagInfo("c:get", //$NON-NLS-1$
            71, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_34 = new TagInfo("c:get", //$NON-NLS-1$
            72, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_21 = new TagInfo("c:get", //$NON-NLS-1$
            73, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_70 = new TagInfo("c:get", //$NON-NLS-1$
            80, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_21 = new TagInfo("c:get", //$NON-NLS-1$
            81, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_21 = new TagInfo("c:get", //$NON-NLS-1$
            82, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_34 = new TagInfo("c:get", //$NON-NLS-1$
            83, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_21 = new TagInfo("c:get", //$NON-NLS-1$
            104, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleGetterMethod", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_34 = new TagInfo("c:get", //$NON-NLS-1$
            105, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_11 = new TagInfo("c:get", //$NON-NLS-1$
            121, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@shingleLabel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_11 = new TagInfo("c:get", //$NON-NLS-1$
            125, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
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
        out.write("import java.util.StringTokenizer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.eclipse.ui.forms.events.HyperlinkEvent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_8.setRuntimeParent(null);
        _jettag_c_get_8_8.setTagInfo(_td_c_get_8_8);
        _jettag_c_get_8_8.doStart(context, out);
        _jettag_c_get_8_8.doEnd();
        out.write(".AbstractIndex;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_8.setRuntimeParent(null);
        _jettag_c_get_9_8.setTagInfo(_td_c_get_9_8);
        _jettag_c_get_9_8.doStart(context, out);
        _jettag_c_get_9_8.doEnd();
        out.write(".ModelAccess;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_14.setRuntimeParent(null);
        _jettag_c_get_11_14.setTagInfo(_td_c_get_11_14);
        _jettag_c_get_11_14.doStart(context, out);
        _jettag_c_get_11_14.doEnd();
        out.write(" extends AbstractIndex {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate Node target[];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_9.setRuntimeParent(null);
        _jettag_c_get_15_9.setTagInfo(_td_c_get_15_9);
        _jettag_c_get_15_9.doStart(context, out);
        _jettag_c_get_15_9.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getTextContent() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tStringBuffer sb = new StringBuffer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsb.append(\"<form>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\ttarget = ModelAccess.getInstance().getNodes(getSourceNode(),\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_64.setRuntimeParent(null);
        _jettag_c_get_24_64.setTagInfo(_td_c_get_24_64);
        _jettag_c_get_24_64.doStart(context, out);
        _jettag_c_get_24_64.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsb.append(\"<li style=\\\"text\\\" >Create a <a href=\\\"new.0\\\">new</a> ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_69); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_69.setRuntimeParent(null);
        _jettag_c_get_26_69.setTagInfo(_td_c_get_26_69);
        _jettag_c_get_26_69.doStart(context, out);
        _jettag_c_get_26_69.doEnd();
        out.write("</li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < target.length; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tString label = ModelAccess.getInstance().bind(target[i],\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_61.setRuntimeParent(null);
        _jettag_c_get_29_61.setTagInfo(_td_c_get_29_61);
        _jettag_c_get_29_61.doStart(context, out);
        _jettag_c_get_29_61.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (label.length() == 0) { label = \"[none]\"; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (target[i]==getSelectedElement()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tlabel= \"<b>\"+label+\"</b>\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<li style=\\\"text\\\" >\");      // bindent=\\\"5\\\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<a href=\\\"delete.\"+i+\"\\\"><img href=\\\"\"+getDeleteKey()+\"\\\"/></a> \");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<a href=\\\"up.\"+i+\"\\\"><img href=\\\"\"+getUpKey()+\"\\\"/></a> \");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<a href=\\\"down.\"+i+\"\\\"><img href=\\\"\"+getDownKey()+\"\\\"/></a> \");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\t\tsb.append(\"<a href=\\\"copy.\"+i+\"\\\"><img href=\\\"\"+getCopyKey()+\"\\\"/></a> \");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"<a href=\\\"goto.\"+i+\"\\\"><img href=\\\"\"+getEditKey()+\"\\\"/></a> \"); ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"   \"+label);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsb.append(\"</li>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsb.append(\"</form>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn sb.toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void linkActivated(HyperlinkEvent e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString href = e.getHref().toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tStringTokenizer st = new StringTokenizer(href,\".\",false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString command = st.nextToken();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tint index = Integer.parseInt(st.nextToken());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (command.equals(\"delete\")) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode removedNode = target[index];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tModelAccess.getInstance().removeNode(removedNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().modelChanged();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tupdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (removedNode == getSelectedElement()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclearSelectedElement();");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_63_1.setRuntimeParent(null);
        _jettag_c_if_63_1.setTagInfo(_td_c_if_63_1);
        _jettag_c_if_63_1.doStart(context, out);
        while (_jettag_c_if_63_1.okToProcessBody()) {
            out.write("\t\t\t\tgetShinglePart().showShingle(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_64_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_35); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_35.setRuntimeParent(_jettag_c_if_63_1);
            _jettag_c_get_64_35.setTagInfo(_td_c_get_64_35);
            _jettag_c_get_64_35.doStart(context, out);
            _jettag_c_get_64_35.doEnd();
            out.write("\");");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_63_1.handleBodyContent(out);
        }
        _jettag_c_if_63_1.doEnd();
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (command.equals(\"copy\")) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode newNode = ModelAccess.getInstance().copyNode(target[index]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_71_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_71_21.setRuntimeParent(null);
        _jettag_c_get_71_21.setTagInfo(_td_c_get_71_21);
        _jettag_c_get_71_21.doStart(context, out);
        _jettag_c_get_71_21.doEnd();
        out.write("().getValidator().validate(newNode,null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().showShingle(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_72_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_72_34.setRuntimeParent(null);
        _jettag_c_get_72_34.setTagInfo(_td_c_get_72_34);
        _jettag_c_get_72_34.doStart(context, out);
        _jettag_c_get_72_34.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_73_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_73_21.setRuntimeParent(null);
        _jettag_c_get_73_21.setTagInfo(_td_c_get_73_21);
        _jettag_c_get_73_21.doStart(context, out);
        _jettag_c_get_73_21.doEnd();
        out.write("().setSourceNode(newNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsetSelectedElement(newNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().modelChanged();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tupdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (command.equals(\"new\")) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode newNode = ModelAccess.getInstance().newNode(getSourceNode(),\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_80_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_80_70.setRuntimeParent(null);
        _jettag_c_get_80_70.setTagInfo(_td_c_get_80_70);
        _jettag_c_get_80_70.doStart(context, out);
        _jettag_c_get_80_70.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_81_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_81_21.setRuntimeParent(null);
        _jettag_c_get_81_21.setTagInfo(_td_c_get_81_21);
        _jettag_c_get_81_21.doStart(context, out);
        _jettag_c_get_81_21.doEnd();
        out.write("().getValidator().validate(newNode,null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_82_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_82_21.setRuntimeParent(null);
        _jettag_c_get_82_21.setTagInfo(_td_c_get_82_21);
        _jettag_c_get_82_21.doStart(context, out);
        _jettag_c_get_82_21.doEnd();
        out.write("().setSourceNode(newNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().showShingle(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_83_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_83_34.setRuntimeParent(null);
        _jettag_c_get_83_34.setTagInfo(_td_c_get_83_34);
        _jettag_c_get_83_34.doStart(context, out);
        _jettag_c_get_83_34.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsetSelectedElement(newNode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().modelChanged();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tupdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (command.equals(\"up\")) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (index==0) { return;}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tModelAccess.getInstance().moveUp(target[index],target[index-1]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().modelChanged();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tupdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (command.equals(\"down\")) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (index==(target.length-1)) { return;}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tModelAccess.getInstance().moveDown(target[index],target[index+1]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().modelChanged();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tupdate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (command.equals(\"goto\")) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_104_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_104_21.setRuntimeParent(null);
        _jettag_c_get_104_21.setTagInfo(_td_c_get_104_21);
        _jettag_c_get_104_21.doStart(context, out);
        _jettag_c_get_104_21.doEnd();
        out.write("().setSourceNode(target[index]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgetShinglePart().showShingle(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_105_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_105_34.setRuntimeParent(null);
        _jettag_c_get_105_34.setTagInfo(_td_c_get_105_34);
        _jettag_c_get_105_34.doStart(context, out);
        _jettag_c_get_105_34.doEnd();
        out.write("\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsetSelectedElement(target[index]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic void linkEntered(HyperlinkEvent e) {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void linkExited(HyperlinkEvent e) {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getDescription() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String getTitle() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_121_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_121_11.setRuntimeParent(null);
        _jettag_c_get_121_11.setTagInfo(_td_c_get_121_11);
        _jettag_c_get_121_11.doStart(context, out);
        _jettag_c_get_121_11.doEnd();
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic String getTargetNodeName() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_125_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_125_11.setRuntimeParent(null);
        _jettag_c_get_125_11.setTagInfo(_td_c_get_125_11);
        _jettag_c_get_125_11.doStart(context, out);
        _jettag_c_get_125_11.doEnd();
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
