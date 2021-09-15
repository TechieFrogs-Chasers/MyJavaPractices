package Assignment;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Number");
        short num = sc.nextShort();
        
        if(num%2==0)
            System.out.println("Given Number is Even");
            else
                System.out.println("Given Number is Odd");
                sc.close();
    }
}
         
    
    

