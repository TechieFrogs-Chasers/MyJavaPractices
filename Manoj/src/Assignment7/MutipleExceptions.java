package Assignment7;

public class MutipleExceptions {
    public static void main(String[] args) {
        //giving multiple exceptions 
        try{
            int arr[]={2,3,5};
            arr[10]=5/0;
        }
        catch(ArithmeticException|ArrayIndexOutOfBoundsException ae){ 
           ae.printStackTrace();
        }
       /* catch(ArrayIndexOutOfBoundsException ib){
            ib.printStackTrace();
        }
       catch(Exception e){
            e.printStackTrace();
        }*/
    }
    
}
