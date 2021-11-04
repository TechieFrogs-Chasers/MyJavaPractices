package TCS_NQT;

import java.util.Scanner;

public class Doctor_Income_10 {
    public static void main(String[] args) {
        //int age ,noOfPatients;
        Scanner myScannerObj = new Scanner(System.in);
        int noOfPatients = myScannerObj.nextInt();
        int age[] = new int[noOfPatients];
        System.out.println(" Enter ages for patients: ");
        for (int num = 0; num < noOfPatients; num++) {
            age[num] = myScannerObj.nextInt();
        }
        myScannerObj.close();
        int fee = 0;
        /*for(int num2=0;num2<age)
        if(age < 17){
            System.out.println("Dr. fee is 200 INR");
        }
        else if(age>=17 && age<=40){
            System.out.println("Dr. fee is 400 INR");
        }
        else if(age>40){
            System.out.println("Dr. fee is 300 INR");
        }
        else if(age<=0&& age>=120){
            System.out.println("INVALID INPUT");


    }*/
    }
}