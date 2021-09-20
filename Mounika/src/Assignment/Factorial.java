package Assignment;
import java.util.Scanner;

public class Factorial {
    /*public static void main(String[] args) {
        Scanner factorialObj = new Scanner(System.in);
        int number = factorialObj.nextInt();
        factorialObj.close();
        int i=1;
        for(int j=1;j<=number;j++)
        {
            i = j*i;
        }
        System.out.println("Factorial of " +number+"  is : "+i);
        
     }*/


public static void main(String[] args) {
        Scanner factorialObj = new Scanner(System.in);
        System.out.println("Enter a value");
         int number = factorialObj.nextInt();
         factorialObj.close();
        int i=1;
        int j=1;
        while(j<=number)
        {
            i = i*j;
            j++;
        }
        System.out.println("Factorial of " +number+"  is : "+i);
    }
}
        
