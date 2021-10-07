package sindhu.src.Methods;

public class Bank {
    
    int getBalance(int i){
        System.out.println("getbalance" + 0);
        return 0;
        
    }
    }

class BankA extends Bank {
    int getBalance(int i, int j){
        System.out.println("bank a balance =" + 1000);
        return 1000;
        
    }
}


class BankB extends BankA{
    int getBalance(String name){
        System.out.println("balance" + 1500);
        return 1500;
    }
}

class BankC extends BankB{
    int getBalance(char ch){
        System.out.println("balance" + 2000);
        return 2000;
    }


    
    public static void main(String[] args) {
        
        BankC z = new BankC();
        z.getBalance('h');
        }

       
}




    

