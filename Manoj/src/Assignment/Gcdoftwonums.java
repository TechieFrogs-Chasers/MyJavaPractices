import java.util.Scanner;
public class Gcdoftwonums{
    public static void main(String...args){
        Scanner object=new Scanner(System.in);    // scanner object is created 
        int gcd=1;
        System.out.println("enter the n1 value");
        int n1=Gcdoftwonums.validatenumber(object);
         
        System.out.println("enter the n2 value ");
        int n2=Gcdoftwonums.validatenumber(object);

        object.close();              //object is closed 
        for (int i =1; i<=n1 && i<=n2; ++i){
             
            if (n1 % i==0 && n2 % i==0)
            gcd = i;
        }
        System.out.println("gcd of "+n1+"and "+n2 +"is "+ gcd);
    }
    static int validatenumber(Scanner object){    //validate method id used for multiple input values 
        int num;
        do{
            System.out.println("entr the number ");
            while(!object.hasNextInt())
            {
                System.out.println("this is not a number ,please enter valid one ");
                object.next();
            }num=object.nextInt();

        }while(num<=0);
        return num ;          //return is used to close the method 
    }
}