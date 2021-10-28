package BasicsAssignment.NumberPrograms;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args)
     {
        System.out.println("Enter number to calculate its multiplication table:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int i = 1;
        //using For
        for (i = 1 ; i <= num ; i++)
        {
            System.out.println(num +"*"+ i + "="+ num*i); 
        }
        //Using While
        i = 1;
        while(i <= num)
        {
            System.out.println(num +"*"+ i + "="+ num*i);
            i++;  
        }
      
     }
       
    
}
