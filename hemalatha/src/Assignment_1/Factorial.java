package Assignment_1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num1,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num1=sc.nextInt();
        int i=1;
        do{
            fact=fact*i;
            i++;
        }while(i<=num1);
        System.out.println("fact=" +fact);
        sc.close();


            
        
    }
             
}
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int i=1;
        for(int j=1;j<=number;j++)
        {
            i = j*i;
        }
        System.out.println("Factorial of " +number+"  is : "+i);
        
     }*/



    

