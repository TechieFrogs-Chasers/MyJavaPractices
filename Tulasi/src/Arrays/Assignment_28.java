package Arrays;

import java.util.Scanner;

public class Assignment_28 {

    public static void main(String[] args) {
        int i,j,rows,cols,even=0,odd=0;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter no of rows and cols in matrix : ");
        rows=scannerObj.nextInt();
        cols=scannerObj.nextInt();

        int[][] arr=new int[rows][cols];

        System.out.println("Enter the matrix: ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                arr[i][j]=scannerObj.nextInt();
            }
        }
        for (i=0;i<rows;i++){
            for (j=0;j<cols;j++){
                if(arr[i][j]%2==0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("Even numbers : "+even);
        System.out.println("Odd numbers :"+ odd);

    }
}
