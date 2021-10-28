package Arrays;

import java.util.Scanner;

public class Assignment_25 {
    public static void main(String[] args) {

        int rows,cols,isEqual=1;
        Scanner scannerObj=new Scanner(System.in);

        System.out.println("Enter the matrix that have rows and columns : ");
        rows=scannerObj.nextInt();
        cols=scannerObj.nextInt();

        int[][] first=new int[rows][cols];
        int[][] second=new int[rows][cols];

        System.out.println("Enter first matrix numbers : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                first[i][j]=scannerObj.nextInt();
            }
        }
        System.out.println("Enter second matrix numbers : ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                second[i][j]=scannerObj.nextInt();
            }
        }
        for (int i=0;i<first.length;i++){
            for (int j=0;j<second[i].length;j++){
                if(first[i][j]!=second[i][j]) {
                    isEqual = 0;
                    break;
                }
            }
        }
        if(isEqual==1){
            System.out.println("The two matrices are equal!");
        }else {
            System.out.println("The two matrices are not equal!");
        }
        scannerObj.close();
    }
}
