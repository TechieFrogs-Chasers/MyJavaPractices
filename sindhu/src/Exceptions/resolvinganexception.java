package Exceptions;

public class resolvinganexception {
    public static void main(String[] args) {
        
        int i=50;
        int j=0;

        int[] x1 = {1,2,3,4};
        try{
            int x = i/j; //throwing an exception it will directly go to catch block
            int x2 = x1[4]; // it will not execute. 
        }
        catch(Exception e){

            System.out.println(i/(j+2));

            


        }
    }
    
}
