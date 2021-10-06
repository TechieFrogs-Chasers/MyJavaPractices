package BasicPractices;
public class EvenOdd {
    public static void main(String[] args) {
        int num = 59;
        if (num % 2 ==0) {
            System.out.println("n is an even numbr");}
        
        else if( (num ^ 1)  == num +1) { 
            System.out.println( "n is an even numbr");
        }
            else {
                System.out.println("n is an odd numbr");

            }
            
        
    }
    
}
