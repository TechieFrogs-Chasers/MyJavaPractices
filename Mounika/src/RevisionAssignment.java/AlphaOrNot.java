import java.util.Scanner;

public class AlphaOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a some character ");
        Scanner alphaObj = new Scanner(System.in);
        char ch = alphaObj.next().charAt(0);
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("Given Value is Alphabet");
        }
        
        else{         //(!(ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("Given Value is not Alphabet");
               System.out.println("Enter an Alphabet ");
               alphaObj.close();
            }// no need of validation because it fall under string, string doesn't need a validation

    }
    
}
    

