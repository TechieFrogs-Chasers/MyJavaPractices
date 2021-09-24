package OopsConcepts;


import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        
    
       Scanner obj1=new  Scanner(System.in);

        System.out.println("enter your first number");
        int a=Average.validation(obj1);
     
        System.out.println("enter your second number");
        int b=Average.validation(obj1);
        obj1.nextInt();
        System.out.println("enter your third number");
        int c= Average.validation(obj1);

      obj1.nextInt();
      //obj1.nextInt();
      //obj1.nextInt();
     
        int sum=(a+b+c)/3;
        System.out.println(sum);


     obj1.close();  
    }
    


     static int  validation(Scanner obj1){
    int num;
    Scanner obj=new  Scanner(System.in);
    do{
        System.out.println("enter your number:");
       while(!obj.hasNextInt() ){
           obj.next();
           System.out.println("  is not a valid type");
         }
         num=obj.nextInt();
       } while(num<=0);
       obj.close();
       return num;
    }   


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