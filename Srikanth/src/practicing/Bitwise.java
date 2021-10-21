package practice;

public class Bitwise {

    static int a = 9;
    static int b = 7;

    public static void main(String[] args) {

        if (a > b && a < b) { // 9>7 : True, 9<7; False- TRUE && False-False
            System.out.println("logic and:true and false-");
        }
        System.out.println(a > b && a < b);

        if (a > b && a > b) {
            System.out.println("2logical and:true and true");
        }
        System.out.println(a > b && a > b);

        if (a < b && a > b) {
            System.out.println("false and true:");
        }
        System.out.println(a < b && a > b);

        if (a < b && a < b) {
            System.out.println("false and false:");
        }
        System.out.println(a < b && a < b);

        // bitwise and operator:
        if (a > b & a < b) { //
            System.out.println("bitwise and");
        } else {
            System.out.println("this is 9-1011 : 7-0111= 3");
        }
        if (a < b & a > b) {
            System.out.println("bitwise and 2");
        }

        // OR operator:
        if (a > b || a < b)
            System.out.println("logical OR");

        if (a > b | a < b) {
            System.out.println("bitwise or");
        }
        System.out.println(a | b);

        // ternary operator:
        int c = (a < b) ? a : b;
        System.out.println(c);
    }
}
