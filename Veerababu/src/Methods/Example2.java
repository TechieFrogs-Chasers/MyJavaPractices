package Methods;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int output = example2.Method(5, 5, 'A', "Hello World", true, 5.0f);
        System.out.println("output"+" "+output);
        
    }

    void Veeru()
    {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("x");
        int x = scannerObj.nextInt();
        int y = scannerObj.nextInt();
        int z= x+y;
        scannerObj.close();
        System.out.println("Sum of x+y"+" "+z);
    }
    public int Method(int x, int y, char c, String name, boolean b, float f)
    {
        int a=10;
        System.out.println("In char Method");
        System.out.println("First No"+" "+x+" "+"Second Value"+" "+y+" "+"Boolen"+" "+b);
        return a;
    }
}
