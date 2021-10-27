import java.util.Scanner;



public class InvFullPyramid {
public static void main(String[] args) {
    int number;
    Scanner scObj = new Scanner(System.in);
    do{
        System.out.println("Enter a value for num");
        while(!scObj.hasNextShort()){
            String input = scObj.next();
            System.out.println("Please enter a valid number");
        }
        number=scObj.nextInt();
        for(int i = number; i >= 1; --i) {
            for(int space = 1; space <= number - i; ++space) {
                    System.out.print("  ");
                }
                for(int j=i; j <= 2 * i - 1; ++j) {
                    System.out.print("* ");
                }
                for(int j = 0; j < i - 1; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }while(number<=0);
    scObj.close();
}
}
    

