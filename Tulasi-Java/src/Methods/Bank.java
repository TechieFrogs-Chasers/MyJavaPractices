package Methods;//Package

public class Bank {//Driver class

    public int getBalance() {//method
        return 0;
    }

    static class BankA {//static class
        int deposit = 1000;

        int getBalance() {//method
            return deposit;

        }
    }

    static class BankB {//static class
        int deposit = 1500;

        int getBalance() {//method
            return deposit;
        }

    }

    static class BankC {//static class
        int deposit = 2000;

        int getBalance() {//method
            return deposit;
        }

    }

    public static void main(String[] args) {//main
        BankA bankAObj=new BankA();
        BankB bankBObj=new BankB();
        BankC bankCObj=new BankC();
        System.out.println("Money deposited in BankA is: " +"$"+ bankAObj.getBalance());
        System.out.println("Money deposited in BankB is: " +"$"+ bankBObj.getBalance());
        System.out.println("Money deposited in BankC is: " +"$"+ bankCObj.getBalance());

    }

}

