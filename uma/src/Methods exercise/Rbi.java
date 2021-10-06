public class Rbi {
     double interestRate;
     double minimumBlance;
     double withDrawalLimit;


     double getInterestRate(){
         return 10.0;
     }

     double getwithDrawal(){

        return 10.0;
     }

     double getminmumBalance(){
         return 10.0;
     }

    
     Rbi (double interestRate,double minimumBlance,double withDrawalLimit){

     }
     Rbi(){

     }
  
}
class Customer{

    String name;
    int age;
    String address;
    int ssn;

    void display(){
        System.out.println("customer name: "+name +"and age is "+age);
        System.out.println("SSN number is  "+ssn);
        System.out.println("address is  "+address);
    }

}
class Account{
    long accountNumber;
    int balance;

    void show(){
        System.out.println("account number is  "+accountNumber);
        System.out.println("balance in the account is  "+balance);
    }
}

class Sbi extends Rbi{

    Sbi(double interestRate,double minimumBlance,double withDrawalLimit){

        super(interestRate, minimumBlance, withDrawalLimit);
    }
    


}
class Icici extends Rbi{
    
   Icici(double interestRate,double minimumBlance,double withDrawalLimit){

    super(interestRate, minimumBlance, withDrawalLimit);
   } 




}
class Pnb extends Rbi{
   
    Pnb(double interestRate,double minimumBlance,double withDrawalLimit){

        super();
    }

    public static void main(String[] args) {

        Customer objCustomer = new Customer();
        objCustomer.display();

        Account objAccount = new Account();
        objAccount.show();
        
        Pnb obj = new Pnb(5/100, 1000, 500);
        obj.getInterestRate();


        Icici obj1 = new Icici(5/100, 1500, 1000);
         obj1.getminmumBalance();
        System.out.println(obj1);

        Sbi objsSbi = new Sbi(6/100, 2000, 1500);
        objsSbi.getwithDrawal();

    }


}
