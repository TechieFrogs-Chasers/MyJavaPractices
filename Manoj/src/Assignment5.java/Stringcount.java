//package Assignment5.java;

public class Stringcount {
    public static void main(String...args){
        String s1=" Count no of Digits,1,2,3,4,5 ,vowels , spaces and consonants";
        int vowels=0, consonants=0,digits=0,spaces=0;

        s1=s1.toLowerCase();
        for(int i=0; i<s1.length();++i){
        char ch= s1.charAt(i);

        if (ch=='a'|| ch=='e'|| ch=='i' || ch=='o'||ch=='u'){ //here it checks the vowels 
            ++vowels;
        }
        else if (ch>='a'&& ch<='z'){// here it checks the consonants
            ++consonants; 
        }
        else if(ch>='0' && ch<='9'){//here it checks the numbers
            ++digits;
        }
        else if (ch==' '){//here it checks the white spaces
            ++spaces;
        }
        }
        System.out.println("vowels are: "+vowels);
        System.out.println("consonants are: "+consonants);
        System.out.println("Digits: "+digits);
        System.out.println("White spaces: "+ spaces);
    }
    
}
