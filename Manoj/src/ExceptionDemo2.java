public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            int arr[]={2,3};
             arr[2]=3;//array indexoutofbound exception 
             arr[3]=5/0;//arithmetic exception 
        }
        //if we have multiple catch statements it will only execute only one statement 
        catch(ArithmeticException ae){
            ae.printStackTrace();

        }
        catch(ArrayIndexOutOfBoundsException ib){
            ib.printStackTrace();
        }
       /* catch(Exception e){
            e.printStackTrace();

        }*/
        
    }
    
}
