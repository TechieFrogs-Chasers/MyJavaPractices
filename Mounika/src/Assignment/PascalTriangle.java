package Assignment;
public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 6, k = 1;
        for(int i = 0; i < rows; i++) {
            for(int l = 1; l < rows - i; ++l) {
            System.out.print("  ");
            }
                for(int j = 0; j <= i; j++) {
                   if (j == 0 || i == 0)
                    k = 1;
                    else
                    k = k * (i - j + 1) / j;
                    System.out.printf("%4d", k);
                }
                System.out.println();
        }
    }
}
