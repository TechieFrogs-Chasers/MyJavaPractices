package TcsPaperPractices;

import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter no of Patients :");
        int patients = scObj.nextInt();
        int ages;
        for (int i = 1 ; i <= patients ; i++){
            System.out.println("Print Age : ");
             ages = scObj.nextInt();
        int fee = 0;
        //for (int j = 0 ; j <= ages ; j++);{
       // }
        if ( ages <= 0 && ages >120){
        System.out.println("Invalid input");
        }
        else if (ages > 0 && ages <= 17){
            fee += 200;
        }
        else if (ages > 17 && ages <= 40){
            fee += 400;
        }
        else if (ages > 40 && ages < 120){
            fee += 300;
        }
        System.out.println("Total income " + i*fee + "INR");
    }
        scObj.close();
    }
}
