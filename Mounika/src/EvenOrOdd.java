import java.util.Scanner;
public class EvenOrOdd {
    

    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
       // System.out.println("Enter the Integer Number");
        short num = validation(scObj);
        
        String value = (num%2==0) ? "Even": "Odd";
        // why string here is string accepts both int value and char values
        System.out.println(num+" is "+ value + " Number");
    }    
    static short validation(Scanner scanner){
        short num;   
        do{
            System.out.println("Enter a Value");
             while(!scanner.hasNextShort()){
                 String input = scanner.next();
                 System.out.println("Please enter a valid number");
             }
             num = scanner.nextShort();
             //System.out.println("Entered Value is Valid");
             
        }while(num<0);  
         return num; 
    
    }
    
}
