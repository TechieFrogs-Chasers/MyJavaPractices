package sindhu.src.TCS;

import java.util.Scanner;

public class Nineteenth {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find Sum of the Numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        if (n1 > n2) {// if range 1 is greater than rang2 ten its a wrong input
            System.out.println("Wrong input");
        } else if (n1 <= 0 || n2 <= 0) {
            System.out.println("Wrong input");
        } else {
            for(int i = n1;i <= n2;i++){
            armstrong(i);
            }
            }
        
    
    
        public static void main(String[] args) {
            int r,cube=0,num,temp;
            
            num =temp;
            while(temp>0){
                r=temp%10;
                temp = temp/10;
                cube = cube+(r*r*r);
    
            }
            
            if(num==cube)
            {
                System.out.println("amstrong number");
            }
            else
            {
                System.out.println("not amstrong number");
    
            }
            
        





        private   int armstrong( i) {
            return i;
        }




        
        
    
        
    

