package edu.tw.tools;

import edu.tw.interfaces.dateTypeHandler;

/**
 * Created by davidshuvli on 2016/10/17.
 */
public class dateTypeTool implements dateTypeHandler {
    @Override
    public String getDateType(String week) {
        String dateType = "weekday";
        switch (week) {
            case "1" : dateType = "weekday";break;
            case "2" : dateType = "weekday";break;
            case "3" : dateType = "weekday";break;
            case "4" : dateType = "weekday";break;
            case "5" : dateType = "weekday";break;
            case "6" : dateType = "weekend";break;
            case "7" : dateType = "weekend";break;
        }
        return dateType;
    }
}
