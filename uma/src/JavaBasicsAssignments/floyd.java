package JavaBasicsAssignments;

import java.util.Scanner;

public class floyd {
    public static void main(String[] args) {
        
        Scanner  scannerObj =new Scanner(System.in);

        int rows;
        
        do{
          System.out.println("Enter number  of rows to be printed");
  
         while (!scannerObj.hasNextInt() ){
              scannerObj.next();
             System.out.println("  is not a valid number");
            }
            rows = scannerObj.nextInt();
          } while (rows<=0);

          scannerObj.close();

          int i;
          int j;
          int k=1;
          for(i=1;i<=rows;i++){
         
             for(j=1;j<=i;j++){
       
            //j++; // prints 2  2  2 4   2 4   2 4 6
        System.out.print(k+" ");
               k++;
             //j++;// prints 1  1  1 3   1 3   1 3 5
        
             }
          
            //j++;// prints 1  1 2  1 2 3  1 2 3 4  1 2 3 4 5
        System.out.println();
      
             } 
             
            
    scannerObj.close();

    }
    
}
