package Practices;

class Car {//class
    int size;
    String model;

    void speed() {//method
        System.out.println("Speed of my car is 120KMPL");
    }

    void size() {
        System.out.println("X volume of size");
    }

    public static class ClassesDemo {//class
        int num;//variables declaration
        String name;//instance variable
        static String name1="Tested";

        void display() {//method
            System.out.println("Demo of classes");

        }

        public static void main(String[] args) {
            int i = 10;
            ClassesDemo demoobj = new ClassesDemo();//object (new),ClassesDemo(Constructors will call implicity while creating objects.To initialize some values we use constructor.If we dnt write any code is called as default constructor and complier take care of it and it will execute)
            demoobj.name="For testing";
            demoobj.name="Testing done";
            demoobj.name1="Test";

            Humanbeing testobj=new Humanbeing();
            testobj.descriptionPerson();
            System.out.println(Humanbeing.id);
            System.out.println(demoobj.name + " " +demoobj.name1+" " +demoobj.num + " " + i);
            demoobj.display();

            Car demo2 = new Car();
            demo2.speed();
            demo2.size();


        }

    }
}