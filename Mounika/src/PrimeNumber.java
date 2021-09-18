import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        int num, primenumber=1, notprimenumber=1;
        Scanner scObj = new Scanner(System.in);
        do{
            System.out.println("Enter an Number to check it is prime or not"); 
            while(!scObj.hasNextInt()){
                String input = scObj.next();
                System.out.println("Entered value is not valid, please enter a valid number");
            }
            num = scObj.nextInt();
            
        }while(num<=0);
        scObj.close();
        //prime number
        int i = 2;
            for(i=2;i<num/2;i++){//quotient
                if(num%i==0){//reminder
                    System.out.println("Not a Prime");
                    break;
                }
            }
            if(!(num%i==0)){
                System.out.println("Given Value is a prime Number");
            }
            
    }
    
}
