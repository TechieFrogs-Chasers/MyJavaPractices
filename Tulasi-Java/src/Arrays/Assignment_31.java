package Arrays;

import java.util.Scanner;

public class Assignment_31 {
    public static void main(String[] args) {
        int i, j, rows, cols;
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Enter no.of line a matrix will have: ");
        rows = scannerObj.nextInt();
        cols = scannerObj.nextInt();

        int arr[][] = new int[rows][cols];
        int transpose[][] = new int[rows][cols];

        System.out.println("Enter the matrix: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                arr[i][j] = scannerObj.nextInt();
            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of the matrice : ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        scannerObj.close();
    }
}
