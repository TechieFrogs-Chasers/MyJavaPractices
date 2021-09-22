package Practices;

import java.util.Scanner;

class Cartester {//class

    static String year;

    void year() {//methods
        System.out.println("Enter car year:");

    }

    public static void main(String[] args) {//main method
        Cartest objInstance = new Cartest();
        Scanner myScannerObj = new Scanner(System.in);
        objInstance.type();
        String type = myScannerObj.next();
        objInstance.speed();
        int speed = myScannerObj.nextInt();
        myScannerObj.close();

    }
}

public class ClassTestDemo {//Driver class - main method
    static String model;//Static variable
    int price = 70000;//Instance varaible
    int mileage = 100;

    public static void main(String[] args) {
        int Id = 9;
        Cartester obj = new Cartester();//class obj
        ClassTestDemo obj1 = new ClassTestDemo();//main class obj
        obj1.model = "Lexus";
        System.out.println("Mileage: " + obj1.mileage + " , " + "Cost: " + obj1.price + " , " + "Model: " + obj1.model + " , " + "Customer ID number: " + Id);

    }

}

