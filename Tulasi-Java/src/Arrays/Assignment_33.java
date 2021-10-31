package Arrays;

import java.util.Scanner;

public class Assignment_33 {

    public static void main(String[] args) {//Multiply two martrix with Jagged array
        Scanner scannerObj = new Scanner(System.in);
        int[][] arr = new int[3][];
        int[][] arr1 = new int[3][];
        int[][] multiply = new int[3][];

        System.out.println("Enter arr Jagged array size: ");
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[1];
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i] = scannerObj.nextInt();
        }
        for (int i = 0; i < arr[1].length; i++) {
            arr[1][i] = scannerObj.nextInt();
        }
        for (int i = 0; i < arr[2].length; i++) {
            arr[2][i] = scannerObj.nextInt();
        }
        System.out.println();

        System.out.println("Enter arr2 Jagged array size: ");
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        arr1[2] = new int[1];

        for (int j = 0; j < arr1[0].length; j++) {
            arr1[0][j] = scannerObj.nextInt();
        }
        for (int j = 0; j < arr1[1].length; j++) {
            arr1[1][j] = scannerObj.nextInt();
        }
        for (int j = 0; j < arr1[2].length; j++) {
            arr1[2][j] = scannerObj.nextInt();
        }
        System.out.println();
        scannerObj.close();


        System.out.println("Jagged Arrays are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ") ;
            }
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println();
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ") ;
            }
        }
        System.out.println();

        multiply[0] = new int[3];
        multiply[1] = new int[2];
        multiply[2] = new int[1];
        System.out.println("Multiplication of two Jagged Arrays : ");
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {
                multiply[i][j] = 0;
                for (int k = 0; k < multiply[i].length; k++)
                {
                    multiply[i][j]+=arr[i][j] * arr1[i][j];
                }
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();

        }

    }
}
