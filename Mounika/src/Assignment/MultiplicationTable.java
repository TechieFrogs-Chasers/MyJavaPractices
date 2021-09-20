package Assignment;
import java.util.Scanner;

public class MultiplicationTable {
    
   /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter a Number");
           int j = sc.nextInt();
           for(int i=2;i<=20;i++){
            System.out.println(j+"*"+i+"="+j*i);
            sc.close();
        }
    }*/
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
           System.out.println("Enter a Number");
           int i=1;
           int j=sc.nextInt();// taken as input frm consol

           while(i<=10){
               System.out.println(j+"*"+i+"="+j*i);
               i++;
               sc.close();
           }
    }
}