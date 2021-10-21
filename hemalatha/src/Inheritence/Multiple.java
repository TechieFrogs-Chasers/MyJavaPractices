package Inheritence;
abstract class Person{ //using abstarct
    static int age;
    static String name;
   protected Person(int age, String name){
        this.age=age;
        this.name=name;
    }
}

final class Employee extends Person{    //using final
    static int salary;
    private Employee(int age,String name,int salary){
        super(age,name);//reusing parent constructor using super keyword
        this.salary=salary;
    }
    static void display()
    {
        System.out.println(age+ " "+name+ " "+salary);
    }

public class Multiple {   //using public
    public static void main(String[] args) {
        Employee emp = new Employee(22,"hema",20000);
        display();  //display method is using static so we can call the method directly
    }
}
}

