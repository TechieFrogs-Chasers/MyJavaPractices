package Arrays;

public class Assignment_36 {
    public static void main(String[] args) {
        int[][] add1 = new int[][]{{1, 2, 3}, {3, 2, 4}, {4, 5, 6}};
        int[][] add2 = new int[][]{{2, 3, 4}, {1, 2, 3}, {4, 1, 3}};
        int[][] Sum = new int[3][3];

        for (int i = 0; i < add1.length; i++) {
            for (int j = 0; j < add2[i].length; j++) {
                Sum[i][j] = add1[i][j] + add2[i][j];
            }
        }
        System.out.println("---Addition of two matrix---");
        for (int i = 0; i < add1.length; i++) {
            for (int j = 0; j < add2[i].length; j++) {
                System.out.print(Sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
