package BasicAssignment;

import java.util.Scanner;

public class HalfPyramidAlphabet {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        char rows;
        do{
            System.out.println("Enter number of rows:");
            while(!myScannerObj.hasNextInt()){
                System.out.println("This is not a Number.Please enter positive Number:");
                myScannerObj.next();
            }
            rows = myScannerObj.next().charAt(0);
        }while(rows <= 0);
        char i , j;
        for( i = 'A'; i <= 'E'  ; ++i) {
            System.out.println(" ");
               for(j = 'A'; j <= i; ++j) {
                  System.out.print( j +" ");
                }
                System.out.println( );
         }
    }
}
