package assignment3;

public class Ten {
    public static void main(String[] args) {
        Banana obj = new Banana();
        obj.show();
    }
}
class Apple{
    int number_of_items =12;
}
class Banana extends Apple{
    int number_of_items=10;
    Banana(){

    }
    void show(){
        System.err.println(" The NO Of items in class Banana : "+number_of_items+" & class Apple:  " +super.number_of_items);

    }
}