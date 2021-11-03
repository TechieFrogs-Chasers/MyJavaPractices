package TCS_NQT;

import java.util.Scanner;

public class Armstrong_19 {
    public static void main(String[] args) {

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter two numbers to find Sum of the Numbers");
        int n1 = scannerObj.nextInt();
        int n2 = scannerObj.nextInt();
        scannerObj.close();
        if (n1 > n2) {// if range 1 is greater than rang2 ten its a wrong input
            System.out.println("Wrong input");
        } else if (n1 <= 0 || n2 <= 0) {
            System.out.println("Wrong input");
        } else {
            for (int i = n1; i <= n2; i++) {
                 Armstrong_19(i);
            }
        }
    }

        public static void Armstrong_19 ( int num){
            int rev, temp, n = 0;
            double sum = 0;
            temp = num;
            while (temp > 0) {
                temp /= 10;
                n++;
            }
            temp = num;
            while (temp > 0) {
                rev = temp % 10;
                sum = (Math.pow(rev, n)) + sum;
                temp = temp / 10;
            }
            if (num == sum)
                System.out.println(num);
        }
    }
