import java.util.Scanner;

public class displaycharacter {
    public static void main(String[] args) {
        char ch, ch1, ch2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting Alphabet:");
        ch1 = sc.next().charAt(0);
        System.out.println("Enter the last Alphabet:");
        ch2 = sc.next().charAt(0);
        for (ch = ch1; ch <= ch2; ch++) {
            System.out.println(ch + "");
            sc.close();
        }

    }
}
