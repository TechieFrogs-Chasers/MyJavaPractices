package sindhu.src.TCS;

import java.util.Scanner;

public class MPCS {
    
    
    public static void main(String[] args) {
        int x3,y3,z3;
        int input;
    int x1,y1,z1;
    int x2,y2,z2;
    if((input>1)&&(input<100)){

    }
        
        
    
         Scanner x = new Scanner(System.in);



         System.out.println("round 1");
     System.out.println("enter input for oxygen level for trainee 1");
        x1 = x.nextInt();
        System.out.println("enter input for oxygen level for trainee 2");
        y1 = x.nextInt();
        System.out.println("enter input for oxygen level for trainee 3");
        z1= x.nextInt();
         

        System.out.println("round2");
        System.out.println("enter input for oxygen level for trainee 1");
        x2 = x.nextInt();
        System.out.println("enter input for oxygen level for trainee 2");
        y2 = x.nextInt();
        System.out.println("enter input for oxygen level for trainee 3");
        z2 = x.nextInt();
       


        System.out.println("Round3");
        System.out.println("enter input for oxygen level for trainee 1");
        x3 = x.nextInt();
        System.out.println("enter input for oxygen level for trainee 2");
        y3 = x.nextInt();
        System.out.println("enter input for oxygen level for trainee 3");
        z3 = x.nextInt();

        int a = (x1+x2+x3)/3;
        System.out.println(" average oxygen level of first trainee " +a);

        int b = (y1+y2+y3)/3;
        System.out.println(" average oxygen level of second trainee " +b);

        int c = (z1+z2+z3)/3;
        System.out.println("average oxygen level of third trainee " +c);

        if((a>b&&a>c)&& (a>70)){
            System.out.println("a is the fit trainee");
        }
            else if ((b>a&&b>c) && (b>70)){
                System.out.println("b is the fit trainee");
             } else{
                 System.out.println("c is the fit trainee");
             }


           int  z = (a+b+c)/3;
             if(z<70){
                 System.out.println("all trainees are unfit");

             }



             


        

      
        int a = (x1+y1+z1)/3;
        System.out.println("average for trainnee 1" + a);

        int b = (x1+y1+z1)/3;
        System.out.println("average for trainnee 2" + b);

        int c = (x1+y1+z1)/3;
        System.out.println("average for trainnee 3" + c);


        
        

    
    }
}





    



        
    

