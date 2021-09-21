package JavaBasicsAssignments;

import java.util.Scanner;

public class numberPattern {
    public static void main(String[] args) {
        
 Scanner scannerObj = new Scanner(System.in);

 int rows;
 

 do{
    System.out.println("Enter number ");

   while (!scannerObj.hasNextInt() ){
        scannerObj.next();
       System.out.println("  is not a valid number");
      }
      rows = scannerObj.nextInt();
    } while (rows<=0);

   for(int i =1;i<=rows;i++){
       int num=0;
       for(int j=rows;j<=num-i;j++){

        System.out.print(" ");
       }
       for(int k=i;k>=1;k--){
       
        System.out.print(k);
       
   } 
   for(int l=2;l<=i;l++){
    System.out.print(l);
   }
   System.out.println();
   }





scannerObj.close();





    }
}
