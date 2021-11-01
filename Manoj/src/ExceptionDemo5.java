import java.util.Scanner;
public class ExceptionDemo5 extends Exception { //runtime exception
     public ExceptionDemo5(String str){
      super(str);
    }
}
    public class testthrow{
    public static void main(String[] args) throws ExceptionDemo5{
        try {
            Scanner obj=new Scanner(System.in);
            
            int num=obj.nextInt();
            if (num<18){
                throw new ExceptionDemo5( "you are not eligible to vote " );
            }
            else{
                System.out.println("you are eligible to vote ");
            }
        }
        catch(ExceptionDemo5 e5){
            e5.printStackTrace();

        }
        
    }

    
}
