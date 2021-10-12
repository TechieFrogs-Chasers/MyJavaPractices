package TcsPaperPractices;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        int num ;
        int n = 10;
        Scanner scObj = new Scanner(System.in);
        do{ 
            System.out.println("Please Enter Positive number:");
            while (!scObj.hasNextInt()) {
                String input = scObj.next();
                System.out.println(input+ " This not an integer, Please enter valid integer");
                scObj.next();
            }
            num =scObj.nextInt();
        }while(num <= 0);
       int total = n - num; 
       if (num >= 1 && num <= 5){
           System.out.println("Number of candies sold out is " +num);
           System.out.println("Nuber of candies left out is "+total);
       }
       else {
           System.out.println("Number of candies sold out is invalid");
           System.out.println("Number of candies left out is "+n);
       }
       scObj.close();
    }
}
