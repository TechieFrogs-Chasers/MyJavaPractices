package Inheritance;//Package

class ParentClass{//parent class
   private void parentMethod(){//method
        System.out.println("This is Parent class");
    }
}
class ChildClass extends ParentClass{//child class extends parent class
   public void childMethod(){//method
        System.out.println("This is Child class");
    }
}
public class PrivateParentClass {//Driver class

    public static void main(String[] args) {//main method
        ParentClass myParentClassObj=new ParentClass();
        ChildClass myChildClassObj=new ChildClass();
    //    myParentClassObj.parentMethod();
        myChildClassObj.childMethod();
      //  myChildClassObj.parentMethod();

    }
}
