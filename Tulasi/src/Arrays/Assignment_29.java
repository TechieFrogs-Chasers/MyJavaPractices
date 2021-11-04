package Arrays;

import java.util.Scanner;

public class Assignment_29 {
    public static void main(String[] args) {
        int rows,cols,i,j,k;
        Scanner scannerObj=new Scanner(System.in);//object of scanner class

        System.out.println("Enter the no.of matrix :"); //input (number of rows and cols)
        rows=scannerObj.nextInt();
        cols=scannerObj.nextInt();


        int[][] arr=new int[rows][cols];//create array (matrix) objects
        int[][] arr1=new int[rows][cols];
        int[][] multiply=new int[rows][cols];

        System.out.println("Enter the matrix of arr :");//input matrix 1
        for(i=0;i<rows;i++){
            for (j=0;j<cols;j++){
                arr[i][j]=scannerObj.nextInt();
            }
        }
        System.out.println("Enter the matrix of arr1 :");//input matrix 2
        for(i=0;i<rows;i++){
            for (j=0;j<cols;j++){
                arr1[i][j]=scannerObj.nextInt();
            }
        }
        System.out.println("Multiplying the matrices :");//multiplication logic
        for (i=0;i<rows;i++){
            for (j=0;j<cols;j++){
                for(k=0;k< rows;k++){
                    multiply[i][j]=multiply[i][j]+arr[i][k]*arr1[k][j];
                }
            }
        }
        System.out.println("The product of the matrices is : ");
        for ( i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }
        scannerObj.close();//Scanner closed
    }
}
