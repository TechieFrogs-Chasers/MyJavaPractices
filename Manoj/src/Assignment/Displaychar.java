import java.util.Scanner;
public class Displaychar {
    public static void main(String...args){
        Scanner object= new Scanner(System.in);
        char ch;
        do{
            System.out.println("enter an charater ");
            while(object.hasNextInt())
            {
                String s=object.next();
                System.out.println( s+ "this is not a character please enter a valid one ");
            }ch=object.next().charAt(0);

        }while(ch<=0);
        object.close();
         for (ch='A' ; ch<='Z'; ++ch){
             System.out.println(ch +"is displayed character  ");
         }
         
    }
    
}
