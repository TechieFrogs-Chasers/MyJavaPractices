import java.util.Scanner;
public class Lcm {
      public static void main(String[] args) {
          int a ;
          int b;
          int i;
          int GCD ;
          int LCM;
          int x;
          Scanner Lcm = new Scanner(System.in);
          System.out.println("a value");
         
          System.out.println("b value");
          

          
          
          do
        {
            System.out.println("L.C.M of Two Nunmbers");
            a = Lcm.nextInt();
            b = Lcm.nextInt();
            GCD = (a<b) ? a : b;
            for( i=1; i<=a ; i++);
              
               
               if(a%i==0 && b%i==0);
               {
                LCM = ((a*b)/GCD);   
                System.out.println("L.C.M of Two Numbers"+"is"+" "+LCM);
                   
               }
               x = 10;

        }while(x<=20);
    }
   
}
