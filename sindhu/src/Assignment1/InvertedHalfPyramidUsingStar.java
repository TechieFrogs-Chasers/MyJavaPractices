package Assignment1;

public class InvertedHalfPyramidUsingStar {
    public static void main(String[] args) {
        int term=6;
        for(int i=1;i<=term;i++){
           // for(int j=1; j<=i; j++){
               for(int j=term; j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
}
