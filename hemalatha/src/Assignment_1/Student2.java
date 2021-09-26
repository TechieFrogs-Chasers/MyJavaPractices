package Assignment_1;

public class Student2 {
    int rollno;
    int phonenumber;
    String address;
    String name;
    Student2(String name,int rollno,int phonenumber,String address)
    {
        this.rollno=rollno;
        this.phonenumber=phonenumber;
        this.address=address;
        this.name=name;

    }
    public static void main(String[] args) {
        Student2 obj1 = new Student2("apple",12,12345,"USA");
        Student2 obj2 = new Student2("mango",13,45678,"India");
        System.out.println(obj1.name+" "+obj1.rollno+" "+obj1.phonenumber+" "+obj1.address);
        System.out.println(obj2.name+" "+obj2.rollno+" "+obj2.phonenumber+" "+obj2.address);

    }
    
}
