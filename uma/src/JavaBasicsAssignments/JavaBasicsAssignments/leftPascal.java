package JavaBasicsAssignments;


import java.util.Scanner;

public class leftPascal{

    public static void main(String[] args) {

  Scanner scannerObj = new Scanner(System.in);

  int rows;

  do{
      System.out.println("Enter no  of rows ");

      while(!scannerObj.hasNextInt() ){
          scannerObj.next();
  
          System.out.println("Enter a valid number");
      }
      rows= scannerObj.nextInt();
  }while(rows<=0);

for(int i=0;i<=rows;i++){  ///for rows
 
    for(int j=0;j<=rows-i;j++){   //for spaces

        System.out.print(" ");
    }
    for(int k=0;k<=i;k++){     // for stars

        System.out.print("*");
    }
    System.out.println();
}
    for (int i=0;i<rows-1;i++){
        for(int j=0;j<=i;j++){
 
            System.out.print(" ");
        }
     for(int k=0;k<=rows-i;k++){
         System.out.print("*");
     }
     System.out.println();
    
}



scannerObj.close();




        
    }
}
    
