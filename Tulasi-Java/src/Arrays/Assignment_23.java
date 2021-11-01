package Arrays;

import java.util.Scanner;

public class Assignment_23 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int size;
        System.out.println("Enter size of the matrix : ");
        size=scannerObj.nextInt();
        scannerObj.close();
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(i==j){
                    System.out.print("1"+" ");
                }else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
