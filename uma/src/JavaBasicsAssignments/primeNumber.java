package JavaBasicsAssignments;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        



        Scanner  scannerobj =new Scanner(System.in);

        int num;
        
        do{
          System.out.println("enter the number : ");
  
         while (!scannerobj.hasNextInt() ){
              scannerobj.next();
             System.out.println("  is not a valid type");
            }
            num = scannerobj.nextInt();
          } while (num<=0);

    if(num==0 | num==1){
        System.out.println(num+ "  is not a prime number");
    
  if(num%2==0)
      System.out.println(num+ "  is not a prime nuber");
  }
else
System.out.println(num+"  is a prime  number");

scannerobj.close();

    }
    
}
