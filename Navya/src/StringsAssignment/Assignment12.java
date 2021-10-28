package StringsAssignment;

public class Assignment12 {
    public static void main(String[] args) {
        StringBuffer str =  new StringBuffer("Hello");
        str.append(" hii,");
        str.append(" I am navya");
        System.out.println(str);
        System.out.println("clear the character");
        System.out.println(str.delete(0, 5));
    }
}
