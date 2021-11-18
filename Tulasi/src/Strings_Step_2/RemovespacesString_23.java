package Strings_Step_2;
//23.	WAP to remove spaces at the ends as well as from the given string?

public class RemovespacesString_23 {
    public static void main(String[] args) {
        String stringName=" java html sql ";
        String result=stringName.trim();
        System.out.println(result);
        stringName=stringName.replaceAll(" ","");
        System.out.println(stringName);
    }
}
