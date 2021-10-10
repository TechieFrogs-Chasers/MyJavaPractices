package InterviewQuestion;

import java.util.Scanner;

public class Monkey {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the no of Monkeys:");
        int n = obj.nextInt();
        System.out.println("Please enter the no of bananas a monkey can eat:");
        int k = obj.nextInt();
        System.out.println("Please enter the no of peanuts a monkey can eat:");
        int j = obj.nextInt();
        System.out.println("Please enter the no of banans given:");
        int m = obj.nextInt();
        System.out.println("Please enter the no of peanuts given:");
        int p = obj.nextInt();

        if((n<0)||(k<0)||(j<0)||(m<0)||(p<0)){
            System.out.println("Invalid Input");
        }
        else {
            int rem = n-((m/k)+(p/j));
            System.out.println("Number of Monkeys left on the tree: " + rem);
        }
        
    }
    
}
