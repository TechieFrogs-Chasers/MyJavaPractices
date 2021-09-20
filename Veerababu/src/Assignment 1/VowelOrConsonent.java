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
            int a;
            do
            {
                System.out.println("Give Input");
                while(!Obj.hasNextInt())
                {
                    Obj.hasNext();
                    s = Obj.next().charAt(1);
                    switch(s)
                    {
                        case 'A' -> System.out.println("A is Vowel");
                        case 'E' -> System.out.println("E is Vowel");
                        case 'I' -> System.out.println("I is Vowel");
                        case 'O' -> System.out.println("O is Vowel");
                        case 'U' -> System.out.println("U is Vowel");
                        default  -> System.out.println("Given input is Consonent");
                    }
                    
                }
                 a = Obj.nextInt();
            }while(a<=10);
            Obj.close();          
            
        System.out.println("Invalid");
    }
}