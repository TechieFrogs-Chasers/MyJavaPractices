package InterviewQuestion;

import java.util.Scanner;

public class WashinMachine {
    public static void main(String[] args) {
        System.out.println("Please enter the values in integer:");
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        if(input>0 && input<=2000){
            System.out.println("Time Estimated : 25 Minutes");}
            else if(input>2000 && input<=4000){
                System.out.println("Time Estimated : 35 Minutes");
            }
            else if(input>4000 && input<7000){
                System.out.println("Time Estimated : 35 Minutes");
            }else{
                System.out.println("Invalid Input");
            }

        

        
    }
    
}
