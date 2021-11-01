package Exceptions;



public class exceptionpropagation {

    void m1(){

        int[] x = {1,2,3,4};
        int y = x[5];
    }

    void m2(){

        m1();
    }

    void m3(){

        try{

            m2();
        }
        catch(ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();

        }
    }

    public static void main(String[] args) {

        exceptionpropagation x = new exceptionpropagation();
        x.m3();
        

    }
    
}
