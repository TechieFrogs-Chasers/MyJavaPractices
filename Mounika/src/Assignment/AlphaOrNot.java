import java.util.Scanner;

public class AlphaOrNot{
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter an Value");
        char ch = scObj.next().charAt(0);
        
          if((ch>='A' && ch<='Z')||(ch>='a'&&ch<='z')){//ASCI value bwt 97-122, 65-90
                System.out.println("Given Value is Alphabet");
            }//if there are mutlpile state use a blck
            else{
                System.out.println("It is not an Alphabet");
                scObj.close();
            }
        
        }

    }
