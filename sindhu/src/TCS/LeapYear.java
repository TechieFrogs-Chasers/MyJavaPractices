package sindhu.src.TCS;

import java.util.Scanner;

public class LeapYear {

    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter year ");
        int x = input.nextInt();
        
        
        if((x%4==0) || (x%100!=0) || (x%400!=0)){

            System.out.println("its a leap year");
        }
        else {
            System.out.println("its not a leap year");
        }

        input.close();

    

        
    }


    
}
