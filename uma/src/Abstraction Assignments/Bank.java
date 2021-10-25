public abstract class Bank {

  abstract void getBalance();

    class BankA{

       int getBalance(){
        return 100;
       }
    }
    class BankB{

        int getBalance(){
            return 150;
        }
    }
    class BankC{
        int getBalance(){
            return 200;
        }
    }

    public static void main(String[] args) {
        Bank obj =new Bank(){
            void getBalance(){
                System.out.println("method in abstract");
            }
        };

        obj.getBalance();
        BankA obj1 = obj.new BankA();
        System.out.println(obj1.getBalance());

        BankB obj2 = obj.new BankB();
        System.out.println(obj2.getBalance());

        BankC obj3 = obj.new BankC();
        System.out.println(obj3.getBalance());
    }
    
}
