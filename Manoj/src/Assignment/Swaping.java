import java.util.Scanner;
public class Swaping {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        System.out.println("enter the value of num1");
         int num1= Swaping.validatenumber(object);    //while using the validate method we need to give the classname 
                                                        // weather its a static one we need togive the classname
        System.out.println("enter the value of num2 ");
         int num2=Swaping.validatenumber(object);
         System.out.println("before swaping " + num1 +" " +num2);

         num1=num1-num2;
         num2=num1+num2;
         num1=num2-num1;

        System.out.println("after swaping " + num1 + " " +num2);

    }
     static int validatenumber( Scanner object){   //validate method is used 
         int num;
         do{
             System.out.println("enter the positive number ");
             while (!object.hasNextInt());
             {
                System.out.println("this is not a number , enter valid one ");
                object.next();

             }num=object.nextInt();

         }while(num<=0);
         return num;     //return is used to close the method 
     }
}
