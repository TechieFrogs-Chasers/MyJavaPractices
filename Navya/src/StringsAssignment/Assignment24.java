package StringsAssignment;

public class Assignment24 {
    public static void main(String[] args) {
        int numbrOfVowels = 0, numbrOfConsonants = 0;    
            
        //Declare a string    
        String str = "No of vowels and consonants in the string";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                numbrOfVowels++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                numbrOfConsonants++;    
            }    
        }    
        System.out.println("Number of vowels: " + numbrOfVowels);    
        System.out.println("Number of consonants: " + numbrOfConsonants);    
    }
}
