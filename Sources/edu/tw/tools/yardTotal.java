package edu.tw.tools;

import edu.tw.interfaces.yardCountStragety;

/**
 * Created by davidshuvli on 2016/10/17.
 */
public class yardTotal implements yardCountStragety {
    public int getYardCount (int M) {
        int T = M / 6;
        int X = M % 6;
        int place = 0;

        if (T == 0 && X < 4) {
            place = 0;
        } else if (T == 0 && X >= 4){
            place = 1;
        } else if (T == 1) {
            place = 2;
        } else if ((T == 2 || T == 3) && X >= 4) {
            place = T + 1;
        } else if (T > 3) {
            place = T;
        } else {
            place = T;
        }

        return place;
    }
}