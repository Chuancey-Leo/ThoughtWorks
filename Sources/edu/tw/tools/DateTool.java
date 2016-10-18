package edu.tw.tools;

import edu.tw.interfaces.dateHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by davidshuvli on 2016/10/17.
 */
public class DateTool implements dateHandler {

    @Override
    public String getWeekDay(String sDate) {
        if("".equals(sDate)){
            return "";
        }
        SimpleDateFormat df = null;
        df = new SimpleDateFormat("yyyy-MM-dd");

        Date date   =   null;
        try   {
            date   =   df.parse(sDate);
        }   catch   (ParseException e)   {
            e.printStackTrace();
        }
        Calendar cd   =   Calendar.getInstance();
        cd.setTime(date);
        int   mydate   = cd.get(Calendar.DAY_OF_WEEK);
        String   showDate   =   "";
        switch   (mydate)   {
            case   1:
                showDate   =   "7";
                break;
            case   2:
                showDate   =   "1";
                break;
            case   3:
                showDate   =   "2";
                break;
            case   4:
                showDate   =   "3";
                break;
            case   5:
                showDate   =   "4";
                break;
            case   6:
                showDate   =   "5";
                break;
            default:
                showDate   =   "6";
                break;
        }

        return showDate;
    }
}
