package Exceptions;



public class throws1 {
    
    static void m1()throws ArrayIndexOutOfBoundsException,NullPointerException{

        try{

            
            try{
            int y =10/0;
        }
        catch(ArithmeticException io){
            System.out.println("using throws keyword");
        }
        throw new NegativeArraySizeException();

        
    } catch(NegativeArraySizeException n){

        System.out.println("using throw and throws keyword");

    }


    System.out.println("method");
}


    public static void main(String[] args) {
        
        throws1 x = new throws1();
        throws1.m1();
    }
}
