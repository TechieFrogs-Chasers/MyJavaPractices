package Assignment1;

import java.util.Scanner;

/*public class MultiplicationTable {

    public static void main(String[] args) {
        //using for loop

        int num = 5;
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }*/

       /* //using while loop
        int num=5,i=1;
        while(i<=10){
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }

    }
}*/
/*public class MultiplicationTable {
    public static void main(String[] args) {   //using scanner method
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int s=input.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", s, i, s * i);
        }
        input.close();

    }
 }*/

 public class MultiplicationTable {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in); //validation method
        int x;
        do{
            System.out.println("enter a number");
            while(!input.hasNextInt())
            {
                String s=input.next();
                System.out.println(s+"please enter a valid number");
            }
             x = input.nextInt();
        } while(x<=0);
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", x, i, x * i);
        }
        input.close();
    }



    }




