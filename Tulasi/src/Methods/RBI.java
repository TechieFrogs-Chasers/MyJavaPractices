package Methods;//Package

import java.util.Scanner;

//Use polymorphism
class RBIBank {//Superclass
    double minimum_interest_rate;
    double minimum_balance_allowed;
    double minimum_withdrawal_limit;

    public double interest_rate() {//method
        minimum_interest_rate = 4.0;
        return minimum_interest_rate;
    }

    public double setWithdrawalLimit(Scanner myScannerObj) {//method

        System.out.println("Enter Account type");
        String acc_type = myScannerObj.nextLine();
        if (acc_type == "SAVINGS") {
            minimum_withdrawal_limit = 1000;
        } else {
            minimum_withdrawal_limit = 500;
        }
        return minimum_withdrawal_limit;
    }
}

class Customer {//class
    String name;
    String address;
    int age;

    public void getCustomerDetails(Scanner myCustomerScanner) {

        System.out.println("Enter name of the customer: ");
        name = myCustomerScanner.next();
        System.out.println("Enter address of the customer: ");
        address = myCustomerScanner.next();
        myCustomerScanner.nextLine();
        System.out.println("Enter age of the customer: ");
        age = myCustomerScanner.nextInt();

    }

    public void printCustomerDetails() {
        System.out.println("Name :" + name + " , " + "Age: " + age + " , " + "Address: " + address);
    }

}

class Account {//class
    long account_number;
    String account_holderName;
    String account_type;

    public void getAccountDetails(Scanner myAccountScanner) {

        System.out.println("Enter Account_Number: ");
        account_number = myAccountScanner.nextLong();
        myAccountScanner.nextLine();
        System.out.println("Enter Account_HolderName: ");
        account_holderName = myAccountScanner.nextLine();
        System.out.println("Enter Account Type: ");
        account_type = myAccountScanner.nextLine();
        System.out.println("Account holder name: " + account_holderName + "," + "Account holder number: " + account_number + "," + "Account type: " + account_type);

    }

    public void printAccountDetails() {
        System.out.println("Account holder name: " + account_holderName + "," + "Account holder number: " + account_number + "," + "Account type: " + account_type);
    }
}

class ICICIBank extends RBIBank {//extend class

    public double setWithdrawlimit() {
        return 700;
    }

    public double getInterestrate() {
        minimum_interest_rate = 2.5;
        return minimum_interest_rate;
    }
}

class SBIBank extends RBIBank {//extend class

    public double setWithdrawlimit() {
        return 500;
    }

    public double getInterestrate() {
        minimum_interest_rate = 3.5;
        return minimum_interest_rate;
    }
}

class PNBBank extends RBIBank {//extend class

    public double setWithdrawlimit() {
        return 600;
    }

    public double getInterestrate() {
        minimum_interest_rate = 3;
        return minimum_interest_rate;
    }
}

public class RBI {//Driver class

    public static void main(String[] args) {//main method
        Scanner sc = new Scanner(System.in);
        Customer myCustomerObj = new Customer();
        myCustomerObj.getCustomerDetails(sc);
        myCustomerObj.printCustomerDetails();
        System.out.println();

        Account myAccountObj = new Account();
        myAccountObj.getAccountDetails(sc);
        myAccountObj.printAccountDetails();
        System.out.println();

        RBIBank myRBIObj = new RBIBank();
        myRBIObj.setWithdrawalLimit(sc);
        myRBIObj.interest_rate();
        System.out.println();

        ICICIBank myICICIBankObj = new ICICIBank();
        System.out.println("Interest rate of ICICIBANK is " + myICICIBankObj.interest_rate());
        System.out.println("Minimum withdrawal limit of ICICIBank is  " + myICICIBankObj.setWithdrawalLimit(sc));
        System.out.println();

        SBIBank mySBIBankObj = new SBIBank();
        System.out.println("Interest rate of ICICIBANK is " + mySBIBankObj.interest_rate());
        System.out.println("Minimum withdrawal limit of ICICIBank is  " + mySBIBankObj.setWithdrawalLimit(sc));
        System.out.println();

        PNBBank myPNBBankObj = new PNBBank();
        System.out.println("Interest rate of ICICIBANK is " + myPNBBankObj.interest_rate());
        System.out.println("Minimum withdrawal limit of ICICIBank is  " + myPNBBankObj.setWithdrawalLimit(sc));
    }
}