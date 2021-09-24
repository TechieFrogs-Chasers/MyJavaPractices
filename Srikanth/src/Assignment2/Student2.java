package Assignment2;

public class Student2 {

    int roll_no;
    long phone_number;
    String address;
    String student;

    public static void main(String[] args) {

        Student2 Object1 = new Student2();
        Student2 Object2 = new Student2();

        Object1.student = "sam";
        Object1.roll_no = 2;
        Object1.phone_number = 92035240000L;
        Object1.address = "india";

        Object2.student = "John";
        Object2.roll_no = 3;
        Object2.phone_number = 362452345324L;
        Object2.address = "Australia";

        System.out.println("Student1 name:" + Object1.student + ". Roll_no: " + Object1.roll_no);
    }

}
