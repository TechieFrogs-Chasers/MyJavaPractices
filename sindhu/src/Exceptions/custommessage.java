package Exceptions;

public class custommessage {

    public static void main(String[] args) {
        
        try{

            int x = 50/0;
        }
        catch(Exception e){

            System.out.println("can't divide by zero"); //custom message
            e.printStackTrace();

        }

        System.out.println("hello");
    }
    
}
