package TcsPaperPractices;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner scObj = new Scanner(System.in);
        int year = scObj.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It's leap year");
                }
                
                else{
                    System.out.println("It's not a Leap Year");
                }
            }
            scObj.close();
        }
            
            else{
                System.out.println("It's not a Leap Year");
            }
               
        
    }
}
