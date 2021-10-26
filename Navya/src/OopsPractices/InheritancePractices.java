package OopsPractices;
class MainCalss{
    int a;
    private int b;
    String name;
    void mainDisplay(){
        System.out.println(" In main display " +b);
    }
    MainCalss(){
        System.out.println(" In main Class Constructors");
    }
    MainCalss(int i ,String name){
        System.out.println(" In parameter main class Constructors " +i+" "+name);
    }
}
class SubClass1 extends MainCalss{
    int j;
    protected int i ;
    static class SubInner {
         void subInnerDisplay(){
            System.out.println(" In subinner display ");
            class MethodInner{
                void methodInnerDisplay(){
                    System.out.println(" In method Inner display ");
                }
            }
            MethodInner methodInnerObj = new MethodInner();
            methodInnerObj.methodInnerDisplay();
        }
        SubInner(){
        System.out.println(" in sub Inner constructor");
        }
        SubInner(int j , int h){
            System.out.println("In SubInner Parameter Constructor : "+ j +" "+ h );
        }
    }
    SubClass1(){
        super(5 , " navya");
        System.out.println(" In Sub class Constructor ");
    }
}
class Child extends SubClass1{
    //class Child extends SubClass{
char Alpha ;
Child(){
    //super(6,4);

}

    public static void main(String[] args) {
        SubClass1 subObj = new SubClass1();
        subObj.mainDisplay();
        Child childObj = new Child();
       // childObj.subInnerDisplay();
    }
}
public class InheritancePractices {
public static void main(String[] args) {
MainCalss mainObj = new MainCalss();
mainObj.name = "navya";

}    
}
