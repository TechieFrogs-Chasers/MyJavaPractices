package PatternPrograms;

import java.util.Scanner;
public class PascalTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of lines you want");
    int num = sc.nextInt();
    int numbr = 1;
    for ( int i = 0; i <= num;i++){
        for (int k = num; k>=i;k--){
            System.out.print(" ");
        }
        for(int j = 0;j<=i ;j++){
            if( i == 0 ||  j == 0){
                numbr = 1;
            }
            else{
                numbr = numbr*(i-j+1)/j;
            }
            System.out.print(numbr+"  ");
        }
        System.out.println();
    }
    sc.close();
  }  
}
