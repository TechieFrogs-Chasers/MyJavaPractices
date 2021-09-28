package Assignment2;

import java.util.*;

public class AddDistance {
    double inch, feet;

    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        AddDistance addDistance = new AddDistance();
        AddDistance addDistance2 = new AddDistance();

        addDistance.inch(aScanner);
        double num = addDistance.inchToFeet();

        addDistance2.inch(aScanner);
        double num1 = addDistance2.inchToFeet();

        double sum = num + num1;
        System.out.println("Sum of Distance in feet:" + sum);
        aScanner.close();
    }

    void inch(Scanner aScanner) {
        System.out.println("Enter the distance in Inch's: ");
        inch = aScanner.nextDouble();
    }

    double inchToFeet() {
        feet = (0.0833 * inch);
        return feet;
    }
}
