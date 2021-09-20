package JavaBasicsAssignments;

import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        
 Scanner  scannerobj =new Scanner(System.in);

      int rows;
      
      do{
        System.out.println("Enter number of lines  to be printed");

       while (!scannerobj.hasNextInt() ){
           String input = scannerobj.next();
           System.out.println(input+"  is not a valid type");
          }
          rows = scannerobj.nextInt();
        } while (rows<=0);

        int i=1;
        int j;

        for(i=1;i<=rows;i++){

           for(j=1;j<=i;j++){
           
      System.out.print("*");}
      System.out.println();
           }
           scannerobj.close();
     }



    }
    

