package Practices;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number1: ");
        double n1=sc.nextDouble();

        System.out.println("Enter number2: ");
        double n2=sc.nextDouble();
        System.out.println("Enter : +,_,*,/ :" );
        char n3=sc.next().charAt(0);
        sc.close();
        double output;

        switch (n3){
            case '+':output=n1+n2;
            break;
            case '-':output=n1-n2;
            break;
            case '*':output=n1*n2;
            break;
            case '/':output=n1/n2;
            break;
            default:
                System.out.println("default value");
                return;
        }
        System.out.println(n1 +" "+ n3 +" " + n2 + ":" + output);
    }
}
