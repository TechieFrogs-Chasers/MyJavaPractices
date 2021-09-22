package JavaBasicsAssignments;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        
        Scanner  scannerObj =new Scanner(System.in);

        int rows;
        
        do{
          System.out.println("Enter number  to be printed");
  
         while (!scannerObj.hasNextInt() ){
              scannerObj.next();
             System.out.println("  is not a valid number");
            }
            rows = scannerObj.nextInt();
          } while (rows<=0);

          scannerObj.close();

          int i;
          int j;
          
          for(i=1;i<=rows;i++){
          
             for(j=1;j<=i;j++){
              
        System.out.print(j+" ");
        
    }
        System.out.println();
             }
             
    scannerObj.close();

    }
}
