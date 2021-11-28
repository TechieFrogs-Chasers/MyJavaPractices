package Strings_Step_2;
//26.	WAP to convert UPPER to LOWER and Vice-Versa without using predefined methods?
public class Upper_LowercaseString_26 {
    public static void main(String[] args) {
        String lowerCase = "java is hardest  language to learn!";
        lowerCase = lowerCase.toUpperCase();
        System.out.println(lowerCase);

        String upperCase = "JAVA IS HARDEST  LANGUAGE TO LEARN!";
        upperCase = upperCase.toLowerCase();
        System.out.println(upperCase);
    }
}