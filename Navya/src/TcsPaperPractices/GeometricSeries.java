package TcsPaperPractices;

import java.util.Scanner;

public class GeometricSeries {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the value of n : ");				
		int n = scObj.nextInt();
		int a = 1, b = 1;
		//statement for even value of n
		if(n % 2 == 0)
		{
			for(int i = 1 ; i <= (n-2) ; i = i+2)
			{
				a = a * 2;
				b = b * 3;
			}
			System.out.print(n+" element of the series is = "+b);
		}
		else
		{
			for(int i = 1 ; i < (n-2) ; i = i+2)
			{
				a = a * 2;
				b = b * 3;
			}
			a = a * 2;
			System.out.print(n+" element of the series is = "+a);
		}
        scObj.close();
    }
}
