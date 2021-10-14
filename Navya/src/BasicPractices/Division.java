package BasicPractices;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
      /*  int i = 35;
        int j = 4;
        int Quotient = (i  / j);
        System.out.println(Quotient);
        int Remainder = (i % j);
        System.out.println(Remainder);*/
        Scanner div =new Scanner (System.in);
        System.out.print("i=" );

        int i = div.nextInt();
        System.out.println("j="  );
        int j = div.nextInt();
        int Remain = (i % j);
        div.close();
        System.out.println("Remainder=" + Remain);
        int Quot = (i / j);
        System.out.println("Quotient=" + Quot);
        

        
    }
    
}
