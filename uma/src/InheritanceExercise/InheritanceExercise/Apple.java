package InheritanceExercise;

public class Apple {
   
    int number_of_items;
}
class Banana extends Apple{
    int number_of_items;

    Banana(){

    }

    void show(){
   System.out.println(this.number_of_items+"  "+this.number_of_items);
    }

    public static void main(String[] args) {
        
        Banana objbBanana = new Banana();
        objbBanana.show();
    }

}
