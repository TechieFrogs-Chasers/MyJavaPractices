class Bike{
    String Brand;
    int speed;
    int km;

    void display(){
        System.out.println(Brand);
    }
    void display1(){
        System.out.println(speed);
    }
    public static void main(String[] args) {
        Bike bikeobj = new Bike();
        bikeobj.Brand = "Duke";
        bikeobj.speed = 40;
        bikeobj.display();
        bikeobj.display1();
        System.out.println("Bike");

        TestClass testobj = new TestClass();
        testobj.name = "Bullet";

        TestClass testobj1 = new TestClass();
        testobj1.name = "Bullet";

        TestObject test = new TestObject();
        test.Display();

        System.out.println(testobj.name+"  "+testobj1.name+" "+test.a+"  "+test.b);
    }

}



public class TestClass{
    int a;
    String name;
    public static void main(String[] args) {
        TestClass testobj = new TestClass();
        testobj.a = 10;
        testobj.name = "Audi";
        System.out.println(testobj.name+"  "+testobj.a);

        Bike bikeobj = new Bike();
        bikeobj.Brand = "Duke";
        bikeobj.speed = 40;
        bikeobj.display();
        bikeobj.display1();
        System.out.println("Bike");

        TestClass testobj2 = new TestClass();
        testobj2.name = "Bullet";

        TestClass testobj1 = new TestClass();
        testobj1.name = "Bullet";

        System.out.println(testobj2.name+"  "+testobj1.name);
    }
   
}