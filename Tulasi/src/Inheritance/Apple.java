package Inheritance;//Package

public class Apple {//Driver class
    int number_of_items=20;
}
class Banana extends Apple{//subclass
    int number_of_items=33;
    Banana(){//subclass constructor

    }
    public void show(){//subclass method
        System.out.println("Value of Bananas "+ number_of_items);
        System.out.println("value of apples "+ super.number_of_items);//with super keyword ,accessing variables from parent class
    }

    public static void main(String[] args) {//main method
        Banana myObj=new Banana();//instance for subclass
        myObj.show();//accessing method
    }
}
