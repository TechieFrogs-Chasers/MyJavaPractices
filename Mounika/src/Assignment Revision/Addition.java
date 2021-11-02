import java.util.Scanner;



public class Addition {
    int i;
    static short s;
    float f;
    public static void main(String[] args) {
        Addition additionObj = new Addition();
        Scanner addObj = new Scanner(System.in);
        System.out.println("Enter Value for i :");
        additionObj.i= addObj.nextInt();
        System.out.println("Enter Value for f :");
        additionObj.f= addObj.nextFloat();
        System.out.println("Enter Value for s :");
        Addition.s = addObj.nextShort();
        
        System.out.println("Sum =" + (additionObj.i+additionObj.f+Addition.s));
        addObj.close();


        
    }
    
}
