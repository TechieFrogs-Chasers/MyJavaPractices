package OopsPractices.InheritanceAssignment;
class Counter{
    int i ;
    void increment(){
        for (i =1 ; i < 3 ; ++i);
        System.out.println("print value of i = " +i);
    }
}
public class CounterIncrement extends Counter{
 public static void main(String[] args) {
     CounterIncrement obj = new CounterIncrement();
     obj.increment(); 
 }   
}      