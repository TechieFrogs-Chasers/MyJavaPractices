package Arrays;

public class Assignment_30 {
    public static void main(String[] args) {
        int rows , columns , sumColumns, sumRows;
        int[][] arrSum = {{2, 5, 6},
                          {9, 5, 8},
                          {9, 8, 7}};

        rows = arrSum.length;
        columns = arrSum[0].length;

        for (int i = 0; i < rows; i++) {
            sumRows = 0;
            for (int j = 0; j < columns; j++) {
                sumRows = sumRows + arrSum[i][j];
            }
            System.out.println("Sum of rows " + (i + 1) + ":" + sumRows);
        }
        System.out.println();
        for (int i = 0; i < columns; i++) {
            sumColumns = 0;
            for (int j = 0; j < rows; j++) {
                sumColumns = sumColumns + arrSum[j][i];
            }
            System.out.println("Sum of columns " + (i + 1) + ":" + sumColumns);
        }

    }
}
