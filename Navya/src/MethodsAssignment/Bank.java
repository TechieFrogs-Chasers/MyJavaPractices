package MethodsAssignment;
class BankA{
    int getBalance(int a){
        System.out.println("BankA Balnce is "+a);
        return a;
    }
}
class BankB{
    int getBalance(int b){
        System.out.println("BankB Balance is "+b);
        return b;
    }
}
class BankC{
    int getBalance(int c){
        System.out.println("Bankc Balance is "+c);
        return c;
    }
}
public class Bank {
    void getBalance(){
       System.out.println("Blance is 0"); 
    }
    public static void main(String[] args) {
        BankA aObj = new BankA();
        BankB bObj = new BankB();
        BankC cObj = new BankC();
        aObj.getBalance(1000);
        bObj.getBalance(1500);
        cObj.getBalance(2000);
    }
}
