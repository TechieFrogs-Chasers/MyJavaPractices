package assignment3;

public class PurchaseItems{
    private String name;
    private double unitprice;
    PurchaseItems(String name, double unitprice){
        this.name=name;
        this.unitprice=unitprice;
    }
    public double getPrice(){
        return unitprice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitprice() {
        return this.unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }   
}
class WeighedItem extends PurchaseItems{
    WeighedItem(){

    }

}
class CountedItem extends PurchaseItems{
    CountedItem(){

    }

}
public class Challenge