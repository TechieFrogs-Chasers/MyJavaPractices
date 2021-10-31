package JavaBasicsAssignments;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
       
        
  Scanner scannerobj =new Scanner(System.in);


   int num;
        
        do{
          System.out.println("Enter number for multiplication table");
  
         while (!scannerobj.hasNextInt() ){
              scannerobj.next();
             System.out.println("  is not a valid type");
            }
            num = scannerobj.nextInt();
          } while (num<=0);


        int i=1;

        scannerobj.close();
        
          for(i=1;i<=10;i++)


      System.out.println(num+ " * "+ i + " = "+ num*i);


      //another way 

     /* int i = 1;

      while (i < 11) {
          int j = 1;
          while (j < 11) {
              System.out.print(i * j);
              System.out.print(" ");
              j++;
          }
          System.out.println();
          i++;*/








    }
    
}
