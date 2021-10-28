package BasicsAssignment.NumberPrograms;
import java.util.Scanner;
public class Factorial {
    public  static void main(String[] args) 
    {
        System.out.println("Enter num to find its factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int fact = 1,i = 1;
    //Using For Loop
        for( i =1;i <= num; i++)
        {
            fact = fact*i;
        }
        System.out.println(" factorial of the num is :"+fact);

    //using While Loop
        while(i<=num)
          {
             fact = fact*i;
             i++;
          }
    System.out.println(" factorial of the num is :"+fact);
 
        }
}
    

