public class AddEx {

    public static void main(String[] args) {
        
        int num=10;
        int num1=0;
        int total;
        try{
            
            total=num /num1;
            System.out.println(total);
        }
        catch(Exception s){

            System.out.println(s);
            total= num/(num1+2);
           
            
        }
        System.out.println(total+ "    after handling exception");
    }
    
}
