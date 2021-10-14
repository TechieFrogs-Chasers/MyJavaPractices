package InterviewQuestion;
import java.util.Scanner;
public class Chain {
    public static void main(String[] args) {
        String name,children;
        boolean boo;
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Parent member: ");
        name = sc.nextLine();
        System.out.println("Does he has a child member? :");
        c = sc.next();
        if((c == "N")||(c == "n")){
            System.out.println("The total Members:" + 1);
            System.out.println("Commision Details:");
            System.out.println(name + ": 250 INR");
        }
        else if ((c == "y")||(c == "Y")){
            System.out.println("Enter the child member: ");
           // sc.useDelimiter(",");
            children = sc.next();
            System.out.println("The total Members:" + children);
            System.out.println("Commision Details:");
            System.out.println(name + ": 250 INR");
        }
    }
}
