  import java.util.Scanner;
    public class Ivalidation {
    
    public static void main(String... args){
        Scanner object= new Scanner(System.in); //created an object 
         int num;
         do {
             System.out.println("enter the positive number  ");
             while (!object.hasNextInt());    //here it checks the given value is number or not 
             {
                 System.out.println("this is not a number .please enter number ");
                 object.next();
             }
             num =object.nextInt(); //if the given value is number it checks here

            }while (num <=0); 

            System.out.println(" the entered number is : " + num); 
         object.close(); // finally we have close the object 

    }
}
