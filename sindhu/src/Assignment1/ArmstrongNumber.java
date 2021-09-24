package Assignment1;

import java.util.Scanner;

/*public class ArmstrongNumber {
    public static void main(String[] args) {

     // 153 = 1*1*1 + 5*5*5 + 3*3*3
     // first we will go from back i.e; from 3

        
        int r,cube=0,num;
        Scanner input = new Scanner(System.in);
        System.out.println("enter  number");
        int temp = input.nextInt();
        num =temp;
        while(temp>0){
            r=temp%10;
            temp = temp/10;
            cube = cube+(r*r*r);

        }
        
        if(num==cube)
        {
            System.out.println("amstrong number");
        }
        else
        {
            System.out.println("not amstrong number");

        }
        input.close();
    }
    
}*/

// validation method

public class ArmstrongNumber {
    public static void main(String[] args) {
        int r,cube=0,num,temp;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("enter number");
            while(!input.hasNextInt())
            {
                String s = input.next();
                System.out.println(s+"please enter a valid number");
            }
            temp = input.nextInt();
        } while(temp<=0);
        num =temp;
        while(temp>0){
            r=temp%10;
            temp = temp/10;
            cube = cube+(r*r*r);

        }
        
        if(num==cube)
        {
            System.out.println("amstrong number");
        }
        else
        {
            System.out.println("not amstrong number");

        }
        input.close();
    }
    
}
    


