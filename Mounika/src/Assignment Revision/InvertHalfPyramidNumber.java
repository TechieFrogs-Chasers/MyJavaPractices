import java.util.Scanner;



public class InvertHalfPyramidNumber {
    
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
                    for (int i = num; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print(j+" ");
                        }
                        System.out.println();
                    }
        }while(num<=0);
        scObj.close();
    }
}


