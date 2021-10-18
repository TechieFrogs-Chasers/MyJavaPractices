package practice;

public class Controlpract {

    /*
     * the highest preference for operators in java is "()" then "/" then "*" then
     * "%" then "+"then "-". x = 4 / 2 + 8 * 4 - ( 5+ 2 ) % 3 x = 4 / 2 + 8 * 4 - 7
     * % 3 x = 2 + 8 * 4 - 7 % 3 x = 2 + 32 - 7 % 3 x = 2 + 32 - 1 x = 34 - 1 x = 33
     */
    public static void main(String[] args) {
        int m = 5;
        int n = 8;

        int r1 = ~m; // Bitwise complement
        int r2 = n ^ m; // Bitwise xor
        int r3 = m % n * m;
        double r4 = (double) m / (n + n); // if we need to get the decimal values use double instead of int
        double r5 = (double) m + n * m - (n * m) / m % n;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }
}
