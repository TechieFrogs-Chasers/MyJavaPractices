import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        /*char ch = 'a';
        switch(ch){
            case 65:
            System.out.println("a is an alphabet");
            break;
            case 97:
            System.out.println("Given input is an alphabet");
            break;
            default:
            System.out.println("a is not a character");
        }*/
        Scanner Dream = new Scanner(System.in);
        System.out.println("Given alphabet is character");
        char s= Dream.next().charAt(0);

        switch(s){
            case 85:
            System.out.println("Given alphabet is Character");
            break;
            case 65:
            System.out.println("Given input is Character");
            break;
            default:
            System.out.println("Given input is not a Alphabet");
        }
    }
}
