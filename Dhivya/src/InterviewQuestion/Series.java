package InterviewQuestion;

import java.util.Scanner;

public class Series {
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the valu of n: ");
    int n = sc.nextInt();
    int f = 0, s = 0;
    sc.close();
    if(n % 2 == 0)
    {
      for(int i = 1 ; i <= (n-2) ; i = i+2)
      {
        f = f + 2;
        s = s / 2;
      }
      System.out.print(s);
     }
     else
     {
       for(int i = 1 ; i < (n-2) ; i = i+2)
       {
         f= f + 2;
         s = s / 2;
       }
       f = f + 2;
       System.out.print("The value of " + n +" element is " + f +" .  ");
     }
   }
}
