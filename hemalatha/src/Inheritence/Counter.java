package Inheritence;

public class Counter {
    int i;
    void increment()
    {
        System.out.println("enter the value of  counter i="+i);
    }
}
class Small extends Counter{
    public static void main(String[] args) {
    Small obj = new Small();
    obj.increment();
    }
}




