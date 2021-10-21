package Interfacefolder;
/* This pgm is to understand how a interface is used as a return type   */ 
public class ObjectInterface {
    public static void main(String[] args) {
        PhoneShop obj = new PhoneShop();
        Phone p1 = obj.getPhone();
        p1.call();
        p1.sms();  
    }   
}
interface Phone{
    void call();
    void sms();
}
class PhoneShop{
    public Phone getPhone(){
        Phone p1= new Phone(){
          public void call(){
             System.out.println("calling");
          }
         public void sms(){
             System.out.println("texting");
          }
        };
    return p1;  
    }
}   