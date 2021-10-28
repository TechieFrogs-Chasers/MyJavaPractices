import java.util.Random;

public class StrQuestion10 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    
    StringBuilder sb = new StringBuilder(); // create random string builder

    Random random = new Random();   // create an object of Random class

    int length = 7;  // specify length of random string

    for(int i = 0; i < length; i++) {

      int index = random.nextInt(alphabet.length());  // generate random index number

      char randomChar = alphabet.charAt(index);// get character specified by index from the string

      sb.append(randomChar);
    }

    String randomString = sb.toString();
    System.out.println("Random String is: " + randomString);

  


    }
    
}
