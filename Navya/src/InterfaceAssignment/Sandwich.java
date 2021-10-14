package InterfaceAssignment;
interface FastFood{
    void maincourse();
    void staters();
    
}
public class Sandwich implements FastFood {

    
    public void maincourse() {
        System.out.println("Pizza , burgur , ChickenWings ");
    }
    public void staters() {
        System.out.println("French Fries , gobi ");
        
    }
    public static void main(String[] args) {
        
    Sandwich foodObj = new Sandwich();
    foodObj.maincourse();
    foodObj.staters();
    }
    
}
