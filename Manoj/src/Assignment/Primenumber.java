import java.util.Scanner; 
public class Primenumber {
    public static void main(String...args){
        Scanner object=new Scanner (System.in);      //object has created here 
        int num,i,count=0;
        do{                                   //here we check the number is 
            System.out.println("enter the number ");
            while(!object.hasNextInt());             //here it checks weather the value is number or not 
            {
                object.next();
                System.out.println("this is not a number please enter a valid one ");

            }num=object.nextInt();
        }while(num<=0);
        object.close(); //object closed 

        for (i=2; i<num; i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if (count==0)
        {
            System.out.println("this is a primenumber ");
        }else
        {
            System.out.println("this is not a primenumber ");
        }
    }
    
}
