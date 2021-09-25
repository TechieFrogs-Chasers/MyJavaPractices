package Assignment_1;

public class ConstructorDemo {  //driver class
    int age;
    String address;
    String name;
    int rollno;
    public ConstructorDemo()  //constructor with zero parameters
    {
        this(22);
        System.out.println("requirments");
    }
    private ConstructorDemo(int age) //constructor with one parameter
    {
        this(22 , "sweet");
        System.out.println("planning");
    }
    public ConstructorDemo(int age,String name)  //constructor with two parameters
    {
        this(22,"sweet","USA");
        System.out.println("testing");
    }
    protected ConstructorDemo(int age,String name,String address)  //constructor with three parameters
    {
        this(22,"Sweet","USA",512);
        System.out.println("devlopment");
    }
    public ConstructorDemo(int age,String name,String address,int rollno)  //constructor with four parameters
    {
        this.age=age;
        this.name=name;
        this.address=address;
        this.rollno=rollno;
        System.out.println("product");
    }
    public void display()  //method
    {
        System.out.println("age:"+age);
        System.out.println("name:"+name);
        System.out.println("address:"+address);
        System.out.println("rollno:"+rollno);
    }
}
    class Demo{     //another class
        int salary;
        String place;
        boolean value;
        Demo()
        {
            System.out.println("hello");

        }
        Demo(int salary,String name,boolean value)
        {
            this.salary=1245900;;
            this.place="india";
            this.value=true;
        }
        public void method()
        {
            System.out.println("salary:"+salary);
            System.out.println("place:"+place);
            System.out.println("value:"+value);
        }
    

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        obj.display(); //calling method
        Demo obj2 = new Demo();
        obj2.method();


    }
}
    




