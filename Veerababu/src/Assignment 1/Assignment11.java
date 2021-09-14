import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner GCD = new Scanner(System.in);
        System.out.println("Print the First Number");
        int i= GCD.nextInt();
        System.out.println("Print the Second Number");
        int j= GCD.nextInt();
        GCD.close();
       
        int Gcd = (i<j)?i:j;

        if(i%Gcd==0 && j%Gcd==0){
            System.out.println("Print the value of GCD is"+"  "+ Gcd);
        }
        else
        System.out.println("Invalid");
    }
}
