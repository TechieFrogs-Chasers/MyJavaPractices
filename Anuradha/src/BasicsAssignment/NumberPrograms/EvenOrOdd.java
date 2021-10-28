package BasicsAssignment.NumberPrograms;

import java.util.Scanner;
class EvenOrOdd{
     public static void main(String[] args) {
         Scanner ab = new Scanner(System.in);
         System.out.println("Enter a Number to test for even or Odd:");
         int a = ab.nextInt();
         EvenOROdd(a);
         //using terinary Operator
         String value = ((a % 2) == 0)? "EVEN" : " ODD" ;
         System.out.println(value);
         ab.close();  
    }     

    public static void EvenOROdd(int num) {
      if( num % 2 == 0)
         System.out.println("Entered Number is Even"); 
      else
         System.out.println("Entered NUmber is Odd");  
    }
   }