package method;
import java.util.Scanner;
public class BankClass {    
    public static void main(String[] args) {
        Account obj =new Account();
        Customer obj2 = new Customer();
        obj.getAccountDetails();
        obj.display();
        obj2.getName();
        obj2.display();
        SBI_Bank bankobj = new SBI_Bank();
        System.out.println("The SBI Bank's interest rate is: "+ bankobj.getInterestRate()+" & Withdrawal limit is : " + bankobj.getWithdrawalLimit());
        PNB_Bank bankobj1= new PNB_Bank();
        System.out.println("The PNB Bank's interest rate is: "+ bankobj1.getInterestRate()+" & Withdrawal limit is : " + bankobj1.getWithdrawalLimit());
    }
}
class RBI_Bank{
    double minInterestRate;
    double minBalance;
    double withdrawalLimit;

public double getInterestRate(){
    minInterestRate = 4.0d;
    return minInterestRate;
}
public double getWithdrawalLimit(){
    withdrawalLimit = 50000d;
    return withdrawalLimit;
}
}
class Account{
    long accNo;
    String accName, accType;
    void getAccountDetails(){
        System.out.println("Enter the details of the account holder: ");
        System.out.println("---------------------------------------");
        System.out.println("Account holder name: ");
        Scanner scan = new Scanner(System.in);
        accName=scan.nextLine();
        System.out.println("Account type: ");
        accType=scan.nextLine();
        System.out.println("Account No: ");
        accNo=scan.nextLong();  
        
    }
    void display(){
        System.out.println("The details of the Account: ");
        System.out.println("---------------------------");
        System.out.println("Account holder Name: "+ accName +"Account No: "+ accNo+"Account Type: "+ accType );
        
    }
}
class Customer{
    String name, address, bank_name;
    long phno;
    void getName(){
        System.out.println("Enter the details of the Customer: ");
        System.out.println("----------------------------------");
        System.out.println("Name: ");
        Scanner scan = new Scanner(System.in);
        name=scan.nextLine();
        System.out.println("Address: ");
        address=scan.nextLine();
        System.out.println("Bank_Name: ");
        bank_name=scan.nextLine(); 
        System.out.println("Contact-No: ");
        phno=scan.nextLong(); 
        SBI_Bank object = new SBI_Bank();
        PNB_Bank object2 = new PNB_Bank();
        switch(bank_name){
            case "SBI":
                System.out.println("The withdrawal limit is :" + object.getWithdrawalLimit()+"The interest rate is: "+ object.getInterestRate());
                break;
            case "PNB":
                System.out.println("The withdrawal limit is :" + object2.getWithdrawalLimit()+"The interest rate is: "+ object2.getInterestRate());
                break;
           default: System.out.println("Enter valid bank name:");
        }
    }
    void display(){
        System.out.println("The details of the Account: ");
        System.out.println("---------------------------");
        System.out.println("Customer Name: "+ name+ " Customer Address : "+ address+ " Customer phno: "+ phno +" Customer Bank-Name: "+ bank_name);
    }
}
class SBI_Bank extends RBI_Bank{
    public double getInterestRate(){
        double minInterestRate = 5.2d;
        return minInterestRate;
}
    public double getWithdrawalLimit(){
        double withdrawalLimit = 30000d;
        return withdrawalLimit;
}
}
class PNB_Bank extends RBI_Bank{
    public double getInterestRate(){
        double minInterestRate = 4.6d;
        return minInterestRate;
}
    public double getWithdrawalLimit(){
        double withdrawalLimit = 25000;
        return withdrawalLimit;
}
}

