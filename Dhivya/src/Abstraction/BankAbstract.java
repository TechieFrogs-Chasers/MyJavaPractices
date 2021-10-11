package Abstraction;
public class BankAbstract {
    public static void main(String[] args) {
        BankA obj1 = new BankA();
        obj1.getbalance();
        BankB obj2 = new BankB();
        obj2.getbalance();
        BankC obj3 = new BankC();
        obj3.getbalance();
    }
    
}
abstract class Bank{
    int banka = 100;
    int bankb = 150;
    int bankc = 200;
    abstract void getbalance();
    }
class BankA extends Bank{
    @Override
    void getbalance() {
        System.out.println("The balance is :" + banka);
    }
}
class BankB extends Bank{

    @Override
    void getbalance() {
        System.out.println("The balance is :" + bankb);
        
    }   
}
class BankC extends Bank{

    @Override
    void getbalance() {
        System.out.println("The balance is :" + bankc);
        
    }
    
}