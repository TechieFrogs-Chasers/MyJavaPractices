package TcsNqt;
 import java.util.Scanner;

public class Jar {
    
    public static void main(String...args){
        Scanner obj=new Scanner(System.in);
        int num, n=10;
        do{
            System.out.println("enter the value ");
            while(!obj.hasNextInt()){
                System.out.println("this is not a valid one ,please enter a valid one");
                obj.next();
            }num=obj.nextInt();
        }while(num<=0);

        if (num<=n){
            System.out.println("number of candies sold : "+ num);
            System.out.println("number of candies available : "+(n-num));
        }
        else if (num==0)
            {
             System.out.println("INVALID INPUT ");
             System.out.println("NUMBER OF CANDIES LEFT: "+n);
        }

    }
    
}
