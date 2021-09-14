package JavaBasicsAssignments;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        int one,two;

        Scanner QuotientAndRemainderobj = new Scanner(System.in);

        //validation for one

        do{
            System.out.println("Enter first  integer");

           while (!QuotientAndRemainderobj.hasNextInt() ){
               String input = QuotientAndRemainderobj.next();
               System.out.println(input+"  is not a valid type");
             }
             one = QuotientAndRemainderobj.nextInt();
           } while (one<=0);

     //validation for two

           do{
            System.out.println("Enter second  integer");
           while (!QuotientAndRemainderobj.hasNextInt() ){
               String input = QuotientAndRemainderobj.next();
               System.out.println(input+"  is not a valid type");
             }
             two = QuotientAndRemainderobj.nextInt();
           } while (two<=0);
       
       System.out.println("enter the type needed  : quo / rem");
       String type = QuotientAndRemainderobj.next();

          int q,r;

     switch(type){
       case "quo":
              q=(one/two);
         System.out.println("Quotient of these numbers is :  "+q);
             break;
      case "rem":
              r=(one % two);
         System.out.println("Remainder is :  "+r);
              break;
        default:
              System.out.println("none");
    }
    
         System.out.println("Thank you");



         QuotientAndRemainderobj.close();
        
    }
}
