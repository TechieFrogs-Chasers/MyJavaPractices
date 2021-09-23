package Assignment_1;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int num,number,temp,total=0;
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        num=scan.nextInt();
        number=num;
        while(number!=0)
        {
            temp=number%10;
            total=total+temp*temp*temp;
            number=number/10;
        }
        if(total==num)
        {
            System.out.println("armstrong number");
        }
        else 
        {
            System.out.println("not armstrong number");
        }
        scan.close();
    }
}

        

        
            
        
        

    
    
    
