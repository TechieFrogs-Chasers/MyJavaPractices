
import java.util.Scanner;

public class NextScanner {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       
        System.out.println("enter your name");
        String name=obj.next();

       System.out.println("your name is :   "+name);
       obj.nextLine();
        
       System.out.println("enter your gender m/f:  ");
        String gender=obj.next();
        System.out.println(gender.charAt(0));
        
        System.out.println(gender.length());

        System.out.println("enter your marital status ");
        
       String status=obj.next();
       
        switch(status){
          case "married":
           System.out.println("you are married");
           break;
            case "unmarried":
           System.out.println("you are unmarried");
            break;
           default:
            System.out.println("child");
        }
       
        System.out.println("enter your age");
        //obj.nextInt();
        int age=obj.nextInt();
        //String s= obj.next();
        if(age<=17)
        System.out.println("minor");
        else if
        //System.out.println("major");
            (age>18 && age<=60)
              System.out.println("in service  and voter");
           else
           System.out.println("senior citizen");
           
            obj.nextLine();
     
        System.out.println("enter your gross income:$  ");
        obj.nextLong();

        System.out.println("your net income is:    ");
        obj.nextFloat();

        System.out.println("your pocket money");
        obj.nextByte();

        boolean b=obj.nextBoolean();
        //obj.nextBoolean();
        if(b==true)
        
        System.out.println("i consent");
else
System.out.println("no consent");



        obj.close();
    }
    
}
