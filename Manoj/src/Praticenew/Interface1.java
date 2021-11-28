package Praticenew;
interface InterfaceA{//create a interface 
    abstract void Interdis();
}
interface InterfaceB extends InterfaceA{
   abstract void Interdis2(); 
       default Interdis3(){
           System.out.println("maonj");
   }

}

public class Interface1 implements InterfaceB{
    public void Interdis(){
        System.out.println("1st interface ");

    }
    public void Interdis2(){
        System.out.println("2nd interface ");
    }
    public static void main(String[] args) {
        Interface1 obj=new Interface1();
        obj.Interdis();
        obj.Interdis2();
        obj.Inter
        
    }
    
}
