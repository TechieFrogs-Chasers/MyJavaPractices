package Strings;//Package

import java.text.ParseException;//text date formate import
import java.text.SimpleDateFormat;//import dateformat
import java.util.Date;//import date

public class Assignment_3 {//Driver class
    public static void main(String[] args) throws ParseException {//main method
        String num="10 10 2021";//String literal
        Date date=new SimpleDateFormat("mm dd yyyy").parse(num);
        System.out.println(date);
    }
}
