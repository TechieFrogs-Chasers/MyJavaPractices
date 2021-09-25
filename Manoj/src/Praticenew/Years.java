package Praticenew;
import java.util.Scanner;

public class Years {
    public static void main(String...args){
        Scanner obj=new Scanner(System.in);
        int num,year,week; 
        do{
            System.out.println("enter the value ");
            while(!obj.hasNextInt())
            {
                System.out.println("this is not a valid one please enter valid one");
                obj.next();
            }num=obj.nextInt();
        }while(num<=0);

        year=(num/365);
        week=((num%365)/7);
        System.out.println(year+"years"+" "+week+"weeks");
        obj.close();
    }
    
}
