import java.util.Scanner;

import Strings.String;

public class Palindrome {
    public static void main(String[] args) {
        int num,temp, y=0, reversenumber=0;
        Scanner scObj = new Scanner(System.in);
        do{
            System.out.println("Enter any number");
            while(!scObj.hasNextInt()){
                String str = scObj.next();
                System.out.println("Given number is not a vaild number.");
                System.out.println("Please enter any number");
            }
            num =scObj.nextInt();
            
        }while(num<=0);
        temp = num;
        System.out.println(num);
               while(num>0){
                   //input 151
                    //System.out.println(num);
                    //reversenumber = num%10;//1 //5
                    y = num%10;

                    //System.out.println(reversenumber);
                   // y = (y*10)+reversenumber;//y= 1
                    reversenumber = (reversenumber*10)+y;
                    num = num/10;//15
                    //System.out.println(y);
                   
                    
                }
                //System.out.println(y);
                //System.out.println(;
                if (reversenumber==temp){
                    System.out.println("Given Number is a Palindrome");
                }
                else{
                    System.out.println("Given Number is not a Palindrome");
                }
                scObj.close();
        
    }
}