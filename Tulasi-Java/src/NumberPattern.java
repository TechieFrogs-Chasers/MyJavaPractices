import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int row, num;
        int num1;
        do {
            System.out.println("Enter a positive number!");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("Its not a number!");
            }
            num1 = myScannerObj.nextInt();
        } while (num1 <= 0);

        for (row = 1; row <= num1; row++) {
            for (num = 1; num <= row; num++){
                System.out.print(num + " ");
        }
        System.out.println();
    }
       for(row=num1-1;row>=1;row--){
           for (num=1;num<=row;num++){
               System.out.print(num+" ");
           }
           System.out.println();
           myScannerObj.close();
       }
    }
}
