package Strings;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphalow = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        String alphanumeric = alphabet+alphalow+digits;

        StringBuilder sb = new StringBuilder();
        
//create an object of random class
        Random x1 = new Random();

        int length =5;

        for(int i=0;i<length;i++){

            int a = x1.nextInt(alphanumeric.length());
            

            char x1Char = alphanumeric.charAt(a);
            

            sb.append(x1Char);
            
        }

        String randomString = sb.toString();
       
        System.out.println("Random String is: " + randomString);
       


        

    }
    
}
