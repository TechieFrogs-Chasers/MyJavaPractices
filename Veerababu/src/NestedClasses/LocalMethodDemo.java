package NestedClasses;

public class LocalMethodDemo {
    int x = 10;
    int y = 15;

    LocalMethodDemo()
    {
        System.out.println("In the Constructor");
    }

    void display()
    {
        System.out.println("In the Method in main class");

                class MethoInnerDemo
                {
                    void Addition()
                    {
                        System.out.println("Addition  "+(x+y));
                    }
                    int Multi()
                    {
                        System.out.println("Multiplication  "+" "+(x*y));
                        return x*0;
                    }

                }
                MethoInnerDemo methoInnerDemo = new MethoInnerDemo();
                methoInnerDemo.Addition();;
                int result = methoInnerDemo.Multi();
                System.out.println("Multiplication  "+result);
    }
    public static void main(String[] args) {
        LocalMethodDemo localMethodDemo = new LocalMethodDemo();
        localMethodDemo.display();

    }

}
