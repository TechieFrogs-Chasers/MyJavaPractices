package BasicAssignment;

import java.util.Scanner;

public class EvenOrOddNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        System.out.println("A= "+ a);
        if(a % 2 ==0){
            System.out.println("it is a number is even");
        }
        else
        System.out.println("it is a number is odd ");

}
}