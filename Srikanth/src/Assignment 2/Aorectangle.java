import java.util.Scanner;

public class Aorectangle {
  int a;
  int b;

  void setDim(int a2, int b2) {
    a = a2;
    b = b2;
    int area = getArea(a, b);
    System.out.println("Area of Rectangle is " + area);
  }

  int getArea(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    Aorectangle rec = new Aorectangle();
    System.out.println("Enter length and breadth ");
    int a = obj.nextInt();
    int b = obj.nextInt();
    rec.setDim(a, b);
    obj.close();
  }

}