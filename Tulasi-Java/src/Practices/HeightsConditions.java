package Practices;

import java.util.Scanner;

public class HeightsConditions {
    public static void main(String[] args) {
        int personfeet=5;
        int personinch=9;
        double personcms;

        personcms=((personfeet*30.48)+(personinch*2.54));
        System.out.println(personcms);
       // System.out.println("This program makes calculations relates to your height:" + "\n Type 1 to give your height in feet and inches or" + "\n Type 2 to give your height in centimeters");
        HeightsConditions myObj = new HeightsConditions();
        Scanner scanner=new Scanner(System.in);
        String name = scanner.nextLine();
        int under=scanner.nextInt();
        if (under==1)
        {
            System.out.println(personcms);
        }
       else if (under==2) {
            System.out.println("Ask height and weight");
        }


    }




}
