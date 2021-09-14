package Assignment;
public class HalfPyramidAlpha {
    public static void main(String[] args) {
        char ch = 'E';
        char st = 'A';

    for (int i = 1; i <= (ch - 'A' + 1); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(st + " ");
      }
      ++st;

      System.out.println();
    }
  }
}
