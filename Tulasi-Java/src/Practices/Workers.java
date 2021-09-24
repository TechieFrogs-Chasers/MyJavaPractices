package Practices;

import java.util.Scanner;

public class Workers {//class
    int id;
    String name;
    char surname;
    static String companyname;//static method
    byte branches;//method

    static void staticMethod(Scanner myScannerObj) {//line 14
        System.out.println("Its Static method");
        companyname = myScannerObj.next();
    }

    void nonStaticMethod(Scanner myScannerObj) {//line 13
        System.out.println("Its non static method");
        branches = myScannerObj.nextByte();
    }
   //void methodParat
    Workers() {
        this("Sam", 'K');
        System.out.println("Its a default Constructor! ");
    }

    Workers(int i) {
        this( (byte)12,"Com");
        id = i;
        System.out.println("Id of the worker:" + id);
    }

    Workers(String nam, char surnam) {//no this(),so it printed as first constructoron line-33 , then it goes to this()with single parameterized constructor -
                                     //goes to line 22 and checks it shows int so goes to int parameterized constructor and prints line 30 and goes back and prints line 24.
        this(15);
        name = nam;
        surname = surnam;
        System.out.println("Enter worker name and surname char:" + name +"  "+ surname);
    }

    Workers(byte branch, String company) {
        branches = branch;
        companyname = company;
        System.out.println("Enter company name and branches: " + companyname +" "+ branches);

    }

    public static void main(String[] args) {//main method
        System.out.println("Worker!");//it prints first
        Scanner myScannerObj = new Scanner(System.in);
        Workers myObj = new Workers();//creating a instance obj -myObj for nonstatic
        myObj.nonStaticMethod(myScannerObj);//for non static method we must have instance obj
        Workers.staticMethod(myScannerObj);//for static we no need for instance obj ,but give Class name for best practice.

    }
}
