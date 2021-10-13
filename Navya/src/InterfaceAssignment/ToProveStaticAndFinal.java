package InterfaceAssignment;
 interface Assignment4{
    // int number ;  because of static and final we should assign the value while intilization
     String name = "navya";
 }
public class ToProveStaticAndFinal implements Assignment4{
    public static void main(String[] args) {
        
     ToProveStaticAndFinal obj = new ToProveStaticAndFinal();
     //Assignment4.name = "add"; //we cannot change the variable values because of  static and final
    }
}
