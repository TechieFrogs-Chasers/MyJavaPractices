class PurchaseItem {
    private String name;
    private double unitprice;

    public String getName() { // accessor
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitprice;
    }

    public void setUnitPrice(double unitprice) {
        this.unitprice = unitprice;
    }

    PurchaseItem() { // constructor
        this.name = "Dell";
        this.unitprice = 1000;
    }

    public double getPrice() { // method
        return unitprice;
    }
}

class WeighedItem extends PurchaseItem {
    private double weight;

    public double getWeight() {// accessor
        return weight;
    }

    public void setWeight(double weight) {// mutator
        this.weight = weight;
    }

    public WeighedItem(double weight) {// constructor
        this.weight = weight;
    }

    public double getPrice() {// method
        return weight * super.getPrice();
    }
}

class CountedItem extends PurchaseItem {
    private int quantity;

    public int getquantity() {// accessor
        return quantity;
    }

    public void setquantity(int quantity) {// mutator
        this.quantity = quantity;
    }

    public CountedItem(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return quantity * super.getPrice();
    }
}

public class Purchase {
    public static void main(String[] args) {
        WeighedItem objItem = new WeighedItem(70);
        System.out.println("weight:" + objItem.getWeight());
        System.out.println("Price:" + objItem.getPrice());
        System.out.println("Unitprice" + objItem.getUnitPrice());
        System.out.println();
        CountedItem objItem2 = new CountedItem(9);
        System.out.println("quantity" + objItem2.getquantity());
        System.out.println("unit price" + objItem2.getUnitPrice());
        System.out.println("Price" + objItem2.getPrice());
    }
}
