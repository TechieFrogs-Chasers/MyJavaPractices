package sindhu.src.InheritanceAssignment;

public class Apple {
    int number_of_items = 10;
    
    
}

class Banana extends Apple{
    int number_of_items;

    void show(int K){
        this.number_of_items = K;

        System.out.println("number_of_items = " + K);

        System.out.println(super.number_of_items);

    }

    Banana(){
        
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Banana x = new Banana();
        x.show(6);
        
    
    }
}
