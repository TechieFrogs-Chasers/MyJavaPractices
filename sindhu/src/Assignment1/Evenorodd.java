package Assignment1;
import java.util.Scanner;




public class Evenorodd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        //validation method
        do{
            System.out.println("Enter the number");

           while (!input.hasNextInt() ){

               String x = input.next();

               System.out.println(x+"  is not a valid type");
             }
             a = input.nextInt();

           } while (a<=0);
           String min = (a%2==0)? "even" : "odd";
        System.out.println(min);
        input.close();
           

        }
       /* int x=6;
        if(x%2==0){
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }*/
        

    
        /*Scanner s = new Scanner(System.in);
        System.out.println("enter x value");
        int x = s.nextInt();
        if(x%2==0){
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        s.close();*/

        //using Ternary operator

       /* Scanner s = new Scanner(System.in);
        System.out.println("enter x value");
        int x = s.nextInt();
        String min = (x%2==0)? "even" : "odd";
        System.out.println(min);
        s.close();*/





       

      

      
    }

    
    

