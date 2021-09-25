package Assignment2;
import java.util.Scanner;

public class Averages {
    public static void main(String...args){
        Scanner obj=new Scanner(System.in);  //oject has created 
        System.out.println("enter the a value ");
        int a=Averages.validatenumber(obj);
        System.out.println("enter the b value ");
        int b=Averages.validatenumber(obj);
        System.out.println("enter the c value ");
        int C=Averages.validatenumber(obj);
        
        int average= ((a+b+C)/3);
        System.out.println("averages of three numbers  "+ average);
        obj.close();
    }
    static int  validatenumber (Scanner obj){ // we use the  validate method 
        int num;
        do{
            System.out.println("enter the positive number");
            while(!obj.hasNextInt())
            {
                System.out.println("this is not a number ,please enter a valid one ");
                obj.next();
            }num =obj.nextInt();
        }while(num<=0);
        return num;   //here we use  return to  close the method and 
    }
    
}
