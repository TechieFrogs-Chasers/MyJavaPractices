package sindhu.src.TCS;

import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("please enter approx. weight");
        int x = input.nextInt();

        if((x>=1) && (x<=2000)){
            System.out.println("time estimated : 25minutes");
        }
        else if ( (x>=2001)&&(x<=4000)){
            System.out.println("time estimated : 35minutes");
        }
        else if ((x>=4000)&& (x<=7000)){
            System.out.println("time estimated : 45 minutes");
        }
        else if (x == 7000) {
            System.out.println("OVERLOADED");
        }
        else {
            System.out.println("INVALID INPUT");
        }
    }
    
}
