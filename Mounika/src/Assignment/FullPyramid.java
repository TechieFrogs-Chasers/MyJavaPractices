package Assignment;
public class FullPyramid {
  public static void main(String[] args) {
    int r = 5, k = 0;
    for (int i = 1; i <=r; ++i, k = 0) {
        for (int j = 1; j <= r - i; ++j) {
            System.out.print("  ");
        }
            while (k != 2 * i - 1){ 
               System.out.print("* ");
               ++k;
            }
            System.out.println();
    }
}
}
 

