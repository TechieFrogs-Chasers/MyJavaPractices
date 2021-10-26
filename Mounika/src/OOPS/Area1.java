package OOPS;

import java.util.Scanner;

public class Area1 {
int length;
int breadth;
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);// instance for scanner to pass the values
            System.out.println("Enter value for Length");
            int length = validation(scObj);
                System.out.println("Enter value for breadth");
                int breadth = validation(scObj);
                scObj.close();
                Area1 area1Obj = new Area1(length, breadth);// instance of our classs use to call the menthods
               System.out.println("Area of Rectangle : "+area1Obj.returnArea());
    }
    Area1(int l, int b){
        length = l;
        breadth = b;
       
   }
   public int returnArea(){
       return  length*breadth;

   }
   public static int validation(Scanner scObj){
       int num;
       do{
           System.out.println("please enter a valid number");
           while(!scObj.hasNextInt()){
               String str = scObj.next();
               System.out.println("please enter a valid number");
            }
            num = scObj.nextInt();
        }while(num<=0);
        System.out.println("Enter value is a valid number ");
        return num;
   }
}
