package Assignment2;

public class Student {
    /*String name;
    int rollNumber;
    public static void main(String[] args) {
        Student studentObj = new Student();
        studentObj.name= "john";
        studentObj.rollNumber= 114;
        System.out.println("Student Name"+" "+studentObj.name+" "+"Roll Numberstudent"+" "+studentObj.rollNumber);
    }*/

    String name;
    int RollNumber;
    String Mobile;

    public static void main(String[] args) {
            Student studentObj = new Student();
            System.out.println("Student Name"+" "+studentObj.name);
            System.out.println("Student Roll Number"+" "+studentObj.RollNumber);
            System.out.println("Student Mobile"+" "+studentObj.Mobile);

    }
    Student()
    {
        name = "Veeru";
        RollNumber = 114;
        Mobile = "8341727692";
        System.out.println("Student Profile");
    }

}
