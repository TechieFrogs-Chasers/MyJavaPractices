package Practices;

import java.util.Scanner;

class Cartest {

    // public String name;
    // public int age;

    void speed() {//method
        System.out.println("Enter your speed: ");
        Scanner myScannerObj = new Scanner(System.in);//Scanners
        int speed = myScannerObj.nextInt();

    }

    void type() {//method
        System.out.println("Enter car type:");
        Scanner myScannerObj = new Scanner(System.in);//Scanners
        String type = myScannerObj.next();
        myScannerObj.close();

    }
}

public class ClassTests {//Driver class
    static String model;
    int price = 90000;
    int mileage = 120;

    public static void main(String[] args) {
        int Id = 99;
        ClassTests obj1 = new ClassTests();//main class obj
        obj1.model = "Tesla";
        Cartest obj = new Cartest();//class obj
        obj.speed();//class call
        obj.type();//classs call
        System.out.print("Mileage: " + obj1.mileage + " , " + "Cost: " + obj1.price + " , " + "Model: " + obj1.model + " , " + "Customer ID number: " + Id);
        Cartester obj2 = new Cartester();
        obj2.condition();//other class called from different program
        obj2.year();//other programming class called
        // obj2.numberofowners(obj.name,obj.age);
        System.out.print("condition: " + obj2.condition + " , " + "year:" + obj2.year);
        System.out.println();
    }
}
