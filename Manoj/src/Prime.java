import java.util.Scanner;

public class Prime {
    public static void main(String...args){
        Scanner scanobj=new Scanner(System.in);
       // Prime obj=new Prime();
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
    }
    
}
