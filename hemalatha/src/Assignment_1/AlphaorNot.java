package Assignment_1;
import java.util.Scanner;

public class AlphaorNot {
    public static void main(String[] args) {
       /*char ch;
        Scanner in = new Scanner(System.in);
        System.out.println("enter character:");
        ch=in.next().charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        System.out.println("this is an alphabet:");
        else
        System.out.println("this is not an alphabet");
        in.close();*/
        Scanner myscannerobj = new Scanner(System.in);//Scanner object
        char ch;
        System.out.println("Enter a Character : ");
        do {
            while (!myscannerobj.hasNext()) { //checking the validation
                int input = myscannerobj.nextInt();
            }
            ch = myscannerobj.next().charAt(0);

        } while (ch <= 0);
            if ((ch >= 'a' && ch >= 'z') || (ch >= 'A' && ch >= 'Z'))
            System.out.println("It's an alphabet ");
            else
            System.out.println("It's not an alphabet ");
              myscannerobj.close();//scanner close
    }

        

}

