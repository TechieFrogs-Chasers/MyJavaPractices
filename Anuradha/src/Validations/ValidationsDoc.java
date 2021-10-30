package Validations;
import java.util.Scanner;
public class ValidationsDoc {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int integerNumber = validateInt(scannerObj);
        System.out.println("entered number is :"+integerNumber);

        String name = validateString(scannerObj);
        System.out.println("Entered String is :"+ name);

        float floatNumber = validateFloat(scannerObj);
        System.out.println("Entered float value is :"+ floatNumber);

        double doubleNumber = validateDouble(scannerObj);
        System.out.println("Entered float value is :"+ doubleNumber);

    }

    public static double validateDouble(Scanner scannerObj) {
        double num;
        do{
            System.out.println("Enter a double Number");
            while(!scannerObj.hasNextDouble()){
                System.out.println("Not a double Number.Please enter a double Nnmber");
                scannerObj.next();
            }
            num = scannerObj.nextDouble();

        }while(num <= 0);
        return num;
    }

    public static float validateFloat(Scanner scannerObj) {
        float num;
        do{
            System.out.println("Enter a float Number");
            while(!scannerObj.hasNextFloat()){
                System.out.println("Not a float Number.Please enter a float Nnmber");
                scannerObj.next();
            }
            num = scannerObj.nextFloat();

        }while(num <= 0);
        return num;
    }

    public static String validateString(Scanner scannerObj) {
        String string;
        do{
            System.out.println("Please enter a string");
            while(!scannerObj.hasNext("[a-zA-z]*")){
                System.out.println("THis is not A string.Please enter a String");
                scannerObj.next();
            }
            string = scannerObj.nextLine();
        }while(string.equals(""));
        return string;
    }

    public static int validateInt(Scanner scannerObj) {
        int num;
      //  do{
            System.out.println("Enter a  number");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("This is not a number.Please enter a Number");
                scannerObj.next();
            }
           num = scannerObj.nextInt();
    //    }while(num <= 0);
        return num;
    }
   
    
}
