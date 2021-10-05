package BasicPractices;
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        char ch;     
        System.out.println("Enter the character ");
        ch=obj.next().charAt(0);   
        obj.close();
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A'&& ch <='Z')) ;
        {
             System.out.println(ch + " is an alphabet.");
        }
    }
    
}
