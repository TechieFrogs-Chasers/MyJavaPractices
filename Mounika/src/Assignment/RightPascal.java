package Assignment;
public class RightPascal {
    public static void main(String[] args) {
    int i, j;
       for(i=0;i<8;i++){
           for(j=1;j<=i;j++){
               System.out.print("* ");
            }
                System.out.println();
        }
        for(i=7;i>=1;i--){
            for(j=1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
