package BasicAssignment;

import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
         int n;
           do{
            System.out.println("Please Enter Positive number:");
            while (!myObj.hasNextInt()) {
                String input = myObj.next();
                System.out.println(input+ " This not an integer, Please enter valid integer");
                myObj.next();
            }
            n =myObj.nextInt();
        }while(n <= 0);
        myObj.close();
        for(int i = 1; i <= 10; i++){
            System.out.println(n +" * " + i + " = " +n*i);
        }
    }   
}
