import java.util.Scanner;
public class Assignment3 {
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
        Scanner Swap = new Scanner(System.in);
        System.out.println("Take Value of x");
        int x = Swap.nextInt();
        System.out.println("Take Value of y");
        int y = Swap.nextInt();
        System.out.println("Take Value of a");
        char a = Swap.next().charAt(0);
        Swap.close();

        System.out.println(x);
        System.out.println(y);
        
        
    }

}
