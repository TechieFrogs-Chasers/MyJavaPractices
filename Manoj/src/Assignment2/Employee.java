package Assignment2;

public class Employee {
    int year;
    String name, address; //instance variables
    public static void main(String...args){
        System.out.println("name "+ " year "+ " address ");
        
        Employee s1=new Employee("robert",1994,"65d-wallstreet");//created the object  
        Employee s2=new Employee("sam ",2000,"96h-wallstreet ");
        Employee s3=new Employee("john ",1999," 53-wallstreet");

    }
    Employee(String n,int i,String a){
        year=i;
        name=n;
        address=a;
        System.out.println(name+" "+year+" "+address);
        
    }
    
    
}
