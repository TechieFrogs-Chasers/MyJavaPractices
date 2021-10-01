package Assignment2;

public class Student {

    String name;
    int roll_no;

    public static void main(String[] args) {

        new Student(2, "John");

    }

    Student(int i, String s) {
        roll_no = i;
        name = s;
        System.out.println("Student name is " + s + ". Roll_no is " + i + ".");
    }

}