package ClassesObjects;

public class StudentPractice {//class

    int roll_no;
    String name;
    String address;
    long phone_no;

    public static void main(String[] args) {//main
        new StudentPractice("Sam", 1, "NY", (long) 3154789333l);//obj for constructor
        new StudentPractice("John", 2, "Atlanta", (long) 3154789232l);//obj for constructor

    }

    StudentPractice(String nam, int roll, String add, long phone) {//constructor
        name = nam;
        roll_no = roll;
        address = add;
        phone_no = phone;
        System.out.println("Name is " + name + " ,roll_number is " + roll_no + " ,address is " + address + " and Phone number is " + phone_no);
    }
}

