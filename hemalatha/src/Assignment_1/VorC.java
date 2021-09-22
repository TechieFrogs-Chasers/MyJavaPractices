package Assignment_1;

import java.util.Scanner;

public class VorC {
    public static void main(String[] args){
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        //char ch = sc.nextChar();
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': i++;
        } //using if statements for checking conditions
        if(i==1)
            System.out.println("enter character  "+ch+" is vowel");
        else
        if((ch=='h' || ch=='g'))
            System.out.println("enter character  "+ch+" is consonant");
        else
            System.out.println("not an alphabet");
            sc.close();





    }

}

