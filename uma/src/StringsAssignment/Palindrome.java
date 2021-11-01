public class Palindrome {
    

    public static void main(String[] args) {
        
        String str = "dadad";
        for (int i=0; i<str.length(); i++){
            for (int j =str.length()-1; j>i; j--){

                if(str.charAt(i) != str.charAt(j))

                System.out.println(" notpalindrome");
                
            }
          //  System.out.println(" notpalindrome");

        }
        
        System.out.println("palindrome");
    }
}
