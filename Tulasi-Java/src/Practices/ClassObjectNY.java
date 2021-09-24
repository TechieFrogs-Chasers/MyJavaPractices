package Practices;

class department {
    String departmentname;
    int id = 11;

    public department() {

    }
    // String depname;

    void employee() {
        System.out.println("Emplyoees!");
    }

    department(String sales){
        //this();
        System.out.println("Default Constructor!");
    }
    department(int id){
        this("sales");
        System.out.println("Id number!");
        employee();
    }
    department(int id,String departmentname){
        this();
        System.out.println("Depaertment name!");

    }
   // department(String departmentname){
    //    this(71);
     //   System.out.println("Department num");
   // }
}
//class
public class ClassObjectNY {

    void branches() {
        System.out.println("Enter branches names: ");
    }

    public static void main(String[] args) {
        ClassObjectNY myObj = new ClassObjectNY();
        department obj1=new department(77);

       // obj1.employee();
      //  myObj.branches();
      //  Cartester obj = new Cartester();
     //   obj.year();
       // obj.condition();
    }
}
