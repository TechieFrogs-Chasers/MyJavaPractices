package Assignment1;

public class HalfPyramidUsingAlphabets {
    public static void main(String[] args) {
        
char last = 'E', alphabet = 'A';

        for (int i = 1; i <= (last - 'A'+1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;
            //++last;
            System.out.println();
        }
    }
}