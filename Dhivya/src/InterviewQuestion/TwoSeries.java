package InterviewQuestion;  // PROGRAM TO FIND NTH ELEMENT OF THE SERIES

import java.util.Scanner;

public class TwoSeries {
    public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		//input value of n
		System.out.print("Enter the value of n : ");				
		int n = obj.nextInt();
		int f = 1, s = 1;  //declaring the first two digits as 1. 
		obj.close();
		
		if(n % 2 == 0)   // checking if the given number is even.
		{
			for(int i = 1 ; i <= (n-2) ; i = i+2) //if the number is even, it means it has odd number.
			{
				f = f * 2;
				s = s * 3;
			}
			System.out.print(n + " Element of the series is = "+ s);
		}
		else
		{
			for(int i = 1 ; i < (n-2) ; i = i+2)   // checking if the given number is odd. 
			{										//if the number is odd, the element must be even number
				f = f * 2;
				s = s * 3;
			}
			f = f * 2;
			System.out.print(n + " Element of the series is = "+ f  + ". ");
		}
	}
}

