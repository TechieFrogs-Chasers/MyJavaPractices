import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int a = ob.nextInt();
        System.out.println("Enter 2st no:");
        int b = ob.nextInt();
        System.out.println("Enter 3st no:");
        int c = ob.nextInt();
        ob.close();
        Average avg = new Average();
        avg.calculate(a, b, c); 
        
    }  
    public int calculate(int a, int b, int c){
        int averageOf = ((a+b+c)/3);
        System.out.println(" The average of 3 no's:" + averageOf);
        return averageOf;
    }
}
