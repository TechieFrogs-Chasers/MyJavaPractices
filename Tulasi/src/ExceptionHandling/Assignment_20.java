package ExceptionHandling;

import java.util.Scanner;

public class Assignment_20 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int number;
        try{
            number=Integer.parseInt(scannerObj.next());
            System.out.println("Number :"+ number);
        }catch (NumberFormatException nfe){
            System.out.println(nfe);
        }finally {
            System.out.println("Final statement!");
        }

    }
}
