import java.util.Scanner;
public class Halfpyramidnum {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        int num;
         do {
             System.out.println("enter the number");
             while(!object.hasNextInt())
             {
                System.out.println("this is not a number please enter a valid one" );
                object.next();

             }num=object.nextInt();
         }while(num<=0);
         object.close();
         int i,j;
         for (i=1;i<=num;++i){
             for (j=1;j<=i;++j){
                 System.out.print(j+ " ");
             }
             System.out.println();
         }
    }
    
}
