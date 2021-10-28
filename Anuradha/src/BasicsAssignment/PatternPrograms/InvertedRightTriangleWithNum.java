package BasicsAssignment.PatternPrograms;
import java.util.Scanner;
public class InvertedRightTriangleWithNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines you want");
        int num = sc.nextInt();
        sc.close();
        for(int i = num ; i >= 1 ;i--)
        {
            for (int j = 1; j<=i; j++ ){

                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }    
    
}
