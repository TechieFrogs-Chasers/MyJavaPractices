

import java.util.Scanner;

public class NestedForLoopLabel {
    public static void main(String[] args) {
        int num=1, num2 , sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of num :");
        num = sc.nextInt();
        num2= sc.nextInt();
        for(sum=0;num<=num2;++num)
        {//System.out.println("Enter value of num :" +num);
            sum=sum+num2;
        }
        System.out.println("The sum of the numbers is : " +sum);
    }
}