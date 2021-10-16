package Assignment_1;

abstract class Person{
    static int age;
    static String name;
   protected Person(int age, String name){
        this.age=age;
        this.name=name;
    }
}

final class Employee extends Person{
    static int salary;
   private Employee(int age,String name,int salary){
        super(age,name);//reusing parent constructor
        this.salary=salary;
    }
    static void display()
    {
        System.out.println(age+ " "+name+ " "+salary);
    }

public class KeyWord {
    public static void main(String[] args) {
        Employee emp = new Employee(22,"hema",20000);
        display();
    }
}
}


    
    

