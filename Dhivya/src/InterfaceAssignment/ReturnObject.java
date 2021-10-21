package InterfaceAssignment;
//how to return object as return type?
public class ReturnObject {
    public static void main(String[] args) {
        Testing obj = new Testing(4);
        System.out.println(" The value of a is : " + obj.a);
        obj = obj.method();
        System.out.println("The value of a second time  is : " + obj.a);

    }
    
}
class Testing{
    int a ;
    Testing(int i){
       this.a =i;
    }
  public  Testing method(){
        Testing temp  = new Testing(a+50);
        return temp;
    }
}