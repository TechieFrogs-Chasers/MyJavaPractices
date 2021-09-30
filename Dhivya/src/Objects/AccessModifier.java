import java.util.Scanner;
public class AccessModifier {
    public static void main(String[] args) { 
        AccessModifier scan = new AccessModifier();
       int r=  scan.pop();
        int y = scan.tom();
        System.out.println(r);
        System.out.println(y);
    }
    static int pop(){
        int a =7;
        System.out.println("in public method");
        return a;
    }
    private int tom(){
        int s= 23;
        System.out.println("in private method");
        return s;
    }
}

