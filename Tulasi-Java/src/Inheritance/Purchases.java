package Inheritance;//Package

class PurchaseItem{//Superclass
    private String name;
    private double unitPrice;

    public String getName() {//getter for private string
        return name;
    }

    public void setName(String name) {//setter for private string
        this.name = name;
    }

    public double getUnitPrice() {//getter for private double
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {//getter for private double
        this.unitPrice = unitPrice;
    }

    PurchaseItem(){//constructor
        this.name="Wood";
        this.unitPrice=3.5;
    }
    public double getprice(){//method
        return unitPrice;
    }
}
class WeighedItem extends PurchaseItem{//subclass
   private double weight;

    public double getWeight() {//getter for private weight
        return weight;
    }

    public void setWeight(double weight) {//setter for private weight
        this.weight = weight;
    }
    public WeighedItem(double weight) {//Constructor
        this.weight = weight;
    }
    public double getprice() {//method
        return  weight* super.getprice();

    }
}
class CountedItem extends PurchaseItem{//subclass
    private int quantity;

    public int getQuantity() {//getter for private quantity
        return quantity;
    }

    public void setQuantity(int quantity) {//setter for private quantity
        this.quantity = quantity;
    }
    public CountedItem(int quantity) {//Constructor
        this.quantity = quantity;
    }
    public double getprice(){//method
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
