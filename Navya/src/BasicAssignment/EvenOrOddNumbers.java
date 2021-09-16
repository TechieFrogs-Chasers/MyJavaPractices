package BasicAssignment;

import java.util.Scanner;

    public class EvenOrOddNumbers {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            int a;
            do{
                System.out.println("please enter a positive number:");
                while (!myObj.hasNextInt()) { // if object was not an integer than goes to print Statement
                    String input = myObj.next(); // to print String from end user
                    System.out.println( input +"  This is an valid number,please enter valid number");
                }
                a = myObj.nextInt();
        
            }
            while( a <= 0);
            myObj.close();
            if(a % 2 ==0){
                System.out.println("it is a number is even");
            }
            else
            System.out.println("it is a number is odd ");

        }
    }