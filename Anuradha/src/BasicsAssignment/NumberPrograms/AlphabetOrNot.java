package BasicsAssignment.NumberPrograms;
import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String args[])
    {
    Scanner ab = new Scanner(System.in);
    System.out.println("Enter any Character to verify whether it is Alphabet or Not");
    char alp = ab.next().charAt(0);
    if( ( alp >= 'a' && alp <= 'z') || ( alp >= 'A' && alp <= 'Z' )) {
    System.out.println("Enter character is an  Alphabet");
    }
  else{
      System.out.println("Entered Character is not an Alphabet");
  }
  ab.close();
    }
   
    
}
