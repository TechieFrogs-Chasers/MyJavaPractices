public class ExceptionDemo {
    public static void main(String[] args) {
       System.out.println("exceptional demo ");
       //here we are getting an exception error for to slove that we need to use 
       //try block is placed where the exception is occurs
       try{
       int a =10;
       int b=0;
       int c=a/b;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       }
       //if we use try block we need to have a catch block or finally block 
       catch(ArithmeticException ae){ //for catch block we need to having a parameters 
        //in parameters we need to give a what kind of exception it occurs  and variable name 
        ae.printStackTrace(); //here printstacktrace is a method in which catch contains of 5 method 
        //it gives the exception name ,reason ,line number ,method ,class ,program name.

       }

       System.out.println("after statements ");

    }
    
}
