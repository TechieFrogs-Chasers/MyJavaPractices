package Exceptions;

public class CustomExceptions extends Exception{

    CustomExceptions(){
        this("message");

        System.out.println("constructor");


    }

    CustomExceptions(String message){

        super("sindhu");


    }

    public static void main(String[] args) {

        CustomExceptions x = new CustomExceptions();
        int age =10;
        if(age<18){

            try{

                throw x;
            } catch (CustomExceptions c){

                System.out.println(c.getMessage());


            }
        }
        

    }
    
}
