package Inheritance;

public class Multilevel {
    int x = 10;
    int y = 15;
    void display()
    {
        System.out.println("Grand Father");
    }
}

    class Father extends Multilevel{
        int a;
        int b;
        void display1()
        {
        System.out.println(" Father");
       }
        static int Addition(int l, int m)
        {
            return l;
        }
    }
    class Children extends Multilevel{
        String name = "Children";
        void name()
        {
            System.out.println("Children");
        }

        public static void main(String[] args) {
            Father father= new Father();
            father.display();
            father.display1();
            Children children = new Children();
            children.display();
            children.name();
        }
    }

    

