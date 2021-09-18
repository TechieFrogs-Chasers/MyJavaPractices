import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num,temp, y=1, reversenumber=0;
        Scanner scObj = new Scanner(System.in);
        do{
            System.out.println("Give any number");
            while(!scObj.hasNextInt()){
                String str = scObj.next();
                System.out.println("Given number is not a vaild number.");
                System.out.println("Please enter any number");
            }
            num =scObj.nextInt();
            
        }while(num<=0);
        temp = num;
            //System.out.println(num);
                while(num>=0){
                    reversenumber = num%10;
                    y = (y*10)+reversenumber;
                    num = num/10;
                   
                    
                }
                if (y==reversenumber){
                    System.out.println("Given Number is a Palindrome");
                }
                else{
                    System.out.println("Given Number is not a Palindrome");
                }
                scObj.close();
        
    }
}