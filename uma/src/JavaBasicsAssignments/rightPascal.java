package JavaBasicsAssignments;

import java.util.Scanner;

public class rightPascal {
    
    public static void main(String[] args) {
        
     Scanner scannerObj = new Scanner(System.in);

     int rows;
     do{
        System.out.println("enter no of rows:");

       while(!scannerObj.hasNextInt() ){
        scannerObj.next();

           System.out.println("  is not a valid type");
      }
         rows=scannerObj.nextInt();
      } while(rows<=0);


      for(int i=0;i<=rows;i++){  ///for rows
 
        for(int j=rows;j>=i;j--){   //for spaces
    
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){     // for stars
    
            System.out.print("*");
        }
        System.out.println();
    }
        for (int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
     
                System.out.print(" ");
            }
         for(int k=1;k<=rows-i;k++){
             System.out.print("*");
         }
         System.out.println();
        
    }
    



scannerObj.close();





    }
}
