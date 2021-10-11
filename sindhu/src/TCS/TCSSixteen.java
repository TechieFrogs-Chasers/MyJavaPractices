package sindhu.src.TCS;

import java.util.Scanner;

public class TCSSixteen {
   
        
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
        
        

        System.out.println("enter first word");
        String x = input.nextLine();
        String x1 = x.replaceAll("[AaEeIiOoUu]", "*");
        System.out.println(x1);

        System.out.println("enter second word");
        String y = input.nextLine();
        
        String y1 = y.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "#");
        System.out.println(y1);
        

        System.out.println("enter third word");
         String z = input.nextLine();
        String z1 = z.toUpperCase();
        System.out.println(z1);


        System.out.println(x1.concat(y1).concat(z1));
        }

    
    
    }
    

    
    


    
        
    





     

       