package StringsAssignment;

public class Assignment14 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("String");
        str.append(" Buffer Uisng ");
        str.append(" Object Creation");
        System.out.println(str);
        str = new StringBuffer();
        System.out.println(" clearing the string "+ str);
    }
}
