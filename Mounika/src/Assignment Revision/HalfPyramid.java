import java.util.Scanner;



public class HalfPyramid {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter a value for num");
            while(!scObj.hasNextShort()){
                String input = scObj.next();
                System.out.println("Please enter a valid number");
            }
            num=scObj.nextInt();
            for(int i=1;i<=num;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");//print is used to print the output in same line
                }
                System.out.println();//new line
            }
        }while(num<=0);
        scObj.close();
    }
    
    
}
