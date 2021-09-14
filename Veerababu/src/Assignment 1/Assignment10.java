import java.util.Scanner;
public class Assignment10 {
    public static void main(String[] args) {
        Scanner Multiply = new Scanner(System.in);
        System.out.println("Print the value of i");
        int i= Multiply.nextInt();
        System.out.println("Print the value of b");
        int b =Multiply.nextInt();
        Multiply.close();

        /*int x=2;
        int k;
        for( k=1; k<=i;k++){
            System.out.println(x+"  "+"X"+"  "+ i +"  "+ "=" + (x*k));
        }*/
        int a=4;

        while(b<=i){

            System.out.println(a +"X"+ b+" "+ "=" + (a*b));
            b++;
        }
        System.out.println("Print Fourth Table");
    }
}
