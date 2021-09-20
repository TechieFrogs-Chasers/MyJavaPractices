package Assignment_1;

import java.util.Scanner;
    

    public class AddTwoNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i, j, k;
            System.out.println("enter the first number");
            i = sc.nextInt();
            System.out.println("enter the second number");
            j = sc.nextInt();
            sc.close();
            k = i + j;
            System.out.println("sum of these numbers:" + k);

        }
    }