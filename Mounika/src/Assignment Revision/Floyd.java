import java.util.Scanner;



public class Floyd {
    
    public static void main(String[] args) {
        int num1, num2=1;
        Scanner scObj = new Scanner(System.in);
        do{
            System.out.println("Enter a value for num1");
            while(!scObj.hasNextShort()){
                String input = scObj.next();
                System.out.println("Please enter a valid number");
            }
            num1=scObj.nextInt();
        }while(num1<=0);
           /* do{
                System.out.println("Enter a value for num2 which is always less than num1");
                while(!scObj.hasNextShort()){
                    String input = scObj.next();
                    System.out.println("Please enter a valid number");
                }
                num2=scObj.nextInt();
            }while(num2<=0 |  num2 < num1);*/

            for(int i = 1; i <= num1; i++) {
    
                for(int j = 1; j <= i; j++) {
                    System.out.print(num2 + " ");
                    ++num2;
                }
                System.out.println();
            }
        
    }
}
    

