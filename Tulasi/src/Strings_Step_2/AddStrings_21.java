package Strings_Step_2;

//21.	WAP to add all the numeric present in the given string?
public class AddStrings_21 {
    public static void main(String[] args) {
        String stringName = "J12A14V15A16";
        System.out.println(sum(stringName));
    }

    static int sum(String stringName) {
        String temp = "0";
        int num = 0;
        for (int i = 0; i < stringName.length(); i++) {
            char ch = stringName.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
            else {
                num += Integer.parseInt(temp);
                temp = "0";
            }
        }


        return num + Integer.parseInt(temp);


    }

}
