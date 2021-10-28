package BasicsAssignment.NumberPrograms;

import java.util.*;
public class SwapTwoNumbers {
    public static void main(String args[])
    {
        Scanner ab = new Scanner(System.in);
        // using temporary variable
        System.out.println("Enter values for A and B");
        int a = ab.nextInt();
        int b = ab.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println( " A = " + a  + " B = " + b);
      //without using temporary variable
        a = a+b;
        b = a - b;
        a = a - b ;
        System.out.println( " A = " + a  + " B = " + b);
        ab.close();
    }
    
}
