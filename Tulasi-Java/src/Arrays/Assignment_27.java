package Arrays;

import java.util.Scanner;

public class Assignment_27 {
    public static void main(String[] args) {
        int rows, cols, i, j;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter Matrix Rows and Columns : ");
        rows = scannerObj.nextInt();
        cols = scannerObj.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println("Enter the matrix: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                arr[i][j] = scannerObj.nextInt();
            }
        }
        System.out.println("---Upper triangle of the matrix---");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                if (i > j)
                    System.out.print("0 ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

