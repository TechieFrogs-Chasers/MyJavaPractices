package BasicAssignment;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
         int num;
         int fact = 1;
         int i;
        do{
            System.out.println("Please Enter Positive number:");
            while (!myObj.hasNextInt()) {
                String input = myObj.next();
                System.out.println(input+ " This not an integer, Please enter valid integer");
                myObj.next();
            }
            num =myObj.nextInt();
        }while(num <= 0);
        for(i=1 ; i <=num; i++){
            fact = fact *i;
        }
            System.out.println("the factorial of  " + num +" is : "+fact);
    }
}
