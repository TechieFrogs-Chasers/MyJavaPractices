package ClassesObjects;

public class Student {
    int roll_no;
    String name;
    public static void main(String[] args) {
        new Student("John", 2);

    }

    Student(String nam, int roll) {
        name=nam;
        roll_no=roll;
        System.out.println("Name is " + name + " and roll number is " + roll_no + ". ");
    }
}
