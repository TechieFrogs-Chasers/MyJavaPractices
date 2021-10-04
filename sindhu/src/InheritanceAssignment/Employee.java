package sindhu.src.InheritanceAssignment;

public class Employee {
    
        String name = "sindhu";
        int Age = 24; 
    }
    
    class Manager{
        String name ="haya";
        int Salary = 23456;

        public static void main(String[] args) {
            Manager y = new Manager();
            System.out.println(y.name);
        }
    }


class Member extends Employee{
        String name;
        int Age1;
        int PhoneNumber;
        int Salary;
        int Address;

        void printSalary(){
            System.out.println("prints the salary of the members");
        }


        public static void main(String[] args) {
            Member x = new Member();
            System.out.println(x.Age);

        }


    }




   


    

