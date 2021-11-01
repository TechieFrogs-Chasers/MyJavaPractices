package Exceptions;



public class throwexcep {

    static void m1(int age){

        if(age<18){

            throw new ArithmeticException("not valid");
        }
        else {

            System.out.println("valid");
        }
    }

    throwexcep(){

        System.out.println("constructor");
    }

    void m2(){
        System.out.println("method2");
    }

    public static void main(String[] args) {
        try{

            int[] x = {1,2,3,4};
            throw new ArithmeticException("not valid"); //RETHROWING AN EXCEPTION
           //int y = x[5];
    
           }catch(NullPointerException ni){
               ni.printStackTrace();
            }
            catch(ArithmeticException ae){
    
                ae.printStackTrace();
    
            }

        

        throwexcep z = new throwexcep();
        z.m2();
        throwexcep.m1(8);
        

       
        

    }
    
}
