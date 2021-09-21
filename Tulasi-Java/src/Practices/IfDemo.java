package Practices;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
          //int i=25,j=78,k=87;
        //  int greater=(i>j)?i:j;
         // System.out.println("Print value:" +greater );
        Scanner sc=new Scanner(System.in);
        System.out.print(" Input of i value : ");
        int i=sc.nextInt();

        System.out.print(" Input of j value : ");
        int j=sc.nextInt();

        System.out.print(" Input of k value : ");
        int k=sc.nextInt();

       if ((i>j)&&(i>k))
           System.out.println("The greatest value" +" "+ i);
        if((j>i)&&(j>k))
            System.out.println("The greatest value" +" "+ j);
        if((k>i)&&(k>j))
            System.out.println("The greatest value" +" "+ k);
       else
           System.out.println("Default");

    }
}
