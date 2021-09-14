package Assignment1;

import java.util.Scanner;


public class VowelConsonant {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("enter any character");
      char ch = input.next().charAt(0); 
      
      //boolean isVowel = false;

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': //isVowel = true;
            
            /*if(isVowel){
                System.out.println(c+ "is a Vowel");
            }
                else{
                    System.out.println(c+ "is not a Vowel");
                }*/
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");

            input.close();
            }


              
                
       
        }
    }
   


