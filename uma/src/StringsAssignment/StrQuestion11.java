import java.util.Random;

public class StrQuestion11 {

    public static void main(String[] args) {
        

        String alphaUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphaLow = "abcdefghijklmnopqrstuvwxyz";
        String numeric = "12345678910";

        String alphaNumeric = alphaUpper + alphaLow + numeric;


        StringBuilder sb = new StringBuilder();  //string builder class

        Random ran = new Random(); // random class

        int length = 10;  //length of the random string

        for(int i=0; i<=length; i++){

            int index = ran.nextInt(alphaNumeric.length());

            char ranChar = alphaNumeric.charAt(index);

            sb.append(ranChar);
        }

        String randomString = sb.toString();

        System.out.println("Random alphaNumeric String is   "+randomString);

        //output will be ramdom eachtime the program runs

    }
    
}
