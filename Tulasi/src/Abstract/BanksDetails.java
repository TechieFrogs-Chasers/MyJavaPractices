package Abstract;//Package

abstract class Bank {//Abstract class
    abstract int getBalance();//abstract method ,method should not have body
}

class BankA extends Bank {//First Subclass
    int getBalance() {//method with retuen type int
        return 100;
    }
}

class BankB extends Bank {//Second subclass
    int getBalance() {//method with retuen type int
        return 150;
    }
}

class BankC extends Bank {//Third subclass
    int getBalance() {//method with retuen type int
        return 200;
    }

}

public class BanksDetails {//Driver class
    public static void main(String[] args) {//main method
        BankA bankAObj=new BankA();//Instance for first subclass
        BankB bankBObj=new BankB();//Instance for second subclass
        BankC bankCObj=new BankC();//Instance for third subclass
        System.out.println("Deposite in Bank A : "+ bankAObj.getBalance());
        System.out.println("Deposite in Bank B : "+ bankBObj.getBalance());
        System.out.println("Deposite in Bank C : "+ bankCObj.getBalance());
    }
}
