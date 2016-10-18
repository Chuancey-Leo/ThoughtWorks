package edu.tw.bookyard;

import edu.tw.interfaces.*;
import edu.tw.tools.*;
import edu.tw.config.*;

/**
 * Created by davidshuvli on 2016/10/17.
 */


public class HandleOrder {

    private boolean checkInput(String input) {
        illegalHandler ilh = new illegalCheckTool();
        return ilh.checkInput(input);
    }

    private String getplusMinus(int payOut, int getIn) {
        String plusMinus = getIn > payOut ? "+" : "-";
        plusMinus = getIn == payOut ? "" : plusMinus;
        return plusMinus;
    }

    private String getDateType(String date) {
        dateHandler dh = new DateTool();
        String week = dh.getWeekDay(date);
        dateTypeHandler dt = new dateTypeTool();
        String dateType = dt.getDateType(week);
        return dateType;
    }

    private int getUnitPrice(String dateType, String time) {
        unitPriceHandler up = new unitPriceTool();
        int unitPrice = up.getTimePrice(dateType, time);
        return unitPrice;
    }

    private int getYardCount(int bookCount) {
        yardCountStragety ycs = new yardTotal();
        int count = ycs.getYardCount(bookCount);
        return count;
    }

    public String generateSummary (String inputArray) {

        StringBuffer result = new StringBuffer("[Summary]\n\n");
        String[] input = inputArray.split("\n");
        int totalIncome = 0;
        int totalPayment = 0;
        int totalProfit = 0;
        for (String item : input) {

            if (!checkInput(item)) continue;

            String[] conditions = item.split(" ");
            String dateType = getDateType(conditions[0].trim());

            //
            int unitPrice = getUnitPrice(dateType, conditions[1]);
            int M = Integer.parseInt(conditions[2].trim());
            int place = getYardCount(M);
            //
            int payOut = 0;
            int getIn = 0;
            //
            if (place == 0) {
                getIn = 0;
                payOut = 0;
            } else {
                payOut = place * unitPrice;
                getIn = M * Config.costPer;
            }

            String profit = getplusMinus(payOut, getIn);

            result.append(conditions[0] + " " + conditions[1] + " +" + getIn + " -" + payOut + " " + profit + Math.abs(getIn - payOut) + "\n" );
            totalIncome += getIn;
            totalPayment += payOut;
            totalProfit += getIn - payOut;
        }

        result.append("\nTotal Income: " + totalIncome + "\n");
        result.append("Total Payment: " + totalPayment + "\n");
        result.append("Profit: " + totalProfit);


        return result.toString();
    }
}
