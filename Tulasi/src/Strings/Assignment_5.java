package Strings;//Package

public class Assignment_5 {//Driver class

    public static void main(String[] args) {//main method
        String s1 = "Today";
        String s2 = s1;

        String s3 = new String("Morning");
        String s4 = s3;

        String s5 = "Java";
        String s6 = "jAVA";

        String s7 = new String("Class");
        String s8 = new String("cLASS");

        System.out.println("Is s1 = s2 :"+ (s1 == s2) );
        System.out.println("Is s3 = s4 :"+ (s3 == s4) );
        System.out.println("Is s5 = s6 :"+ (s5 == s6) );
        System.out.println("Is s7 = s8 :"+ (s7 == s8) );
    }
}
