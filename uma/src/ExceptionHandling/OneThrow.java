public class OneThrow {
    public static void main(String[] args) {
        

    
        try {
            System.out.println("keyword throw");

            throw new Exception();
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
        finally{
            System.out.println("exit");
        }
    }
    
}
