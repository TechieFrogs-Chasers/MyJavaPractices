import java.util.Scanner;
public class Fullpyramid{
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        int num;
        do {
            System.out.println("enter the number ");
            while(!object.hasNextInt())
            {
                System.out.println("this is not a number ,please enter a valid one ");
                object.next();

            }num=object.nextInt();
        }while(num<=0);
        int i, j, k=0 ;
        
        for ( i =1;i<=num; ++i, k=0){
            for ( j=1; j<=num-i; ++j){
                System.out.println("  ");
            }
            while(k !=num *i-1){
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }

    }
    
}
