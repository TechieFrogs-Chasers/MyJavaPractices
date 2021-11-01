public class Arithmetic {

    public static void main(String[] args) {
        
        int a= 10;
        int b= 0;
        int sum;
        try {
            sum=a/b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            
        }
        finally{
            sum =a/(b+2);
            System.out.println(sum);
        }
    }
    
}
