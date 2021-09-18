package BasicAssignment;

import java.util.Scanner;

public class DivisionOfIntegers {
    public static void main(String[] args) {
        float d;
        Scanner myObj = new Scanner(System.in);
        int a = DivisionOfIntegers.validateDivision(myObj);
        System.out.println("A= "+a);
        int b = DivisionOfIntegers.validateDivision(myObj);
        System.out.println("B= " +b);
         d = (a % b);
         System.out.println("Division of A and B is:" +d);
        myObj.close();
    }
    static int validateDivision(Scanner myObj){
        int num;
        do{
            System.out.println("Enter positive Number:");
            while(!myObj.hasNextInt()){
                System.out.println("This is not a Number.Please enter positive Number:");
                myObj.next();
            }
            num = myObj.nextInt();
        }while(num <= 0);
      return num;
    }
    /*static double rem(int a, int b){
        return(a%b);
    }*/
    }

