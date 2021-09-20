import java.util.*;

public class ValidationLoop {

    //Static Long num;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Static Long input; //validate (Scanner.sc);

        long num = validate(sc);
        long num3 = validate(sc);
       /* do {
            System.out.println("Enter a phone number:");
            while (!sc.hasNextLong()) {
                System.out.println("This is not a phone number");
                sc.next();
            }
            num = sc.nextLong();
        }
        while (num <= 0);*/
        System.out.println(num);
        System.out.println(num3);
    }

    static long validate(Scanner sc) {
        long num;
        do {
            System.out.println("Enter a phone number:");
            while (!sc.hasNextLong()) {
                System.out.println("This is not a phone number");
                sc.next();
            }
            num = sc.nextLong();

        }
        while (num <= 0);
        return num;

    }


}

