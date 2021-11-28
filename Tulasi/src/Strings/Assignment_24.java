package Strings;//Package

public class Assignment_24 {//Driver class

    public static void main(String[] args) {//main method
        int vowelsCount = 0, consonantsCount = 0;
        String name = "Assignment is about strings ";
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                vowelsCount++;
            } else if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z')) {
                consonantsCount++;
            }
        }
        System.out.println("No.Of Vowels in the sentance : " + vowelsCount);
        System.out.println("No.Of Consonants in the sentance : " + consonantsCount);

    }
}

