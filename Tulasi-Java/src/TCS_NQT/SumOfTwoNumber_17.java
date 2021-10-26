package TCS_NQT;

import java.util.Scanner;

public class SumOfTwoNumber_17 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter two numbers to find Sum of the Numbers");
        float n1 = scannerObj.nextFloat();
        float n2 = scannerObj.nextFloat();
        scannerObj.close();
        if(n1 < 0 || n2 < 0){
            System.out.println("Enter positive numbers");
        }
        else{
            sum(n1,n2);
        }
    }

    public static void sum(float n1,float n2){
        float sum = n1+n2;
        System.out.println("Sum of "+n1+" and "+n2+" is "+sum);
    }
}
