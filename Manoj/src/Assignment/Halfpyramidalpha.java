import java.util.Scanner;
public class Halfpyramidalpha {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        char alpha;
         do {
             System.out.println("enter the value ");
             while(!object.hasNextInt())
             {
                 System.out.println("this is not the correct one ,please enter valid one");
                 object.next();
             }alpha=object.next().charAt(0);
         }while(alpha<=0);
          char i,j;
         for (i='A'; i<='E' ;i++){
             System.out.println(" ");
             for (j='A'; j<=i;j++){
                 System.out.print(j+ " ");
             }
             System.out.println(  );
         }

    }
    
}
