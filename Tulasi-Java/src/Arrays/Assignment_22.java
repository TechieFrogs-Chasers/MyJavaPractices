package Arrays;

public class Assignment_22 {
    public static void main(String[] args) {
        int[][] arr = {{10, 9}, {9, 8}};
        int[][] arr1 = {{5, 7}, {3, 4}};
        int[][] sub = new int[2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sub[i][j] = arr[i][j] - arr1[i][j];
            }
        }
        System.out.println("---Subtraction of two matrix---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }

}
