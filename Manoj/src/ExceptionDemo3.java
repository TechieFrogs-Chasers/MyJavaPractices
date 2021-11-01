public class ExceptionDemo3 {
    public static void main(String[] args) {
        //here we are trying nested to execute all the catch blocks 
        try {
            int arr[]={2,3};
            try {
                arr[5]=4;//indexout of bound exception 
            }
            catch(ArrayIndexOutOfBoundsException ib){
                ib.printStackTrace();
            }
            arr[3]=4/0; //arthematic exception
        }
            catch(ArithmeticException ae){
                ae.printStackTrace();

            }
            finally {
                System.out.println("from finally block");
            }
    }
    
}
