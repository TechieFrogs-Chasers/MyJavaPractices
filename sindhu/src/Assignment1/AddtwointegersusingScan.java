package Assignment1;
import java.util.Scanner; 
public class AddtwointegersusingScan{
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //create an scanner object

    System.out.println("Enter an integer  : "  );
   int data1 = input.nextInt(); // reads input from the user

    System.out.println("Enter an integer 1 : " );
    int data2 = input.nextInt(); //reads input from the user

    int data3 = data1 + data2;
    System.out.println("Add two integers " + data3);
    input.close(); 
    
 }
}
