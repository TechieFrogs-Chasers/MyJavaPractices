package Strings;

public class StringBuilder {
    public static void main(String[] args) 
    {
        String s1 = new String("welcome");
        String s2 = new String(" home");
        String s = String.format("%s%s",s1,s2);
        String g = String.join("",s1,s2);
        System.out.println(s.toString());
        System.out.println(g.toString());

    }
    
    
}
