import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        
        Scanner veeru = new Scanner(System.in);
        System.out.println("Given Alphabet");
        char ch = veeru.next().charAt(0);
        veeru.close();

        for(int i=1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print((char)(char)(i+64)+" ");
                
            }
           // System.out.println(i);            
            System.out.println();
        }
    }
}
