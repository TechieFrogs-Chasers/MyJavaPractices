package Arrays;

import java.util.Arrays;

public class Assignment_21 {
    public static void main(String[] args) {
        int[] sortNum={5,1,9,4,3,78,15,16,397,84,22,48,456};
        System.out.println("After sorting the number : ");
        Arrays.sort(sortNum);//to sort number in array we use -Array.sort()
        for(int i=0;i<sortNum.length;i++){
            System.out.println(sortNum[i]);
        }
    }
}
