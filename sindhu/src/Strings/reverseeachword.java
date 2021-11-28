public class reverseeachword {

    public static void main(String[] args) {
        
        String x = "this is sindhu";

        String[] words = x.split(" ");

        String reverseString = " ";

        for(int i=0; i<words.length;i++){

            String y = words[i];
            String reverseWord = "";
             
            for (int j = y.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + y.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";


        }
        System.out.println(reverseString);
    }
    
}
