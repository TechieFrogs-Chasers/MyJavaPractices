package Assignment;
import java.util.Scanner;
public class Sumofnaturalnums {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        int num;
        int sum=0;
        int i;
        do{
            System.out.println(" enter the positive number");
            while(!object.hasNextInt())
            {
              System.out.println("this is not a number ,please enter a number ");
              object.next();
            }num=object.nextInt();
        }while(num<=0);
        object.close();
         for(i=1;i<=num;i++){
             sum=sum+i;
         }
         System.out.println("the sum of natural numbers is  "+ sum);
    }
    
}
