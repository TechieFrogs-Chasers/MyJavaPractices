package Assignment1;



/*public class PrimeNumber {
    public static void main(String[] args){
        int num=3;
        int count=0;
        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                count++;
             }
            if(count==2)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("not a prime number");

            }
        }
        else
        {
            System.out.println("not a prime number");
        }
    }
    
}*/

//scanner method

/*import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        int count=0;

Scanner input = new Scanner(System.in);

System.out.println("enter a number");
int sc = input.nextInt();

        if(sc>1)
        {
            for(int i=1;i<=sc;i++)
            {
                if(sc%i==0)
                count++;
             }
            if(count==2)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("not a prime number");

            }
        }
        else
        {
            System.out.println("not a prime number");
        }
        input.close();
    }
    
}*/

//validation method
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sc,count=0;
        do{
            System.out.println("enter a number");
            while(!input.hasNextInt()){
                String x = input.next();
                System.out.println(x+"is not a valid number");
            }
            sc = input.nextInt();
        }while(sc<=0);

        if(sc>1)
        {
            for(int i=1;i<=sc;i++)
            {
                if(sc%i==0)
                count++;
             }
            if(count==2)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("is not a prime number");

            }
        }
        else
        {
            System.out.println("is not a prime number");
        }
        input.close();
    }
}






    


