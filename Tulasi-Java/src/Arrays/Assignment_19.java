package Arrays;

import java.util.Arrays;

public class Assignment_19 {
    public static int[] removeDuplicates(int[] a) {
        int i = 1;
        while (i < a.length) {
            if (a[i] == a[i - 1]) {
                System.arraycopy(a, i + 1, a, i, a.length - i - 1);
                a = Arrays.copyOf(a, a.length - 1);
            } else {
                i++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = removeDuplicates(new int[] { 1, 1, 2, 2, 2, 3, 4, 5, 5, 6 });

        for (int num : a) {
            System.out.println(num);
        }
    }
}
