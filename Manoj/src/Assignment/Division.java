package Assignment;
import java.util.Scanner;

public class Division {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        double d;
        System.out.println("enter the a value ");
        int a= Division.validatenumber(object);

        System.out.println("enter the b value");
        int b= Division.validatenumber(object);
        
        d=(a%b);
        System.out.println("division of numbers are  " + d);

       object.close();
    }
    
    static int validatenumber(Scanner object){
        int num;
        do{
            System.out.println("enter the positive number ");
            while (!object.hasNextInt())
            {
                System.out.println("this is not a number please a valid number ");
                object.next();
            }num=object.nextInt();
            while(num<=0);
            return num; //return is used to exit from the method 
        }
    }
    
}
