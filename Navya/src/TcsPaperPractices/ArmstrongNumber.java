package TcsPaperPractices;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter two numbers to find Sum of the Numbers");
        int n1 = scObj.nextInt();
        int n2 = scObj.nextInt();
        scObj.close();
        int rem, temp, total=0;
        if((n1<0)||(n1>n2)){
           System.out.println("Invalid input");}
        else if((n1>0)&&(n2>n1)){
           for (int i = n1; i <= n2; i++)
        {
           temp=i;
           total = 0;
           while(temp!=0)
           {
              rem=temp%10;
              temp=temp/10;
              total=total+(rem*rem*rem);
           }
           if(i==total)
           System.out.print( i + " is the Armstrong number in the given range. ");
        
     
        }
        }
 }
}
