package ClassesObjects;
import java.util.Scanner;

public class AddDistance {//class
    double inch;
    double feet;

    void data(Scanner myScannerObj) {//main
        System.out.println("Enter the Distance in Inch's :");
        inch = myScannerObj.nextDouble();
    }

    double inchToFeet() {//method
        feet = (0.0833 * inch);
        return feet;
    }

    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        AddDistance obj1 = new AddDistance();
        obj1.data(myScannerObj);
        AddDistance obj2 = new AddDistance();
        obj2.data(myScannerObj);
        double num = obj1.inchToFeet();
        double num1 = obj2.inchToFeet();
        double sumOfDistances = num + num1;
        System.out.println("Sum of Distances in Feet :" + sumOfDistances);
        myScannerObj.close();//Scanner closed

    }
}