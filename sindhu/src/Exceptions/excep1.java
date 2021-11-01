package Exceptions;

public class excep1 {
    public static void main(String[] args) {
        
        try{

            int x= 50/0;
        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println(e);


        }

        System.out.println("rest of the code");
    }
    
}
