package Assignment1;

import java.util.Scanner;

/*public class Naturalnumbers {
    
    public static void main(String[] args) {
        int i,num=5,sum=0;
       //number = n*(n+1)/2;
       for(i=1;i<=num;++i){
          
           sum=sum+i;
       }
           System.out.println("enter sum of natural numbers" + sum);
    }
}*/

/*public class Naturalnumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        System.out.println("enter a number");
        int s=input.nextInt();
        for(int i=1;i<=s;i++){
          
            sum=sum+i;
        }
        
            System.out.println("enter sum of natural numbers" + sum);
        
        input.close();

    }

}*/

public class Naturalnumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0,x;
        do{
            System.out.println("enter a number");
            while(!input.hasNextInt()){
                String s = input.next();
                System.out.println(s+"please enter a number");
            }
            x=input.nextInt();
        } while(x<=0);
        for(int i=1;i<=x;i++){
          
            sum=sum+i;
        }
        
            System.out.println("enter sum of natural numbers" + sum);
            input.close();


        
    }
}



           

    


        
    

