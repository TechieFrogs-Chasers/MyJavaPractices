import java.util.Scanner;

public class TCSNQTProgram17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find Sum of the Numbers");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        sc.close();
        if(n1 < 0 || n2 < 0){
            System.out.println("enter positive numbers");
        }
        else{
            sum(n1,n2);
        }
    }

    public static void sum(float n1,float n2){
        float sum = n1+n2;
        System.out.println("Sum of "+n1+" and "+n2+" is "+sum);
    }
    
}
