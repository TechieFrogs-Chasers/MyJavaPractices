package Arrays;

import java.util.Arrays;

public class Assignment_40 {
    public static void main(String[] args) {

        System.out.println("----Multi-dimensional Array----");
        String[][] arr=new String[][]{{"Java"},{"Classes"}};
            System.out.println(Arrays.deepToString(arr));//to print an multi demsional array[][]- use Arrays.deepToString() mehtod.

        System.out.println();

        System.out.println("---Single-dimensional Array---");
        int[] arr1=new int[]{4,6,9};
        for (int name:arr1){
            System.out.println(name + " ");

        }
    }
}
