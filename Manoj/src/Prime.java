import java.util.Scanner;

public class Prime {
    public static void main(String...args){
        Scanner scanobj=new Scanner(System.in);
        Prime obj=new Prime();
        int num;

        do{
            System.out.println("enter the num");
            while(!scanobj.hasNextInt())
            {
                System.out.println("this is not a valid one ,please enter valid num");
                scanobj.next();
            }
            num=scanobj.nextInt();
        }while(num<=0);      
        scanobj.close();
        obj.check(num);//calling method 
    }
         void check(int num){
        if ((num%2==0)|| (num%4==0)||(num%6==0)||(num%5==0)||(num%7==0)||(num%9==0))
        {
            System.out.println("its not a prime number");
        }
        else
        {
            System.out.println(" this is a prime number");
        }

    }
    
}
