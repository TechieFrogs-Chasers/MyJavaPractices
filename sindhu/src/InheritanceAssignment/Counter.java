package sindhu.src.InheritanceAssignment;

public class Counter {
    int i;
    void Increment(int i){
      System.out.println("i=3");
    }
    
}

class subClass extends Counter{

    public static void main(String[] args) {
        subClass x = new subClass();
        x.Increment(3);

    


}
}
