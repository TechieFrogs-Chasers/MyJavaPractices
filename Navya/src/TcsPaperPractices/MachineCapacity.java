package TcsPaperPractices;

import java.util.Scanner;

public class MachineCapacity {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter the weigth: ");
        int weigth = scObj.nextInt();
         if(weigth > 0 && weigth < 100)
        System.out.println("Estimated Time : = 0 minutes");
         else if (weigth > 100 && weigth < 2000)
         System.out.println("Estimated Time : = 25 minutes");
         else if ( weigth > 2000 && weigth < 4000)
         System.out.println("Estimated Time : = 35 minutes");
         else if ( weigth > 4000 && weigth < 7000)
         System.out.println("Estimated Time : = 45 minutes");
         else if ( weigth >= 7000)
         System.out.println("OverLoaded");
         scObj.close();
     }
}
