package TCS;
import java.util.Scanner;

public class Jar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of candies");
        int num=sc.nextInt();
        int N=10;
        int k=5;
        if(num>=1 && num<=k){
            int remainingcandies = N-num;
            System.out.println("number of candies:"+num);
            System.out.println("number candies avilable in jar:"+remainingcandies);
            
        }
        else {
            System.out.println("INVALID OUTPUT");
            System.out.println("number of candies left in jar:"+N);
        }
        sc.close();
    
       
                

            }
        }
    
    
        
        
   

    

