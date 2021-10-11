package InterviewQuestion;

import java.util.Scanner;

public class EnglishWords {
    public static void main(String[] args) {
        String w1 ="";
        String w2 ="";

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the First word: ");
        String word1 = obj.nextLine();
        System.out.println("Enter the second word: ");
        String word2 = obj.nextLine();
        System.out.println("Enter the third word: ");
        String word3 = obj.nextLine();
         word3= word3.toUpperCase();
         int length1 = word1.length();
         int length2 = word2.length();
         for(int i=0;i<length1;i++){
             char c = word1.charAt(i);
             if((c=='A')||(c=='a')||(c=='E')||(c=='e')||(c=='I')||(c=='i')||(c=='O')||(c=='o')||(c=='u')||(c=='U')){
                 w1 = w1+'%';
             }else{
                w1 = w1+c;
             }
            }
            for(int i=0;i<length2;i++){
                char c = word2.charAt(i);
                if(((c>='A')&&(c<='Z'))||((c>='a')&&(c<='z'))){
                    if((c=='A')||(c=='a')||(c=='E')||(c=='e')||(c=='I')||(c=='i')||(c=='O')||(c=='o')||(c=='u')||(c=='U')){
                        w2= w2+c;
                    }else{
                        w2=w2+'#';
                    }
                    
                    }
            }
            System.out.println("The concatenation of three words: "+ w1+w2+word3);
    }
}