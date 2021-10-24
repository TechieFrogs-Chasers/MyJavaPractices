package JavaBasicsAssignments;

import java.util.Scanner;

public class addition{

 void display(){
   System.out.println("test");
 }




    public static void main(String[] args) {
        int first,second;
        Scanner scannerobj = new Scanner(System.in);

        //validation for first integer

        do{
            System.out.println("Enter first  integer");

           while (!scannerobj.hasNextInt() ){
               scannerobj.next();
               System.out.println("  is not a valid type");
             }
             first = scannerobj.nextInt();
           } while (first<=0);
    
        //validation for the second integer
        
           do{
            System.out.println("Enter second  integer");
           while (!scannerobj.hasNextInt() ){
               scannerobj.next();
               System.out.println("entered value  is not a number");
             }
             second = scannerobj.nextInt();
           } while (second<=0);
       
       int sum;
        sum = (first  +  second);

        System.out.println("Addition of these integers is:  "+ sum);
        
         //sum = Addtionobj.nextInt();
         System.out.println("Thank you");
        
         scannerobj.close();
    }
}
