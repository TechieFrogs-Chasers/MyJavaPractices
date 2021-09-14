import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
      /*  char ch ='z';        
        if(ch =='a'|| ch =='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Given alphabet is Vowel");
        }
        else
        
        System.out.println("Given alphabet is Consonent");
    */
        Scanner Vowel = new Scanner(System.in);
        System.out.println("Give alphabet");
        char s1 = Vowel.next().charAt(0);

        switch(s1){
            case 'a':
            System.out.println("a is vowel");
            break;
            case 'e':
            System.out.println("e is vowel");
            break;
            default:
            System.out.println("Given Alphabet is Consonent");
        }

        System.out.println("Z is not a Vowel");
    }
}