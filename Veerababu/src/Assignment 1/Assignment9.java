import java.util.Scanner;
public class Assignment9 {
public static void main(String[] args) {
    Scanner Natural = new Scanner(System.in);
    System.out.println("Enter the Value of l");
    long l = Natural.nextInt();
    Natural.close();

    long i=1;
    long sum=0;
    /*while(i<=l){
        sum=sum+i;
        //System.out.println("Print the Sum of N Natural Numbers"+"  "+ sum);
        i++;
       }*/

       for(i=1;i<=l;i++)
       {
           sum=sum+i;
          // System.out.println("Print Sum of Natural Numbers"+ sum);
       }
       System.out.println("Sum of N Natural Numbers is"+"  "+sum);
    }
    
}
