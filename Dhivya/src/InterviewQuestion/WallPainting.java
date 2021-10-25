package InterviewQuestion;

import java.util.Scanner;

public class WallPainting {
    public static void main(String[] args) {
        int interiorwalls, exteriorWalls;
        float inSurface = 0.0f;
        float exSurface = 0.0f;
        int icost = 18;
        int ecost = 12;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of Interior Walls: ");
        interiorwalls = obj.nextInt();
        System.out.println("Enter the no of Exterior Walls: ");
        exteriorWalls = obj.nextInt();
        System.out.println("Enter the Surface area for the Interior walls:");
        for(int i=1;i<=interiorwalls;i++){
            
            float isurface = obj.nextFloat();
            inSurface += (float)isurface; 
        }
        System.out.println("Enter the Surface area for the Exterior walls:");
        for(int i=1;i<=exteriorWalls;i++){
            
            float esurface = obj.nextFloat();
            exSurface += (float)esurface; 
        }
        obj.close();
        System.out.println("The cost of painting the interior wall is: " + (icost*inSurface));
        System.out.println("The cost of painting the interior wall is: " + (ecost*exSurface));
        System.out.println("The total cost of painting is: " + ((icost*inSurface)+(ecost*exSurface)));
    }
}
