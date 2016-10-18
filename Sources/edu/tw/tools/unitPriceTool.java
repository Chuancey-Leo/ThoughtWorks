package edu.tw.tools;

import edu.tw.interfaces.unitPriceHandler;

import java.util.HashMap;

/**
 * Created by davidshuvli on 2016/10/17.
 */
public class unitPriceTool implements unitPriceHandler {
    public int getTimePrice(String dateType, String time) {
        String filePath = "Resources\\unitPrice.xml";
        XmlImpl xml = new XmlImpl();
        HashMap<String, Integer> priceMap = xml.parserXml(filePath, dateType);
        String[] timeRange = time.split("~");
        String[] startRange = timeRange[0].split(":");
        String[] endRange = timeRange[1].split(":");
        int start = Integer.parseInt(startRange[0].trim());
        int end = Integer.parseInt(endRange[0].trim());
        int unitPrice = 0;
        for (int i = start; i < end; i ++) {
            unitPrice += priceMap.get("time_" + i);
        }

        return unitPrice;
    }
}