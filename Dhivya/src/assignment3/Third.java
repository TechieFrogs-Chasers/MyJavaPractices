package assignment3;
/* example for hierarchial inheritance, member class is inherited by manager and employee class
*/

public class Third {
    public static void main(String[] args) {
        System.out.println(" The output for two subclasses:");
        Manager obj = new Manager("Mr.Karthik",35,75000,9944335678f,"7600 Silver Cir,Lincoln,NE-68506");
        Employee obj2 = new Employee("Mr.Ram", 25, 50000, 89097867443f, "3010,72nd st,Vandon,Ohio-78908");
    }
    
}
class Members{
    String name, address;
    int age, salary;
    float phno;

void printSalary(){
    System.out.println("the salary of the employee: " + salary);
}

}
class Manager extends Members{
    String department = "Technical";
    Manager(String name, int age, int salary, float phno, String address){
        super.name=name;
        super.age=age;
        super.salary=salary;
        super.address= address;
        super.phno=phno;
        System.out.println("Name: "+name+ "  Age: "+age+"  Contact No: "+ phno+"  Salary: "+salary+"  Address: "+ address+"  Department: "+department);

    }

}
class Employee extends Members{
    String specialization = "HR";
    Employee(String name, int age, int salary, float phno, String address){
    super.name=name;
        super.age=age;
        super.salary=salary;
        super.address= address;
        super.phno=phno;
        System.out.println("Name: "+name+ "  Age: "+age+"  Contact No: "+ phno+"  Salary: "+salary+"  Address: "+ address+"  Specialization: "+specialization);
    }
}