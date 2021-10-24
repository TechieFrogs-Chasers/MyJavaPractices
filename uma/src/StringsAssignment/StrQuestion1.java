public class StrQuestion1 {

    public static void main(String[] args) {
        String str = "My name is Uma with id 10";

        int s =str.length();
        System.out.println(s);

        int x=0;
        char ch=0;
        for(int i =0; i<=str.length(); i++){
            
            x++;
            switch(x){
        
                case'a','e','i','o','u'->
                   System.out.println(x+" is a lower case vowel");
       
               case 'A','E','I','O','U'->
                   System.out.println(x+" is a upper case vowel");
               
       
               default->
                   System.out.println(x+"  is consonant");
               }
               System.out.println(x);
        }
    }
    
}
