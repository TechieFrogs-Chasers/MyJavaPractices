import java.util.Scanner;

public class MallJar {

    public static void main(String[] args) {
        

        int jar=20;
        
        int k=5;

        Scanner obj = new Scanner(System.in);

       
        System.out.println("enter the number of candies ordered");
        int input=obj.nextInt();

       if(input>jar | input<=0)
       System.out.println("invalid input");
       else
        System.out.println("ordered candies are  "+input);
        

        int rem =(jar-input);
        if (input>0 && input <=jar)
     System.out.println("remianing candies after the order is  "+rem);

    else
    System.out.println("remaining candies in the jar is  "+jar);

     if (rem<=k)
     System.out.println("fill the jar again");


        obj.close();
    }
    
}
