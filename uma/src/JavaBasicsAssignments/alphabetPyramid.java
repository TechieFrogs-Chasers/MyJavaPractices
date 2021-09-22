package JavaBasicsAssignments;

import java.util.Scanner;

public class alphabetPyramid {
    
public static void main(String[] args) {
   Scanner scannerObj =new Scanner(System.in);  
   int num;
   do{
      System.out.println("enter no of rows to be printed");
     while(!scannerObj.hasNextInt() ){
      scannerObj.next();
         System.out.println("  is not a valid type");
       }
       num=scannerObj.nextInt();
     } while(num<=0);
char ch= 'A';
     for(int i=1;i<=num;i++)
     {
        
       
        for(int j =1;j<=i;j++)
        {
           
       System.out.print(ch+" ");
        //ch++;// prints A BC DEF GHIJ KLMNO
        }
        ch++;// prints A BB CCC DDDD EEEEE
        System.out.println();
       // ch++;//prints A BB CCC DDDD EEEEE
     }
scannerObj.close();

}
}