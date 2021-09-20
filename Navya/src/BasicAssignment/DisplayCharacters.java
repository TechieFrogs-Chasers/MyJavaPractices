package BasicAssignment;

import java.util.Scanner;

public class DisplayCharacters {
    public static void main(String[] args) {
       // Scanner myObj = new Scanner(System.in);
        char ch;
        //do{
           // System.out.println(" Please enter Char:");
        //}
            //while (myObj.hasNextInt()); 
                //char ch;
               // String input = myObj.next();
               // System.out.println(" This is not a Alphabet,Please enter valid Alphabet:");
                /*ch = myObj.next().charAt(0);
                if (!(Character.isLetter(ch))){
                       System.out.println("This is not a char.enter valid char");
                }*/
             for(ch = 'A'; ch <= 'Z'; ++ch){
                System.out.print(ch + " ");
             //alpha = myObj.next().charAt(0);
             //System.out.println();
             //myObj.close();
             }
    }    
}   
