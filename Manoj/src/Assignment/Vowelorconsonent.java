
import java.util.Scanner;

public class Vowelorconsonent {

    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        char ch; 
            do{
                System.out.println("enter a character");
                while(object.hasNextInt())
                {
                  String n=object.next(); 
                  System.out.println(n +" this is not a character .enter a valid one ");
                }
                ch=object.next().charAt(0); //charAt represents the specific index position of a string 

            }while(ch<=0);
    
    switch(ch)
    {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        System.out.println(ch +" is vowel");
        break;
        default:
        System.out.println(ch +"is consonant");

    }
    object.close();

    }
}
