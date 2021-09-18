package BasicAssignment;

import java.util.Scanner;

public class PascalsRighTriangle {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int rows;
        do{
            System.out.println("Enter number of rows:");
            while(!myScannerObj.hasNextInt()){
                System.out.println("This is not a Number.Please enter positive Number:");
                myScannerObj.next();
            }
            rows = myScannerObj.nextInt();
        }while(rows <= 0);
        int i , j;
        for( i = 1; i <= rows  ; ++i) {
            System.out.println(" ");
               for(j = 1; j <= i; ++j) {
                  System.out.print(" * ");
                }
                System.out.println( );
         }
         for( i = rows; i > 1  ; --i) {
            System.out.println(" ");
               for(j = 1; j < i; ++j) {
                  System.out.print(" * ");
                }
                System.out.println( );
         }
    }
}
