package edu.tw.tools;


/**
 * Created by davidshuvli on 2016/10/17.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;


public class XmlImpl {

    public HashMap<String, Integer> parserXml(String fileName, String stragety) {
        HashMap<String, Integer> priceMap = new HashMap<String, Integer>();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(fileName);

            NodeList priceStragetys = document.getChildNodes();
            for (int i = 0; i < priceStragetys.getLength(); i++) {
                Node curStragety = priceStragetys.item(i);
                NodeList stragetyInfo = curStragety.getChildNodes();
                for (int j = 0; j < stragetyInfo.getLength(); j++) {
                    Node node = stragetyInfo.item(j);
                    if (node.getNodeName().equals(stragety)) {
                        NodeList priceMeta = node.getChildNodes();
                        for (int k = 0; k < priceMeta.getLength(); k++) {
                            if (!priceMeta.item(k).getTextContent().trim().isEmpty()) {
                                priceMap.put(priceMeta.item(k).getNodeName(), Integer.parseInt(priceMeta.item(k).getTextContent().trim()));
                            }
                        }
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ParserConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (SAXException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return priceMap;
    }
}
