public class StrQuestion1 {

    public static void main(String[] args) {
        String str = "My name is Uma & with id 10!";

        int s =str.length();
        System.out.println(s);

        int vowel=0;
        int consonant=0;
        int spaces =0;
        int punctuation=0;
       
        for(int i =0; i<str.length(); i++){
           
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowel++;
                
            }
             if(str.charAt(i)=='!'||str.charAt(i)=='?'||str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)==':'||str.charAt(i)==';'||
            str.charAt(i)=='/'||str.charAt(i)=='&'){

                punctuation++;
            }

            if(str.charAt(i)==' '){
                spaces++;
            }
            else{
            consonant++;

            }
            
            
        }
            
            System.out.println("number of vowels in the string is  : "+vowel);
            System.out.println("number of consonants in the string is  :"+consonant);
            System.out.println("number of spaces in the string is  : "+spaces);
            System.out.println("number ofpunctuation marks in the string is  : "+punctuation);
           
            
           
           
        
    }
    
}
