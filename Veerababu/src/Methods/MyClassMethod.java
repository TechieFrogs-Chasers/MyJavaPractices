package Methods;

import java.util.Scanner;

public class MyClassMethod
{
 int a;
 int b;
 public static void main(String[] args) 
    {
            MyClassMethod myClassMethod = new MyClassMethod();
            int result = myClassMethod.Display();
            System.out.println("Print"+" "+result);
            int results = myClassMethod.Display(10, 20);
            System.out.println("z value"+" "+results);

            
    }

        int Display()
        {
            int a;
            int b;
            int c;
            Scanner scannerObj = new Scanner(System.in);
            System.out.println("Print a value");
            a = scannerObj.nextInt();
            System.out.println("Print b value");
            b = scannerObj.nextInt();
            c=a+b;
            scannerObj.close();
            return c;
        }

        int Display(int x, int y)
        {
           
            int z =x+y;
            return z;
        }
}


