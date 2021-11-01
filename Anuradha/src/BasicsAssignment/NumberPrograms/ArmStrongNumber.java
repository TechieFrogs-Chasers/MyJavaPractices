package BasicsAssignment.NumberPrograms;

import java.util.Scanner;
public class ArmStrongNumber {;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to test it is Armstrong or not");
        int num = sc.nextInt();
        sc.close();
        int rev,temp,n = 0;
        double sum = 0;
        temp = num;
        while(temp > 0)
        {
            temp /= 10;
            n++;
        }
        temp = num;
        while(temp > 0){
            rev  = temp % 10;
            sum = (Math.pow(rev,n) )+ sum;
            temp = temp / 10;
        }
        if( num == sum)
           System.out.println("Armstrong");
        else
           System.out.println("Not a Armstrong");
    
    }
    }
 