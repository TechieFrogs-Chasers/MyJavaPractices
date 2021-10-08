package InheritanceAssignment;

 class Members {
    String name;
    int age;
    Long phNumbr ;
    String Address;
    double salary;
    void printSalary(){
        System.out.println("Name of the member : "+ name);
        System.out.println("Age of the member : "+ age);
        System.out.println("Phone Number is : "+ phNumbr);
        System.out.println("Address of the member : "+ Address);
        System.out.println("Salary of the member : "+ salary);
    }
}
class Employee extends Members{
    String specialization; 

}
class Manager extends Members{
    String department;
}
public class MembersDetails{
    public static void main(String[] args) {
        Employee empObj = new Employee();
        Manager managerObj = new Manager();
        empObj.name = "navya";
        empObj.age = 22;
        empObj.phNumbr = 9474837362l;
        empObj.Address = "India , Andhra Pradesh";
        empObj.salary = 398732f;
        empObj.specialization = "Developer";
        empObj.printSalary();

        managerObj.name = "Navya Pasumarthi";
        managerObj.age = 21;
        managerObj.phNumbr = 9846376376l;
        managerObj.Address = " India ,Telangana";
        managerObj.salary = 86467f;
        managerObj.department ="HR";
        managerObj.printSalary();
    }
}