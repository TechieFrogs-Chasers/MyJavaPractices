package TcsPaperPractices;

import java.util.Scanner;

public class WallPainting {
    public static void main(String[] args) {
        int exteriorWalls;
        int interiorwalls;
        float interiorSurface = 0.0f;
        float exteriorSurface = 0.0f;
        int interiorCost = 18;
        int exteriorCost = 12;
        Scanner scObj = new Scanner(System.in);
        
      //  innteriorWalls = scObj.nextInt();
        //;
        System.out.println("Enter no of interior walls : ");
        interiorwalls = scObj.nextInt();
        System.out.println("Enter the Surface area for the interior walls:");
        for(int i=1;i<=interiorwalls;i++){
           
             interiorSurface = scObj.nextFloat();
            interiorSurface += (float)interiorSurface; 
        }
        System.out.println("Enter no of exterior walls : ");
        exteriorWalls = scObj.nextInt();
        System.out.println("Enter the Surface area for the Exterior walls:");
        for(int i=1;i<=exteriorWalls;i++){
            
            float esurface = scObj.nextFloat();
            exteriorSurface += (float)esurface; 
        }
        scObj.close();
        System.out.println("The cost of painting the interior wall is: " + (interiorCost*interiorSurface));
        System.out.println("The cost of painting the exterior wall is: " + (exteriorCost*exteriorSurface));
        System.out.println("The total cost of painting is: " + ((interiorCost*interiorSurface)+(exteriorCost*exteriorSurface)));
    }   
}