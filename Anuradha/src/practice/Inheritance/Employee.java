package Inheritance;

public class Employee {
 
    String name;
    int age;
    double salary;
    int a,b,sum;
    Employee(){
        System.out.println("Default Constructor in Employee");
        System.out.println("--------");
    }
    public void printData(){
       System.out.println("name: " + name);
       System.out.println("age: " + age);
       System.out.println("salary: " + salary);
    }

    public final void emp(){
        System.out.println("final method in Employee");
    }
 }
  
 
 