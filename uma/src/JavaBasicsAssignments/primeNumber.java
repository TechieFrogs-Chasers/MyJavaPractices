package JavaBasicsAssignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner  scannerObj =new Scanner(System.in);

        int num;
        
        do{
          System.out.println("Enter the number : ");
  
         while (!scannerObj.hasNextInt() ){
              scannerObj.next();
             System.out.println("  is not a valid number");
            }
            num = scannerObj.nextInt();
         } while (num<=0);

         if(num%2==0){
         System.out.println(num+ "  is not a prime nuber");

         if( num==1)
             System.out.println(num+ "  is not a prime number");
    
          }
         else
                System.out.println(num+"  is a prime  number");

         scannerObj.close();

    }
    
}
