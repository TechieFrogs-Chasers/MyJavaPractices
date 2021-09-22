package JavaBasicsAssignments;

import java.util.Scanner;

public class armStrong {

    public static void main(String[] args) {
        
Scanner scannerObj=new Scanner(System.in);
   
int num;

 do{
  System.out.println("Enter the number");
  

  while(!scannerObj.hasNextInt() ){
    scannerObj.next();
      System.out.println("enter a valid number");
       }
        num=scannerObj.nextInt();
    }while(num<=0);


  int digit,sum=0;

    while(num>0){
     
       digit=num%10;
      num=num/10;
    sum= sum + digit*digit*digit;
    }

  if(sum==num)
      System.out.println("  is an armstrong number");
      
    else
    System.out.println("   is not an armstrong number");



   scannerObj.close();






    }
}
