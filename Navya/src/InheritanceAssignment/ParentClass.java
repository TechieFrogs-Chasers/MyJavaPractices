package InheritanceAssignment;

 class ParentClass {
     private void parentDisplay(){
        System.out.println("This is parent class");
    }
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        parentObj.parentDisplay();
        ChildClass childObj = new ChildClass();
        childObj.childDisplay();
       // childObj.parentDisplay();
    }
}
class ChildClass extends ParentClass{
    void childDisplay(){
        System.out.println("This is child class");
    }   
}
  