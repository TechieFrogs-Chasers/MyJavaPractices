package Practices;

class department {
    String departmentname;
    int id = 11;

    public department() {//constructor

    }

    void employee() {//method
        System.out.println("Emplyoees!");

    }

    department(String sales) {//constructor
        System.out.println("Default Constructor!");
    }

    department(int id) {//constructor
        this("sales");
        System.out.println("Id number!");
        employee();
    }

    department(int id, String departmentname) {//constructor
        this();
        System.out.println("Department name!");

    }
}

public class ClassObjectNY {//driver class

    void branches() {//method
        System.out.println("Enter branches names: ");

    }

    public static void main(String[] args) {//main
        ClassObjectNY myObj = new ClassObjectNY();//instance for driver class
        new department(77);//
        myObj.branches();//call branch method

    }
}
