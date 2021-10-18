
//package MethodAssignment;
import java.util.Scanner;

class RbiBank {
    double minimum_interest_rate;
    double minimum_balance_allowed;
    double maximum_withdrawal_limit;

    public double interestRate() { // method
        minimum_interest_rate = 4.0;
        return minimum_interest_rate;
    }

    public double setWithdrawlimit(Scanner sc) {
        System.out.println("Enter Account type:");
        String account_type = sc.nextLine();
        if (account_type == "Savings.") {
            maximum_withdrawal_limit = 10000;
        }
        return maximum_withdrawal_limit;
    }
}

class customer {
    String name;
    String address;
    int age;

    public void getCustomerDetails(Scanner cScanner) {
        System.out.println("Enter name of the customer;");
        name = cScanner.next();
        System.out.println("Enter address of the customer");
        address = cScanner.next();
        cScanner.nextLine();
        System.out.println("Enter age of the customer:");
        cScanner.nextInt();
    }

    public void CustomerDetails() {
        System.out.println("Name:" + name + ", Age:" + age + ", address:" + address);
    }
}

class Account {
    long account_number;
    String account_holderName;
    String account_type;

    public void getAccountDetails(Scanner aScanner) {
        System.out.println("Enter Account_Number: ");
        account_number = aScanner.nextLong();
        System.out.println("Enter Account_Holder:");
        account_holderName = aScanner.nextLine();
        System.out.println("Enter Account_type:");
        account_type = aScanner.nextLine();
        System.out.println("Account No:" + account_number + ", account_Holder:" + account_holderName + "account_type:"
                + account_type);

    }

    public void Accountdetails() {
        System.out.println("Account No:" + account_number + ", account_Holder:" + account_holderName + "account_type:"
                + account_type);
    }
}

class IcIcBank extends RbiBank {
    public double setWithdrawlimit() {
        return 1500;
    }

    public double getInterest_rate() {
        minimum_interest_rate = 2.5;
        return minimum_interest_rate;
    }
}

class SBI extends RbiBank {
    public double setWithdrawlimit() {
        return 300;
    }

    public double getInterestrate() {
        minimum_interest_rate = 3.5;
        return minimum_interest_rate;
    }
}

class PNBBank extends RbiBank {
    public double setWithdrawlimit() {
        return 400;
    }

    public double getInterest_rate() {
        minimum_interest_rate = 3;
        return minimum_interest_rate;
    }
}

public class Rbi { // driver class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customer cscanner = new customer();
        cscanner.getCustomerDetails(sc);
        cscanner.CustomerDetails();
        System.out.println();

        Account aScanner = new Account();
        aScanner.getAccountDetails(sc);
        aScanner.Accountdetails();
        System.out.println();

        RbiBank robj = new RbiBank();
        robj.interestRate();
        robj.setWithdrawlimit(sc);
        System.out.println();

        IcIcBank Iobj = new IcIcBank();
        System.out.println("Interest rate:" + Iobj.interestRate());
        System.out.println("Min withdrawal is:" + Iobj.setWithdrawlimit());
        System.out.println();

        SBI sobj = new SBI();
        System.out.println("Interest rate:" + sobj.interestRate());
        System.out.println("Min withdrawal:" + sobj.setWithdrawlimit());
        System.out.println();

        PNBBank pobj = new PNBBank();
        System.out.println("Interest rate:" + pobj.interestRate());
        System.out.println("withdrawal is:" + pobj.setWithdrawlimit());

    }
}
