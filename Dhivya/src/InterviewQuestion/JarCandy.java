package InterviewQuestion;

import java.util.Scanner;

public class JarCandy{
    
    public static void main(String[] args) {
        int  N = 10;
        int  k =5;
       
        System.out.println("The maximum no of Candies in the Jar:" + N);
        System.out.println("Enter the no of candies you need:");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i<=0||i>=N) {
            System.out.println("Invalid Input "); 
    }
            else if(i>=k){
            System.out.println("The candies in the Jar must be refilled: " );
            }
        else if(i<k&&i<N)
        {
                k= N-i;
             System.out.println("The number of candies sold : " + i);
         System.out.println("The remaining candies in the Jar: "+ k);
        }
         
         scan.close();
        
}
}
