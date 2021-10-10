import java.util.Scanner;

public class TCSNQTProgram7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Monkeys");
        int n = sc.nextInt();
        System.out.println("Enter number of eatable bananas by single monkey");
        int k = sc.nextInt();
        System.out.println("Enter number of eatable peanuts by single monkey");
        int j = sc.nextInt();
        System.out.println("Enter number of Bananas");
        int m = sc.nextInt();
        System.out.println("Enter number of Peanuts");
        int p = sc.nextInt();
        sc.close();
        int atebananas = 0,atepeanuts = 0;
        if( n<0 && k<0 || j<0 || m<0 || p<0)
    {
        System.out.println("Invalid Input");
    }
    else
    {
        if(k>0)
             atebananas =m/k;
        if(j>0)
             atepeanuts = p/j;
         n = n-atebananas-atepeanuts;
         System.out.println("Number of Monkeys left on the Tree: "+n);
    }
    }
}
