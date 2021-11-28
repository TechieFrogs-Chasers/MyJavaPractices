package Arrays;

import java.util.Arrays;

public class Assignment_41 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

// create a new array
        int[] result = new int[arr1.length + arr2.length];

// concatenate arrays
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        System.out.println(Arrays.toString(result));
    }
}
