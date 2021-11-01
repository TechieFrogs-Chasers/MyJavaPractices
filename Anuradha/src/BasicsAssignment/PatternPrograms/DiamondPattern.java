package BasicsAssignment.PatternPrograms;
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines you want");
        int num = sc.nextInt();
        
    for (int i = 1; i <= num; i++) {  
                                                                                                       
        for (int j = i; j < num; j++)
        {
            System.out.print("  ");
        }
        for (int k = 1; k < (i * 2); k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i = 1 ; i <= num ;i++)
        {
            for (int j = 1; j<=i; j++){

                System.out.print("  ");
            }
            for (int j = i; j<=num; j++){

                System.out.print("* ");
            }
            for (int j = i; j<num; j++){

                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
    
}

