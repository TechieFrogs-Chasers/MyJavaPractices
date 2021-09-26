package OOPS;

import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        float value1;
        float value2, avg, value3;
        Scanner obj = new Scanner(System.in);
            //System.out.println("Enter value for value2");
            value1 = validation(obj);
            //System.out.println("Enter value for value2");
            value2 = validation(obj);
            value3 = validation(obj);
            avg = (value1+value2+value3)/2;
            System.out.println("Average :"+avg);
            obj.close();

    }
    static float validation(Scanner scanner){
        float num;
        do{
            System.out.println("Enter a valid number");
            while(!scanner.hasNextInt()){
                String input = scanner.next();
            System.out.println("Please enter a valid number");
        }
         num = scanner.nextInt();
        }while(num<=0);
            System.out.println("Enter value is a valid number ");
            return num;
    }

}
    
    

