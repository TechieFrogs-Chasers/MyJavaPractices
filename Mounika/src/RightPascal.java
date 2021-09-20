import java.util.Scanner;

public class RightPascal {
    public static void main(String[] args) {
        int rows;
        Scanner scObj = new Scanner(System.in);
        do{
            System.out.println("Enter a value for num");
            while(!scObj.hasNextShort()){
                String input = scObj.next();
                System.out.println("Please enter a valid number");
            }
            rows=scObj.nextInt();
        }while(rows<=0);
        

        int i, j;
        
       for(i=0;i<rows;i++){
           for(j=1;j<=i;j++){
               System.out.print("* ");
            }
                System.out.println();
        }
        for(i=rows-1;i>=1;i--){
            for(j=1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }scObj.close();
    }
}
