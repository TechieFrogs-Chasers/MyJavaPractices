package Assignment;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int num = sc.nextInt();
            int sum= 0;//local vairables should be intalized
            for (i=1;i<=num;i++){
                sum =sum+i;
                System.err.println("Sum of Natural Number ="+sum);
                sc.close();
            }
    }
    
}
