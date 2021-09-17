// package Assignment;
import java.util.Scanner;

public class Largestnum {
    public static void main(String...args){
        Scanner object=new Scanner(System.in); // object has created here 
                 System.out.println("enter the num1");
                 int num1=Largestnum.validatenumber(object); //though we have the static we can have the classname before validation  
 
                        System.out.println("enter the num 2 ");
                        int num2= Largestnum.validatenumber(object); // we need to pass the object in the validation 

                 System.out.println("enter the num3");
                 int num3= Largestnum.validatenumber(object);

        object.close(); // here we close the object 
        
        if (num1>num2 && num1>num3){
                     System.out.println(num1+ "its the greatest number");

            }else if(num2>num3 && num2>num1){
                     System.out.println(num2 + "its the greatest number");

            }else if(num3>num1 && num3>num2){
                     System.out.println(num3 + " its the greatest number ");

            }else 
                     System.out.println("all are equal ");
    }

       static int validatenumber(Scanner object){  //here we create a method with validate 
           int num;
        do {
                   System.out.println("enter the positive number ");
                   while(!object.hasNextInt()) //here it checks the value is number or not 
                    {
                        System.out.println("this is not a number .please enter a valid num ");
                          object.next(); //given value is not a num it goes again to while 

                    }num=object.nextInt();// if the given value is num 

                  } while(num<=0);
                  return num; //return is used to exit from a method with or without the value

                }

    }
      

