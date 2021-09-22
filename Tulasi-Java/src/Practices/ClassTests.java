package Practices;

import java.util.Scanner;

class Cartest {//class -Cartest
    static String condition;
    {
        condition="BrandNew";
    }


    void speed() {//method for speed
        System.out.println("Enter your speed: ");


    }

    void condition() {//method for condition
        System.out.println("Enter your vehicle condition:");
    }

    void type() {//method for type
        System.out.println("Enter car type:");

    }
}

public class ClassTests {//Driver class
    static String model;
    int price = 90000;
    int mileage = 120;



    public static void main(String[] args) {//main
        int Id = 99;
        ClassTests obj1 = new ClassTests();//main class obj
        Cartest obj = new Cartest();//class obj
        Cartester obj2 = new Cartester();
        obj1.model = "Tesla";
        Scanner myScannerObj = new Scanner(System.in);
        obj.speed();//class call
        int speed = myScannerObj.nextInt();
        obj.type();//classs call
        String type = myScannerObj.next();
        obj2.year();//other programming class called
        int year = myScannerObj.nextInt();
        System.out.println("Mileage: " + obj1.mileage + " , " + "Cost: " + obj1.price + " , " + "Model: " + obj1.model + " , " + "Customer ID number: " + Id);
        System.out.println("condition: " + obj.condition + " , " + "year:" + obj2.year);
        myScannerObj.close();
    }
}
