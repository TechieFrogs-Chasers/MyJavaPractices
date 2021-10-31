import java.util.Arrays;
public class CopyingArray {

    public static void main(String[] args) {
        
      String[] cards = {"chase","citi","amex"};

    String[] copy = Arrays.copyOf(cards,cards.length);

    System.out.println("original array"+cards);
    System.out.println("copied array"+copy);


    //in single dimensional array,it is called deep copying,
    //because an exact copy of the array is created in the memory

     
    






    }
    
}
