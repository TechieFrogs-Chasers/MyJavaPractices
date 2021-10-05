package BasicPractices;
import java.util.Scanner;

public class  AdditionIntegers {
     public static void main(String[] args) {
       /* int i ,j , sum ;
         i=10;
         j=20;
         sum = i + j ;
         System.out.println("addition of two integers=" +sum);*/
         Scanner obj = new Scanner(System.in);
         System.out.println("nmbr1=" );
         int i = obj.nextInt();
         System.out.println("nmbr2=" );
         int j = obj.nextInt();
        int sum = i + j;
        obj.close();
        
         System.out.println("Sum=" +sum);
    }
        }