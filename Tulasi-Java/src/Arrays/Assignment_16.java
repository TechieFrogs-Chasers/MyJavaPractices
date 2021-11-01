package Arrays;

import java.util.Arrays;

public class Assignment_16 {
    public static void main(String[] args) {
        int[] largestThirdNum = {5, 9, 45, 77, 33, 445, 97, 36, 14, 23};

        System.out.println(methodNumber(largestThirdNum, 10));
    }

    public static int methodNumber(int[] largestThirdNum, int total) {
        Arrays.sort(largestThirdNum);//to sort number in array we use -Array.sort()
        return largestThirdNum[total - 3];
    }
}
