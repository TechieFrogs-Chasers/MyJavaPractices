package Arrays;

import java.util.Arrays;

public class Assignment_4 {
    public static void main(String[] args) {
        int[] dup = {2, 9, 1, 2, 8, 9, 1, 4, 6, 3, 7, 88, 4};
        Arrays.sort(dup);//to sort the array number ,use Arrays.sort()
        System.out.println("Before deleting duplicate numbers : ");
        for (int i = 0; i < dup.length; i++) {
            System.out.println(dup[i]);
        }
        System.out.println("Duplicate numbers : ");
        for (int j = 0; j < dup.length; j++) {
            for (int k = j + 1; k < dup.length; k++) {
                if (dup[j] == dup[k]) {
                    System.out.println(dup[j]);
                }
            }
        }
    }
}
