package Assignment1;

import java.util.Scanner;

/*public class Swaptwonumbers {
    public static void main (String[] args){
        int x,y,t;
        /* x=10;
        y=20;
         t=x;
        x=y;
         y=t;
        System.out.println(x);
        System.out.println(y); 
        System.out.println(t); */

        /*Scanner s  = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
         x = s. nextInt();
         y = s.nextInt();
         System.out.println("before swapping numbers: "+x +"  "+ y);  */
       //swapping 
       /*t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
       s.close();
}
    
}*/

public class Swaptwonumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t,x,y;
    do{
            System.out.println("enter first number");
            while(!input.hasNextInt())
            {
                String s=input.next();
                System.out.println(s+"is not a valid number");
            }
             x= input.nextInt();
       }while(x<=0);
    //System.out.println("first integer is:" +x);

    
    do
    {
            System.out.println("enter second number");
            while(!input.hasNextInt());
        {
            String s=input.next();
            System.out.println(s+"is not a valid number");
        }
        y= input.nextInt();
    }while(y<=0);

       //System.out.println("second integer is:   "+y);

     t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
       input.close();

    }
}
