package BasicsAssignment.NumberPrograms;
import java.util.Scanner; 
public class VowelORConstant {
    public static void main(String[] args) {
    Scanner ab = new Scanner(System.in);
    System.out.println("Enter any Character to verify whether it is Vowel or Constant");
    char str = ab.next().charAt(0);
    if( str == 'a' || str == 'A' ||str == 'E' ||str == 'e' ||str == 'i' ||str == 'I' ||str == 'o' ||str == 'O' ||str == 'u' ||str == 'U' )
         System.out.println("Enter character is an  Vowel");
    else
          System.out.println("Entered Character is Constant");
  
  ///using for each
  char array[] = {'a','e','i','o','u','A','E','I','O','U'};
  for (char c : array) {
      if( str == c ){
          System.out.println("VOWEL");
          break;
      }
      else
        {
         System.out.println("CONSTANT");  
         break; 
        }
  }
  ab.close();
}
}