package BasicsAssignment.NumberPrograms;

import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String args[])
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter values for A and B");
        int a = ab.nextInt();
        int b = ab.nextInt();
        System.out.println(" Quotient of A and B is " + (a/b));
        System.out.println(" Reminder of A and B is " + (a%b));
        ab.close();
    
}
    
}
