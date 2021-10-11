package sindhu.src.TCS;

import java.util.Scanner; 

public class PrimeNumber {
    
    

    
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to check whether it is prime or not");
            int num = sc.nextInt();
            sc.close();
            if( num < 0){
                System.out.println("Please enter positive number");
            }
            else{
                checkPrime(num);
            }
    }
    
     public static void checkPrime(int num){
         int count = 0;
         for(int i =2 ;i< num/2;i++){
             if(num % i == 0){
                 count++;
             }
         }
    
         if(count > 1){
             System.out.println("Given NUmber is not a prime Number");
         }
         else{
             System.out.println("Given Number is a prime Number");
         }
    
     }
    }

