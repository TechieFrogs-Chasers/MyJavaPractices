import java.util.Scanner;
public class Displaychar {
    public static void main(String...args){
        Scanner object= new Scanner(System.in); //object created  using scanner 
        char ch;
        do{                                 //here we check the validation using so while 
            System.out.println("enter an charater ");
            while(object.hasNextInt())
            {
                String s=object.next();
                System.out.println( s+ "this is not a character please enter a valid one ");
            }
            ch=object.next().charAt(0);

        }while(ch<=0);
        object.close(); //object closed 
         for (ch='A' ; ch<='Z'; ++ch){
             System.out.println(ch +"is displayed character  ");
         }
         
    }
    
}
