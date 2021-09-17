package Assignment;
import java.util.Scanner;

public class Lcm {
    
    public static void main(String args[]){
        int a, b, max, step, lcm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        a = sc.nextInt();
        System.out.println("Enter second number :");
        b = sc.nextInt();
        sc.close();
  
        if(a > b){
           max = step = a;//suppose a=4, step = 4, max= 4
        }
        else{
           max = step = b;//suppose b=5, step =5 max =5
        }
  
        while(a!= 0) {
           if(max % a == 0 && max % b == 0) {// both conditions true
              lcm = max;//here max =5 so lcm =5
              break;
           }
           max += step;//
        }
        System.out.println("LCM of given numbers is :: "+lcm);
     }
  }
