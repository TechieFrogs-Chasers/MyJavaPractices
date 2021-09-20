package Assignment_1;
import java.util.Scanner;

public class InvertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //using Scanner object
        System.out.println("enter number of rows: ");//input from the user
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
            sc.close();

        }




        
    }
    
}
