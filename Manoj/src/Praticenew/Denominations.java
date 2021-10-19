package Praticenew;
import java.util.Scanner;

public class Denominations {

    public static void main(String...args){
        Scanner obj=new Scanner (System.in);
        System.out.println("enter the amount :");
        int num;
      do {
          System.out.println("enter the value ");
          while(!obj.hasNextInt())
          {
              System.out.println("this is not the valid one ,enter valid one ");
              obj.next();
          }num=obj.nextInt();
      }while(num<=0);
      int amount;
      if (num>100){
          amount=(num/100);//here it gives quotient 
          num=(num%100);//here it gives remainder 
          System.out.println("100: "+amount);
      }
      if (num>50){
          amount=(num/50);
          num=(num%50);
          System.out.println("50: "+amount);
      }
      if (num>10){
          amount=(num/10);
          num=(num%10);
          System.out.println("10: "+amount);
      }
      
      obj.close();


    }
    
}
