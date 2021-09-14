import java.util.Scanner;
public class Assignment13 {
    public static void main(String[] args) {
       
        Scanner alph = new Scanner(System.in);
        System.out.println("Give Alphabet");
        char ch = alph.next().charAt(0);
        alph.close();

        for(char i=ch ;i<='z';i++){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("Capital Letters"); 
    }
}
