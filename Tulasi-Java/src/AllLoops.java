import java.util.Scanner;

public class AllLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines you want :");
        int LIMIT = sc.nextInt();
        int count = 1;
        int total = 0;

        while (count <= LIMIT) {
            System.out.println(count + " I love Computer Science!!");
            total = total + count;
            count++;
        }
        System.out.println("Printed this message " + LIMIT + " times. The sum of the numbers from 1 to " + LIMIT + " is " + total);
    }

}
