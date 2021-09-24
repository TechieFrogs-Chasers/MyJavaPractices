package Assignment_1;
import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        int rows,num=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:");
        rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
            sc.close();
        }

        
    }
    
}
