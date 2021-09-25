
import java.util.Scanner;
public class Area{
    Scanner sc = new Scanner (System.in);
        int l= sc.nextInt();
        int b = sc.nextInt();

    public static void main(String[] args) {
        System.out.println("Enter the value for length and breadth : ");
        Area objt = new Area();
        Arear ob = new Arear(objt.l, objt.b);
        System.out.println("The Area is : " + objt.returnArea());
    }
    static class Arear{
        Arear(int l, int b){
        System.out.println(" value of length and breadth is: "+ l+ " & " + b);
        }
    }
    public int returnArea(){
        int area = l * b;
        return area;
    }
}
