import java.util.Scanner;



public class SwapNumber {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
           int i,j;
            i =validation(scObj);
            System.out.println("i Value is : "+i);
            j =validation(scObj);
            System.out.println("j Value is : "+j);
                int k = i;
                i =j;
                j = k;
                System.out.println(" After Swaping values of i and j");
                System.out.println("Value of i :"+i);
                System.out.println("Value of j :"+j);
                    
    }

        static  int validation(Scanner scanner){
            int num;
            
                do{
                   System.out.println("Enter a Value");
                    while(!scanner.hasNextInt()){
                        String input = scanner.next();
                        System.out.println("Please enter a valid number");
                    }
                    num = scanner.nextInt();
                    System.out.println("Entered Value is Valid");
                    
                }while(num<0);
               // System.out.println("Please enter a valid number");
                
                
            return num;
                
           
        }
       
}       
    
    

