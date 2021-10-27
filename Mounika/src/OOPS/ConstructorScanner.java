package OOPS;

import java.util.Scanner;

public class ConstructorScanner{
    int num1;
    int num2;

    ConstructorScanner(int num1, int num2){// 1st constructor
        num1 = num1;
        num2 = num2;
        if(num1%2==0)
        System.out.println("Even");
        else{
        System.out.println("Odd");
        }
        for(num2=1;num2<=5;++num2){
            if(num2==2){
                //System.out.println("In if loop");
                //break;
                continue;
            }
            System.out.println(num2);
        }
    }
    ConstructorScanner(String name, int num1){// 2nd constructor for a class
        //this(num1, num2);// constructor chaining
        System.out.println("In 2nd constructor");
        System.out.println(name+" "+num1);
        System.out.println();
    }

    ConstructorScanner(){// constructor must not be static, final, abstract, synch

        System.out.println("Default constructor");
    }
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
            System.out.println("Enter value for num1");
            int num1 = scObj.nextInt();
            System.out.println("Enter value for num2");
            int num2 = scObj.nextInt();
            ConstructorScanner accObj= new ConstructorScanner(num1, num2);
            //scObj.Accesssmodifiers(num1, num2); we can not call a constrctor explicitly
            ConstructorScanner accObj1 = new ConstructorScanner("Mounika", 20);
            // we r not able to get num2 value from 1st constructor need to give the value here
            //System.out.println("Enter a name");
            //String name = scObj.next();
            //num2 = scObj.nextInt();
            //System.err.println();
            accObj1.write();// defaultmethod
            accObj1.write(20);// single paramter
            accObj.write(20, 2); // multiple parametre

    }
    protected void write(){
        System.out.println("In Wrtie method");

    }
    private void write(int k){
        System.out.println("In private accessmodifier Wrtie method");

    }
    public int write(int age, int name){
        ConstructorScanner accObj1 = new ConstructorScanner("Mounika", num2);
        accObj1.write(20);// we can call method inside a method if we have the instance of the class is there in the method
        System.out.println("In public accessmodifier Wrtie method");
       // return  (age, name); not accepted 
        return write (age, name);

    }


    
}
