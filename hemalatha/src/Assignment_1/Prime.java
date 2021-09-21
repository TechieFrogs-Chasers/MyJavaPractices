package Assignment_1;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num=1,i=2;
        boolean condition = false;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        do{
            while(!sc.hasNext()){
                int val= sc.nextInt();
            }
            
           while(i<=num/2);
            {
             if(num%i==0){
                 condition=true;
             }
             i++;
            }
            if(!condition)
                System.out.println("this is prime number");
                else
                System.out.println("this is not a prime number");
                sc.close();

             
         
        
        


        
        
    }
    
}
