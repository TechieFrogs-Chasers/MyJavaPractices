package JavaBasicsAssignments;

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner LargestNumobj = new Scanner(System.in);
    
    int first, second ,third;

    //Validation of first number

    do{
        System.out.println("Enter the first +ve number");

       while(!LargestNumobj.hasNextInt())
        {
           String input= LargestNumobj.next();
           System.out.println(input+"  is not a valid type");
         }

         first= LargestNumobj.nextInt();

       } while(first<=0);

   //Validation of second number


    do{
        System.out.println("Enter the second +ve number");

       while(!LargestNumobj.hasNextInt()) 
       {
           String input= LargestNumobj.next();
           System.out.println(input+"  is not a valid type");
         }
         second= LargestNumobj.nextInt();

       } while(second<=0);


       //Validation of third number


       do{
        System.out.println("Enter the third +ve number");

       while(!LargestNumobj.hasNextInt())
        {
           String input= LargestNumobj.next();
           System.out.println(input+"  is not a valid type");
         }
         third= LargestNumobj.nextInt();

       } while(third<=0);
    
    // Condition

    if(first>second && first>third)

          System.out.println("First number is greater");

    else if (second>first && second>third)

        System.out.println("Second is greater number");

    if(third>first && third >second)

         System.out.println("Third number is greater");

            System.out.println("Thank you");




   LargestNumobj.close();
    }
    

      




        static int ValidatePositiveNumber(Scanner LargestNum){
            int number;
            do{
                System.out.println("enter the +ve number");
               while(!LargestNum.hasNextInt()) {
                   String input= LargestNum.next();
                   System.out.println(input+"  is not a valid type");
                 }
                 number= LargestNum.nextInt();
               } while(number<=0);
               System.out.println("you have entered the +ve number"+number);
               return number;
            }
    
        }
