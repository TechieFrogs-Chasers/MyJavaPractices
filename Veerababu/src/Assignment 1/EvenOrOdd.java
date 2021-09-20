import java.util.Scanner;

public class EvenOrOdd {
   public static void main(String[] args) {
       int a;
       int b;
      /* float x = 10f;
       if(x%2==0){
           System.out.println("x is even"+" "+x);
       }
       else
       System.out.println("veeru is odd");
       System.out.println("Givn number is even or odd");*/

       Scanner eo = new Scanner(System.in);
       
       do
       {    
            System.out.println("Enter Input");

                if(eo.hasNextInt())
                    {   
                        a= eo.nextInt();
                        b=eo.nextInt();
                                if((a+b)%2==0)
                                {
                                    System.out.println("a value; "+ a + "b value; "+ b);
                                    System.out.println("1.Given values of a and b are Even Numbers  "+(a+b));
                                }
                                else if(((a+b)%2!=0))
                                {
                                    System.out.println("a value; "+ a + "b value; "+ b);
                                    System.out.println("1.Given values of a and b are Odd Numbers");
                                }
                                else
                                {
                                    System.out.println("Invalid");
                                }
                    }
                    else if(!eo.hasNextBoolean())
                    {  eo.next();
                        a= eo.nextInt();
                        b= eo.nextInt();
                                if((a+b)%2==0)
                                {
                                    System.out.println("a value; "+ a + "b value; "+ b);
                                    System.out.println("2.Given values of a and b are Even Numbers");
                                }
                                else{
                                    System.out.println("2.Given values of a and b are Odd Numbers");
                                }
                    }
                    else{
                        System.out.println("Null");
                    }
   
                    a = eo.nextInt();
        }while(a<=5);
                eo.close();

                System.out.println("Hi");
    }
}
