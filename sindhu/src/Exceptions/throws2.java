package Exceptions;

public class throws2 {

    void m1() throws ArithmeticException,ArrayIndexOutOfBoundsException,NegativeArraySizeException{

        //ur method may throw other  exceptions. so, we can write multiple exceptions

     //void m1(){

        try{
            throw new ArithmeticException("not valid condition");
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();

            System.out.println("custom message");
        }
        
    }
        
    throws2(String name){

        System.out.println("constructor1");
    }


    void m2(){

        try{
            //System.exit(0);

            throw new ArrayIndexOutOfBoundsException(); //anonymus way 
        }
        catch(ArrayIndexOutOfBoundsException ai){

            System.out.println("custom message2");
        }
        finally{
            System.out.println("custom message 3");
        }
    }

    void m3(){
        

        try{
            throw new NullPointerException();
        }
        catch(NullPointerException n){

            System.out.println("custommessage4");
            
        }
    }

    throws2(){
        
        this("sindhu");
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        
        throws2 x = new throws2();
        x.m1();
        x.m2();
        x.m3();
    }
    
}
