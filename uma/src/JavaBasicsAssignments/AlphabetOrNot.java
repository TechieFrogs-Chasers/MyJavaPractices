package JavaBasicsAssignments;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
       System.out.println("program for alphabet or not ");
       
        System.out.println("Enter a character ");

      Scanner AlphabetOrNotobj = new Scanner(System.in);

      char ch = AlphabetOrNotobj.next().charAt(0);

    
     
  if(ch>='a' && ch<='z'){
      
      System.out.println("Entered input is a lower case alphabet");}

    else if (ch>='A' && ch<='Z')

      System.out.println("Entered input is an upper case alphabet");
  else
      System.out.println("Entered input is not an alphabet");

      
     AlphabetOrNotobj.close();


}
}