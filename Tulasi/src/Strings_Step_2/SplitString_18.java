package Strings_Step_2;
//18.	WAP to split the given string?
public class SplitString_18 {
    public static void main(String[] args) {
        String split="JAVA IS A LANGUAGE!";
        String[] arrOfStr = split.split(" ");
        for (String a: arrOfStr)
            System.out.println(a);
    }
}
