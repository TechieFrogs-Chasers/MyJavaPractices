package Practices;

import java.util.Scanner;

public class TicketPrice {

    public static void main(String[] args) {
        float amount, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your age :");
        int age = sc.nextInt();
        if (age <= 5){
            System.out.println(" Entry is free");}
        System.out.println(" Enter ticket price: ");
        float ticketprice = sc.nextFloat();
        System.out.println(" Enter discount % :");
        float dis = sc.nextFloat();
        amount = (dis * ticketprice) / 100;
        sum = ticketprice - amount;
        String person = "Forsty county";
        if (age >= 65) {
            System.out.println(" After discount your ticket price  : " + sum);
        }
        else if (age >= 55 && age <= 60 ) {
            if (person == "Forsty county") {
                System.out.println("Person is from Forsty county :" + (ticketprice - 2));
            } else {
                System.out.println("Normal Price :" + ticketprice);
            }
        }
       // else if (age <= 5){
         //       System.out.println(" Entry is free");}
        else{
                System.out.println(" No discount applied");}
        sc.close();
        }

        }



