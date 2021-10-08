import java.util.Scanner;


public class TCSNQTProgram3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in grams not more than 7000grams");
        int weight = sc.nextInt();
        machineCapacity(weight);
        sc.close();
       
    }
    
    public static void machineCapacity(int weight){

    if(weight == 0 && weight < 100)
        System.out.println("Time Estimated: 0 minutes)");

    else if(weight >= 100 && weight <= 2000)
        System.out.println("Time Estimated :25 minutes");

    else if(weight > 2000 && weight <= 4000)
        System.out.println("Time Estimated :35 minutes");

    else if(weight > 4000 && weight <= 7000)
        System.out.println("Time Estimated :45 minutes");

    else 
        System.out.println("OVER LOADED");

    }
}
