package Practices;

interface Employees {//Interface -Parent class

     void Employee_Job_Type();

    interface Emloyee_area {//inner interface
        default void Employee_area() {

        }
    }
}

class Full_Time_Employees implements Employees.Emloyee_area {//interface.inner interface
    @Override
    public void Employee_area() {
        Employees.Emloyee_area.super.Employee_area();
        System.out.println("Full time employess");
    }
}

class Part_Time_Employees implements Employees.Emloyee_area {//class -2


    @Override
    public void Employee_area() {
        Employees.Emloyee_area.super.Employee_area();
        System.out.println("Part time employess");
    }
}

class Employee_Details {//class
    Employees.Emloyee_area Emp;//Interface reference

    Employee_Details(Employees.Emloyee_area Emp) {//Constructor(Interface ref)
        this.Emp = Emp;
    }

    void method() {//method
        System.out.println("Employee_Details");
       // Emp.Employee_Job_Type();
        Emp.Employee_area();
    }

}

public class Employee_Upcasting {//driver class

    public static void main(String[] args) {//main method
        Full_Time_Employees fullEmp = new Full_Time_Employees();//class-1 instance
        Part_Time_Employees partEmp = new Part_Time_Employees();//class-2 instance
        Employee_Details empDetails = new Employee_Details((Employees.Emloyee_area) fullEmp);//class instance (class-1 Instance)
        empDetails.method();//class instance.method
        Employee_Details empDetails1 = new Employee_Details((Employees.Emloyee_area) partEmp);//class instance (class-2 Instance)
        empDetails1.method();//class instance.method
    }
}

