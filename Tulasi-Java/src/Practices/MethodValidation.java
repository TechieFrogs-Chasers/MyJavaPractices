package Practices;

import java.util.Scanner;

public class MethodValidation {

    public class Average {
        public static void main(String[] args) {
            Scanner myScannerObj= new Scanner(System.in);
            int num1=checkIntValues(myScannerObj);
            int num2=checkIntValues(myScannerObj);
            double num3=checkDoubleValues(myScannerObj);
            double num4=checkDoubleValues(myScannerObj);
            myScannerObj.close();
            int average=(int)(num1+num2+num3+num4)/4;
            System.out.println("The Average of entered numbers is: "+average);
        }
        static int checkIntValues(Scanner scanner){
            int number;
            do{
                System.out.println("Enter a Valid Number: ");
                while (!(scanner.hasNextInt())){
                    System.out.println("Please check the entered input again ");
                    scanner.next();
                }
                number=scanner.nextInt();
            }while(number<=0);
            return number;
        }
        static double checkDoubleValues(Scanner scanner){
            double number;
            System.out.println("Enter a Double Number: ");
            do{
                System.out.println("Enter a Valid Number: ");
                while (!(scanner.hasNextDouble())){
                    System.out.println("Please check the entered input again ");
                    scanner.next();
                }
                number=scanner.nextDouble();
            }while(number<=0);
            return number;
        }
    }
}
