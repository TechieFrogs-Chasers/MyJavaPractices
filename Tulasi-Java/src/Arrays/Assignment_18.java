package Arrays;

import java.util.Arrays;

public class Assignment_18 {
    public static void main(String[] args) {
        int[] smallSecondNum={5,6,4,2,0,45,89,4146,11,4,3,44};
        System.out.println(methodSmall(smallSecondNum,12));
    }
    public static int methodSmall(int[] smallSecondNum,int total){
        Arrays.sort(smallSecondNum);//to sort number in array we use -Array.sort()
        return (smallSecondNum[1]);
    }
}
