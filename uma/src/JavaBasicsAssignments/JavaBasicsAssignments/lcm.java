package JavaBasicsAssignments;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        

        Scanner Lcmobj = new Scanner(System.in);

        int a,b,lcm;

        do{
            System.out.println("Enter first  integer");

           while (!Lcmobj.hasNextInt() ){
               String input = Lcmobj.next();
               System.out.println(input+"  is not a valid type");
             }
             a = Lcmobj.nextInt();
           } while (a<=0);
    

           do{
            System.out.println("Enter second  integer");
           while (!Lcmobj.hasNextInt() ){
               String input = Lcmobj.next();
               System.out.println(input+"  is not a valid type");
             }
             b = Lcmobj.nextInt();
           } while (b<=0);

           lcm=(a>b)?a:b;
          while(true){

           if (lcm%a ==0 && lcm%b==0) {
             System.out.println(lcm);
             break;
           }
      lcm++;
          
          }

           Lcmobj.close();

    }
    
}
