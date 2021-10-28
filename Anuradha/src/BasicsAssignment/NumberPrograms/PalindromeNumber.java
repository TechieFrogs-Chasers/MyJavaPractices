package BasicsAssignment.NumberPrograms;

import java.util.Scanner;
public class PalindromeNumber {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number to test it is palindrome or not");
    int num = sc.nextInt();
    sc.close();
    int rev,temp,sum = 0;
    temp = num;
    while(num > 0){
        rev  = num % 10;
        sum = (sum * 10) + rev;
        num = num / 10;
    }
    if( temp == sum)
       System.out.println("palindrome");
    else
       System.out.println("Not a Palindrome");

}
}