import java.util.Scanner;


public class LargestOfThree {
    public static void main(String[] args) {
        
            Scanner largestObj = new Scanner(System.in);
            //System.out.println("Eneter Value of i");
            int i = validation(largestObj);
            System.out.println("i Value is :"+i);
            int j = validation(largestObj);
            System.out.println("j Value is :"+j);
            int k = validation(largestObj);
            System.out.println("k Value is :"+k);
            largestObj.close();
            if (i>j){
                   if(i>k)     
                      System.out.println("Largest Number is "+i);
                       else 
                          System.out.println("Largest Number is "+k);//Nested if
            }
                           if (j>k)
                                 System.out.println("Largest Number is "+j);
                                     
    }
    static  int validation(Scanner scanner){
        int num;
        
            do{
                System.out.println("Pease enter a valid number");
                while(!scanner.hasNextShort()){
                    String input = scanner.next();
                    System.out.println("Please enter a valid number");
                }
                num = scanner.nextShort();
         //System.out.println("Entered Value is Valid");
        }while(num<0);  
        return num;
    }

}
