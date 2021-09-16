        package BasicAssignment;

        import java.util.Scanner;

        public class AmstrongNumbers {
            public static void main(String[] args) {
            Scanner myScannerObj=new Scanner(System.in);
            int check, rem, sum = 0;
            int num;
            do {//Validation
                System.out.println("Please enter a positive number! ");
                while (!myScannerObj.hasNextInt()) {
                    String input = myScannerObj.next();
                    System.out.println( input +" That's not a number!");
                }
                num = myScannerObj.nextInt();
            } while (num <= 0);
            myScannerObj.close();//Scanner Close
            check = num;
        while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }
        if(sum == num)
            System.out.println("Given number is an armstrong number.");
        else
            System.out.println("Given number is not an armstrong number.");
        }
    }