package JavaBasicsAssignments;

import java.util.Scanner;



public class OddEven {
    public static void main(String[] args) {
        
        int num;

        Scanner OddEvenobj = new Scanner(System.in);

        //validation for num

        do{
            System.out.println("Enter the number");

           while (!OddEvenobj.hasNextInt() ){

               String input = OddEvenobj.next();

               System.out.println(input+"  is not a valid type");
             }
             num = OddEvenobj.nextInt();

           } while (num<=0);
           System.out.println("number is  "+num);

             String n =  (num%2==0)? "even":"odd";

              System.out.println(n);
         
         System.out.println("Thank you");
      
           OddEvenobj.close();
    }
    
}
