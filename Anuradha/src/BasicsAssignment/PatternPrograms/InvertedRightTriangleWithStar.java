package PatternPrograms;
import java.util.Scanner;
public class InvertedRightTriangleWithStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines you want");
        int num = sc.nextInt();
        sc.close();
        for(int i =1 ; i <= num ;i++)
        {
            for (int j = i; j<=num; j++ ){

                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}
