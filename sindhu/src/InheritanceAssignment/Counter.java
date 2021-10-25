package sindhu.src.InheritanceAssignment;

public class Counter {
    int i;
    void Increment(int i){
      this.i = i;
      System.out.println("the value of i =  " + i);
    }
    
}

class subClass extends Counter{

    public static void main(String[] args) {
        subClass x = new subClass();
        x.Increment(3);

    


}
}
