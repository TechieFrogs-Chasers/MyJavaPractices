
import java.util.Scanner;

public class Evenorodd {
    public  static void main(String... args){

        Scanner object=new Scanner(System.in); // create an scanner object 
        int num;
        do{
            System.out.println(" enter the number :");
            while (!object.hasNextInt()); //here we checks the given value is number or not
            {
                System.out.println(" this is not a number ; please enter the number ");
                object.next();  
            } 
            num=object.nextInt();
        }while (num%2==0);
        System.out.println("the given number is even ");
        object.close();
        

        /* if (num%2==0){
             System.out.println("given number is even ");
         }else 
         System.out.println("given number is odd");*/


    }
}
