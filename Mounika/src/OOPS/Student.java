package OOPS;

public class Student {
    static String address;// memory allocated in stack area
   String name;// memor allocated in heap area
    int roll_No;
    long phonenumber;

    public static void main(String[] args) {
       // String name;
        //int roll_No;
        /*long phonenumber;// local variables cannot call with the instance of the class
        we cannot use access modifiers for local variable */

        Student studentObj = new Student();// memory alloacation in heap area
        studentObj.name = "John";
        studentObj.roll_No = 2;
        studentObj.phonenumber = 9845641523l;
        Student.address ="D no: 5/84, near ramalaya, Kphb, Hyd";
        System.out.println("Name :"+studentObj.name+ " Roll_No : "+studentObj.roll_No+" Phone Number "+studentObj.phonenumber+" Address: "+address);
        Student studentObj1 = new Student();
        studentObj1.name = "Sam";
        studentObj1.roll_No = 3;
        studentObj1.phonenumber = 84512535654l;
        Student.address ="Kphb";
        System.out.println("Name :"+studentObj1.name+ " Roll_No : "+studentObj1.roll_No+ " Phone Number "+studentObj1.phonenumber+" Address: "+address);

    }
}
