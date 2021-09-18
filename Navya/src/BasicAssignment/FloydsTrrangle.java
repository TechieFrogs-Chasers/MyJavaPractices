package BasicAssignment;

import java.util.Scanner;

public class FloydsTrrangle {
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
            int i , j, number = 1;
            for( i = 1; i <= rows  ; ++i) {
                System.out.println(" ");
                   for(j = 1; j <= i; ++j) {
                      System.out.print(number+" ");
                      number++;
                    }
                    System.out.println( );
             }
    }
}
