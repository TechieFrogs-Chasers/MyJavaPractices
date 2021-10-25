package JavaBasicsAssignments;

import java.util.Scanner;

public class pascal{

    public static void main(String[] args) {
        
        Scanner scannerobj = new Scanner(System.in);

        //validation for integer

       int rows;
        do{
            System.out.println("Enter valid  integer");

           while (!scannerobj.hasNextInt() ){
               scannerobj.next();
               System.out.println("  is not a valid type");
             }
             rows = scannerobj.nextInt();
           } while (rows<0);
    

       for(int i=0;i<=rows;i++){  //prints no of rows
         
         for(int j=0;j<=rows-i;j++){   //prints no of spaces

            System.out.print(" ");
         }

       int number=1;
       for(int k=0;k<=i;k++){   //prints the numbers
 
        System.out.print(number+ " ");
        number=number * (i-k)/(k+1);
       }

    System.out.println();

scannerobj.close();
       }










    }
}