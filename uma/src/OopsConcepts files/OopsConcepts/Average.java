package OopsConcepts;


import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        
    
       Scanner obj1=new  Scanner(System.in);

        //System.out.println("enter your first number"); //no need ,already in the validation method

        int a= Average.validation(obj1); //no need of class name since it is in the same class
        int b= validation(obj1);  //works with or without class name
        int c= validation(obj1);

        int sum=(a+b+c)/3;
        System.out.println("average of three numbers is  "+sum);


        obj1.close();
    
    
    }

      static int  validation(Scanner obj1){
        
           int num;
      //Scanner obj=new  Scanner(System.in);// no need to use scanner here if we have in the main method

         do{
           System.out.println("enter your number:");
            while(!obj1.hasNextInt() ){
           obj1.next(); 
           System.out.println("  is not a valid type");
              }
              num=obj1.nextInt();
           } while(num<=0);

          // obj.close(); //we can not close the scanner here ,it gives run time error
          //                      closing stops scanner to take next input
               return num;
      }   

         //program with out validation
         /*Scanner sc =new Scanner(System.in);
                System.out.println("first number");
               int a = sc.nextInt();
                 System.out.println("second number");
               int b= sc.nextInt();
               System.out.println("third number");
           int c=sc.nextInt();
            Average obj = new Average();
           obj.dispay(a, b, c);


          sc.close();
    }
            void dispay(int a,int b,int c){
           int average=(a+b+c)/3;
             System.out.println(average);
       }*/
}