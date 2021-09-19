import java.util.Scanner;
public class Halfpyramid {
    public static void main(String...args){
        Scanner object = new Scanner(System.in);
        int rows;
         do {
             System.out.println("enter the value");
             while(!object.hasNextInt())
             {
                 System.out.println("this is not a value ,please enter a valid one ");
                 object.next();

             }rows=object.nextInt();
         }while(rows<=0);
          object.close();
         int i,j;
         for(i=1; i<=rows;++i){
             System.out.println(" ");
             for ( j=1; j<=i; ++j){
                 System.out.println("* ");
             }
             System.out.println();
         }
    }


}
