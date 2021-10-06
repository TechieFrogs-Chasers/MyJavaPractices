package Methods;//Package

public class Bank {//Driver class

    public int getBalance() {//method
        return 0;
    }

    static class BankA {//static firstclass
        int deposit = 1000;

        int getBalance() {//method
            return deposit;

        }
    }

    static class BankB {//static secondclass
        int deposit = 1500;

        int getBalance() {//method
            return deposit;
        }

    }

    static class BankC {//static thirdclass
        int deposit = 2000;

        int getBalance() {//method
            return deposit;
        }

    }

    public static void main(String[] args) {//main
        BankA bankAObj=new BankA();//Instance for firstclass
        BankB bankBObj=new BankB();//Instance for secondclass
        BankC bankCObj=new BankC();//Instance for thirdclass
        System.out.println("Money deposited in BankA is: " +"$"+ bankAObj.getBalance());
        System.out.println("Money deposited in BankB is: " +"$"+ bankBObj.getBalance());
        System.out.println("Money deposited in BankC is: " +"$"+ bankCObj.getBalance());

    }

}

