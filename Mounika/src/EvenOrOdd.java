import java.util.Scanner;
public class EvenOrOdd {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Number");
        short num = sc.nextShort();
        
        String value = (num%2==0) ? "Even": "Odd";
        // why string here is string accepts both int value and char values
        System.out.println(value);
           
            
    
    }
    
}
