import java.util.Scanner;

public class Prime {
    public static void main(String...args){
        Scanner scanobj=new Scanner(System.in);
       // Prime obj=new Prime();
        int num;
        int count=0;

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
    

    if (num>1)   //prime number should be greater than 1
    {
        for(int i=1;i<=num;i++) //number should only two factors 1& itself
        {
         if (num%i==0) //here it checking the factors or not
         {
           count++;    //count= factors if the count gets 2 it executes the next block
         }
        }
        if (count==2){
            System.out.println("its a prime");
        }
        else
        {
            System.out.println("its not a prime");
        }
    }
 }

 
}
