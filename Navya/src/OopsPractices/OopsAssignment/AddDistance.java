package OopsPractices.OopsAssignment;

import java.util.Scanner;

public class AddDistance {
    double inch;
    double feet;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AddDistance distance1 = new AddDistance();
        distance1.getData(sc);
        AddDistance distance2 = new AddDistance();
        distance2.getData(sc);
        double a = distance1.inchToFeet();
        double b = distance2.inchToFeet();
        double sumOfDistances = a+b;
        System.out.println("Sum of Distances in Feet :"+sumOfDistances);

        sc.close();

    } 
     void getData(Scanner sc){
     System.out.println("Enter the Distance in Inch's :");
     this.inch = sc.nextDouble();        
    }
    double inchToFeet(){
     this.feet = (0.0833 * this.inch);
     return feet;
    }
}
