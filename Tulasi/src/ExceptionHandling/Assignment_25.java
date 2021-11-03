package ExceptionHandling;

public class Assignment_25 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.out.println(80 / 2);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("finally:I execute always!");
        }
    }
}
