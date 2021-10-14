public class Rbi {
     double interestRate;
     double minimumBlance;
     double withDrawalLimit;
     double balance = 5000;

     double getInterestRate(){
         return 4.0;
     }

     double getwithDrawal(){

        return 10.0;
     }

     double getminmumBalance(){
         return 10.0;
     }

     Rbi(){

     }
  
}
class Customer{

    String name;
    int age;
    String address;
    int ssn;

    void display(String name,int age,int ssn,String address){
        System.out.println("customer name: "+name +"   and age is "+age);
        System.out.println("SSN number is  "+ssn);
        System.out.println("address is  "+address);
    }

}

class Account extends Rbi{
    long accountNumber;
    

    void show(long accountNumber,double balance){
         
        System.out.println("account number is  "+accountNumber);
        System.out.println("balance in the account is  "+balance);
    }
}

class Sbi extends Rbi{

    Sbi(){

        super();
    }
    double getInterestRate(){
        return 4.0;
    }

    double getwithDrawal(){   
     return 1000.0;
    }

    double getminmumBalance(){
        return 2000.0;
    }

}
class Icici extends Rbi{
    
   Icici(){

    super();
   } 
  
    double getInterestRate(){
       
    return 5.0;
    }

    double getwithDrawal(){

     return 1500.0;
    }

    double getminmumBalance(){
     return 2500.0;
    }

}
class Pnb extends Rbi{
   
    Pnb(){

        super();
    }
    double getInterestRate(){
       
        return 6.0;
    }

    double getwithDrawal(){

       return 500.0;
    }

    double getminmumBalance(){
        return 3000.0;
    }

    public static void main(String[] args) {

        Customer objCustomer = new Customer();
        objCustomer.display("uma", 41, 3132313, "st.louis");
    
        Account objAccount = new Account();
        objAccount.show(100000l,6000);

        Rbi b = new Rbi();
       
         System.out.println("withdrawal limit in sbi is "+b.withDrawalLimit);
         System.out.println("minimum balance for sbi is  "+b.getminmumBalance());
         System.out.println("interest rate in sbi is  "+b.getInterestRate());

       Rbi a = new Rbi();
        System.out.println("withdrawal limit in icici is "+a.withDrawalLimit);
        System.out.println("minimum balance for icici is  "+a.minimumBlance);
        System.out.println("interest rate  for icici  "+a.getInterestRate());

       
        System.out.println("withdrawal limit in pnb is "+b.withDrawalLimit);
        System.out.println("minimum balance for pnb is  "+b.minimumBlance);
        System.out.println("interest rate in pnb is  "+b.getInterestRate());

    }


}
