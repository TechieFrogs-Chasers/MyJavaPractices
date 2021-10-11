import java.util.Scanner;

public class WashingMachine {


    int weight;
    int time;
    

    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        System.out.println("enter the weight");
       int w = weight.nextInt();
      
      if(w<=2000)
       System.out.println("low level weight and takes 25 minutes");
      else if (w>2000 && w<4000)
      System.out.println("medium level weight and takes 35 minutes");
      else if (w>4000 && w<7000)
       System.out.println("high level weight and takes 45 minutes");
      
       else 
       System.out.println("invalid or overloaded");

    


    weight.close();

    }
    
}
