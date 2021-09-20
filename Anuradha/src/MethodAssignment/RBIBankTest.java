    import java.util.Scanner;
    class RBIBank{  //Base class

    double min_balance = 10000;
    double min_withdrawal_limit;
    double min_interest_rate;

    public double getInterestRate(){
        min_interest_rate = 4.0;
        return min_interest_rate;
    }

    public double setWithdrawalLimit(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Account type");
        String acc_type = sc.nextLine();
        sc.close();
        if(acc_type == "SAVINGS"){
        min_withdrawal_limit = 1000;
        }
        else{
            min_withdrawal_limit = 500;
        }
        return min_withdrawal_limit;
    }
}
class Customer{

    String name,address;
    int age;

    public void getCustomerDetails(){
        Scanner sc1  = new Scanner(System.in);
        System.out.println("Enter values for name, age ,address of customer");
        name = sc1.nextLine();
        age = sc1.nextInt();
        sc1.nextLine();
        address = sc1.nextLine();
        sc1.close();
    }
    public void printCusDetails(){
        System.out.println("Name , Age and Address of the Customer: "+name+",  "+age+",  "+address);
    }

}
class Account{
    double acc_number;
    String acc_holderName,acc_type;
    public void getAccountDetails(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter values for Account_Number , Account_HolderName , Account Type");
        acc_number = sc.nextDouble();
        sc.nextLine();
        acc_holderName = sc.nextLine();
        acc_type = sc.nextLine();
        sc.close();
    }
     public void printAccDetails(){
        System.out.println("Account holder's Name and  Number : "+acc_holderName+",  "+acc_number+",  "+acc_type);
    }

}
class ICICIBank extends RBIBank{

    public double setWithdrawalLimit(){
        return 600;
    }

    public double getInterestRate(){
        min_interest_rate = 3.0;
        return min_interest_rate;
    }

}
class SBIBank extends RBIBank{
    public double setWithdrawalLimit(){
        return 400;
    }

    public double getInterestRate(){
        min_interest_rate = 3.5;
        return min_interest_rate;
    }
}
class PNBBank extends RBIBank{
    public double setWithdrawalLimit(){
        return 300;
    }

    public double getInterestRate(){
        min_interest_rate = 2.5;
        return min_interest_rate;
    }
}

public class RBIBankTest{

    public static void main(String[] args) {
        Customer cusObj = new Customer();
        cusObj.getCustomerDetails();
        cusObj.printCusDetails();
        System.out.println("-------------------");
        Account  accObj = new Account();
        accObj.getAccountDetails();
        accObj.printAccDetails();
        System.out.println("-------------------");
        RBIBank rbiObj = new RBIBank();
        rbiObj.getInterestRate();
        rbiObj.setWithdrawalLimit();
        System.out.println("-------------------");
        SBIBank sbiObj = new SBIBank();
        System.out.println("Interest rate of SBIBANK is "+sbiObj.getInterestRate());
        System.out.println("Minimum withdrawal limit of SBIBank is  "+sbiObj.setWithdrawalLimit());
        System.out.println("-------------------");
        ICICIBank iciciObj = new ICICIBank();
        System.out.println("Interest rate of ICICIBANK is "+iciciObj.getInterestRate());
        System.out.println("Minimum withdrawal limit of ICICIBank is  "+iciciObj.setWithdrawalLimit());
        System.out.println("-------------------");
        PNBBank pnbObj = new PNBBank();
        System.out.println("Interest rate of PNBBANK is "+pnbObj.getInterestRate());
        System.out.println("Minimum withdrawal limit of PNBBank is  "+pnbObj.setWithdrawalLimit());
    }

}
