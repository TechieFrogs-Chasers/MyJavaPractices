public class Bank1{
static int getBalance(int amount){
    System.out.println("The balance amount in Bank : " + amount) ;
    return amount;
    }
    public static void main(String[] args) {
        //Bank1 obj = new Bank1();
        getBalance(0);
        BankA obj1 = new BankA();
        BankB obj2 = new BankB();
        BankC obj3 = new BankC();
        System.out.println("The balance amount in Bank A: " + obj1.getBalance(1000d));
        System.out.println("The balance amount in Bank B: " + obj2.getBalance(1500d));
        System.out.println("The balance amount in Bank C: " + obj3.getBalance(2500d));
    }
}
class BankA extends Bank1{
    double getBalance(double amount){
        return amount;
    }
}
class BankB extends Bank1{
    double getBalance(double amount){
        return amount;
    }
}
class BankC extends Bank1{
    double getBalance(double amount){
        return amount;
    }
}