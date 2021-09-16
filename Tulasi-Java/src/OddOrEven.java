import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter any number to verify is it ODD or EVEN");
        int num=Sc.nextInt();
        if (num%2==0)
            System.out.println("Entered number as Even");
        else
            System.out.println("Entered number as Odd");
    }
}
