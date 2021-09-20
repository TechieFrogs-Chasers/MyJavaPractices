import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {

        int num1;
        Scanner scObj = new Scanner(System.in);
    do{
        System.out.println("Enter a value for num1");
        while(!scObj.hasNextShort()){
            String input = scObj.next();
            System.out.println("Please enter a valid number");
        }
        num1=scObj.nextInt();
    }while(num1<=0);
    scObj.close();
   int k = 0;
    for (int i = 1; i <=num1; ++i, k=0){
        for (int j = 1; j <= num1 - i; ++j) {
            System.out.print("  ");
        }
            while (k != 2 * i - 1){ 
               System.out.print("* ");
               ++k;
            }
            System.out.println();
    }
}
}
    
