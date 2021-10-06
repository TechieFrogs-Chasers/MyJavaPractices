package Inheritance;//package

public class Counter {//Driver class
    int i;//variables

   public void increment(int i) {//method
        System.out.println("i="+ i);
    }
}

 class CounterClass extends Counter{//subclass extends super class
    public static void main(String[] args) {//main method
        CounterClass myObj=new CounterClass();//subclass instance
        myObj.increment(3);//call method

    }
}
