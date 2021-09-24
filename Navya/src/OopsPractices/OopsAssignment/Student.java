package OopsPractices.OopsAssignment;

public class Student {
    String name;
    int roll_no;
    long phn_no;
    String address;
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.name = "Sam";
        obj1.roll_no = 1;
        obj1.phn_no = 9655986688l;
        obj1.address = " India , Andra pradesh";
        obj2.name = "John";
        obj2.roll_no = 2;
        obj2.phn_no = 9776467895l;
        obj2.address = "India , Telangana";
        System.out.println("Name  " +obj1.name+" "+"Roll_Number  " +obj1.roll_no+" "+ " phnumber "+obj1.phn_no+" "+ " Address "+obj1.address);
        System.out.println("Name  " +obj2.name+" "+"Roll_Number  " +obj2.roll_no+" "+ " phnumber "+obj2.phn_no+" "+ " Address "+obj2.address);
    }
}
