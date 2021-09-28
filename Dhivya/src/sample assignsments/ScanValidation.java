import java.util.Scanner;

public class ScanValidation {
    public static void main(String[] args) {
        int age, b;
        String name;
        System.out.println(" Enter your name: ");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println("Enter valid no for age: ");
       while(!scan.hasNextInt()) 
        {
            do
            {
                System.out.println("Enter valid no:");
            }age = scan.nextInt();

        }
        if(age>=0)
        {
            System.out.println(" Your name is : "+ name);
            System.out.println(" Your age is : "+ age);
        }
     
        }

    }

