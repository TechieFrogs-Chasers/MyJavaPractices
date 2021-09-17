import java.util.Scanner;

public class Alphabetornot {
    public static void main(String...args){
        Scanner object= new Scanner(System.in);
        char ch;
        do {
            System.out.println("enter any alphabet ");
            while(object.hasNextInt())
            {
                String n=object.next();
                System.out.println(n+ " this is not a alphabet .enter valid one ");
            }ch=object.next().charAt(0);
        }while(ch<=0);
        if ((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println( ch + " is an alphabet ");
        }
        else
        {
        System.out.println(ch +" is not an alphabet ");    
        }
        object.close();
    }
    
}
