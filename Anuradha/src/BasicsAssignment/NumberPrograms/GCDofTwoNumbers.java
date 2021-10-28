package BasicsAssignment.NumberPrograms;
import java.util.Scanner;
public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers to find LCM");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int gcd = 1,i = 1,small;
        small = (num1 < num2) ? num1 : num2;  
        while( i <= small)
        {
            if(num1 % i == 0 && num2 % i == 0)
               gcd = i;
         i++;      
        }
        System.out.println("GCD of given numbers is "+gcd);
}
}
