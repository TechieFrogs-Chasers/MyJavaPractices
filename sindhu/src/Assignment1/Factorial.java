package Assignment1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int i,factorial=1,number;
        System.out.println("enter a number");
      
        
          number=sc.nextInt();

        
        for(i=1;i<=number;i++){
            factorial = factorial*i;

        
        System.out.println("factorial of the given number"+" "+factorial);
        sc.close(); 


        

    }
}
}
     

