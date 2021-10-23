package Strings;

public class Assign1 {
    public static void main(String[] args) {
        int vowcount=0;
        int concount=0;
        int digit=0;
        int space=0;
        String str = "Strings 10 methods";
        str=str.toLowerCase();
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowcount++;
            }
        
    
                else if(str.charAt(i)>='a' && str.charAt(i)<='z')
                {
                    concount++;
                }
                else if(str.charAt(i)>='1' && str.charAt(i)<='7'){
                    digit++;
                    

                }
                else if(str.charAt(i)==' ')
                {
                    space++;
                }
        }
        
        System.out.println("number of vowels " +vowcount);
        System.out.println("number of consonants " +concount);
        System.out.println("number of digits " +digit);
        System.out.println("number of spaces " +space);
        
    }
    
}
