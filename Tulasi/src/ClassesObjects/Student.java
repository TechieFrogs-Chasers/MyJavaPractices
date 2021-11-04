package ClassesObjects;

public class Student {//class
    int roll_no;
    String name;
    public static void main(String[] args) {//main
        new Student("John", 2);//obj for constructor

    }

    Student(String nam, int roll) {//constructor
        name=nam;
        roll_no=roll;
        System.out.println("Name is " + name + " and roll number is " + roll_no + ". ");
    }
}
