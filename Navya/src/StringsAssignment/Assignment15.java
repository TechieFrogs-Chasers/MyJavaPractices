package StringsAssignment;

public class Assignment15 {
    public static void main(String[] args) {
        String name = "first letter to be capital";
        System.out.println("Original String: " + name);
        // get First letter of the string
        String firstLetStr = name.substring(0, 1);
        // Get remaining letter using substring
        String remLetStr = name.substring(1);
        System.out.println(remLetStr);
        // convert the first letter of String to uppercase
        firstLetStr = firstLetStr.toUpperCase();
 
        // concantenate the first letter and remaining string
        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        System.out.println("String with first letter as Capital: " + firstLetterCapitalizedName);
    }
}
