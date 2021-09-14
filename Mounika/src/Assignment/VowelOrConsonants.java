package Assignment;
import java.util.Scanner;
 class VowelOrConsonants {
    
    public static void main(String[] args) {
        System.out.println("Enter an Alphabet");
        Scanner alphaObj = new Scanner(System.in);
        char ch = alphaObj.next().charAt(0);//return type for char
        switch(ch){
            case 'A', 'E', 'I', 'O', 'U'-> System.out.println(" Given Alphabet is a Vowel");
            default->
               System.out.println(" Given Alphabet is a Consonants");
            }
            alphaObj.close();
        }

    }
 
