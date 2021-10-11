package TcsPaperPractices;

import java.util.Scanner;

public class FitTrainee {
    public static void main(String[] args) {
        int trainee1 ;
        int trainee2 ;
        int trainee3;
        Scanner scObj = new Scanner(System.in);
        System.out.println("print the oxygen level of trainee1 in round 1 : ");
        int oxyLevelT1R1 = scObj.nextInt();
        System.out.println("print the oxygen level of trainee2 in round 1 : ");
        int oxyLevelT2R1 = scObj.nextInt();
        System.out.println("print the oxygen level of trainee3 in round 1 : ");
        int oxyLevelT3R1 = scObj.nextInt();
        System.out.println("print the oxygen level of trainee1 in round 2 : ");
        int oxyLevelT1R2 = scObj.nextInt();
        System.out.println("print the oxygen level of trainee2 in round 2 : ");
        int oxyLevelT2R2 = scObj.nextInt();
        System.out.println("print the oxygen level of trainee3 in round 2 : ");
        int oxyLevelT3R2 = scObj.nextInt();
        System.out.println("print the oxygen level of trainee1 in round 3 : ");
        int oxyLevelT1R3 = scObj.nextInt();
        System.out.println("print the oxygen level of trainee2 in round 3 : ");
        int oxyLevelT2R3 = scObj.nextInt();
        System.out.println("print the oxygen level of trainee3 in round 3 : ");
        int oxyLevelT3R3 = scObj.nextInt();
        trainee1 = (oxyLevelT1R1+oxyLevelT1R2+oxyLevelT1R3)/3;
        System.out.println("Average Oxygen Level of trainee1 in three rounds is : " +trainee1);
        trainee2 = (oxyLevelT2R1+oxyLevelT2R2+oxyLevelT2R3)/3;
        System.out.println("Average Oxygen Level of trainee2 in three rounds is : "+ trainee2);
        trainee3 = (oxyLevelT3R1+oxyLevelT3R2+oxyLevelT3R3)/3;
        System.out.println("Average Oxygen Level of trainee3 in three rounds is : " + trainee3); 
        if (trainee1 > 70){
        System.out.println(" Trainee1 is fit");
        }
        else{
            System.out.println(" Trainee1 is not fit");
        }
        if (trainee2 > 70){
            System.out.println(" Trainee2 is fit");
        }
        else{
            System.out.println("Trainee2 is not fit ");
        }
        if (trainee3 > 70) {
            System.out.println(" Trainee3 is fit");
        } else {
            System.out.println((" Trainee3 is not fit"));
        }
        if (trainee1 > 70 && trainee2 > 70 && trainee3 >70);
        System.out.println("All the trainees Are Fit");
        scObj.close();
    }
}
