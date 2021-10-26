package OOPS;

public class Encapsulation {
    int i = 10;
    private String name = "Mounika";
    float f;
    public String getName(){
        return name;

    }
    public int getI(){
      return i;

    }
    public void nameSet(String name){
        this.name = name;
        

    }
    
   
            
}     
    
class MainClassNew{
    public static void main(String[] args) {
        Encapsulation enObj = new Encapsulation();
        System.out.println(enObj.getName());
        System.out.println(enObj.getI());
        enObj.nameSet("Mounika Madhu");
        System.out.println(enObj.getName());
        
    }

}  
   

