import java.util.Scanner;
public class Io {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* int i;
        do
        {
            System.out.println("Enter age");
            while(!in.hasNextInt())
            {
                String a = in.next();
                System.out.println("Print Integer Value");
              //  System.out.println(a);
                
            }
            i = in.nextInt();
        }while(i<=4);*/
        int a;
        int b;
        do{
            System.out.println("Give First & Second Number");
            while(!in.hasNextInt())
            {   
                String input = in.next();
                int i= in.nextInt();
                int j =in.nextInt();
                System.out.println("Print String Value"+" "+input);
                System.out.println("i+j ="+" "+(i+j));
                i++;
                System.out.println(i);
            }
            a = in.nextInt();
        }while(a<=4);

          /*  String s;
            int a;
            if(!in.hasNextInt())
            {
                s = in.next();
                System.out.println("Print String Value"+" "+s);
                if(!in.hasNext()){
                    a = in.nextInt();
                    System.out.println("Print a value"+ a);
            }
            else
            {
                System.out.println("Hi");
            }
        }*/
                   
        System.out.println("Please Enter Valid Number");
    }
}
