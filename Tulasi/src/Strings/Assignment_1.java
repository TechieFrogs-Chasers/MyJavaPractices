package Strings;//Package

import java.util.Scanner;

public class Assignment_1 {//Driver class

    public static void main(String[] args) {//main method
        int vowels=0,digits=0,spaces=0,consonants=0,special_Characters = 0;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence=scannerObj.nextLine();
        char str[]=sentence.toCharArray();
        int n=str.length;
        for(int i=0;i<n;i++){
            if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
                vowels++;
            }
            else if((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z')){
                consonants++;
            }
            else if((str[i]>='0'&&str[i]<='9')){
                digits++;
            }
            else if(str[i]==' '){
                spaces++;
            }
            else {
                special_Characters++;
                
            }
        }
        System.out.println("Vowels = "+vowels);
        System.out.println("Consonants = "+consonants);
        System.out.println("Digits = "+digits);
        System.out.println("White spaces = "+spaces);
        System.out.println("Special characters = "+special_Characters);
    }
}
