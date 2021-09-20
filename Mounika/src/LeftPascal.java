import java.util.Scanner;
public class LeftPascal {
    public static void main(String[] args) {
        int num;
        Scanner scObj = new Scanner(System.in);
        do{
            System.out.println("Enter a value for num");
            while(!scObj.hasNextShort()){
                String input = scObj.next();
                System.out.println("Please enter a valid number");
            }
            num=scObj.nextInt();
        }while(num<=0);
        int i,j,space;
        for(i=0;i<=num;i++){//k=10
            for(space=1;space<2*(num-i);space++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
             System.out.print("* ");
            }
            System.out.println();
        }
        for(i=1;i<=num-1;i++){
            for(space=1;space<=i;space++){
                System.out.print(" ");
            }
            
            for(j=1;j<=num-i;j++){
                System.out.print("* ");
                
            }  
            System.out.println();
        }scObj.close();
    }
}
