package Constructs;

public class MyStudent {
    int a;
    int b;
    String name;
    public static void main(String[] args) {
        MyStudent myStudentObj = new MyStudent();
       // myStudentObj.a=10;
       // myStudentObj.b=10;
        System.out.println("1. Print Mystudent"+" "+(myStudentObj.a+myStudentObj.b));

        MyStudent myStudentObj1 = new MyStudent(50,50);
       // myStudentObj1.a=12;
        //myStudentObj1.b=14;
        System.out.println("2. Print Mystudent"+" "+(myStudentObj.a+myStudentObj.b)+" "+(myStudentObj1.a+myStudentObj1.b));
        System.out.println("3. Print Mystudent"+" "+(myStudentObj1.a+myStudentObj1.b));

            MyStudent myStudentObj2 = new MyStudent(12,14,"Hello World");
           // myStudentObj2.a=10;
           // myStudentObj2.b=10;
            System.out.println("4. Print Mystudent"+" "+(myStudentObj2.a+myStudentObj2.b)+ " "+myStudentObj2.name);

            Addition add = new Addition(15,15);
            System.out.println("Addition of Two Numbers"+" "+(add.i+add.j));

    }
    MyStudent()
    {
        a=10;
        b=12;
        System.out.println("In Default Constructor");
    }

    MyStudent(int a, int b, String s)
    {
        this.a=a;
        this.b=b;
        //a=a;  //local and instance variable
        //b=b;  // local and instance variable
        name=s;
        System.out.println("In Parameterised Constructor passing three arguments");
    }

    MyStudent(int i, int j)
    {
        a = i;
        b = j;
        System.out.println("In Parameterised Constructor");
    }
    
    
}

class Addition{
    int i;
    int j;
    public static void main(String[] args) {
        System.out.println("Addition of Two Integers");
        
    }
    Addition(int a, int b)
    {
        i=a;
        i=b;
    }
}
