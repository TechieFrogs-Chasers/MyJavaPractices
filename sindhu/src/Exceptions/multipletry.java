package Exceptions;

public class multipletry {

    public static void main(String[] args) {

        

        try{
            int i = 50;
            int j = 0;
            try{

                int x = i/j;
            }
            catch(ArrayIndexOutOfBoundsException ai){
                ai.printStackTrace();

            }
            
            
        }
        catch(ArithmeticException ae){

            ae.printStackTrace();

        }
       

        finally{

            System.out.println("remaining code");
        }
        

    }
    
}
