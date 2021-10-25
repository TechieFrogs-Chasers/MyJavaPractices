package InterfaceAssignment;

public interface Exercise4 {
    int a = 10;
    //int b; // We must assign values bcz they are static and final, which means they are constants.
    String name ="HELLO!";

    
}
class Prove implements Exercise4{
    int a= 20;
    public static void main(String[] args) {
        Prove obj = new Prove();
        //Exercise4.a = 40; // when i try to re-assign the value for interface field, it doesn't allow.
        System.out.println("The value of a is:" +obj.a);
        System.out.println("The value of static a is :"+ Exercise4.a);
        // since the variable is static am able to access in a static way.
        
    }

}