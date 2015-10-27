package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editordatareaderjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editordatareaderjava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@editorPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_8 = new TagInfo("c:get", //$NON-NLS-1$
            17, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$editor/@constraintPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_54 = new TagInfo("c:get", //$NON-NLS-1$
            17, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@validatorClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_87_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            87, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$editor/type", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_19 = new TagInfo("c:get", //$NON-NLS-1$
            88, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_56 = new TagInfo("c:get", //$NON-NLS-1$
            88, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type/@validatorClass", //$NON-NLS-1$
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
        out.write("import java.io.ByteArrayInputStream;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.io.InputStream;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Hashtable;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import javax.xml.parsers.DocumentBuilder;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.xml.parsers.DocumentBuilderFactory;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.w3c.dom.Document;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.NamedNodeMap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.Node;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.w3c.dom.NodeList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_16_1.setRuntimeParent(null);
        _jettag_c_iterate_16_1.setTagInfo(_td_c_iterate_16_1);
        _jettag_c_iterate_16_1.doStart(context, out);
        while (_jettag_c_iterate_16_1.okToProcessBody()) {
            out.write("import ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_17_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_8.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_17_8.setTagInfo(_td_c_get_17_8);
            _jettag_c_get_17_8.doStart(context, out);
            _jettag_c_get_17_8.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_17_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_54.setRuntimeParent(_jettag_c_iterate_16_1);
            _jettag_c_get_17_54.setTagInfo(_td_c_get_17_54);
            _jettag_c_get_17_54.doStart(context, out);
            _jettag_c_get_17_54.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_16_1.handleBodyContent(out);
        }
        _jettag_c_iterate_16_1.doEnd();
        out.write(NL);         
        out.write("public class DataReader {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate static DataReader instance = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Hashtable<String,AbstractConstraint> validators = new Hashtable<String, AbstractConstraint>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate DataReader() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic static DataReader getInstance() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (instance == null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tinstance = new DataReader();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tinstance.loadValidators();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn instance;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Document buildModel(String content) throws Exception {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn readData(new ByteArrayInputStream(content.getBytes()));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Document readData(InputStream is) throws Exception {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDocumentBuilder parser = factory.newDocumentBuilder();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDocument newDocument = parser.parse(is);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tnewDocument.normalize();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvalidate(newDocument);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn newDocument;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic Document buildEmptyModel() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry { ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tDocument newDocument = buildModel(\"<root></root>\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvalidate(newDocument);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn newDocument; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} catch (Throwable t) { return null; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void validate(Document doc) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNodeList nlist = doc.getChildNodes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < nlist.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode kid = nlist.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (kid.getNodeType() == Node.ELEMENT_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvalidate((Element)kid);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void validate(Element element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString name = element.getNodeName();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tAbstractConstraint validator = validators.get(name);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (validator == null) { return; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvalidator.validate(element, null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tNodeList nlist = element.getChildNodes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (int i = 0; i < nlist.getLength(); i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tNode kid = nlist.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tint nodeType = kid.getNodeType();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (nodeType == Node.ELEMENT_NODE) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvalidate((Element)kid);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate void loadValidators() {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_87_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_87_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_87_1.setRuntimeParent(null);
        _jettag_c_iterate_87_1.setTagInfo(_td_c_iterate_87_1);
        _jettag_c_iterate_87_1.doStart(context, out);
        while (_jettag_c_iterate_87_1.okToProcessBody()) {
            out.write("\t\tvalidators.put(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_88_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_88_19.setRuntimeParent(_jettag_c_iterate_87_1);
            _jettag_c_get_88_19.setTagInfo(_td_c_get_88_19);
            _jettag_c_get_88_19.doStart(context, out);
            _jettag_c_get_88_19.doEnd();
            out.write("\", new ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_88_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_88_56.setRuntimeParent(_jettag_c_iterate_87_1);
            _jettag_c_get_88_56.setTagInfo(_td_c_get_88_56);
            _jettag_c_get_88_56.doStart(context, out);
            _jettag_c_get_88_56.doEnd();
            out.write("());");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_87_1.handleBodyContent(out);
        }
        _jettag_c_iterate_87_1.doEnd();
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
