package Assignment2;

import java.util.Scanner;

public class ReturnArea {
     int length;
     int breadth;
    public static void main(String[] args) {
        int l;
        int b;
     Scanner Sc = new Scanner(System.in);
     l = Sc.nextInt();
     b = Sc.nextInt();
     ReturnArea returnA = new ReturnArea(l, b);
     int Result = returnA.returnarea();
     System.out.println("print result: "+" "+Result);
     Sc.close();

    }
    ReturnArea(int x, int y)
    {
         length = x;
         breadth = y;
    }
   
    public int returnarea()
    {
        int A = length*breadth;
        return A;
    }
}
