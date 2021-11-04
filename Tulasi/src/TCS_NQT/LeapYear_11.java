package TCS_NQT;

import java.util.Scanner;

public class LeapYear_11 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter year to check whether leap year or not");
        int year = scannerObj.nextInt();
        scannerObj.close();

        if(((year%4==0) && (year%100!=0)) || (year%400==0)){

            System.out.println("its a leap year");
        }
        else {
            System.out.println("its not a leap year");
        }
    }
}
