package TCS_NQT;

import java.util.Scanner;

public class PaintingCost_5 {

    public static void main(String[] args) {
        float num_Of_Interior_Walls;
        float num_Of_Exterior_Walls;
        float interior_wall=18;
        float exterior_wall=12;
        float cost=0;
        float temp;
        Scanner myScannerObj=new Scanner(System.in);
        num_Of_Interior_Walls=myScannerObj.nextInt();
        num_Of_Exterior_Walls=myScannerObj.nextInt();

        while (!myScannerObj.hasNextFloat()) {
            System.out.println("This is a number");
            myScannerObj.next();
        }
        num_Of_Interior_Walls = myScannerObj.nextFloat();

        if(num_Of_Interior_Walls==0 || num_Of_Exterior_Walls==0){
            System.out.println("Total estimated cost: "+ cost);
        }
        else if(num_Of_Interior_Walls<0 || num_Of_Exterior_Walls<0){
            System.out.println("INVALID INPUT ");
        }
        else {
            for(int i=0;i<num_Of_Interior_Walls;i++){
                temp=myScannerObj.nextFloat();
                cost=cost+interior_wall*temp;
            }
            for(int j=0;j<num_Of_Exterior_Walls;j++){
                temp=myScannerObj.nextFloat();
                cost=cost+exterior_wall*temp;
            }
            System.out.println("Total estimated cost : "+ cost+ " INR");
        }
    }
}
