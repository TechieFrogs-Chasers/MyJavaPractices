package Assignment;
import java.util.Scanner;
public class Swap {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        int i = sp.nextInt();
        int j = sp.nextInt();
        sp.close();
        System.out.println("Enter Value of i and j");
        System.out.println("Before Swaping numbers:"+i +" "+j);
        int k = i;
        j = i;
        j = k;
        System.out.println("After Swaping:"+i+" "+j);
    }
    
}
