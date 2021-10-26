package StringsAssignment;

public class Assignment32 {
    public static void main(String[] args) {
        String str = "hello world";    
        String spaceStr = str.replaceAll("\\s", "//");  
        System.out.println(spaceStr);   
    }
}
