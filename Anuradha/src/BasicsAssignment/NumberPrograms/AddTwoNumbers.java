package BasicsAssignment.NumberPrograms;

import java.util.*;
public class AddTwoNumbers { // Class Declaration
    public static void main(String[] args) //Main method Declaration
    {
        int sum; //variable declaration
        Scanner scannerObj = new Scanner(System.in); //Object Declaration
        System.out.println("Enter values for A and B");
        int a = AddTwoNumbers.validate(scannerObj); //Variable initialization along with validation
        int b = AddTwoNumbers.validate(scannerObj); //validate method call
        sum = add(a,b); //function call
        System.out.println("SUM OF A and B is "+ sum);
        scannerObj.close(); //OBject closing
    }
  static int add(int a ,int b) //add method definition
 {
   return a+b; //return statement
 }
    static int validate(Scanner scannerObj){ //validate method definition
        int num;
        do{
            System.out.println("Enter positive Number:");
            while(!scannerObj.hasNextInt()){
                System.out.println("This is not a Number.Please enter positive Number:");
                scannerObj.next();
            }
            num = scannerObj.nextInt();
        }while(num <= 0);
      return num;
    }
}
