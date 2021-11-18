package Strings_Step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//7.WAP to check particular character exist or not?
public class ExistString_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferObj=new BufferedReader(new InputStreamReader(System.in));//BufferReader
        System.out.println("Enter String : ");
        String stringName=bufferObj.readLine();
        char array[] = stringName.toCharArray();
        char ch = bufferObj.readLine().charAt(0);
        boolean flag=false;

        for(int i = 0; i < array.length - 1; i++) {

            if( array[i] == ch) {
                flag = true;

            }
        }

        if(flag==true){
            System.out.println("Given character "+ '"'+ ch + '"'+  " is present in given String "+ '"'+stringName+'"');

        }else {
            System.out.println("Given character "+ '"'+ ch + '"'+  " is not present in given String "+ '"'+stringName+ '"' );

        }
    }
}
