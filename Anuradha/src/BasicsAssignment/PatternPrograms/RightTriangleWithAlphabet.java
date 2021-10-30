package BasicsAssignment.PatternPrograms;
import java.util.Scanner;
public class RightTriangleWithAlphabet {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of lines you want");
    int num = sc.nextInt();
    for(int i =1 ; i <= num ;i++)
    {
        for (int j = 1; j<=i; j++ ){

            System.out.print((char)(64+i)+" ");
        }
        System.out.println("");
    }
    sc.close();
}

    
}
