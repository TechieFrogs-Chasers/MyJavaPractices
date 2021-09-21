package JavaBasicsAssignments;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        

        Scanner scannerObj = new Scanner(System.in);   
        
        int num;
        int sum=0;
        int digit;
         do{
             System.out.println("enter your number:");
 
            while(!scannerObj.hasNextInt() ){
             scannerObj.next();
 
                System.out.println("  is not a valid type");
           }
              num=scannerObj.nextInt();
           } while(num<=0);

        while(num>1){

         digit=num%10; //finds the last digit of the number

         sum=sum*10+digit;  //adding last digit of a number to the sum

         num=num/10;}

         System.out.print(sum);

         
         scannerObj.close();
        

    }
}
