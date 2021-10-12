package sindhu.src.TCS;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        int jar =10;
    
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many candies do you want");
     int a1 = input.nextInt();
     int z1 = jar -a1;

     if((z1>0 && z1<10)){
     System.out.println("number of candies sold : " + a1);
     System.out.println("number of candies left :" +z1 );
 }
 else if(z1<=0 || z1>=10){
     System.out.println("invalid input");
     System.out.println("number of candies left :" +jar );
 } 

        input.close();
}
}
}


    