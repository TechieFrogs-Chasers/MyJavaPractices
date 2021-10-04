package NestedClasses;

public class NestedInner {
    String Resturant;
    int Persons;
    int Date;
    int Time;
    String Treat;

    void display()
    {
        System.out.println("Get Together");
    }
    private int date(int Day)
    {
        Date = Day;
        return Day;
    }

    class InnerNested{
        void display1()
        {
            System.out.println("From Nested Inner "+" "+Date);
        }
        protected String hi()
        {
            return Resturant;
        }
    }

    public static void main(String[] args) {
        
    NestedInner nestedInner = new NestedInner();
    int result = nestedInner.date(2);
    System.out.println("Date "+result);
    NestedInner.InnerNested innerNested = nestedInner.new InnerNested();
    innerNested.display1();
    String result1 = innerNested.hi();
    System.out.println("Return value  "+ result1);

    }

}
