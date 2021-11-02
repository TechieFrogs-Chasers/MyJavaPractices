public class ExceptionDemo4 {
   /* static void validate( int age){
        if (age<18){
            throw new ArrayIndexOutOfBoundsException("you are not eligible to vote ");
            //throwing an exception by user using throw 
        }
        else {
            System.out.println("you are eligible to vote ");
        }

    }
  public static void main(String[] args) {
      validate(16);
      
  }    */



  //throwsis used in method signature and allows to try catch block
     static void display()  throws ArithmeticException {
        int a = 3/0;
        System.out.println(a);

    }
    public static void main(String[] args) {
        try {
            display();
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("   ");
        
    }

}
