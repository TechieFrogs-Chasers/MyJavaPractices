public class Arguments {
    public static void main(String[] args) {
       // arg(10.7);
        

    }

    static void arg(int x){
        System.out.println("exception argument");
        try {
            x=10;
            
        } catch (Exception e) {
          x=(int) 10.7;
            System.out.println(e);
        }
        
        System.out.println("exit");
    }
    
}
