package practice;

final class MethodsPract {
    public static void main(String[] args) {
        // Scanner objScanner = new Scanner(System.in);
        MethodsPract ad = new MethodsPract();
        int result = ad.add(10, 2);
        System.out.println(result);
        ad.mulitiple(10, 4);
        // objScanner.close();

    }

    class subclass {

        final class subsetclass extends subclass {

        }
    }

    static void MethodsPract1() {

    }

    int add(int a, int b) {
        // int a = 5;
        // int b = 8;
        // int c =a+b ;
        return a + b;

    }

    void mulitiple(int h, int k) {
        int r = h * k;
        System.out.println(r);
    }

    MethodsPract() {
        System.out.println("This is a constructor");
    }
}
