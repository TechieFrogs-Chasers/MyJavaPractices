package InterviewQuestion;

import java.util.Scanner;

public class JarCandy{
    
    public static void main(String[] args) {
        int  N = 10;
       
        System.out.println("The maximum no of Candies in the Jar:" + N);
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i>N||i<=0) {
            System.out.println("Invalid Input ");  
        } 
    int k= N-i;
             System.out.println("The number candies sold : " + i);
         System.out.println("The remaining candies in the Jar: "+ k);
         
         scan.close();
        
}
}
