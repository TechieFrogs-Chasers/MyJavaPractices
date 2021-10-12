import java.util.Scanner;

public class Prime {
    
public static void main(String[] args) {
      
       Prime objPrime = new Prime();
    Scanner obj = new Scanner(System.in);
   
    int num=Prime.check(obj);
    
       obj.close();
       objPrime.checker(num);
}

     void checker(int  number){
         int count=0;
         if(number==1 || number==2)
         System.out.println("is a prime number");
         else
         for(int i=2;i<number;i++){
             if( number%i==0){
                 count++;
                 break;
             }
         }
         if( count==0)
         System.out.println("is a prime number");
         else
         System.out.println("is not a prime number");

         
     }

    public static int check(Scanner obj){
        int num;
        do{
            System.out.println("enter a valid  integer number:");
           while(!obj.hasNextInt() ){
               obj.next();
               System.out.println("not a valid  integer number");
             }
             num=obj.nextInt();
           } while(num<=0);
        return num;
    }














}
