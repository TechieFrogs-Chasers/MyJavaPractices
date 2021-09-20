package Assignment_1;
import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scan.nextInt();//to read input
        if(a%2==0){  //check the number
            System.out.println("this is even number:");
        }else{
            System.out.println("this is odd number:");
        }
        scan.close();



    }
    
}
