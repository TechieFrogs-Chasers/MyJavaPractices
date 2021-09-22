package Assignment_1;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        int x,y,t; //t is temporary variable to store the values
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("before swapping");
        t=x;
        x=y;     //swapping
        y=t;
        System.out.println("after swapping:"+x+" "+y);
        sc.close();


    }
}

