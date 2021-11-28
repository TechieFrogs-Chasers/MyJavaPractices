package Strings_Step_2;
//20.WAP to count no of numeric present in a given string?
public class NumString_20 {
   /* public static void main(String[] args) {
        String s="coding is harder in Java 1234567890";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                count++;

        }
        System.out.println("the number of digits in the given string is:" + count);
    }*/
   public static void main(String[] args) {
       String str = "welcome to online java classes ";

       int count = 1;

       for (int i = 0; i < str.length() - 1; i++)
       {
           if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
           {
               count++;
           }
       }
       System.out.println("Number of words in a string : " + count);
   }
}
