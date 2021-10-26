package StringsAssignment;

public class Assignment5 {
    public static void main(String[] args) {
        String str1 = "Navya";
        String str2 = "navay";
        String str3 = "NAVYA";
        String str4 = "Navya";
        String str5 = new String("Navya");
        String str6 = new String("NAVYA");
        String str7 = new String("navya");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1.equals(str5));
        System.out.println(str1 == str5);
       
        System.out.println(str1 == str6);
        System.out.println(str1 == str7);
        System.out.println(str2 == str1);
    }
}
