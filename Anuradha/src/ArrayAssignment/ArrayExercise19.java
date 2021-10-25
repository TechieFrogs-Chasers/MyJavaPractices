
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise19 {

    public static void main(String[] args) {

        int[] intArr = new int[8];
        int len = intArr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 integer values :");
        for (int i = 0; i < len; i++) {
            intArr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Entered values are");
        for (int n : intArr) {
            System.out.print(n + " ");
        }

        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (intArr[i] > intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        int visited = -1, count = 1;
        System.out.println();
        System.out.println(" elements after removing duplicates in given array:");
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (intArr[i] == intArr[j]) {
                    count++;
                    intArr[j] = visited;
                }
            }
            if (intArr[i] != visited && count > 0) {
                System.out.print(intArr[i] + " ");
            }
        }
    }

}
