package Strings_Step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//5.WAP to remove a particular character from the string?
public class RemoveString_5 {
    public static void main(String[] args) throws IOException {
      /*  String name=new String("Too remove a particular character from the string!");
        System.out.println(name.replace('o',' '));

        String name1="Remove a particular character from the string! ";
        System.out.println(stringMethod(name1,6));
    }
    public static String stringMethod(String remove, int position){
        return remove.substring(position+1);*/

        BufferedReader bufferObj = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        String string = bufferObj.readLine();

        System.out.println("Enter a character to remove");
        char ch = (char)bufferObj.read();
        String newString = string.replace(String.valueOf(ch),"");
        System.out.println("String "+string +" after removing "+ch +" is :"+newString);

    }
}
