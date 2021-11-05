package ExceptionHandling;

public class Assignment_15 {
    public static void main(String[] args) {
        int []arr=new int[-10];
        try {
            System.out.println(arr);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
        }catch (NegativeArraySizeException ne){
            ne.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Final statement!");
        }
    }
}
