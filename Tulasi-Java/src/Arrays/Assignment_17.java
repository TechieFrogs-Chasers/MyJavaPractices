package Arrays;

import java.util.Arrays;

public class Assignment_17 {
    public static void main(String[] args) {
        int[] largestSecond={5,9,71,345,14,65,114,3265,1415,11,0};
        System.out.println(methodSecondNumber(largestSecond,11));
    }
    public static int methodSecondNumber(int[] largestSecond,int total){
        Arrays.sort(largestSecond);//to sort number in array we use -Array.sort()
        return largestSecond[total-2];
    }
}
