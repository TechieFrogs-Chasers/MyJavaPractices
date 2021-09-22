import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
      /*  byte a=1;
        byte b=2;
        byte c=3;
        if((a<b) && (b<c)){
            System.out.println("c is the largest number"+" "+ c);
        }
        else if((a<c)||(b<c)){
            System.out.println(" b is the largest number"+" "+ b);
        }
        else
        System.out.println("Invalid");*/

      /*  Scanner Big = new Scanner(System.in);
        System.out.println("Enter the Num 1");
        int x = Big.nextInt();
        System.out.println("Enter the Num2");
        int y = Big.nextInt();
        System.out.println("Enter the Num3");
        int z = Big.nextInt();

        if((x<y)&&(x<z)){
            System.out.println("Value of X is Bigger"+"  "+ x);
        }
        else if((x<y)||(x>y)){
            System.out.println("Value of Y is Bigger"+"  "+ y);
        }
        else if((x<y)==(x>y)){
            System.out.println("VAlue of Z is Bigger"+"  "+ z);
        }*/

        Scanner Large = new Scanner(System.in);
        int x;
        int y;
        int z;
        int a;
            do
            {
               System.out.println("Print Largest Number"); 
               while(!Large.hasNextInt())
               {
                Large.next();
                System.out.println("Print x,y,z values");
                x = Large.nextInt();
                y = Large.nextInt();
                z = Large.nextInt();
                    if(((x+y)<y) && ((x+z)>y))
                    {
                    System.out.println("x is the Largest Number"+" "+x);
                    }
                    else if(((x+z)<y) || ((x+z)<z))
                    {
                    System.out.println("y is the Largest Number"+" "+y);
                    }
                    else if(((x+y)<z) && ((x+z)>y))
                    {
                    System.out.println("z is the Largest Number"+" "+z);
                    }
                    else
                    {
                        System.out.println("Invalid");
                    }
                
               }
               a = Large.nextInt();
           }while(a<=2);
           Large.close();

        System.out.println("Invalid Result");
    }
}
