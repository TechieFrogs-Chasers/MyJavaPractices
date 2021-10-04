package assignment3;

public class Seven {
    public static void main(String[] args) {
        Sub object = new Sub();
        object.subMethod();
    }

    
}
class Counter{
    int i;
    void increment(int i){
        this.i =i;
        System.out.println(" The vale of I is : " + i);

    }
}
class Sub extends Counter{
    void subMethod(){
        super.increment(5);
    }
}