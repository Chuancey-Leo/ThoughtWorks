package edu.tw.bookyard;

/**
 * Created by davidshuvli on 2016/10/17.
 */
public class Main {
    public static void main(String[] args) {

        String input =
                        "2016-06-02 20:00~22:00 7\n" +
                        "2016-06-03 09:00~12:00 14\n" +
                        "2016-06-04 14:00~17:00 22\n" +
                        "2016-06-05 19:00~22:00 3\n" +
                        "2016-06-06 12:00~15:00 15\n" +
                        "2016-06-07 15:00~17:00 12\n" +
                        "2016-06-08 10:00~13:00 19\n" +
                        "2016-06-09 16:00~18:00 16\n" +
                        "2016-06-10 20:00~22:00 5\n" +
                        "2016-06-11 13:00~15:00 11";

        HandleOrder ho = new HandleOrder();

        System.out.println(ho.generateSummary(input));
    }
}
