package sindhu.src.InheritanceAssignment;

public class PurchaseItem {
    private String name;
    private double unitPrice;

    PurchaseItem(String name, double UnitPrice){
        System.out.println(name);
        System.out.println(UnitPrice);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice
    }
}

class WeighedItem{
    private double weight;
}

class CountedItem{
    private int quantity;
}




public static void main(String[] args) {
        PurchaseItem x = new PurchaseItem("sindhu" , 5.0);
        x.setName("hanuman");
        x.setUnitPrice(6.54);
        System.out.println(x.getName());
        System.out.println(x.getUnitPrice());
        

}
    


    

