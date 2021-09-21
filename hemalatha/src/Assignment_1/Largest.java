package Assignment_1;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number:");
        x=in.nextInt();
        System.out.println("enter the second number:");
        y=in.nextInt();
        System.out.println("enter the third number:");
        z=in.nextInt();
        if(x>y && x>z)
        {
            System.out.println("largest number is: " +x);
        }
        else if(y>z)
        {
            System.out.println("largest number is: " +y);
        }
        else
        {
            System.out.println("largest number is: " +z);
        }
        in.close();



        
    }
    

}
