import java.util.*;

public class ScannersMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your valid zip code : ");
        int num = sc.nextInt();
        System.out.println("Enter your address :");
        sc.nextLine();
        String address = sc.nextLine();
        //sc.nextLine();
        System.out.println("Output: " + sc.findInLine("HN"));
        System.out.println("Left String: " + sc.nextLine());
       //System.out.println("Delimiter:"+sc.delimiter());
        System.out.println("Enter your first name :");
        String firstname = sc.next();
        System.out.println("Enter your last name :");
        String lastname = sc.next();
        System.out.println("Are you a employee (y/n) :");
        char employee = sc.next().charAt(0);
        if (employee == 'y')
            System.out.println("Yes I am an employee.");
        else
            System.out.println("No I am not an employee");
        System.out.println("Enter your mail ID : ");
        String usermail=sc.next();
        System.out.println("Is your given data is true : ");
        boolean bn = sc.nextBoolean();
        if (bn == true) {
            System.out.println("My data is correct ");
        } else if (bn == false) {
            System.out.println("No my data is not correct ");
            sc.close();
        }
    }
}

