package OopsPractices.OopsAssignment;

public class Employee {
    String name;
    int yearOfJoining;
    String addres;
    public static void main(String[] args) {
        Employee myInstanceObj1 = new Employee("Robort ", 1994,"64C Walls-Street");
        Employee myInstanceObj2 = new Employee("Sam ",2000,"68D Walls-Street");
        Employee myInstanceObj3 = new Employee("Jhon ", 1999,"26B Walls-Street");

    }
    Employee(String string, int i, String string2){        
        System.out.println(string +" "+ i+" "+ string2);
    }
}
