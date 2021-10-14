package TcsPaperPractices;

import java.util.Scanner;

public class Monkeys {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Total No of Monkeys :");
        int n = scObj.nextInt();
        System.out.println("No Of Banannas can be eat by single monkey : ");
        int k = scObj.nextInt();
        System.out.println("No of peanuts can be eat by single monkey :  ");
        int j = scObj.nextInt();
        System.out.println("Total no of Banannas : ");
        int m = scObj.nextInt();
        System.out.println("Total no of peanuts : ");
        int p = scObj.nextInt();
        if (n <= 0 || k <= 0 || j <= 0 || m <= 0 || p <= 0)
        System.out.println("Invalid Input ");
        else {
            int rem = n - (m/k + p/j);
            System.out.println("Number of monkeys left on the tree : " +rem);
        }
        scObj.close();
    }
}
