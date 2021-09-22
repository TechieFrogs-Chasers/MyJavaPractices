package Assignment_1;
import java.util.Scanner; //scanner package
public class NaturalNumbers {
    public static void main(String[] args) { // main class
        int i,num,sum=0; //variables
        Scanner obj = new Scanner(System.in); //using scanner class
        System.out.println("first number:");
        i=obj.nextInt();
        System.out.println("last number");
        num = obj.nextInt(); //take integer as input
        while(i<=0)
        {
        //for(int i=1;i<=10;i++){
            //adding the value of i into sum
            sum=sum+i;
            i++;  //increment the i value
        }
        System.out.println("enter the sum of natural numbers:" +sum);
        obj.close();
    }
    
}
