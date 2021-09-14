import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Height :");
        int height = sc.nextInt();
        System.out.println("Enter width :");
        int width = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++)
                System.out.print("#");
            System.out.println("");
        }
    }
}
