package Strings;

public class Assign6 {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = new String("Welcome");
        String s2 = "Student";
        String s3 = "Student";
        String s4 = "Marks";
        String s5 = "Teacher";
        String s6 = "50" + " 60 ";
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s)); //false
        System.out.println(s1.equals(s2)); //false
        System.out.println(s2.equals(s3)); //true
        System.out.println(s3.equals(s2)); //true
        System.out.println(s4.equals(s3)); //false
        System.out.println(s4.equals(s5)); //false
        System.out.println(s2.equals(s6)); //false
    }
    
}
