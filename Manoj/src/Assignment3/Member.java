package Assignment3;

public class Member {
    String name="manoj";
    int age=24;
    int no=965268244;
    String address="18-2021,madhapur,hyderabad";
    float salary=10000;
    void printSalary(){
        System.out.println("the salary of the member : "+salary);
    }
    
}
class Employee extends Member{
    String specialization=" java";
    Employee(){
    System.out.println("name:"+name+ " "+"age:"+age+" "+"no:"+no+" "+"address"+address);
    System.out.println("specialization :"+specialization);
    }
}
class Manager extends Member{

    String department="computers";
    Manager(String n ,int a,int ph, String add,float sal){
        name=n;
        age=a;
        no=ph;
        address=add;
        salary=sal;
        System.out.println("name:"+n+" "+"age: "+a+" "+"phone number: "+ph+" "+"address:"+add);
        System.out.println("department: "+department);

    }

}
class Inher{
    public static void main(String...args){
        Employee obj=new Employee();
        obj.printSalary();
        Manager obj2=new Manager("man", 24, 965268244, "1-19,madhapur ,hyderabad",50000);
        obj2.printSalary();
    }

}
