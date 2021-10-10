import java.util.Scanner;

public class TCSNQTProgram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of candies ordered by customer (max order not more than 5):");
        int num = sc.nextInt(); //no.of.candies required by customer
        sc.close();
        int N = 10; //capacity of jar
        int k = 5; // minimum no.of candies must be present in jar

        if(num >= 1 && num <= k){
            int availableCandies = N - num;
            System.out.println("NUMBER OF CANDIES SOLD: "+num);
            System.out.println("NUMBER OF CANDIES AVAILABLE: "+availableCandies);
        }
        else{
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT: "+N);
        }
    }
    
}
