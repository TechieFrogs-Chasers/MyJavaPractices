package BasicAssignment;

import java.util.Scanner;

public class VowelsOrConsonants {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        char ch = myObj.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
            System.out.println(ch+" is an lowercase Vowels");
        }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U' ){
                System.out.println(ch+ " is an uppercase vowels");
            }
            else 
            System.out.println(ch +" is a consonants");
            myObj.close();
    }
}
