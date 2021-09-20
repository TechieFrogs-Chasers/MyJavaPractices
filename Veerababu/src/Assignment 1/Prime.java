import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
         Scanner Prime = new Scanner(System.in);
        int i;
        int n;
         do
         {
             System.out.println("Find Prime Numbers");
            
             while(!Prime.hasNextInt())
             {  
                 Prime.next();
                 n = Prime.nextInt();
                 i = Prime.nextInt();
                 System.out.println("n  value in for loop");
                 if((n/i)!=0)
                 {
                 System.out.println("i value"+" "+i);
                 System.out.println("Given Number"+" "+i+" "+ "is  a Prime Number");
                // break;
                 }
                 else if((n/i)==0)
                 {
                 System.out.println("Given Number"+" "+i+" "+ "is not Prime Number");
                 }
                 else
                 {
                    System.out.println("Given Number"+" "+i+" "+ "is Invalid Number");
                 }
                
             }

             i = Prime.nextInt();
         }while(i<=9);
         Prime.close();

         System.out.println("Program Ended");
    }
}
