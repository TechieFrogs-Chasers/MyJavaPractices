package ClassesObjects;

public class Student {
  String name;
  int roll_no;
  long phone_number;
  String address;

    public static void main(String[] args) {
        Student obj=new Student();
        obj.name="John";
        obj.roll_no=2;
        obj.phone_number=9124578963L;
        obj.address="India";
        System.out.println("Name is " + obj.name +" and roll number is "+ obj.roll_no +". " + "Phone number -" + obj.phone_number+ " and his address -" +obj.address);

        Student obj1=new Student();
        obj1.name="Sam";
        obj1.roll_no=1;
        obj1.phone_number=3121452363L;
        obj1.address="USA";
        System.out.println("Name is " + obj1.name +" and roll number is "+ obj1.roll_no +". " + "Phone number -" + obj1.phone_number+ " and his address -" +obj1.address);

    }


}
