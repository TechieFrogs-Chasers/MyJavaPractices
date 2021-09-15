package JavaBasicsAssignments;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        

        Scanner Lcmobj = new Scanner(System.in);

        int a,b,c,d,e,lcm;

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
       a=1;
       b=1;
       c=1;
    d=(a/c);
    e=(b/c);
   
      lcm=((c)*(d)*(e));
     System.out.println(lcm);



           Lcmobj.close();

    }
    
}
