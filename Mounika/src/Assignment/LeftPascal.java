package Assignment;
import java.util.Scanner;

public class LeftPascal {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter Number of Rows: ");
       int k= sc.nextInt();
       int i,j,space;
        for(i=0;i<=k;i++){//k=10
            for(space=1;space<2*(k-i);space++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
             System.out.print("* ");
            }
            System.out.println();
        }
        for(i=1;i<=k-1;i++){
            for(space=1;space<=i;space++){
                System.out.print(" ");
            }
                for(j=1;j<=k-i;j++){
                      System.out.print("* ");
                      sc.close();
                }  
                System.out.println();
        }
    }
}


