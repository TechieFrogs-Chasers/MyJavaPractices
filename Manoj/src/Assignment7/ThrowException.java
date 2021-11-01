package Assignment7;

//import java.io.NotActiveException;
import java.util.Scanner;

//class ThrowException extends Exception {
    //user defined exception 
   /* public ThrowException(String str){
        super(str);
    }
    public static void main(String[] args) {
        try{
            throw new ThrowException("this is user defined ");
        }
        catch(ThrowException te){
            System.out.println("caught the excetption ");
         te.printStackTrace();
        }
    }*/
//--------------------------------------------------------------------------------------------

    /*static void display(int num ){
        if (num%2!=0){
           throw new  ArrayIndexOutOfBoundsException("not a even number ");
        }
        else {
            throw new ArithmeticException("its a even number ");
           // System.out.println("it is a even number ");
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value ");
        int num=obj.nextInt();
        obj.close();
        display(num);
    }*/
//}

//user defined exceptions 

class Makingexception extends Exception{
   public Makingexception(String name){
       super(name);
   }
   static void display(int num) throws Makingexception{
       if (num%2!=0){
           throw new Makingexception("this not a even number ");
       }
       else{
         System.out.println("given number is even ");
       }
   }
   public static void main(String[] args) {
       Scanner obj= new Scanner(System.in);
       System.out.println("enter the value :");
       int num=obj.nextInt();
       try {
           display(num);
       }
       catch(Makingexception me){
          // System.out.println( me.getMessage());
          System.out.println(me.toString());
          //me.printStackTrace();

       }
       obj.close();
       
   }

}
