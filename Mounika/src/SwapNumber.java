import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
           int i,j;
                System.out.println("Enter Value for i");
                i =scObj.nextInt();
                System.out.println("Enter Value for j");
                j =scObj.nextInt();
                    int k = i;
                    i =j;
                    j = k;
                    System.out.println(" After Swaping values of i and j");
                    System.out.println("Value of i :"+i);
                    System.out.println("Value of j :"+j);
    }

 /* static  String validatePositiveIntNumber(Tokens tokens){
    String input = tokens.nextLine();
                while(input = tokens.nextLine());
                    //System.out.println("Please enter a valid number");
                    //while(!scanner.hasNextInt()){
                    
                    System.out.println("Please enter a valid number");
                
             
        
            System.out.println("Enter value is a valid ");
           return input;
        }*/
}       
    
    

