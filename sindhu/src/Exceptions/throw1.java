package Exceptions;

public class throw1 {
    
        public int division(int a, int b) throws ArithmeticException{
           int t = a/b;
           return t;
        }

        throw1(){
            System.out.println("constructor");
        }
        public static void main(String args[]){
           throw1 obj = new throw1();
           try{
              System.out.println(obj.division(15,0));
           }
           catch(ArithmeticException e){
              System.out.println("You shouldn't divide number by zero");
           }
        }
     }
    

