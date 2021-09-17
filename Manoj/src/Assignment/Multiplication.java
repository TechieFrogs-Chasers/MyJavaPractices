import java.util.Scanner;
public class Multiplication {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        int num;
        do {
            System.out.println("enter the positive number");
            while(!object.hasNextInt())
            {
                String n=object.next();
                System.out.println(n + "this is not a valid one please enter valid number ");

            }num=object.nextInt();

        }while(num<=0);
        object.close();
        for (int i =1 ;i<=10; i++){
            System.out.println(num+ " * " + i + " = "+ num*i);
        }
    }

    
}
