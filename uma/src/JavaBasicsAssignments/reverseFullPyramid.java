package JavaBasicsAssignments;

import java.util.Scanner;

public class reverseFullPyramid {
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
  
          int i;
          int j;
          int k;
          for(i=rows;i>=1;i--){
           
             for(j=rows-1;j<=i;j++){
           
             System.out.print(" ");
             }
          
       for ( k=1;k<=i;k++){
      
         System.out.print("*"+" ");
     //i--;}
        System.out.println();
           
       }  
         i--; 
    } 
              
  }

    }
    

