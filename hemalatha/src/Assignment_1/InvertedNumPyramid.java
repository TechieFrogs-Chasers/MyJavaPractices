package Assignment_1;
import java.util.Scanner;

public class InvertedNumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int value=sc.nextInt();
        for(int i=value;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(j+" ");
            }
            System.out.println();
        }
                
            sc.close();
                
            
        
        

    }
    
}
