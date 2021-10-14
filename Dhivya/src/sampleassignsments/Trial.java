import java.util.Scanner;

 public class Trial {
     public static void main(String[] args) {
         Scanner myscan = new Scanner(System.in);
         int a = Trial.validation(myscan);
         System.out.println("The value of First no is: "+ a);
         int b = Trial.validation(myscan);
         System.out.println("The value of Second no is: "+b);
         int c = Trial.validation(myscan);
         System.out.println("The value of Third no is:"+c);
         int average = ((a+b+c)/3);
         System.out.println("Average of three no's : "+ average);
     }
     static int validation(Scanner myscan){
     int num;
         do{
             System.out.println("Enter positive Number:");
             while(!myscan.hasNextInt()){
                 System.out.println("This is not a Number.Please enter positive Number:");
                 myscan.next();
             }
             num = myscan.nextInt();
         }while(num <= 0);
       return num;
     }
 }