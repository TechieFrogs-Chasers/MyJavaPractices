package Assignment;
import java.util.Scanner;
public class Diamond {
    static int i, j, k, n, space=1;
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sd = new Scanner(System.in);
        n= sd.nextInt();
        int space=n-1;
        for (int i = 1; i <= n; i++){
            for (j =1;j<= space; j++)
                System.out.print(" ");
            space--;
            for (j = 1; j <= 2 * i - 1; j++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (i = 1; i <= n - 1; i++) 
        {
            for (j = 1; j <= space; j++) 
            {
                System.out.print(" ");
            }
            space++;
            for (j = 1; j <= 2 * (n - i) - 1; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
        
}
    

