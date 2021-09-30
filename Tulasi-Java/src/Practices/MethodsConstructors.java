package Practices;//Package

import java.util.Scanner;//Import scanner

class Example {//class

    void methodExample() {//default method
        System.out.println("Default method-void returns nothing!");
    }

    Example() {//Default Constructor-In above class
        System.out.println("Default Constructor!");
    }
}

public class MethodsConstructors {//Driver class
    int num;
    private char letter;

    MethodsConstructors(int number, char letters) {//Parameterized Constructor in driver class
        num = number;
        letter = letters;
        System.out.println("Enter your number " + number + "Enter a letter " + letters);
    }

    void methodExample(final Scanner scanner) {//
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter your age " + age + "Enter your name " + name);
        //return new Example(age,name);
    }

    public static void main(String[] args) {//main
        //int age ;String name;
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        Example obj = new Example();//class obj creation
        obj.methodExample();

        return ;
        //MethodsConstructors driverClassObj=new MethodsConstructors(myScannerObj );
    }
}
