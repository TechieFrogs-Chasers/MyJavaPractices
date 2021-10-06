public class Banks {
    int getBalance(){

        System.out.println("no deposit");
        return 10;
    }
}
class BankA extends Banks{
    int getBalance(){
    int deposit=1000;
    System.out.println("$ "+deposit);
       return deposit; 
    }

}
class BankB extends Banks{
    int getBalance(){
        
            int deposit=1500;
            System.out.println("$ "+deposit);
               return deposit; 
        
    }

}
class BankC extends Banks{
    int getBalance(){
        
            int deposit=2000;
            System.out.println("$ "+deposit);
               return deposit; 
        
    }

    public static void main(String[] args) {
        Banks obj = new Banks();
        obj.getBalance();
        
        BankA objA = new BankA();
        objA.getBalance();


        BankB objB = new BankB();
        objB.getBalance();


        BankC objC = new BankC();
        objC.getBalance();




    }

}
