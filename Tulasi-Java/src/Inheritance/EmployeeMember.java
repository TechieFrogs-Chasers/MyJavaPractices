package Inheritance;//Package

class Member{//Parent class
    //variables
    String name;
    byte age;
    String phoneNumber;
    String address;
    short salary;

    void printSalary(){//method in Parent class

        System.out.println("Print salary of the member: " + salary);
        System.out.println("Name of the member: "+ name);
        System.out.println("Age of the member: "+age);
        System.out.println("Address of the member: "+address);
        System.out.println("Phone number of the member: "+phoneNumber);
    }
}
class Employee extends Member{//Extended class for memeber
    String Specialization;//String datatype

}
class Manager extends Member{//Extended class for memeber
    String department;//String datatype
}

public class EmployeeMember {//Driver class
    public static void main(String[] args) {//main method
        Employee empObj=new Employee();//instance of employee class
        Manager magObj=new Manager();//instance of manager class
         //call employee variables
        empObj.name=" Krishna ";
        empObj.age= 24;
        empObj.phoneNumber="3564789412";
        empObj.address="Atlanta";
        empObj.salary=10000;
        empObj.printSalary();
        empObj.Specialization="Executive Manager";

        System.out.println();

        //call manager variables
        magObj.name="Rama";
        magObj.age=26;
        magObj.address="NY";
        magObj.salary=18000;
        magObj.phoneNumber="3526478911";
        magObj.printSalary();
        magObj.department="Sales";

    }
}
