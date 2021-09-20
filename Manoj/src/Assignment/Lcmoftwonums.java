import java.util.Scanner;
public class Lcmoftwonums {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        int lcm;
        System.out.println("enter the n1 value ");
        int n1=Lcmoftwonums.validatenumber(object);

        System.out.println("enter the n2 value ");
        int n2=Lcmoftwonums.validatenumber(object);

        object.close();
        lcm=(n1>n2) ? n1:n2;   //here we trinary operator
        while(true){               
            if (lcm % n1==0 && lcm % n2==0){
                System.out.printf("the lcm of %d and %d is %d. ",n1, n2,lcm);
                break;
            }
            ++lcm;
        }
    }
    static int validatenumber(Scanner object){ //validate method is used for multiple inputs 
        int num;
        do{
            System.out.println("enter the number ");
            while(!object.hasNextInt())
            {
                System.out.println("this is not a number ,please enter valid one ");
                object.next();

            }num=object.nextInt();
        }while(num<=0);
        return num;   //return is used to close the method 
    }

    
}
