package Assignment;
import java.util.Scanner;
 public class Addition {

    public static void main(String[] args) {
        Scanner addObj = new Scanner(System.in);
        System.out.println("Enter 1st Value");
        byte i = addObj.nextByte();
        System.out.println("Enter 2nd Value");
        byte j = addObj.nextByte();
        System.out.println("Sum:"+(i+j));
        addObj.close();
        
    }
}
