import java.util.Scanner;

import Strings.String;

public class DisplayAtoZ {
    public static void main(String[] args) {
       // Scanner scObj = new Scanner(System.in);
        char smallch, capitalch;
            for(smallch='a';smallch<='z';smallch++)
            //System.out.println("small Letters : ");
            System.out.print(smallch +" ");
            System.out.println(" ");
                for(capitalch='A';capitalch<='Z';capitalch++)
                System.out.print(capitalch +" ");
    }
    
}
