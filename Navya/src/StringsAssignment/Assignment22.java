package StringsAssignment;

public class Assignment22 {
    public static void main(String[] args) {    
        String string = "Total number of characters in the string";    
        int count = 0;      
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    //doesn't count space between characters
                count++;    
        }     
        System.out.println("Total number of characters in a string: " + count);    
    }    
}
