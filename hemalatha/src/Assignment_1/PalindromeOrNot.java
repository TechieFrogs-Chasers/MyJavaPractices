package Assignment_1;
import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        int num,rev,temp=0,val=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        do{
            while(!sc.hasNext()){
                int input = sc.nextInt();
            }
            rev=sc.nextInt();
            num = rev;
        }
             while(rev<0);
            {
                num=rev%10;
                rev=rev/10;
                temp=temp*10+num;     
            }
               if(temp==val)
               {
                   System.out.println("this is palindrome:");
               }
               else 
               {
                   System.out.println("this is not palindrome");
               }
               sc.close();
            
            
        
            
        
            

        

        


    }
}
    


