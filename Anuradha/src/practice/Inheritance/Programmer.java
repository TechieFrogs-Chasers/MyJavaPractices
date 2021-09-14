package Inheritance;

public class Programmer extends Employee {
  
    String language;
    Programmer(){
        this(10,20);
        System.out.println("Default Constructor in Programmer");
        System.out.println("--------");
    }
    Programmer(int a ,int b){
        System.out.println("values of a and b in programmer is"+a+" "+b);
    }
    public void printData(){
       super.printData();
       System.out.println("language: " + language);
    }
    public static void Data(){
        System.out.println("Static method in programmer");
    }
 }