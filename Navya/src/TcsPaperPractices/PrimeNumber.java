package TcsPaperPractices;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // creating scanner object
      //System.out.println("Enter positive Number:");
      int num , count = 0;
      num = myObj.nextInt();
      myObj.close();
      if(num>1)
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            count++;
            System.out.println(count);
         }
        if(count==2)
        {
            System.out.println( "prime number");
        }
        else
        {
            System.out.println("is not a prime number");

        }
    }
    else
    {
        System.out.println("is not a prime number");
    }
    }
}
