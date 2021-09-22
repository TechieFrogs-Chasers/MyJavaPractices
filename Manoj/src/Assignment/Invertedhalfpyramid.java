import java.util.Scanner;
public class Invertedhalfpyramid {
 public static void main(String...args){
     Scanner object=new Scanner(System.in);
     int num;
     do{
         System.out.println("enter the value ");
         while(!object.hasNextInt())
         {
             System.out.println("this is not a valid one ,please enter a valid one ");
             object.next();

         }num=object.nextInt();
     }while(num<=0);
     int i,j;
     for (i=num;i>=1;--i){
         System.out.println(" ");
         for(j=1;j<=i;++j){
             System.out.print("* ");
         }
     }
 }
    
}
