package Assignment1;

import java.util.Scanner;

/*public class Palindromeprogram {
    public static void main(String[] args){
        int num = 2442, reversedNum = 0, remainder;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num/ 10;
          }
        if (reversedNum==originalNum)
        {
            System.out.println("palindrome");
        }
            else 
            {
                System.out.println("not palindrome");
            }
        
    }
 }*/

 //scanner method
 /*public class Palindromeprogram {
    public static void main(String[] args){
        int num, reversedNum = 0, remainder;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
         num = input.nextInt();
         int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num/ 10;
          }
        
        if (reversedNum==originalNum)
        {
            System.out.println("palindrome");
        }
            else 
            {
                System.out.println("not palindrome");
            }

        input.close();
        }
}*/

//validation method
public class Palindromeprogram {
    public static void main(String[] args){
        int  reversedNum = 0, remainder,x;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("enter a number");
            while(!input.hasNextInt()){
                String s = input.next();
                System.out.println(s+"please enter a valid number");
            }
            x = input.nextInt();
        }while(x<=0);

        int originalNum = x;
        while (x != 0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x = x/ 10;
          }
        
        if (reversedNum==originalNum)
        {
            System.out.println("palindrome");
        }
            else 
            {
                System.out.println("not palindrome");
            }

        input.close();



    }
}

    

