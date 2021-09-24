import java.util.Scanner;
public class Facorial {
    public static void main(String[] args) {
         Scanner Factorial = new Scanner(System.in);
      /*   System.out.println("Print i value");
         int i = Factorial.nextInt();
         System.out.println("Print fact value");
         int fact = Factorial.nextInt();
         System.out.println("Print n value");
         int n = Factorial.nextInt();
         
         while(i<=n)
         {
            fact = fact*i;
            i++;
         }
         Factorial.close();*/

       //  for loop
       int i;
       int n;
       int fact;
       fact = Factorial.nextInt();
       n = Factorial.nextInt();
       for(i=1 ; i<=n ; i++)
            fact = fact*i;

            
            System.out.println("Facorial of Given number i is"+" "+ fact);
    }
}
