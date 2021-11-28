package Strings_Step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8.WAP to count given character from given string as below?
public class CountStrings_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferObj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        String stringName = bufferObj.readLine();
        char ch = bufferObj.readLine().charAt(0);
        System.out.print("Total count given character from given string "+ch+"' is: ");
        System.out.println(countstring(stringName,ch));
    }

    public static  int countstring(String stringName,char ch ) {
        char arr[] = new char[stringName.length()];
        int count = 0;
        for (int i = 0; i < stringName.length(); i++) {
            arr[i] = stringName.charAt(i);
            if (arr[i] == ch) {
                count++;

            }

        }
        return count;
    }
}