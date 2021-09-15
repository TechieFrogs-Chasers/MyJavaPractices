package BasicAssignment;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    char alpha;
    do{
        while (myObj.hasNextInt()) {
            char ch;
           // String input = myObj.next();
            System.out.println(" This is not a Alphabet,Please enter valid Alphabet:");
            /*ch = myObj.next().charAt(0);
            if (!(Character.isLetter(ch))){
                   System.out.println("This is not a char.enter valid char");
            }*/
        }
        alpha = myObj.next().charAt(0);
    }while(!((alpha > 'a' &&  alpha < 'z')||( alpha > 'A' && alpha < 'Z')) );
    System.out.println(alpha + " It is a Alphabet");
    myObj.close();
}
}
