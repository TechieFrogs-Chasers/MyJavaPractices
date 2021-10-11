package MethodsAssignment;
class MainClass{
    int i;
    void printNum(int i){
        this.i = i;
        System.out.println("i = "+i);
    }
}
class SubClass extends MainClass{
    int j;
    void printNum(int j){
        this.j = j;
        super.printNum(3);
        System.out.println("j = "+j);
    }
}
public class PrintData {
    public static void main(String[] args) {
        SubClass subObj = new SubClass();
      //  subObj.printNum(1);
        subObj.printNum(4);
    }
}
