package ClassesObjects;

import java.util.Scanner;

public class StudentPractice {

    int roll_no;
    String name;
    String address;
    long phone_no;

    public static void main(String[] args) {
        new StudentPractice("Sam", 1, "NY", (long) 3154789333l);
        new StudentPractice("John", 2, "Atlanta", (long) 3154789232l);

    }

    StudentPractice(String nam, int roll, String add, long phone) {
        name = nam;
        roll_no = roll;
        address = add;
        phone_no = phone;
        System.out.println("Name is " + name + " ,roll_number is " + roll_no + " ,address is " + address + " and Phone number is " + phone_no);
    }
}

