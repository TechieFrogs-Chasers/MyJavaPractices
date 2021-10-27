package Arrays;

import java.util.Scanner;

public class Assignment_24 {
    public static void main(String[] args) {
        int rows=0,column=0,count=0;

        Scanner scannerObj=new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        rows=scannerObj.nextInt();

        System.out.print("Enter number of columns: ");
        column=scannerObj.nextInt();

        int size[][]=new int[rows][column];
        System.out.println("Enter no : " );
        for (int i=0;i<rows;i++){

            for (int j=0;j<column;j++){
                size[i][j]=scannerObj.nextInt();
                if(size[i][j]==0){
                    count++;
                }
            }
        }
       if(count>(rows*column)/2){
           System.out.println("Its a Sparse matrix");
       }else {
           System.out.println("Its not a Sparse matrix");//run time give space to the numbers
       }

    }
}
