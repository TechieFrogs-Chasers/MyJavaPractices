package Assignment3;

public class Counter {
    int i=3;
    void increament(){
        System.out.println("i ="+i);

    }
    
}
class Counter2 extends Counter{
    public static void main(String...arg){
        Counter obj=new Counter();
        obj.increament();
    }


}
