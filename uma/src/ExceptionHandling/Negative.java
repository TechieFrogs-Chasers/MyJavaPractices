public class Negative {

    public static void main(String[] args) {
       

        try {
            int[] a = new int[-4];
            System.out.println(a);
 
            
        } catch (NegativeArraySizeException  e) {
            System.out.println(e);
           
        }
        System.out.println("out of array");
    }
    
}
