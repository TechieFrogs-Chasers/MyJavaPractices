package TypeCasting;

public class palindromestring {

    public static void main(String[] args) {
        
       String s = "nitin";

        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();

        String s2 = s1.toString(); //converting string builder to string
        if(s.equals(s2)){
        System.out.println("palindrome string");
        }
        else {

            System.out.println("not a palindrome string");
        }

       
        

        
    }
    
}
