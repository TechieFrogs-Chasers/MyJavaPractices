package ClassesObjects;

import java.util.Scanner;

public class AverageClassObjects {//class
    int avg1, avg2, avg3;

    public static void main(String[] args) {//main method
        AverageClassObjects avg = new AverageClassObjects();//instance obj
        Scanner myScannerObj = new Scanner(System.in);//scanner
        System.out.println("Enter avg1 value : ");
        int avg1 = AverageClassObjects.validationNumber(myScannerObj);
        System.out.println("Enter avg2 value: ");
        int avg2 = AverageClassObjects.validationNumber(myScannerObj);
        System.out.println("Enter avg3 value: ");
        int avg3 = AverageClassObjects.validationNumber(myScannerObj);
        avg.cal(avg1, avg2, avg3);
        myScannerObj.close();//Scanner Closed

    }

    void cal(int ... args) {//method-by giving int ... args the method will accept no.of args .
        int average = (avg1 + avg2 + avg3) / 3;
        System.out.println("The average of 3 numbers is:" + average);
    }

    static int validationNumber(Scanner scanner) {//Scanner validation with method
        int num;
        do {
            System.out.println("Enter a positive number");
            while (!(scanner.hasNextInt())) {
                String input = scanner.next();
                System.out.println(input + "is not a vlaid number,Please enter valid number! ");
            }
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.println("Entered a positive number" + num);
        return num;//return should be the last statement,if u have conditions then we can give statements under return.

    }
}