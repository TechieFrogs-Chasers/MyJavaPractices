package practice;

public class variablespract {
    static int h = 30; // A variable which is inside a class and outside a method with static keyword.
                       // is static
    int x = 40;

    public static void main(String[] args) {
        int i = 30; // Is a "local variable". which is declared inside a class and inside the method
        System.out.println(i);

        variablespract sri = new variablespract();
        // A variable which is declared inside a class and outside a method
        // without static keyword is called "instance variable"
        // To use instance we need to create an object
        System.out.println(sri.x);// This is called an instance variable.

        System.out.println(h);
    }

}