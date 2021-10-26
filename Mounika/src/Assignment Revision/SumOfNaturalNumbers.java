import java.util.Scanner;


public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num;
        int i;
        int sum=0;
        Scanner scObj = new Scanner(System.in);
        do{
            System.out.println("Enter a number");
            while(!scObj.hasNext()){
                String str = scObj.next();
                System.out.println("Enter a valid number");
            }
            num=scObj.nextInt();
                for(i=0;i<=num;i++){
                    sum = sum+i;
                }
                System.out.println("Sum of all Natural Number is : "+sum);
                
        }while(num<=0);
        scObj.close();
    }
}
    

