package BasicPractices;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

         int a, b, c ,largest ; 
Scanner three = new Scanner(System.in);  
//reading input from the user  
System.out.println("Enter the first number:");  
a = three.nextInt();  
System.out.println("Enter the second number:");  
b = three.nextInt();  
System.out.println("Enter the third number:");  
c = three.nextInt();  
three.close();
largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
System.out.println("The largest number is: "+largest);
    }
    
}
