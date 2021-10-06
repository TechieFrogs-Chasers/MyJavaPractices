package InheritanceExercise;

public class PurchaseItem {

   // private String name;
    private double unitPrice;


    PurchaseItem(){

        super();
    }
    
    public int getPrice( double w, int q){
        System.out.println(20.2* 2);
        return 10;
    }

    

    public double getunitPrice() {
        return this.unitPrice;
    }

    public void setunitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    
}
class WeighedItem extends PurchaseItem{

   private double weight;

    WeighedItem(){
    super();
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getPrice( double w, int q){
        System.out.println(20.2* 1);
        return 10;
    }

}
class CountedItem extends PurchaseItem{
    private int quantity;

    CountedItem(){

        super();
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPrice( double w, int q){
        System.out.println(20.2* 3);
        return 10;
    }

}
class Challenge{
    public static void main(String[] args) {
        WeighedItem objWeighedItem = new WeighedItem();
        objWeighedItem.getPrice(10, 2);

        CountedItem objCountedItem = new CountedItem();
        objCountedItem.getPrice(15, 5);
    }
}
