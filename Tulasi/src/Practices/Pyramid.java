package Practices;

public class Pyramid {
    public static void main(String[] args) {
        int i;
        int Star = 1;
        int lines = 6;
        for (i = 1; i <= lines; i++) {//lines

            for (int j = lines; j > i; j--) {//space
                System.out.print(" ");
            }
            for (int k = 1; k <= Star; k++) {//stars

                System.out.print("*");
            }
            Star = Star + 2;
            System.out.println();
        }
        /*public static void main(String[] args) {*/
        int l;
        int stars = 9;
        int line = 5;
        for (l = 1; l <= line; l++) {
            for (int m = 1; m <= l; m++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= stars; n++) {
                System.out.print("*");
            }
            stars = stars - 2;
            System.out.println();
        }

    }
}