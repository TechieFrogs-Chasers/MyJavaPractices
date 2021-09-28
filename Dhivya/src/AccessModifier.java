import java.util.Scanner;

public class AccessModifier {
    public static void main(String[] args) { 
        AccessModifier scan = new AccessModifier();
        scan.pop();
        scan.tom();
    }

    public void pop(){
        int a =7;
        System.out.println("in public method");
    }
    private void tom(){
        int s= 23;
        System.out.println("in private method");
    }
}

