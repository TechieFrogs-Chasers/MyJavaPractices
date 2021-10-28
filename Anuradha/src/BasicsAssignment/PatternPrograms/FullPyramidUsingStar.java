package BasicsAssignment.PatternPrograms;
import java.util.Scanner;
public class FullPyramidUsingStar {
    public static void main(String[] args) {
        System.out.println(" Full pyramid Using Star");
        Scanner obj = new Scanner(System.in);
        int n;
        do {
            System.out.println("enter  number of rows : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a number.Please Enter Positive Number: ");
                obj.next();
            }
            n = obj.nextInt();
        } while (n <= 0);
        System.out.println("------------------------------------");
        for(int i = 1 ; i <= n ;i++)
        {
            for (int j = i; j<=n; j++){

                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){

                System.out.print("* ");
            }
            for (int j = 1; j<i; j++){

                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("------------------------------------");
        for(int i = 1 ; i <= n ;i++)
        {
            for (int j = i; j<=n; j++){

                System.out.print("  ");
            }
            for (int j = 1; j<=(2*i)-1; j++){

                System.out.print("* ");
            }
            System.out.println("");
        }
System.out.println("------------------------------------");
        for (int i = 1; i <= n; i++) {  
                                                                                                       
            for (int j = i; j < n; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }
}