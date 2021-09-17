package JavaBasicsAssignments;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        
        Scanner  scannerobj =new Scanner(System.in);

        int rows;
        
        do{
          System.out.println("Enter number of lines  to be printed");
  
         while (!scannerobj.hasNextInt() ){
              scannerobj.next();
             System.out.println("  is not a valid type");
            }
            rows = scannerobj.nextInt();
          } while (rows<=0);

          scannerobj.close();

          int i=1;
          int j;
          int k=1;
          for(i=1;i<=rows;i++);{
            
             for(j=1;j<=i;j++){
                
        System.out.print(k +" ");
        k++;
    }
        System.out.println();
             }
             


    }
}
