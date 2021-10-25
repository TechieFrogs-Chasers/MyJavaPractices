package JavaBasicsAssignments;

import java.util.Scanner;

public class invertedNumberPyramid {
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


          
          int i;
          int j=1;
        
          for(i=rows;i>=1;i--){
         
             for(j=1;j<=i;j++){
        
        System.out.print(j+" ");
        
            } 
            
        System.out.println();
      
             } 
           
    } 
    
}
