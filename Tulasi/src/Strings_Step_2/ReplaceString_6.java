package Strings_Step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//6.WAP to replace particular character in given String?
public class ReplaceString_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferObj = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        String string = bufferObj.readLine();

        System.out.println("Enter a character to replace with *");
        char ch = (char)bufferObj.read();
        String newString = string.replace(String.valueOf(ch),"*");
        System.out.println("String "+string +" after replacing "+ch +" is :"+newString);
    }
}
/*Enter String: java
Enter a character to replace with *
a
String java after replacing a is :j*v*
*/