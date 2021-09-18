import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scObj = new Scanner(System.in);
        do{
            System.out.println("Enter a value for num1");
            while(!scObj.hasNextShort()){
                String input = scObj.next();
                System.out.println("Please enter a valid number");
            }
            num1=scObj.nextInt();
        }while(num1<=0);
        do{
            System.out.println("Enter a value for num2");
            while(!scObj.hasNextShort()){
                String input = scObj.next();
                System.out.println("Please enter a valid number");
            }
            num2=scObj.nextInt();
        }while(num2<=0);

        int gcd = 1, i, y;
        for(i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
            
        }
        System.out.printf("GCD of %d and %d is: %d", num1,num2,gcd);
        
    }


    
}
