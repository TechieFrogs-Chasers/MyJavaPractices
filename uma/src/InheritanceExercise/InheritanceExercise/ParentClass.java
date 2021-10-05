package InheritanceExercise;
public class ParentClass {
    int i;
    void display(){
        System.out.println("This is parent class");
    }
    private void hi(){
        System.out.println("private method in parent");
    }

    public static void main(String[] args) {
        ParentClass objParentClass = new ParentClass();
        objParentClass.display();
        objParentClass.hi();

    }
    
}
class ChildClass extends ParentClass{
    int j;

    void display_1(){
        System.out.println("This is child class");
    }
    

    public static void main(String[] args) {
        ChildClass objChildClass = new ChildClass();
        objChildClass.display();
        objChildClass.display_1();
        //objChildClass.hi();


        ParentClass objParentClass = new ParentClass();
        objParentClass.display();
        
    }
}//-------------------------------------------------------------------------
class Member{

    String name;
    int age;
    long phonenumber;
    long salary;
    String address;

    Member(String name,int age,long salary,long phonenumber, String address){

    this.name=name;
    this.age=age;
    this.phonenumber=phonenumber;
    this.salary=salary;
    this.address=address;
    
    }
    Member(){
        
    }
    


    void printSalary(){
        
        //System.out.println(name+" "+age+" "+salary+" "+ phonenumber+" "+ address);
    }
}
class Employee extends Member{
    String specialization;
    
    Employee(String name,int age,long salary,long phonenumber, String address){
        System.out.println(name+" "+age+" "+salary+" "+ phonenumber+" "+ address);
    }
   

}
class Manager extends Member{
    String department;
     Manager(String name,int age,long salary,long phonenumber, String address){
        System.out.println(name+" "+age+" "+salary+" "+ phonenumber+" "+ address);
     }
    

    public static void main(String[] args) {

    Manager objManager = new  Manager("uma",41,31454658,5000,"st.louis,MO"   );
    
   Employee objEmployee = new Employee("ram", 45, 314368, 5000, " stlouis");

   objEmployee.printSalary();
   objManager.printSalary();

    }

}