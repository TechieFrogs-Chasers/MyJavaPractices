package StaticAndInstance;
public class Try {
    public static void main(String[] args) {
    Counter obj = new Counter();
    System.out.println(obj.c);  

    obj.increment();
    obj.increment();
    obj.display();
    System.out.println(obj.name);  
    System.out.println(obj.c);  
    Counter obj1 = new Counter();
    obj1.increment();

    //System.out.println(obj.i);    
   
    }
}
class Counter{
     int c=1;
    String name="hi";
    public void increment(){
       String name="hello";
       int i=4;
        c++;
        i++;
        System.out.println("The value of c is:" +  c);
        System.out.println("The value of i is:" +  i);
        System.out.println("static name: " + name);
    }
    void display(){
        System.out.println("static name: " + name+ " c value is : "+c);
    }
}