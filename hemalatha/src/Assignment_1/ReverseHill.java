package Assignment_1;

import java.util.Scanner;
public class ReverseHill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        System.out.print(" enter number of rows:");
        n=in.nextInt(); // input from user
        for(int i=1;i<=n;i++){ //using loops
            for(int j=1;j<=2*n;j++) //inner loop
                if(j<i)
                System.out.print(" ");
                    else if(j <= 2*n-i)
                    System.out.print("*"); 
                    System.out.println(" ");
                    in.close();
            
            
        }

        
    }

    
}
