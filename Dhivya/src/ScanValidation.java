import java.util.Scanner;

public class ScanValidation {
    public static void main(String[] args) {
        int a, b;
        String name;
        System.out.println(" Enter your name: ");
        Scanner n1 = new Scanner(System.in);
        if(n1.hasNext()) 
        {
            name= n1.next();
            System.out.println(" Your name is : "+ name);
        }

        else{
            System.out.println("Enter valid data");
        }


    }
}
