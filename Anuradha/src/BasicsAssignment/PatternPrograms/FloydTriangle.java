package BasicsAssignment.PatternPrograms;

import java.util.Scanner;
class FloydTriangle {
    public static void main(String[] args) {
        int numbr= 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Lines:");
        int num = sc.nextInt();
        for(int i =0; i <= num;i++){
            for( int j = 0 ;j<= i;j++){
                System.out.print(numbr + " ");
                numbr+=1;
            }
            System.out.println();
        }
        sc.close();
    }
}
