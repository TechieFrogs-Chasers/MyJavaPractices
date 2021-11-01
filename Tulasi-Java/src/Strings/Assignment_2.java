package Strings;//Package

import java.util.Scanner;

public class Assignment_2 {//Driver class

    public static void main(String[] args) {//main method


        String word ="Java";
        char ch[] = word.toCharArray();
        int length = ch.length;
        char temp;
        String rev = " ";
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                rev = rev + word.charAt(i + 1) + word.charAt(i);
                System.out.println(rev);
            }
            else {
                rev+=word.charAt(i+1);
            }
        }
        System.out.println(" The original string : "+ word);
        System.out.println("The sort word in lexicographical order: "+rev);

    }
}
