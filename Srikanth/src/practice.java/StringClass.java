import java.lang.*;

class String {
    java.lang.String s = "Hello";
    String s2 = new String("Hi");// creating string using string object
    java.lang.String r2 = "Hi";// creating using literals.
    String t9 = new String("original");

    String(String s, String s2) {
        this.s = s;
        this.s2 = s2;
    }

    public String(java.lang.String string) {
    }

    public java.lang.String toString() {
        return s + " " + s2;
    }
}

public class StringClass {
    public static void main(String[] args) {
        System.out.println("toString");
    }
}
