import java.util.Scanner;
public class AddingIntegers {
    public static void main(String[] args) {
       /* int i;
        int j;
        i=15;
        j=25;
        System.out.println("Add two integer values" +" "+ (i+j));
   

    Scanner add = new Scanner(System.in);
    System.out.println("Given First Value");
    int l = add.nextInt();
    System.out.println("Givre Second Value");
    int m=add.nextInt();
    add.close();
    
    int k;
    k=l+m;
    System.out.println("Adding of Two Integers is"+" "+k);  */

    // if condition

    /*int a=10;
    int b=10;
        System.out.println("Enter an Integer value ");
        Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()) 
            {
                a= sc.nextInt();
                b= sc.nextInt();
                if((a+b)>0)
                {
                    System.out.println("You entered a positive integer "+(a+b));
                }
                else 
                {
                    System.out.println("You entered a negative integer "+(a+b));
                }
            }
            else 
            {
                System.out.println("Please Enter Valid Integer");
            }
    sc.close();
    System.out.println("a+b ="+ (a+b)); */

    // do while loop

    Scanner add = new Scanner(System.in);
    int a;
    int b;
    do{
        System.out.println("Print Integer Values");
        while(!add.hasNextInt())
        {   add.nextBoolean();
            a=add.nextInt();
            b=add.nextInt();
            System.out.println("Sum of Integers "+ (a+b));
        }
       // System.out.println("print a & b");
        a=add.nextInt();
        b=add.nextInt();
    }while((a+b)<=4);
    add.close();
    
    //while
    /*Scanner add = new Scanner(System.in);
    int a;
    int b;
        while(!add.hasNextInt())
        {   add.next();
            a = add.nextInt();
            b = add.nextInt();
            System.out.println("Sum of Two Integers; "+ (a+b));
            
        }
        add.close();*/

        System.out.println("Sum of Integers");
    }
   
}

