package ExceptionHandling;

import java.util.Scanner;

public class Assignment_21 {


    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter number: ");
        method(scannerObj.nextInt());
        scannerObj.close();
    }
    static void method(int num) {
        try {
            System.exit(0);
            int total = num / 0;
            System.out.println(num);

        } catch (NegativeArraySizeException ne) {
            ne.printStackTrace();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final statement!");

        }

    }
}
