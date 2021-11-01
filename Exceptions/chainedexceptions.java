package Exceptions;

import java.io.IOException;

public class chainedexceptions {

    static void m1() throws Throwable{

        try{

            int a = 10/0;
        }catch(Exception e){

             e.printStackTrace();

         throw  e.initCause(new IOException("we are unable to read and write infinity values"));


        }
    }
    
    public static void main(String[] args)  {
        try{

            m1();
        }
        catch(Throwable t){
            System.out.println(t.getCause());

        }
    }
}
