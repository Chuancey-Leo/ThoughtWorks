package edu.tw.tools;

import edu.tw.interfaces.illegalHandler;
/**
 * Created by davidshuvli on 2016/10/18.
 */
public class illegalCheckTool implements illegalHandler{

    @Override
    public boolean checkDate(String date) {
        return true;
    }

    @Override
    public boolean checkTime(String time) {
        return true;
    }

    @Override
    public boolean checkCount(String num) {
        return true;
    }

    @Override
    public boolean checkInput(String input) {
        return true;
    }
}
