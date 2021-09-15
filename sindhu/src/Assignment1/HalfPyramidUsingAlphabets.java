package Assignment1;
import java.util.*;

public class HalfPyramidUsingAlphabets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many rows");
        int x= input.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 'A'; j <= i; j++) {
              System.out.print(j );
            }
        }
    }
    
}
