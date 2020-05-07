package cn.edu.example.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

/**
 * @author virgil.Wang
 * @date 2020/5/7 17:01
 */
public class XpathTest {

    public static void main(String[] args) throws ParserConfigurationException, IOException,
            SAXException, XPathExpressionException {

        // FIXME
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        // 开启验证
        documentBuilderFactory.setValidating(true);
        documentBuilderFactory.setNamespaceAware(false);
        documentBuilderFactory.setIgnoringComments(true);
        documentBuilderFactory.setIgnoringElementContentWhitespace(false);
        documentBuilderFactory.setCoalescing(false);
        documentBuilderFactory.setExpandEntityReferences(true);

        // 创建documentBuilder
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        documentBuilder.setErrorHandler(new ErrorHandler() {
            public void warning(SAXParseException exception) throws SAXException {
                System.out.println("warning: " + exception.getMessage());
            }

            public void error(SAXParseException exception) throws SAXException {
                System.out.println("error: " + exception.getMessage());
            }

            public void fatalError(SAXParseException exception) throws SAXException {
                System.out.println("fatalError: " + exception.getMessage());
            }
        });

        // 将文档加载到document对象中
        String uri = XpathTest.class.getClassLoader().getResource("").toString();
        System.out.println(uri);
        Document parse = documentBuilder.parse(uri +  "\\inventory.xml");
        // 创建XpathFactory
        XPathFactory xPathFactory = XPathFactory.newInstance();
        // 创建XPath
        XPath xPath = xPathFactory.newXPath();
        // 编译XPath表达式
        XPathExpression compile = xPath.compile("//book[author='Neal Stepenson']/title/text()");
        // 通过Xpath表达式得到结果,第一个参数指定了xpath表达式进行查询的上下文节点
        // 也就是在指定节点下查找符合XPath的节点。本例中的上下文节点就是整个文档；第二个参数指定了
        // xpath表达式的返回类型
        Object object = compile.evaluate(documentBuilder, XPathConstants.NODESET);
        System.out.println("作者Neal Stepenson的读书名： ");
        NodeList nodes = (NodeList) object;
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());
        }
    }

}
