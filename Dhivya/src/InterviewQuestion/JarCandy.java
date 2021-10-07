package InterviewQuestion;

import java.util.Scanner;

public class JarCandy {
    
    public static void main(String[] args) {
        int  N = 10;
        int k;
        System.out.println("The maximum no of Candies in the Jar:" + N);
        Scanner scan = new Scanner(System.in);
        int i;
        do{
            System.out.println("Enter the no of candies you need");   
            while(!scan.hasNextInt())
            {
                System.out.println("Enter valid no:");
                scan.nextInt();
            }
            i= scan.nextInt();
            }while(i<=0); 
        k= N-i;
        if (i>N) {
            System.out.println("Invalid Input ");  
        } 
        else 
         {
             System.out.println("The number candies sold : " + i);
         System.out.println("The remaining candies in the Jar: "+ k);
        }   
         scan.close();
    }
}
