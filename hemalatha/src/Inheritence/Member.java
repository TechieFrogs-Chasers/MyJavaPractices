package Inheritence;

public class Member {
    int age,salary,phonenumber;
    String name,address;
    void printSalary()
    {
        System.out.println("salary of the members:");
    }

    class Employee extends Member{
        String specialization,department;
        void display(){
        System.out.println(name+ " "+age+ " "+salary+ " "+phonenumber+ " "+address);
        }
    }

    class Manager extends Member{
        String specialization,department;
        void display(){
            System.out.println(name+ " "+age+ " "+salary+ " "+phonenumber+ " "+address);
        } 
    }   

public static void main(String[] args) {
    Member mem = new Member();
    mem.printSalary();
    Employee emp = mem.new Employee();  // calling annoymus way
    emp.display();
    Manager member = emp.new Manager();
    member.display();
}


}
    




