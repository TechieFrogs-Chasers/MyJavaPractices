package Assignment2;

import java.util.*;

public class Employee {
    String name;
    int year;
    String address;

    public static void main(String[] args) { // main class
        Scanner eScanner = new Scanner(System.in); // scanner- input from user

        Employee employee = new Employee(); // employee 1 instance created
        employee.information(eScanner); // employee 1 information-input

        Employee employee2 = new Employee(); // employee 2 information - input
        employee2.information(eScanner);

        Employee employee3 = new Employee(); // employee 3 information -input
        employee3.information(eScanner);

        System.out.println("Name         Year        Adress"); // this displays as according to the question
        employee.display();
        employee2.display();
        employee3.display();

        eScanner.close();
    }

    void information(Scanner eScanner) { // method to take input from user's information
        System.out.println("Enter Employee name:");
        name = eScanner.next();
        System.out.println("Enter Employee joining year:");
        year = eScanner.nextInt();
        System.out.println("Enter Employee address: ");
        address = eScanner.next();
    }

    void display() { // method - each time you enter the details
        System.out.println(name + "      " + year + "     " + address); // they store in each of the values.
    }
}
