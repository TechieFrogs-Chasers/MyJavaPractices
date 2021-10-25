package StringsAssignment;

public class Assignment1 {
    public static void main(String[] args) {
    String str = "Hii Hello I am navya";
    int vowels = 0,digits = 0,space = 0, consonants = 0;
         for(int i = 0; i < str.length() ; i++){
             if (str.charAt(i) =='a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u' || str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U' ){
             vowels++;
                
             }
             else if ((str.charAt(i)>='a'&& str.charAt(i)<='z') || (str.charAt(i)>='A'&& str.charAt(i)<='Z') ){
                 consonants++;
                 
             } 
             else if (str.charAt(i) >= 0 && str.charAt(i) <= 9){
                 digits++;
                
             }
             else if (str.charAt(i) == ' '){
                 space++;
                 
             }
        } 
        System.out.println("print voewls = " + vowels );   
        System.out.println("print consonants = "+ consonants);  
        System.out.println("print consonants = "+ digits);    
        System.out.println("print space = "+ space); 
     }
 }

