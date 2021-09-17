import java.util.Scanner;
public class SwapOfTwoNumbers {
    public static void main(String[] args) {
       /* int x =1;
        int y=2;
        int a;
        a=x;
        x=y;
        y=a;
        System.out.println("Swap of a is;"+x);
        System.out.println("Swap of b is;"+y);
        System.out.println("Swap of x and y is;"+ "x="+ x+  "and"+"y="+y );
*/  
        int x;
        int y;
        
        Scanner Swap = new Scanner(System.in);
        System.out.println("Take Value of x");
        x = Swap.nextInt();
        System.out.println("Take Value of y");
        y = Swap.nextInt();
        System.out.println("Take Value of a");
        Swap.close();
        x= x+y;
        y= x-y; 
        x=x-y; 
        

        System.out.println("Swap value of x"+" "+x);
        System.out.println("Swap value of y"+" "+y);
        
        
    }

}
