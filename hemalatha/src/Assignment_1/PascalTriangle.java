package Assignment_1;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int num,a=1,b;
        Scanner sc = new Scanner(System.in); //user input
        System.out.println("enter number of rows:");
         num = sc.nextInt();
         for(int i=0;i<=num;i++){
             for(b=0;b<=num-i;b++)
             System.out.println("");
             for(int j=0;j<=i;j++){
                 if(j==0||i==0)
                 a=1;
                 else 
                 a=a*(i-j+1)/j;
                 System.out.print(""+a);
             }
                
            } 
             System.out.println("");
             sc.close();

         


    }
    
}
