import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        char s;
      /* char ch ='z';        
        if(ch =='a'|| ch =='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Given alphabet is Vowel");
        }
        else
        
        System.out.println("Given alphabet is Consonent"); */
     
     /*   Scanner Vowel = new Scanner(System.in);
        System.out.println("Give alphabet"); 
       char s1 = Vowel.next().charAt(0);

            switch(s1)
            {
                case 'a':
                System.out.println("a is vowel");
                break;
                case 'e':
                System.out.println("e is vowel");
                break;
                default:
                System.out.println("Given Alphabet is Consonent");
            }Vowel.close(); */
            Scanner Obj = new Scanner(System.in);

                if(!Obj.hasNextInt())
                {
                   String i = Obj.next();
                    System.out.println("Enter alphabet"+ i);
                    s= Obj.next().charAt(2);
                    switch(s)
                    {
                        case 'a' -> System.out.println("a is Vowel"); 
                        case 'e' -> System.out.println("e is Vowel");
                        case 'i' -> System.out.println("i is Vowel");
                        case '0' -> System.out.println("o is Vowel");
                        case 'u' -> System.out.println("u is Vowel");
                        default  ->  System.out.println("Given alphabet is not a Vowel");
                    }
                }
                else
                {
                    System.out.println("Given alphabet is Consonent");
                }Obj.close();
            
       // System.out.println("Z is not a Vowel");
    }
}