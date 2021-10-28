package BasicsAssignment.NumberPrograms;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number to verify whether it is prime or not ?:");
    int num = sc.nextInt();
    sc.close();
    for ( int i = 2 ; i < num/2; i++ ){
        if(num % i == 0){
         System.out.println("not a prime");
         break;
        }
        else
        System.out.println("prime");
    }
}
}
