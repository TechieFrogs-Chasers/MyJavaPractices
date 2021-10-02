//package Assignment1;

import java.util.Scanner;

/*public class GCDoftwonumbers {
    public static void main(String[] args) {
        
        int n1 = 81, n2 = 153;
    
        // initially set to gcd
        int gcd = 1;
    
        for (int i = 1; i <= n1 && i <= n2; ++i) {
    
          if (n1 % i == 0 && n2 % i == 0)
            gcd = i;
        }
    
        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }
    
}*/

//scanner method

/*public class GCDoftwonumbers {
    public static void main(String[] args) {
        int gcd=1;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();
        System.out.println("enter second number");
        int y = input.nextInt();
        for (int i = 1; i <= x && i <= y; ++i) {
    
            if (x % i == 0 && y % i == 0)
              gcd = i;
          }
      
          System.out.println("GCD of " + x +" and " + y + " is " + gcd);
          input.close();

    }
}*/

//validation method
public class GCDoftwonumbers {
    public static void main(String[] args) {
        int gcd=1,x,y;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("enter first number");
            while(!input.hasNextInt()){
                String s = input.next();
                System.out.println(s+"is not a valid number");
            }
            x=input.nextInt();
        } while(x<=0);

        do
        {
            System.out.println("enter second number");
            while(!input.hasNextInt())
            {
                String s = input.next();
                System.out.println(s+"is not a valid number");
            }
            y=input.nextInt();
        } while(y<=0);

        for (int i = 1; i <= x && i <= y; ++i)
        {
    
            if (x % i == 0 && y % i == 0)
              gcd = i;
        }
      
          System.out.println("GCD of " + x +" and " + y + " is " + gcd);
          input.close();




    }
}


