import java.util.Scanner;
public class S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Roll Number");
        int a = in.nextInt();
        System.out.println("Name");
        String n = in.next();
        System.out.println("Clg Name");
        String c = in.next();
        System.out.println("Location");
        String l = in.nextLine();
        System.out.println("Print BooleanValue");
        boolean b = in.nextBoolean();
        in.close();

        System.out.println("Location"+" "+l+" "+"Roll Number="+" "+a+" "+"Name="+" "+" "+n+" "+"Clg Name="+" "+c+" "+"Print Boolean"+" "+b);
    }
}
