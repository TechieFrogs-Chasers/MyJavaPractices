package Assignment7;

import java.io.IOException;

public class Exceptionmethod {
    
    void display() throws IOException{
        throw new IOException("from display ");
    }
    void display2() throws IOException{

        display();
    }
    void display3(){
        try {
        display2();
        }
        catch(Exception e){
       System.out.println("exception");
        }
    }
    public static void main(String[] args) {
        Exceptionmethod obj=new Exceptionmethod();
        obj.display3();
    }
    
}
