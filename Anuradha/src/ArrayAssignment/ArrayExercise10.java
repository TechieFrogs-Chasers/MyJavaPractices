

import java.util.Scanner;

public class ArrayExercise10 {

    public static void main(String[] args) {
        int[] intArr = new int[6];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 6 integer values :");
        for(int i = 0;i< intArr.length;i++){
            intArr[i]=sc.nextInt();
        }

        sc.close();
        System.out.println("Entered values are");
        for(int n:intArr){
            System.out.print(n+" ");
        }  

        System.out.println();
        
        int small = intArr[0];
        for(int i = 0;i< intArr.length;i++){
          if(intArr[i] < small){
                small = intArr[i];
            }
        }
           
        System.out.println("Smallest element in the array is :"+small);
    }
    
    
}
