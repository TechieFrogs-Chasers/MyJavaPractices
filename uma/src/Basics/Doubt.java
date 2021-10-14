

public class Doubt {
    String person="This person is";
    String adult="an adult.";
    
    int a=10; 
    public static void main(String[] args) {
    
      Doubt obj1=new Doubt();
      obj1.voting(); } 
  
      public  void voting(){ 
           
        if (a>=18) {
           System.out.println(person+"  "+adult);}
           
    else
    System.out.println("Not an adult");
        } 
        
    }

