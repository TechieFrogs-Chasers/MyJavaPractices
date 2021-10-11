package InterviewQuestion;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        double n1 = SumOfNumbers.valid(scan);
        System.out.println("Enter the second Number: ");
        double n2 = SumOfNumbers.valid(scan);
        System.out.println("The addition of given numbers: "+ SumOfNumbers.addition(n1, n2));    
    }
    
    static double addition(double n1, double n2){
        double n3= n1+n2;
        return n3;
    }
    static double valid(Scanner scan){
         double num;
            do{
                System.out.println("Enter positive Number:");
                while(!scan.hasNextDouble()){
                    System.out.println("This is not a Number.Please enter positive Number:");
                    scan.next();
                }
                num = scan.nextDouble();
            }while(num <= 0);
          return num;
        }
}
