package StringsAssignment;

public class Assignment30 {
    public static void main(String[] args) {
        String str = "hello world";    
        String noSpaceStr = str.replaceAll("\\s", "");  
        System.out.println(noSpaceStr);  
    }
}
