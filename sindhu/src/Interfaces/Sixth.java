package sindhu.src.Interfaces;

public interface Sixth {
    void hi();
    void hello();
}

interface Apple{
    void hi1();
    void hello1();
}

interface Banana{
    void hi2();
    void hello2();
}

interface Orange1 extends Banana,Apple,Sixth{

    void hi3();
    void hello3();

}

class Guava implements Orange1{

   public void hi2(){
        System.out.println("sindhu");
    }

    public void hello2(){
        System.out.println("haya");
    }

     public void hi1() {
        System.out.println("sindhu");
    }
       
    
 public void hello1() {
        System.out.println("haya");
        
    }

 public void hi() {
        System.out.println("sindhu");
    }
        
        
public void hello() {
        System.out.println("haya");
        
        
    }

public void hi3() {
        System.out.println("sindhu");
    }
        
        
public void hello3() {
        System.out.println("haya");
        
        
    }
}

class Promo extends Guava{

    void m1(String Sixth){
        System.out.println("a");
        

    }

    void m2(String Apple){
        
        System.out.println("b");
    }



    void m3(String Banana){
        System.out.println("c");

    }

    void m4(String Guava){
        System.out.println("d");

    }

public static void main(String[] args) {
    Promo x = new Promo();
    x.m1("sin");
    x.m2("dhu");
    x.m3("haya");
    x.m4("thi");

    
}
}
