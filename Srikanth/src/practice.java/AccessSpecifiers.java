//package practicing;

import java.util.Scanner;

class main {
    int i = 8;
    int j = 8;

    void display() {
        System.out.println("This is amethod outer");
    }

    class secondmain extends main {
        int u = 9;
        int t = 4;

        void display1() {
            System.out.println("This is second outer class");
        }
    }
}

public class AccessSpecifiers {
    int s = 9;
    int h;
    int roll_no;

    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);
        System.out.println("Enter your roll no: ");
        int roll_no = objScanner.nextInt();
        System.out.println(roll_no);
        objScanner.close();

        AccessSpecifiers a = new AccessSpecifiers();
        System.out.println(a.h);
        System.out.println(a.s);

        main b = new main();
        System.out.println(b.i);
        System.out.println(b.j);
        b.display();

    }

}
