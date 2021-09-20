import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter any number to verify whether it a prime number or not:");
        int prime= SC.nextInt();
    for(int i=2;i<prime/2;i++){
        if(prime%i==0){
            System.out.println("prime value");
        break;}
            else
            System.out.println("Not a prime number");

        }
    }


    }

