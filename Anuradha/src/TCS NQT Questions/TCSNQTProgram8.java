import java.util.Scanner;

public class TCSNQTProgram8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Parent Member");
        String parent = sc.nextLine();
        System.out.println("Has Parent Member has any child ? Y or N ");
        char hasChild = sc.next().charAt(0);

        int parentCommsion;

        if(hasChild == 'N'){
           System.out.println("TOTAL MEMBERS:1");
        System.out.println("COMISSION DETAILS");
        parentCommsion = 500;
        System.out.println(parent+" :"+parentCommsion +"INR");
        }
        else{
            System.out.println("Enter Child names:");
            String[] children = inputValidationS(sc).split(",");
            int len  = children.length;
            System.out.println("TOTAL MEMBERS: "+(len+1));
            System.out.println("COMISSION DETAILS");
            parentCommsion = len*500;
            System.out.println(parent+" :"+parentCommsion +"INR");

            for (int i = 0; i < len; i++) {
                System.out.println(children[i] + ": " + "250 INR");
            }

        }
      sc.close();
    }

    public static String inputValidationS(Scanner sc) {
        String name;
        do {
            while (!sc.hasNext("[A-Za-z,]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            name = sc.nextLine();
        } while (name.equals(""));
        return name;
    } 
    
}
