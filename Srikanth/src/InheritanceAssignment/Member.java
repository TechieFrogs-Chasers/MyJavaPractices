package InheritanceAssignment;

public class Member {
    String name;
    int age;
    String phone_number;
    String address;
    float salary;

    public static void main(String[] args) {
        Employee empobj = new Employee();
        Manager manobj = new Manager();

        empobj.name = "Srikanth";
        empobj.age = 26;
        empobj.phone_number = "9951613066";
        empobj.salary = 35000;
        empobj.address = "india";
        empobj.printSalary();
        empobj.specialization = "Executive Manager.";
        System.out.println();

        manobj.name = "Srikanth";
        manobj.age = 26;
        manobj.phone_number = "9951613066";
        manobj.salary = 35000;
        manobj.address = "india";
        manobj.printSalary();
        manobj.department = "Sales Manager.";
        System.out.println();

    }

    void printSalary() {
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phone_number);
        System.out.println("Address: " + address);
        System.out.println("Salary of the member:" + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}
