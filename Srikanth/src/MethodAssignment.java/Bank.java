//package MethodAssignment;
public class Bank {
    public static void main(String[] args) {
        BankA A = new BankA();
        BankB B = new BankB();
        BankC C = new BankC();

        System.out.println("Money deposited at first:" + A.deposit);
        System.out.println("Money deposited at first:" + B.deposit);
        System.out.println("Money deposited at first:" + C.deposit);
    }

    public int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    int deposit = 1000;

    public int getBalance() {
        return deposit;
    }
}

class BankB extends Bank {
    int deposit = 1500;

    public int getBalance() {
        return deposit;
    }
}

class BankC extends Bank {
    int deposit = 2000;

    public int getBalance() {
        return deposit;
    }
}
