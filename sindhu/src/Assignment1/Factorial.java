package Assignment1;

import java.util.Scanner;

/*public class Factorial {
    public static void main(String[] args){
        
        int i,fact=1;  
        int number=5;//It is the number to calculate factorial    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);  
        
       }  
 }*/

 /*public class Factorial{
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);  //using scanner method
         int i,fact=1;
         System.out.println("enter a number");
         
         int number = input.nextInt();
         input.close();
         for(i=1;i<=number;i++)
        {    
            fact=fact*i;    
        } 
        System.out.println("Factorial of "+number+" is: "+fact);
    

     }
     
    }*/

    public class Factorial{
        public static void main(String[] args) 
        {
            int i,fact=1;
            Scanner input = new Scanner(System.in);

            int number;
            do
            {
                System.out.println("enter a number");
                while(!input.hasNextInt())
                {
                    String x = input.next();
                    System.out.println(x+"is not a valid number");
                }
                 number = input.nextInt();
            } while(number<=0);
            input.close();
            for(i=1;i<=number;i++)
        {    
            fact=fact*i;    
        } 
        System.out.println("Factorial of "+number+" is: "+fact);
        }
    }


    
    





     

