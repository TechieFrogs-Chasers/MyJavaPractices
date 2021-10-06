package Inheritance;//Package

class PurchaseItem{//Superclass
    private String name;
    private double unitPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    PurchaseItem(){
        this.name="Wood";
        this.unitPrice=3.5;
    }
    public double getprice(){
        return unitPrice;
    }
}
class WeighedItem extends PurchaseItem{
   private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public WeighedItem(double weight) {
        this.weight = weight;
    }
    public double getprice(){
        return  weight* super.getprice();
    }
}
class CountedItem extends PurchaseItem{
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public CountedItem(int quantity) {
        this.quantity = quantity;
    }
    public double getprice(){
        return  quantity* super.getprice();
    }
}

public class Purchases {//Driver class
    public static void main(String[] args) {//main method

        WeighedItem myObjWeight=new WeighedItem(50);
        myObjWeight.getWeight();
        myObjWeight.getUnitPrice();
        myObjWeight.getprice();
        System.out.println("Weight : " + myObjWeight.getWeight() );
        System.out.println("Unit price : " + myObjWeight.getUnitPrice());
        System.out.println("Price : " + myObjWeight.getprice());

        System.out.println();

        CountedItem obj1 = new CountedItem(25);
        obj1.getQuantity();
        obj1.getprice();
        obj1.getUnitPrice();
        System.out.println("Weight : " + obj1.getQuantity() );
        System.out.println("Unit price : " + obj1.getUnitPrice());
        System.out.println("Price : " + obj1.getprice());

    }
}
