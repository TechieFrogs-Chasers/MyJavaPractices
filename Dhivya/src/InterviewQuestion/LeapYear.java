package InterviewQuestion;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner obj = new Scanner(System.in);
        long year = obj.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It's leap year");
                }else{
                    System.out.println("It's not a Leap Year");
                }
            }
        }
            
            else{
                System.out.println("It's not a Leap Year");
            }
               
        
    }
}
