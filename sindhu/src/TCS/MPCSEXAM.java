package sindhu.src.TCS;

import java.util.Scanner;

public class MPCSEXAM {
    
    public static void main(String[] args) {
        int x;
        
    Scanner input = new Scanner(System.in);
    
    for(int i=1; i<4; i++){
        System.out.println("enter input for oxygen level for trainee 1");
        x = input.nextInt();
        if((x>1)&&(x<100)){
            System.out.println("oxygen level for trainee1 ");
        }else {
            System.out.println("please enter in the valid range");
        }
        

        /*System.out.println("enter oxygen level input for trainee 2");
       int y=input.nextInt();
       if((y>1)&&(y<100)){
        System.out.println("oxygen level for trainee2");
    }else {
        System.out.println("please enter in the valid range");
    }
    
        System.out.println("enter oxygen level input for trainee 3");
       int z=input.nextInt();
       if((z>1)&&(z<100)){
        System.out.println("oxygen level for trainee3");
    }else {
        System.out.println("please enter in the valid range");
    }
    
   int round = (x+y+z)/3;
    System.out.println("average oxygen level for trainnee"+round);*/
    




  


    
    
}
    }
}
