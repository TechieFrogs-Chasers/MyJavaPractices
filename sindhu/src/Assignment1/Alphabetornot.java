package Assignment1;
/*import java.util.Scanner;

public class Alphabetornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the character");
        char ch =input.next().charAt(0);
        if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){    
            System.out.println(ch+"is an alphabet");
        }
        else {
            System.out.println(ch+"is not an alphabet");
            input.close();
        }

        }
 }*/



 
/*import java.util.Scanner;
 
public class Alphabetornot
{
    public static void main(String args[])
    {
        char character;
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a Character : ");
        character = scanner.next().charAt(0);
 
        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            System.out.print(character + " is an alphabet.");
        }else{
            System.out.print(character + " is not an alphabet.");
            scanner.close();
        }
    }
    }*/

    import java.util.Scanner;
 
public class Alphabetornot
{
    public static void main(String args[])
    {
        char character;
        Scanner scanner = new Scanner(System.in);

//int a,c;
do
    {
    System.out.print("Enter a character: " );
    while(scanner.hasNextInt())
    {
        String x = scanner.next();
        System.out.println(x+ "is not a valid character");
    }
    character = scanner.next().charAt(0);
    if((character>='a' && character<='z') || (character>='A' && character<='Z'))
   {
    System.out.print(character + " is an alphabet.");
   }
else
   {
    System.out.print(character + " is not an alphabet.");
    scanner.close();
   }
}while(character<=0);

    }
}
        
   