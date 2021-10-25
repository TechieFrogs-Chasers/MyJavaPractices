package StringsAssignment;

public class Assignment23 {
    public static void main(String[] args) {
        int countPuncMarks = 0;  
        String str = "Is punctuation extis in the String ?.";  
        for (int i = 0; i < str.length(); i++) {  
                //Checks whether given character is punctuation mark  
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
                countPuncMarks++;  
            }  
        }  
        System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);
    }
}
