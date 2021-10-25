package sindhu.src.TCS;

import java.util.Scanner;

public class Monkeys {
    

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        

        System.out.println("enter number of monkeys");
        int n = input.nextInt();
        if(n>0){

        System.out.println("enter number of eatable bananas by single monkey");
        int k = input.nextInt();

        System.out.println("enter number of eatable peanuts by single monkey");
        int j = input.nextInt();

        System.out.println("enter total number of bananas");
        int m = input.nextInt();

        System.out.println("enter total number of peanuts");
        int p = input.nextInt();

        n = m-k;
        int n1= p-j;
    
     System.out.println("number of monkeys left on the tree"+" " +n);
        }

     else {
         System.out.println("invalid input");
     }

       






        
    }
}
    

