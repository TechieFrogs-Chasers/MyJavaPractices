package BasicPractices;
public class HalfPyramid {
    public static void main(String[] args) {
       int rows = 5;
        for(int i = 1; i <= rows  ; ++i) {
        // for(int i = rows ; i >=1 ; --i)  { 
           for(int j = 1; j <= i; ++j) {
               // SYStem.out.print("*");
               // System.out.print( j );
              System.out.print("*");
            }
            System.out.println( );
        }
    }
} 
