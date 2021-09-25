package HackerRank.java;

import java.util.Scanner;




public class IfElse {

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
       System.out.println("enter number");
        int n = scanner.nextInt();
         
        
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2 == 1){
       System.out.println("Weird"); 
    } 
    else if(n%2==0 && 2<n && n<5){
       System.out.println("Not Weird");
    }
    else if(n%2==0 && 6<n && n<=20){
       System.out.println("Weird"); 
    }
    else if(n%2==0 && 20<n && n<=100){
       System.out.println("Not Weird"); 
    }
    
        
      
       
        scanner.close();
    }
}

/*
if(n%2==1 || (n>=6 && n <= 20)){
  Sysout "Weird";
}else{
  ans = "Not Weird";
}

*/