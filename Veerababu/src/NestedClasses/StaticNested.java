package NestedClasses;

public class StaticNested {
    String name;
    int persons;
    public static int Addition(int x,  int y)
    {
        int z = x+y;
        return z;
    }
    static class InnerNested
    {
        void display()
        {
            System.out.println("Hello");
        }
        InnerNested()
        {
            System.out.println("In the Static Constructor");
        }
    }

    public static void main(String[] args) {
        InnerNested innerNested = new InnerNested();
        innerNested.display();
        StaticNested staticNested = new StaticNested();
        int result = StaticNested.Addition(5, 4);
        System.out.println("Results  "+" "+result);
    }
}
