package practice;

public class Simple {
    public static void main(String[] args) {
        // modules
        int a = 6;
        int b = 6;
        System.out.println("a%b= " + (a % b));
        System.out.println("-= " + (a -= b));

        // assignment
        int s = 6;
        int var;

        var = s;
        System.out.println("= " + var);
        var += s;
        System.out.println("+= " + var);
        var -= s;
        System.out.println("-= " + var);
        var *= s;
        System.out.println("*= " + var);
        var %= s;
        System.out.println("%= " + var);

        String str = "how are you";
        System.out.println(str);
        System.out.println(str);

        System.out.println("1.str");
        System.out.println("1.str");

        System.out.print("1.str");
        System.out.println("1.str");

        System.out.print("str");

    }

}
