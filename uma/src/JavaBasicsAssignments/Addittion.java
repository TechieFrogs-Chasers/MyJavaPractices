package JavaBasicsAssignments;

import java.util.Scanner;

public class Addittion {
    public static void main(String[] args) {
        int first,second;
        Scanner Addtionobj = new Scanner(System.in);

        //validation for first integer

        do{
            System.out.println("Enter first  integer");

           while (!Addtionobj.hasNextInt() ){
               String input = Addtionobj.next();
               System.out.println(input+"  is not a valid type");
             }
             first = Addtionobj.nextInt();
           } while (first<=0);
    
        //validation for the second integer
        
           do{
            System.out.println("Enter second  integer");
           while (!Addtionobj.hasNextInt() ){
               String input = Addtionobj.next();
               System.out.println(input+"  is not a valid type");
             }
             second = Addtionobj.nextInt();
           } while (second<=0);
       
       int sum;
        sum = (first  +  second);

        System.out.println("Addition of these integers is:  "+ sum);
        
         //sum = Addtionobj.nextInt();
         System.out.println("Thank you");
        
        Addtionobj.close();
    }
}
