import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Dom_reader {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);

        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse("C:\\Users\\WWW\\IdeaProjects\\PowerTools_DOM\\src\\powertools.xml");

        Element root = document.getDocumentElement();

        System.out.println(root.getNodeName());
        System.out.println(root.getNodeType());


        NodeList list = root.getElementsByTagName("powertool");

        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            System.out.println("Model powertool: " + root.getElementsByTagName("model").item(i).getFirstChild().getTextContent());
            System.out.println("Handly: " + root.getElementsByTagName("handly").item(i).getFirstChild().getTextContent());
            System.out.println("Capacity: " + root.getElementsByTagName("capacity").item(i).getFirstChild().getTextContent());
            System.out.println("Cartrydge type: " + root.getElementsByTagName("cartrydge_type").item(i).getFirstChild().getTextContent());
            System.out.println("Speed: " + root.getElementsByTagName("speed").item(i).getFirstChild().getTextContent());
            System.out.println("Application: " + root.getElementsByTagName("application").item(i).getFirstChild().getTextContent());

        }


    }

}

