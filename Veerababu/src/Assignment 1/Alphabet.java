import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        /*char ch = 'a';
        switch(ch){
            case 65:
            System.out.println("a is an alphabet");
            break;
            case 97:
            System.out.println("Given input is an alphabet");
            break;
            default:
            System.out.println("a is not a character");
        }*/
      /*  Scanner Dream = new Scanner(System.in);
        System.out.println("Given alphabet is character");
        char s= Dream.next().charAt(0);

        switch(s){
            case 85:
            System.out.println("Given alphabet is Character");
            break;
            case 65:
            System.out.println("Given input is Character");
            break;
            default:
            System.out.println("Given input is not a Alphabet");
        }*/
        Scanner Obj = new Scanner(System.in);
        boolean b;         
        do
        {   
                System.out.println("Enter alphabets");
        
                    if(!Obj.hasNextInt())
                    {
                        Obj.hasNext();  
                        char c = Obj.next().charAt(1);
                            switch(c)
                            {
                                case 65 -> System.out.println("1.Given input is Alphabet i.e.,"+" "+c);
                                case 68 -> System.out.println("2.Given input is Alphabet i.e.,"+" "+c);
                                case 69 -> System.out.println("3.Given input is Alphabet i.e.,"+" "+c);
                                case 97 -> System.out.println("4.Given input is Alphabet i.e.,"+" "+c);
                                case 'z'-> System.out.println("5.Given input is Alphabet i.e.,"+" "+c);
                                default -> System.out.println("Invalid Input");
                            }
                    }
                    else
                    {
                        System.out.println("Given input is not a alphabet");
                    }

                b = Obj.nextBoolean();
        }while(b== true);
        Obj.close();
                System.out.println("Program Ended");
    }
}
