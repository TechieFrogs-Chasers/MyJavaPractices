import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        
            Scanner largestObj = new Scanner(System.in);
            System.out.println("Eneter Value of i");
            int i = largestObj.nextInt();
            System.out.println("Eneter Value of j");
            int j = largestObj.nextInt();
            System.out.println("Eneter Value of k");
            int k = largestObj.nextInt();
            largestObj.close();
            if (i>j){
                   if(i>k)     
                      System.out.println("Largest Number "+i);
                       else 
                          System.out.println("Largest Number "+k);//Nested if
            }
                           if (j>k)
                                 System.out.println("Largest Number "+j);
                                 
                                     else
                                         System.out.println("Largest Number "+k);//if else
                                     
         
     
    }
    
}
