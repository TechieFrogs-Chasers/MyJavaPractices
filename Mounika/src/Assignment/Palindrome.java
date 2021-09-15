package Assignment;
import java.util.Scanner;

class Palindrome {  
   public static void main(String args[])  
   {  
      String Normal, reverse = ""; // Objects of String class  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      Normal = sc.nextLine();   
      int length = Normal.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + Normal.charAt(i);  
      if (Normal.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
         sc.close();
   }  
}  