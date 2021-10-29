package BasicsAssignment.NumberPrograms;

import java.util.Scanner;
public class SumOfNaturalNumbers {
 public static void main(String[] args) {
     System.out.println("Enter any number to find sum of all natural numbers");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     sc.close();
     int sum = 0 ,i = 0;
     //Using For
     for ( i = 0 ; i <= num ; i++)
     {
         sum = sum + i;
     }
     System.out.println(" sum of all natural numbers is :" + sum);
      
     //Using While
     while(i <= num){
        sum = sum + i;
        i++;
    }
    System.out.println(" sum of all natural numbers is :" + sum);
        
    }
    
}

