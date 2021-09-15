package Assignment1;

import java.util.Scanner;

public class HalfPyramidusingNumbers {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int x;
        do{
          System.out.println("enter how many rows");
          while(!input.hasNextInt()){
            String s = input.next();
            System.out.println(s+"is not a valid one");
          }
           x = input.nextInt();
        }while(x<=0);
    
        for (int i = 1; i <= x; i++) {
          for (int j = 1; j <= i; j++) {
            System.out.print(j );
          }
          System.out.println();
        }
        input.close();
      }
    }

   /* public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
            System.out.println("Enter the row size:");
    
            int x,i,j;
            x=input.nextInt();
          
            for(i=1;i<=x;i++)
        {
            
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
          }
         input.close();
    
      }
    }*/

    

