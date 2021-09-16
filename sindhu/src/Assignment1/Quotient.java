package Assignment1;

import java.util.Scanner;

/*public class Quotient {
    public static void main(String[] args) {
       // int a=4;
        //int b=8;
        //System.out.println(a/b);
        //System.out.println(a%b);
        Scanner s = new Scanner(System.in);
        System.out.println( "enter an integer :" );
        int a = s.nextInt();
        System.out.println( "enter an integer1 :" );
        int b = s.nextInt();
        System.out.println("quotient" + a/b);
        System.out.println("remainder" + a%b);

        s.close();


    }
    
}*/

public class Quotient{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        do{
            System.out.println("enter first number");
            while(!input.hasNextInt()){
                String s=input.next();
                System.out.println(s+"is not a valid number");
            }
            x=input.nextInt();
        }while(x<=0);

        int y;
        do{
            System.out.println("enter first number");
            while(!input.hasNextInt()){
                String s=input.next();
                System.out.println(s+"is not a valid number");
            }
            y=input.nextInt();
        }while(y<=0);
        System.out.println("quotient" + x/y);
        System.out.println("remainder" + x%y);
        input.close();
        
    }
}


