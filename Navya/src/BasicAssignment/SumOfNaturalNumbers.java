package BasicAssignment;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
         int num;
         int sum = 0;
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
        myObj.close();
        for(i=1 ; i <=num; i++){
            sum = sum  + i;
        }
            System.out.println("the sum of natural numbers of  " + num +" is : "+sum);
    }
}
