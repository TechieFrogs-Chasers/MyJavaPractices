package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise7 {

    public static void main(String[] args) {
        int[] intArr = new int[10];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 10 integer values :");
        for(int i = 0;i< intArr.length;i++){
            intArr[i]=sc.nextInt();
        }

        sc.close();
        System.out.println("Entered values are");
        for(int n:intArr){
            System.out.print(n+" ");
        }  


        System.out.println();
        System.out.println("Entered values at even positions are");
        for(int i = 0;i< intArr.length;i++){
            if( i % 2 == 0)
            System.out.print(intArr[i]+" ");
        } 
    }
    
}
