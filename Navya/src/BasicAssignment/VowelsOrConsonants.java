package BasicAssignment;

import java.util.Scanner;

public class VowelsOrConsonants {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        char ch ;
        do{
            System.out.println("please enter a valid char:");
            while (myObj.hasNextInt()) { // if object was not an integer than goes to print Statement
                String input = myObj.next(); // to print String from end user
                //System.out.println(input.length());
                System.out.println( input +"  This is an valid number,please enter valid number");
                
            }
            ch = myObj.next().charAt(0);
         }
         while(!((ch > 'a' &&  ch < 'z')||( ch > 'A' && ch < 'Z')));
         //for(ch = 97; ch <=122; ch++);
         //for(ch = 65; ch <=90; ch++);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
            System.out.println(ch+" is an lowercase Vowels");
        }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U' ){
                System.out.println(ch+ " is an uppercase vowels");
            }
            else{
            System.out.println(ch +" is a consonants");
            myObj.close();
            }
    }
}
