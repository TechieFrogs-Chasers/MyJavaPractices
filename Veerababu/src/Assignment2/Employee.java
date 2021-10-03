package Assignment2;

public class Employee {
   /* String name;
    int yoj;
    int salary;
    String Address;*/

    public void Employee1(String name,int yoj,int salary,String Address)
    {
        System.out.println("1st Employ Name:"+" "+name+" and "+"Year of Joining:"+" "+yoj+"  and "+"Salary:"+" "+salary+" "+"Address:"+"is "+Address);
       
    }
    public static void Employee2(String name,int yoj,int salary,String Address)
    {
        System.out.println("2nd Employ Name:"+" "+name+" and "+"Year of Joining:"+" "+yoj+"  and "+"Salary:"+" "+salary+" "+"Address:"+"is "+Address);
        
    }
    void Employee3(String name,int yoj,int salary,String Address)
    {
        System.out.println("2nd Employ Name:"+" "+name+" and "+"Year of Joining:"+" "+yoj+"  and "+"Salary:"+" "+salary+" "+"Address:"+"is "+Address);
        
    }

    public static void main(String[] args) {
        Employee employeeObj = new Employee();
        employeeObj.Employee1("Mahesh", 2015, 25000, "64-C Wall Street");
        Employee.Employee2("Pavan", 2016, 28000, "68D- Wall Street");
        employeeObj.Employee3("Sairam", 2019, 40000, "26B- Wall Street");
       
    }
}
