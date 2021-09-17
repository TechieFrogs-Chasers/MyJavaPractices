import java.util.Scanner;

public class GuessMyNumber {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int guess, tried, equal = 0;
        num = (int) (Math.random() * 10) + 1; // get random number between 1 and 100

        tried = 1;
        guess = 0;
        do {
            System.out.println("\"Enter a guess between 1 and 10 : ");
           // guess = console.nextInt();
            tried++;
            if (guess < 10) {
                System.out.println("Too high! Try Again");
            } else if (guess < num) {
                System.out.println("Too low! Try Again");
            } else {
                System.out.println("Correct! You got it in " + tried + " guesses!");
            }
            guess++;

        }while(guess != num) ;
     System.out.println("Gusee my number: ");
     System.out.println("");

    }

}