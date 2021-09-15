package Assignment;
import java.util.Scanner;
public class Div {
    public static void main(String[] args) {
        Scanner divObj = new Scanner(System.in);
        System.out.println("Enter Value of i");
        int i = divObj.nextInt();
        System.out.println("Enter Value of j");
        int j = divObj.nextInt();
        divObj.close();
        System.out.println("Quotient:"+ i/j);
        System.out.println("Reminder:"+ i%j);
    }
    
}
