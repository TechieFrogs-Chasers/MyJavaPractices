package JavaBasicsAssignments;

import java.util.Scanner;

public class diamond {
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
  
          for(i=1;i<=rows;i++){
          
            for(j=rows-i;j>0;j--){
             
       System.out.print(" ");}
       
      for (int k=1;k<=2*i-1;k++){
        System.out.print("*");
      
     }
       
       System.out.println();
    }

           for(i=rows-1;i>0;i--){
          
            for(j=rows-1-i;j>=0;j--){
       
         System.out.print(" ");}
 
        for (int k=1;k<=2*i-1;k++){
         System.out.print("*");

       }
 
           System.out.println();
        }










    }
    
}
