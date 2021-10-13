package TCS;
import java.util.Scanner;

public class Jar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,N=10;
    
        //System.out.println("enter the no.of candies:");
            for(int i=1;i<=N;++i){
            System.out.println("enter the no.of candies:"+N);
            //System.out.println("enter number of candies sold:"+i);
            //for(int k=1;k<=i;k++){
                //System.out.println("enter remaining candies in jar:"+k);
                k = N - i;
                System.out.println("enter number of candies sold:"+i);
                System.out.println("remaining candies in jar:"+k);

                sc.close();
                

            }
        }
    }
    
        
        
   

    

