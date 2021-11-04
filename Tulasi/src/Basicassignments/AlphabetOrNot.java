package Basicassignments;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner

        char character;
        System.out.println("Enter a Character : ");
        do {//Validation
            while (! myScannerObj.hasNext()) {//for not to allow numbers
                int input = myScannerObj.nextInt();
            }
            character =  myScannerObj.next().charAt(0);

        } while (character <= 0);
        if ((character >= 'a' && character >= 'z') || (character >= 'A' && character >= 'Z'))
            System.out.println("It's an alphabet ");
        else
            System.out.println("It's not an alphabet ");

        myScannerObj.close();//scanner close


    }
}
