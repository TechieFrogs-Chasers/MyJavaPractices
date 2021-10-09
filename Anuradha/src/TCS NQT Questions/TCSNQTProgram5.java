import java.util.Scanner;

public class TCSNQTProgram5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of.interior walls :");
        int interiorWalls = sc.nextInt();
        System.out.println("Enter no.of exterior walls :");
        int exteriorWalls = sc.nextInt();
        float interiorSurfaceArea[] = new float[interiorWalls];
        float exteriorSurfaceArea[] = new float[exteriorWalls];
        int interiorPaint = 18;
        int exteriorPaint = 12;
        double interiorCost = 0, exteriorCost = 0;

        if (interiorWalls == 0 || exteriorWalls == 0) {
        } else {
            System.out.println("Enter Surface Area of interior walls");
            for (int i = 0; i < interiorWalls; i++) {
                interiorSurfaceArea[i] = sc.nextFloat();
            }

            System.out.println("Enter Surface Area of exterior walls");
            for (int i = 0; i < exteriorWalls; i++) {
                exteriorSurfaceArea[i] = sc.nextFloat();
            }
        }

        if (interiorWalls == 0 || exteriorWalls == 0) {
        } else {
            for (int i = 0; i < interiorWalls; i++) {
                interiorCost = interiorPaint * interiorSurfaceArea[i];
            }

            for (int i = 0; i < exteriorWalls; i++) {
                exteriorCost = exteriorPaint * exteriorSurfaceArea[i];
            }

            System.out.println("Toatal Estimated cost of Paninting is :: " + (interiorCost + exteriorCost) + "  INR");
            sc.close();

        }

    }

}
