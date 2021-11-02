package MethodAssignment;
class Bank{

    public int getBalance(){
        return 0;
    }

}
class BankA extends Bank{
    int deposit = 1000;
    public int getBalance(){
        return deposit;
    }

}
class BankB extends Bank{
   int deposit = 1500;
    public int getBalance(){
        return deposit;
    }

}
class BankC extends Bank{
    int deposit = 2000;
    public int getBalance(){
        return deposit;
    }

}





public class BankTest {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("Money deposited in BankA is: "+a.getBalance());
        System.out.println("Money deposited in BankB is: "+b.getBalance());
        System.out.println("Money deposited in BankC is: "+c.getBalance());
        
    }
}
