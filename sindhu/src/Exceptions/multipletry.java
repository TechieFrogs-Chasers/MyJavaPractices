package Exceptions;

public class multipletry {

    public static void main(String[] args) {

        

        try{
            int i = 50;
            int j = 0;
            
            try{

                int x = i/j;
            }
            catch(ArrayIndexOutOfBoundsException ae){  //it will not read system.exit it will comes out of the loop
                ae.printStackTrace();
                

            }
            System.exit(0); 
           
            
            
        }
        
        
       

        finally{

            System.out.println("remaining code");
        }
        

    }
    
}
