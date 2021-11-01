public class NestedTry {
    public static void main(String[] args) {
        try
        {
            System.out.print("A");
            throw new Exception();
        }
        catch (Exception e)
        {
            try
            {
                try 
                {
                    throw new Exception();
                }
                catch (Exception ex) 
                {
                    System.out.print("B");
                }
                throw new Exception();
            }
            catch (Exception exc)
            {
                System.out.print("C");
            }
        } 
    }
    
}
